#extension GL_OES_standard_derivatives: require
precision highp float;

uniform vec4 uColor1;
uniform vec4 uColor2;
uniform vec2 uCenter;
uniform float uAspect;
uniform int uExtendMode;

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
float applyExtendAA(float t, int mode) {
    float w = clamp(fwidth(t), 0.0, 0.5);
    if (mode == 0) {
        float u = clamp(t, 0.0, 1.0);
        float m = clamp(1.0 - w, 0.0, 1.0);
        u = (u - 0.5) / max(m, 1e-6) + 0.5;
        return clamp(u, 0.0, 1.0);
    } else if (mode == 1) {
        return softMirror01(t, w);
    } else {
        return softRepeat01(t, w);
    }
}

void main() {
    vec2 local_uv = vTexCoord;

    vec2 d = local_uv - uCenter;
    d.x *= uAspect;
    float r = length(d);

    vec2 c0 = (vec2(0.0, 0.0) - uCenter); c0.x *= uAspect;
    vec2 c1 = (vec2(1.0, 0.0) - uCenter); c1.x *= uAspect;
    vec2 c2 = (vec2(0.0, 1.0) - uCenter); c2.x *= uAspect;
    vec2 c3 = (vec2(1.0, 1.0) - uCenter); c3.x *= uAspect;
    float rMax = max(max(length(c0), length(c1)), max(length(c2), length(c3))) + 1e-6;

    float t = r / rMax;

    float u = applyExtendAA(t, uExtendMode);

    gl_FragColor = mix(uColor1, uColor2, u);
}