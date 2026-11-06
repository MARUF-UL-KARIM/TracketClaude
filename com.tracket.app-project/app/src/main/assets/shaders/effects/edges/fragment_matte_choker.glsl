precision highp float;

uniform sampler2D uTexture;
uniform vec2 uTexel;         // 1/w, 1/h
uniform float uRadiusPx;      // >= 0 (px)
uniform float uFeatherPx;     // >= 0 (px)
uniform int uMode;          // 0 = Tighten (erode), 1 = Expand (dilate)

varying vec2 vTexCoord;

vec2 dirByK(int k) {
    if (k == 0) return vec2(0.0, -1.0);
    if (k == 1) return vec2(0.7071, -0.7071);
    if (k == 2) return vec2(1.0, 0.0);
    if (k == 3) return vec2(0.7071, 0.7071);
    if (k == 4) return vec2(0.0, 1.0);
    if (k == 5) return vec2(-0.7071, 0.7071);
    if (k == 6) return vec2(-1.0, 0.0);
    return vec2(-0.7071, -0.7071);
}

float sampleMask(vec2 uv) {
    return texture2D(uTexture, uv).a;
}

float morphAlpha(vec2 uv, float radiusPx) {
    float center = sampleMask(uv);
    int steps = int(floor(radiusPx + 1e-3));
    if (steps <= 0) return center;

    if (uMode == 1) {
        // Dilate = max
        float acc = center;
        for (int k = 0; k < 8; ++k) {
            vec2 dir = dirByK(k) * uTexel;
            for (int s = 1; s <= 16; ++s) {
                if (s > steps) break;
                float a = sampleMask(uv + dir * float(s));
                acc = max(acc, a);
            }
        }
        return acc;
    } else {
        // Erode = min
        float acc = 1.0;
        for (int k = 0; k < 8; ++k) {
            vec2 dir = dirByK(k) * uTexel;
            for (int s = 0; s <= 16; ++s) {
                if (s > steps) break;
                float a = sampleMask(uv + dir * float(s));
                acc = min(acc, a);
            }
        }
        return acc;
    }
}

float blur9(vec2 uv) {
    float a = 0.0;
    a += sampleMask(uv);
    a += sampleMask(uv + vec2(uTexel.x, 0.0));
    a += sampleMask(uv + vec2(-uTexel.x, 0.0));
    a += sampleMask(uv + vec2(0.0, uTexel.y));
    a += sampleMask(uv + vec2(0.0, -uTexel.y));
    a += sampleMask(uv + vec2(uTexel.x, uTexel.y));
    a += sampleMask(uv + vec2(-uTexel.x, uTexel.y));
    a += sampleMask(uv + vec2(uTexel.x, -uTexel.y));
    a += sampleMask(uv + vec2(-uTexel.x, -uTexel.y));
    return a * (1.0 / 9.0);
}

void main() {
    vec4 src = texture2D(uTexture, vTexCoord);   // premultiplied

    float m = morphAlpha(vTexCoord, uRadiusPx);

    float featherT = clamp(uFeatherPx / 8.0, 0.0, 1.0);
    float mFeather = mix(m, blur9(vTexCoord), featherT);

    float newA = clamp(mFeather, 0.0, 1.0);
    float scale = (src.a > 1e-5) ? (newA / src.a) : 0.0;
    vec3 newRGB = src.rgb * scale;

    gl_FragColor = vec4(newRGB, newA);
}