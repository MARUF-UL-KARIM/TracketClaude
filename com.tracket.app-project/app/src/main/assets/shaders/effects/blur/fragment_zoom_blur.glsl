precision highp float;

uniform sampler2D uTexture;
uniform vec2 uCenterOffset;

uniform int uSamples;
uniform float uStrength;   // 0..1, scales how far we move towards center

varying vec2 vTexCoord;

void main() {
    vec2 p = vTexCoord;
    vec2 c = vec2(0.5, 0.5) + uCenterOffset;

    vec4 acc = vec4(0.0);
    float norm = 0.0;

    // Sample along the ray p -> center in UV space.
    for (int i = 0; i < 64; ++i) {
        // 64 = hard cap; uSamples <= 64
        if (i >= uSamples) break;
        float t = (float(i) + 1.0) / float(uSamples);
        vec2 s = mix(p, c, t * clamp(uStrength, 0.0, 1.0));

        // Optional clamp to avoid unnecessary texture fetches outside [0,1]
        if (s.x >= 0.0 && s.x <= 1.0 && s.y >= 0.0 && s.y <= 1.0) {
            acc += texture2D(uTexture, s);
            norm += 1.0;
        }
    }

    if (norm > 0.0) acc /= norm;
    gl_FragColor = acc;
}