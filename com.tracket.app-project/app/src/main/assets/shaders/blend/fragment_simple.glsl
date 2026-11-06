precision highp float;

uniform sampler2D uSrc;
uniform sampler2D uDst;
uniform float uOpacity;
uniform int uMode;

varying vec2 vSrcTexCoord;
varying vec2 vDstTexCoord;

const float EPS = 1e-5;

vec3 toStraight(vec3 c, float a) { return c / max(a, EPS); }
vec3 toPremul(vec3 c, float a) { return c * a; }

float inside(vec2 uv) {
    vec2 inXY = step(vec2(0.0), uv) * step(uv, vec2(1.0));
    return inXY.x * inXY.y;
}

vec3 blendDarken(vec3 s, vec3 d) { return min(s, d); }
vec3 blendLighten(vec3 s, vec3 d) { return max(s, d); }
vec3 blendMultiply(vec3 s, vec3 d) { return s * d; }
vec3 blendScreen(vec3 s, vec3 d) { return 1.0 - (1.0 - s) * (1.0 - d); }
vec3 blendLinearBurn(vec3 s, vec3 d) { return max(s + d - 1.0, 0.0); }
vec3 blendLinearDodge(vec3 s, vec3 d) { return max(s + d, 0.0); }
vec3 blendOverlay(vec3 s, vec3 d) {
    vec3 m = 2.0 * s * d;
    vec3 sc = 1.0 - 2.0 * (1.0 - s) * (1.0 - d);
    return mix(m, sc, step(0.5, d));
}
vec3 blendSoftLight(vec3 s, vec3 d) {
    vec3 res = mix(d - (1.0 - 2.0 * s) * d * (1.0 - d),
                   d + (2.0 * s - 1.0) * (sqrt(d) - d),
                   step(0.5, s));
    return clamp(res, 0.0, 1.0);
}
vec3 blendHardLight(vec3 s, vec3 d) {
    vec3 m = 2.0 * s * d;
    vec3 sc = 1.0 - 2.0 * (1.0 - s) * (1.0 - d);
    return mix(m, sc, step(0.5, s));
}
vec3 blendDifference(vec3 s, vec3 d) { return abs(d - s); }
vec3 blendExclusion(vec3 s, vec3 d) { return s + d - 2.0 * s * d; }

void main() {
    vec4 dstP = texture2D(uDst, vDstTexCoord);
    vec4 srcP = texture2D(uSrc, vSrcTexCoord) * inside(vSrcTexCoord);

    vec3 d = toStraight(dstP.rgb, dstP.a);
    vec3 s = toStraight(srcP.rgb, max(srcP.a, EPS));

    vec3 b = s;
    if      (uMode == 1)  b = blendDarken(s, d);
    else if (uMode == 2)  b = blendMultiply(s, d);
    else if (uMode == 3)  b = blendLinearBurn(s, d);
    else if (uMode == 4)  b = blendLighten(s, d);
    else if (uMode == 5)  b = blendScreen(s, d);
    else if (uMode == 6)  b = blendLinearDodge(s, d);
    else if (uMode == 7)  b = blendOverlay(s, d);
    else if (uMode == 8)  b = blendSoftLight(s, d);
    else if (uMode == 9)  b = blendHardLight(s, d);
    else if (uMode == 10) b = blendDifference(s, d);
    else if (uMode == 11) b = blendExclusion(s, d);

    float aS = clamp(srcP.a * uOpacity, 0.0, 1.0);
    float aD = dstP.a;
    float Aout = aS + aD * (1.0 - aS);

    vec3 Cout_s = vec3(0.0);
    if (Aout > EPS) {
        vec3 num = (1.0 - aS) * aD * d + aS * b;
        Cout_s = num / Aout;
    }

    gl_FragColor = vec4(toPremul(Cout_s, Aout), Aout);
}
