#extension GL_OES_standard_derivatives: require
precision highp float;

uniform vec4 uColor1;
uniform vec4 uColor2;
uniform float uAngleDeg;
uniform int uExtendMode;
uniform float uScale;

varying vec2 vTexCoord;

float softRepeat01(float t, float w) {
    float u = fract(t);
    float m = clamp(1.0 - w, 0.0, 1.0);
    u = (u - 0.5) / max(m, 1e-6) + 0.5;
    return clamp(u, 0.0, 1.0);
}

float softMirror01(float t, float w) {
    float tri = 1.0 - abs(fract(t * 0.5) * 2.0 - 1.0);
    float m = clamp(1.0 - w, 0.0, 1.0);
    tri = (tri - 0.5) / max(m, 1e-6) + 0.5;
    return clamp(tri, 0.0, 1.0);
}

float applyExtendAA(float tScaled, int mode) {
    float w = clamp(fwidth(tScaled), 0.0, 0.5);

    if (mode == 0) {
        float u = clamp(tScaled, 0.0, 1.0);
        float m = clamp(1.0 - w, 0.0, 1.0);
        u = (u - 0.5) / max(m, 1e-6) + 0.5;
        return clamp(u, 0.0, 1.0);
    } else if (mode == 1) {
        return softMirror01(tScaled, w);
    } else {
        return softRepeat01(tScaled, w);
    }
}

void main() {
    vec2 p = vTexCoord - vec2(0.5);

    float a = radians(uAngleDeg);
    vec2 dir = vec2(cos(a), sin(a));

    float h = 0.5 * (abs(dir.x) + abs(dir.y)) + 1e-6;
    float t = dot(p, dir) / (2.0 * h) + 0.5;

    float s = max(uScale, 1e-6);
    float tScaled = (t - 0.5) * s + 0.5;

    float u = applyExtendAA(tScaled, uExtendMode);

    gl_FragColor = mix(uColor1, uColor2, u);
}