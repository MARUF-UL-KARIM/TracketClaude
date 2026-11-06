precision highp float;

uniform sampler2D uTexture;
uniform sampler2D uMaskTexture;
uniform vec2  uBlurDirection;
uniform vec2  uDstBlurDirection;
uniform float uSigma;
uniform int   uMaskChannel;

varying vec2 vMaskUV;
varying vec2 vDstUV;

const int MAX_RADIUS = 64;
const vec3 LUMA = vec3(0.299, 0.587, 0.114);

float readMask(vec4 m) {
    if (uMaskChannel == 0) return dot(m.rgb, LUMA);
    if (uMaskChannel == 1) return m.r;
    if (uMaskChannel == 2) return m.g;
    if (uMaskChannel == 3) return m.b;
    return m.a;
}

vec4 maskedDirectionalBlur() {
    int support = int(min(float(MAX_RADIUS), floor(uSigma * 3.0)));
    if (support <= 0) return texture2D(uTexture, vDstUV);

    vec4 acc   = vec4(0.0);
    float norm = 0.0;

    vec4 c0 = texture2D(uTexture, vDstUV);
    float m0 = readMask(texture2D(uMaskTexture, vMaskUV));
    acc  += c0 * m0;
    norm += m0;

    for (int i = 1; i <= MAX_RADIUS; ++i) {
        if (i > support) break;

        float fi = float(i);
        float w  = exp(-0.5 * (fi * fi) / (uSigma * uSigma));
        vec2 dstOff = fi * uDstBlurDirection;
        vec2 maskOff = fi * uBlurDirection;

        vec2 uvP_dst = vDstUV  + dstOff;
        vec2 uvN_dst = vDstUV  - dstOff;
        vec2 uvP_msk = vMaskUV + maskOff;
        vec2 uvN_msk = vMaskUV - maskOff;

        if (uvP_dst.x >= 0.0 && uvP_dst.x <= 1.0 && uvP_dst.y >= 0.0 && uvP_dst.y <= 1.0) {
            vec4 cP = texture2D(uTexture, uvP_dst);
            float mP = readMask(texture2D(uMaskTexture, uvP_msk));
            float wm = w * mP;
            acc  += cP * wm;
            norm += wm;
        }
        if (uvN_dst.x >= 0.0 && uvN_dst.x <= 1.0 && uvN_dst.y >= 0.0 && uvN_dst.y <= 1.0) {
            vec4 cN = texture2D(uTexture, uvN_dst);
            float mN = readMask(texture2D(uMaskTexture, uvN_msk));
            float wm = w * mN;
            acc  += cN * wm;
            norm += wm;
        }
    }

    return (norm > 0.0) ? (acc / max(norm, 1e-6)) : vec4(0.0);
}

void main() {
    if (vMaskUV.x < 0.0 || vMaskUV.x > 1.0 || vMaskUV.y < 0.0 || vMaskUV.y > 1.0) {
        gl_FragColor = vec4(0.0);
        return;
    }

    float maskCenter = readMask(texture2D(uMaskTexture, vMaskUV));
    if (maskCenter <= 0.0) {
        gl_FragColor = vec4(0.0);
        return;
    }

    if (uSigma < 1.0) {
        vec4 base = texture2D(uTexture, vDstUV);
        gl_FragColor = base * maskCenter;
        return;
    }

    vec4 blurred = maskedDirectionalBlur();
    gl_FragColor = blurred * maskCenter;
}
