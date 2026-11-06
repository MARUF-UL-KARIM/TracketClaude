precision highp float;

uniform sampler2D uTexture;
uniform vec2 uCenterOffset;

uniform int uSamples;
uniform float uStrength;

varying vec2 vTexCoord;

void main() {
    vec2 p = vTexCoord;
    vec2 c = vec2(0.5, 0.5) + uCenterOffset;

    vec4 acc = vec4(0.0);
    float norm = 0.0;

    vec2 diff = p - c;
    float radius = length(diff);

    if (radius > 0.001) {
        vec2 direction = normalize(diff);
        float blurLength = uStrength * 0.3;
        float step = blurLength / float(uSamples);

        for (int i = 0; i < 64; ++i) {
            if (i >= uSamples) break;

            float offset = (-blurLength * 0.5) + (float(i) + 0.5) * step;

            vec2 s = p + direction * offset;

            if (s.x >= 0.0 && s.x <= 1.0 && s.y >= 0.0 && s.y <= 1.0) {
                acc += texture2D(uTexture, s);
                norm += 1.0;
            }
        }
    }

    if (norm > 0.0) {
        gl_FragColor = acc / norm;
    } else {
        gl_FragColor = texture2D(uTexture, vTexCoord);
    }
}