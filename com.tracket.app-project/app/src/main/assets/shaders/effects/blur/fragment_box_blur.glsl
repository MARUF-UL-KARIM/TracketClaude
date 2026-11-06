precision highp float;

uniform sampler2D uTexture;
uniform vec2  uBlurDirection; // texel step in blur direction, e.g. (1/width, 0) or (0, 1/height)
uniform int   uRadius;        // half-width of the box kernel

varying vec2 vTexCoord;

// We keep a compile-time cap for safety on ES 2.0 loop unrolling.
const int MAX_RADIUS = 64;

vec4 boxBlur1D() {
    if (uRadius <= 0) {
        return texture2D(uTexture, vTexCoord);
    }

    // Total taps = 2*radius + 1
    float count = float(2 * uRadius + 1);
    vec4 acc = vec4(0.0);

    // Clamp coordinates instead of skipping OOB samples
    // to avoid dark edges (normalization stays consistent).
    for (int i = -MAX_RADIUS; i <= MAX_RADIUS; ++i) {
        if (i < -uRadius) continue;
        if (i >  uRadius) break;

        vec2 uv = vTexCoord + uBlurDirection * float(i);
        uv = clamp(uv, vec2(0.0), vec2(1.0));
        acc += texture2D(uTexture, uv);
    }

    return acc / count;
}

void main() {
    gl_FragColor = boxBlur1D();
}