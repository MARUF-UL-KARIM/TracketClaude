precision highp float;

uniform sampler2D uTexture;
uniform vec2 uTextureSize;
varying vec2 vTexCoord;

float catmullRomWeight(float x) {
    float ax = abs(x);
    float ax2 = ax * ax;
    float ax3 = ax2 * ax;
    if (ax <= 1.0) return 1.5 * ax3 - 2.5 * ax2 + 1.0;
    if (ax < 2.0) return -0.5 * ax3 + 2.5 * ax2 - 4.0 * ax + 2.0;
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
    vec4 neighborhoodMin = vec4(1.0);
    vec4 neighborhoodMax = vec4(0.0);

    for (int y = -1; y <= 2; ++y) {
        float wy = catmullRomWeight(float(y) - f.y);
        for (int x = -1; x <= 2; ++x) {
            float wx = catmullRomWeight(float(x) - f.x);
            float w = wx * wy;
            vec4 sampleColor = sampleTexel(base, float(x), float(y));
            color += sampleColor * w;
            weightSum += w;
            if (x >= 0 && x <= 1 && y >= 0 && y <= 1) {
                neighborhoodMin = min(neighborhoodMin, sampleColor);
                neighborhoodMax = max(neighborhoodMax, sampleColor);
            }
        }
    }

    color = color / max(weightSum, 0.0001);
    color = clamp(color, neighborhoodMin, neighborhoodMax);
    if (color.a <= 0.0) discard;

    gl_FragColor = color;
}
