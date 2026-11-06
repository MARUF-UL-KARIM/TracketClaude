precision highp float;

uniform sampler2D uTexture;
uniform float uAngle;
uniform vec2 uCenter;

varying vec2 vTexCoord;

void main() {
    // operate directly in dst/UV space
    vec2 p_dst = vTexCoord;
    vec2 c_dst = uCenter;

    vec2 diff = p_dst - c_dst;
    float radius = length(diff);

    vec4 acc = vec4(0.0);
    float samples = 64.0;

    if (radius > 0.001) {
        float stepAngle = uAngle / samples;
        float currentAngle = -uAngle / 2.0;

        for(float i = 0.0; i < samples; i++) {
            vec2 rotated_diff;
            rotated_diff.x = cos(currentAngle) * diff.x - sin(currentAngle) * diff.y;
            rotated_diff.y = sin(currentAngle) * diff.x + cos(currentAngle) * diff.y;

            vec2 sample_dst = c_dst + rotated_diff;

            if (sample_dst.x >= 0.0 && sample_dst.x <= 1.0 && sample_dst.y >= 0.0 && sample_dst.y <= 1.0) {
                acc += texture2D(uTexture, sample_dst);
            }

            currentAngle += stepAngle;
        }

        acc /= samples;
    } else {
        acc = texture2D(uTexture, vTexCoord);
    }

    gl_FragColor = acc;
}