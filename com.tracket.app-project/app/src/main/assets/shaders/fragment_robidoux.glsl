precision highp float;

uniform sampler2D uTexture;
uniform vec2 uTextureSize;
varying vec2 vTexCoord;

float cubicWeight(float x) {
    float b = 0.37821576;
    float c = 0.31089212;
    float ax = abs(x);
    float ax2 = ax * ax;
    float ax3 = ax2 * ax;
    if (ax < 1.0) {
        return ((12.0 - 9.0 * b - 6.0 * c) * ax3 +
            (-18.0 + 12.0 * b + 6.0 * c) * ax2 +
            (6.0 - 2.0 * b)) / 6.0;
    }
    if (ax < 2.0) {
        return ((-b - 6.0 * c) * ax3 +
            (6.0 * b + 30.0 * c) * ax2 +
            (-12.0 * b - 48.0 * c) * ax +
            (8.0 * b + 24.0 * c)) / 6.0;
    }
    return 0.0;
}

vec4 sampleTexel(vec2 base, float x, float y) {
    vec2 uv = (base + vec2(x, y) + 0.5) / uTextureSize;
    uv = clamp(uv, vec2(0.0), vec2(1.0));
    return texture2D(uTexture, uv);
}

void main() {
    if (any(lessThan(vTexCoord, vec2(0.0))) || any(greaterThan(vTexCoord, vec2(1.0)))) discard;

    vec2 src = vTexCoord * uTextureSize - 0.5;
    vec2 base = floor(src);
    vec2 f = src - base;

    vec4 color = vec4(0.0);
    float weightSum = 0.0;

    for (int y = -1; y <= 2; ++y) {
        float wy = cubicWeight(float(y) - f.y);
        for (int x = -1; x <= 2; ++x) {
            float wx = cubicWeight(float(x) - f.x);
            float w = wx * wy;
            color += sampleTexel(base, float(x), float(y)) * w;
            weightSum += w;
        }
    }

    color = color / max(weightSum, 0.0001);
    color = clamp(color, 0.0, 1.0);
    if (color.a <= 0.0) discard;

    gl_FragColor = color;
}
