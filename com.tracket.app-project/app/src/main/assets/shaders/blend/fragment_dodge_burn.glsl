precision highp float;

uniform sampler2D uSrc;
uniform sampler2D uDst;
uniform float uOpacity;
uniform int uMode; // 20: Color Dodge, 21: Color Burn

varying vec2 vSrcTexCoord;
varying vec2 vDstTexCoord;

const float EPS = 1e-5;

vec3 toStraight(vec3 c, float a) { return c / max(a, EPS); }
vec3 toPremul(vec3 c, float a) { return c * a; }

float inside(vec2 uv) {
    vec2 inXY = step(vec2(0.0), uv) * step(uv, vec2(1.0));
    return inXY.x * inXY.y;
}

vec3 blendColorDodge(vec3 s, vec3 d){
    return clamp(d / max(1.0 - s, EPS), 0.0, 1.0);
}
vec3 blendColorBurn(vec3 s, vec3 d){
    return 1.0 - clamp((1.0 - d) / max(s, EPS), 0.0, 1.0);
}

void main(){
    vec4 dstP = texture2D(uDst, vDstTexCoord);
    vec4 srcP = texture2D(uSrc, vSrcTexCoord) * inside(vSrcTexCoord);

    vec3 d = toStraight(dstP.rgb, dstP.a);
    vec3 s = toStraight(srcP.rgb, max(srcP.a, EPS));

    vec3 b = d;
    if (uMode == 20)      b = blendColorDodge(s,d);
    else if (uMode == 21) b = blendColorBurn(s,d);

    float aMix = clamp(srcP.a * uOpacity, 0.0, 1.0);
    vec3 outStraight = mix(d, b, aMix);
    float outA = clamp(dstP.a + aMix * (1.0 - dstP.a), 0.0, 1.0);

    gl_FragColor = vec4(toPremul(outStraight, outA), outA);
}