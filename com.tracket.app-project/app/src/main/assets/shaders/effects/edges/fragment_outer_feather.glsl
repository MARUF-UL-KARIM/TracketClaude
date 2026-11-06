precision highp float;

uniform sampler2D uTexture;
uniform vec2 uBlurDirection;
uniform float uSigma;
uniform float uHardness;

varying vec2 vTexCoord;

vec4 blur() {
    int support = int(uSigma * 3.0);

    vec4 blurredColor = vec4(0.0);
    float totalWeight = 0.0;

    for (int i = -support; i <= support; i++) {
        float coeff = exp(-0.5 * float(i) * float(i) / (uSigma * uSigma));
        vec2 offset = vTexCoord + float(i) * uBlurDirection;

        if (offset.x >= 0.0 && offset.x <= 1.0 && offset.y >= 0.0 && offset.y <= 1.0) {
            blurredColor += texture2D(uTexture, offset) * coeff;
        }

        totalWeight += coeff;
    }

    if (totalWeight > 0.0) {
        blurredColor /= totalWeight;
    }

    vec4 centerColor = texture2D(uTexture, vTexCoord);
    float hardAlpha = max(centerColor.a, blurredColor.a);

    vec3 hardRgb;
    if (blurredColor.a > 0.001) {
        hardRgb = (blurredColor.rgb / blurredColor.a) * hardAlpha;
    } else {
        hardRgb = vec3(0.0);
    }

    vec4 hardColor = vec4(hardRgb, hardAlpha);

    return mix(blurredColor, hardColor, uHardness);
}

void main() {
    vec4 finalColor;

    if (uSigma < 1.0) {
        finalColor = texture2D(uTexture, vTexCoord);
    } else {
        finalColor = blur();
    };

    gl_FragColor = finalColor;
}