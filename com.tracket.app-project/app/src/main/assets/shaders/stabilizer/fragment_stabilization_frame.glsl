precision highp float;

uniform sampler2D uTexture;
uniform mat4 uSourceTexMatrix;
uniform vec2 uFrameSize;
uniform vec3 uViewportToSource0;
uniform vec3 uViewportToSource1;
uniform vec3 uViewportToSource2;
uniform int uEdgeFill;
uniform vec2 uTextureSize;
uniform int uUseCubic;

varying vec2 vViewportUv;

vec2 mapPoint(vec3 r0, vec3 r1, vec3 r2, vec2 point) {
    vec3 p = vec3(point, 1.0);
    float w = dot(r2, p);
    if (abs(w) < 0.000001) {
        w = 0.000001;
    }
    return vec2(dot(r0, p) / w, dot(r1, p) / w);
}

vec2 mirrorUv(vec2 uv) {
    vec2 wrapped = mod(abs(uv), 2.0);
    return mix(wrapped, 2.0 - wrapped, step(1.0, wrapped));
}

bool outside01(vec2 uv) {
    return any(lessThan(uv, vec2(0.0))) || any(greaterThan(uv, vec2(1.0)));
}

float catmullRomWeight(float x) {
    float ax = abs(x);
    float ax2 = ax * ax;
    float ax3 = ax2 * ax;
    if (ax <= 1.0) return 1.5 * ax3 - 2.5 * ax2 + 1.0;
    if (ax < 2.0) return -0.5 * ax3 + 2.5 * ax2 - 4.0 * ax + 2.0;
    return 0.0;
}

vec4 sampleCatmullRomTexel(vec2 base, float x, float y) {
    vec2 uv = (base + vec2(x, y) + 0.5) / uTextureSize;
    return texture2D(uTexture, clamp(uv, vec2(0.0), vec2(1.0)));
}

vec4 sampleCatmullRom(vec2 uv) {
    vec2 src = uv * uTextureSize - 0.5;
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
            float weight = wx * wy;
            vec4 sampleColor = sampleCatmullRomTexel(base, float(x), float(y));
            color += sampleColor * weight;
            weightSum += weight;
            if (x >= 0 && x <= 1 && y >= 0 && y <= 1) {
                neighborhoodMin = min(neighborhoodMin, sampleColor);
                neighborhoodMax = max(neighborhoodMax, sampleColor);
            }
        }
    }

    return clamp(color / max(weightSum, 0.0001), neighborhoodMin, neighborhoodMax);
}

void main() {
    vec2 viewportPoint = vec2(vViewportUv.x, 1.0 - vViewportUv.y) * uFrameSize;
    vec2 sourcePoint = mapPoint(uViewportToSource0, uViewportToSource1, uViewportToSource2, viewportPoint);
    vec2 uv = sourcePoint / uFrameSize;

    if (uEdgeFill == 0 && outside01(uv)) {
        discard;
    } else if (uEdgeFill == 1) {
        uv = clamp(uv, vec2(0.0), vec2(1.0));
    } else if (uEdgeFill == 2) {
        uv = mirrorUv(uv);
    }

    vec2 sourceUv = (uSourceTexMatrix * vec4(uv.x, 1.0 - uv.y, 0.0, 1.0)).xy;
    vec4 color = uUseCubic == 1 ? sampleCatmullRom(sourceUv) : texture2D(uTexture, sourceUv);
    if (color.a <= 0.0) discard;
    gl_FragColor = color;
}
