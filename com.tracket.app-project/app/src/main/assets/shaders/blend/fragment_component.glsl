precision highp float;

uniform sampler2D uSrc;
uniform sampler2D uDst;
uniform float uOpacity;
uniform int uMode; // 30: Hue, 31: Saturation, 32: Color, 33: Luminosity

varying vec2 vSrcTexCoord;
varying vec2 vDstTexCoord;

const float EPS = 1e-5;

vec3 toStraight(vec3 c, float a) { return c / max(a, EPS); }
vec3 toPremul(vec3 c, float a) { return c * a; }

float inside(vec2 uv) {
    vec2 inXY = step(vec2(0.0), uv) * step(uv, vec2(1.0));
    return inXY.x * inXY.y;
}

// Simple luminance & saturation helpers (HSL-ish)
float lum(vec3 c) { return dot(c, vec3(0.3, 0.59, 0.11)); }
float sat(vec3 c) { return max(max(c.r, c.g), c.b) - min(min(c.r, c.g), c.b); }

vec3 setLum(vec3 c, float L) {
    float d = L - lum(c);
    c += vec3(d);

    float mn = min(min(c.r, c.g), c.b);
    float mx = max(max(c.r, c.g), c.b);

    if (mn < 0.0) {
        c = L + (c - L) * (L / max(L - mn, EPS));
    }
    if (mx > 1.0) {
        c = L + (c - L) * ((1.0 - L) / max(mx - L, EPS));
    }
    return clamp(c, 0.0, 1.0);
}

vec3 setSat(vec3 c, float S) {
    float oldS = sat(c);
    if (oldS < EPS) return vec3(lum(c));
    float k = S / oldS;
    float L = lum(c);
    vec3 t = L + (c - L) * k;
    return clamp(t, 0.0, 1.0);
}

// Hue: hue from s, saturation from d, luminance from d
vec3 blendHue(vec3 s, vec3 d) {
    float L = lum(d);
    float S = sat(d);
    vec3 s2 = setSat(s, S);
    return setLum(s2, L);
}

// Saturation: saturation from s, hue+luminance from d
vec3 blendSaturation(vec3 s, vec3 d) {
    float L = lum(d);
    vec3 d2 = setSat(d, sat(s));
    return setLum(d2, L);
}

// Color: hue+saturation from s, luminance from d
vec3 blendColor(vec3 s, vec3 d) {
    return setLum(setSat(s, sat(s)), lum(d));
}

// Luminosity: luminance from s, hue+saturation from d
vec3 blendLuminosity(vec3 s, vec3 d) {
    return setLum(d, lum(s));
}

void main() {
    vec4 dstP = texture2D(uDst, vDstTexCoord);
    vec4 srcP = texture2D(uSrc, vSrcTexCoord) * inside(vSrcTexCoord);

    vec3 d = toStraight(dstP.rgb, dstP.a);
    vec3 s = toStraight(srcP.rgb, max(srcP.a, EPS));

    vec3 b = d;
    if (uMode == 30)      b = blendHue(s, d);
    else if (uMode == 31) b = blendSaturation(s, d);
    else if (uMode == 32) b = blendColor(s, d);
    else if (uMode == 33) b = blendLuminosity(s, d);

    float aMix = clamp(srcP.a * uOpacity, 0.0, 1.0);
    vec3 outStraight = mix(d, b, aMix);
    float outA = clamp(dstP.a + aMix * (1.0 - dstP.a), 0.0, 1.0);

    gl_FragColor = vec4(toPremul(outStraight, outA), outA);
}