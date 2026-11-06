precision highp float;

uniform sampler2D uTexture;      // premultiplied
uniform vec2  uViewportSize;     // (w,h) px
uniform float uOpacity;

uniform float uStrengthPx;       // 1..2
uniform float uMaxBlurPx;        // 24..96

uniform float uSigmaScale;       // e.g. 0.35 (sigma = lenPx * scale)
uniform float uSigmaMinPx;       // e.g. 1.5
uniform float uSigmaMaxPx;       // e.g. 32.0

uniform float uHardness;         // 0..1

varying vec2 vTexCoord;
varying vec2 vCurrNdc;
varying vec2 vPrevNdc;

const int MAX_SUPPORT = 32; // => up to 65 taps worst-case (center + ±32). Keep moderate for mobile.

vec4 samplePremul(vec2 uv) {
    // Hard clip like you do everywhere
    if (uv.x < 0.0 || uv.x > 1.0 || uv.y < 0.0 || uv.y > 1.0) return vec4(0.0);
    return texture2D(uTexture, uv);
}

void main() {
    if (vTexCoord.x < 0.0 || vTexCoord.x > 1.0 || vTexCoord.y < 0.0 || vTexCoord.y > 1.0) discard;

    // Velocity in pixels
    vec2 velNdc = (vCurrNdc - vPrevNdc);
    vec2 velPx  = velNdc * (uViewportSize * 0.5) * uStrengthPx;

    float lenPx = length(velPx);

    // No motion => just output
    if (lenPx < 0.5) {
        vec4 c = texture2D(uTexture, vTexCoord);
        c *= uOpacity;
        if (c.a <= 0.0) discard;
        gl_FragColor = c;
        return;
    }

    // Clamp length
    if (lenPx > uMaxBlurPx) {
        velPx *= (uMaxBlurPx / lenPx);
        lenPx = uMaxBlurPx;
    }

    // Direction step: 1 px per tap along motion direction (converted to UV)
    vec2 dirPx = velPx / max(lenPx, 1e-6);          // unit in px
    vec2 stepUv = (dirPx / uViewportSize);          // 1px step in UV

    // Sigma chosen from velocity length
    float sigmaPx = clamp(lenPx * uSigmaScale, uSigmaMinPx, uSigmaMaxPx);

    // Support = ±3σ, capped
    int support = int(min(float(MAX_SUPPORT), ceil(sigmaPx * 3.0)));

    // Gaussian accumulate in premul space
    vec4 acc = vec4(0.0);
    float wSum = 0.0;

    // center
    vec4 center = texture2D(uTexture, vTexCoord);
    acc += center; // w=1
    wSum += 1.0;

    for (int i = 1; i <= MAX_SUPPORT; i++) {
        if (i > support) break;

        float fi = float(i);
        float w = exp(-0.5 * (fi * fi) / (sigmaPx * sigmaPx));

        vec2 d = stepUv * fi;

        acc += samplePremul(vTexCoord + d) * w;
        acc += samplePremul(vTexCoord - d) * w;
        wSum += 2.0 * w;
    }

    vec4 blurred = acc / max(wSum, 1e-6);

    // "Hardness": preserve alpha a bit crisper (premul-safe)
    float hardA = mix(blurred.a, max(blurred.a, center.a), clamp(uHardness, 0.0, 1.0));

    // Keep straight RGB of blurred, but re-premultiply with hardA
    vec3 straight = (blurred.a > 1e-6) ? (blurred.rgb / blurred.a) : vec3(0.0);
    vec4 outC = vec4(straight * hardA, hardA);

    // Apply layer opacity at end
    outC *= uOpacity;

    if (outC.a <= 0.0) discard;
    gl_FragColor = outC;
}