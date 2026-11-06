precision highp float;

uniform sampler2D uTexture;
uniform vec2 uDirection;
uniform float uRadius;

varying vec2 vTexCoord;

const int MAX_RADIUS = 64;

vec4 maxFilter1D() {
    int r = int(floor(uRadius));
    r = clamp(r, 0, MAX_RADIUS);

    vec4 best = vec4(0.0);

    for (int i = -MAX_RADIUS; i <= MAX_RADIUS; i++) {
        if (i < -r || i > r) continue;

        vec2 uv = vTexCoord + float(i) * uDirection;
        uv = clamp(uv, 0.0, 1.0);

        best = max(best, texture2D(uTexture, uv));
    }

    return best;
}

void main() {
    gl_FragColor = (uRadius < 0.5)
    ? texture2D(uTexture, clamp(vTexCoord, 0.0, 1.0))
    : maxFilter1D();
}
