precision highp float;

uniform sampler2D uTexture;      // premultiplied video frame
uniform float uOpacity;          // layer opacity (0..1)
uniform vec2 uViewportSize;      // render target size in pixels (width, height)

uniform float uStrengthPx;       // blur strength multiplier in pixels (e.g. 1..2)
uniform float uMaxBlurPx;        // clamp blur length in pixels (e.g. 24..64)

varying vec2 vTexCoord;
varying vec2 vCurrNdc;
varying vec2 vPrevNdc;

float triWeight(float t) {
    // t in [0..1] => peak at 0.5
    return 1.0 - abs(2.0 * t - 1.0);
}

void main() {
    // Keep your hard clip outside source UVs
    if (any(lessThan(vTexCoord, vec2(0.0))) || any(greaterThan(vTexCoord, vec2(1.0)))) discard;

    // Screen-space velocity in NDC [-1..1]
    vec2 velNdc = (vCurrNdc - vPrevNdc);

    // Convert NDC delta to pixel delta:
    // NDC [-1..1] spans viewport pixels => pixels = ndc * (viewport/2)
    vec2 velPx = velNdc * (uViewportSize * 0.5);

    // Apply strength and clamp
    velPx *= uStrengthPx;

    float lenPx = length(velPx);
    if (lenPx < 0.5) {
        // No noticeable motion => regular sample
        vec4 c = texture2D(uTexture, vTexCoord);
        c.rgb *= uOpacity;
        c.a   *= uOpacity;
        if (c.a <= 0.0) discard;
        gl_FragColor = c;
        return;
    }

    if (lenPx > uMaxBlurPx) {
        velPx *= (uMaxBlurPx / lenPx);
        lenPx = uMaxBlurPx;
    }

    // Convert pixel velocity to UV velocity
    vec2 velUv = velPx / uViewportSize;

    // Number of taps depends on length (cheap adaptive)
    // NOTE: GLSL ES 1.00 needs constant loop bounds, so we do max taps and early break.
    const int MAX_TAPS = 15;
    float tapsF = clamp(3.0 + lenPx * 0.25, 5.0, float(MAX_TAPS)); // tune
    int taps = int(floor(tapsF + 0.5));

    vec4 acc = vec4(0.0);
    float wsum = 0.0;

    // Symmetric sampling around center to reduce bias
    for (int i = 0; i < MAX_TAPS; i++) {
        if (i >= taps) break;

        float t01 = (taps == 1) ? 0.5 : (float(i) / float(taps - 1));   // [0..1]
        float offset = t01 - 0.5;                                       // [-0.5..0.5]

        // Triangular weights (smoother than box, still stable)
        float w = triWeight(t01);

        vec2 uv = vTexCoord - velUv * offset;

        // Hard clip samples outside
        if (any(lessThan(uv, vec2(0.0))) || any(greaterThan(uv, vec2(1.0)))) continue;

        vec4 s = texture2D(uTexture, uv); // premultiplied
        acc += s * w;
        wsum += w;
    }

    vec4 c = acc / max(wsum, 1e-6);

    // Apply layer opacity (premul-safe: scale both rgb and a)
    c.rgb *= uOpacity;
    c.a   *= uOpacity;

    if (c.a <= 0.0) discard;
    gl_FragColor = c;
}