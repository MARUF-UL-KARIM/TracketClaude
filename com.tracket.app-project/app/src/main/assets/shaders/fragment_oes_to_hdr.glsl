#version 300 es
#extension GL_OES_EGL_image_external_essl3: require
#extension GL_EXT_YUV_target: require
precision highp float;

uniform __samplerExternal2DY2YEXT uTexture;
uniform int uTransfer;
in vec2 vTexCoord;
out vec4 outColor;

vec3 sampleLimitedRangeBt2020(vec2 uv) {
    vec3 yuv = texture(uTexture, uv).xyz - vec3(0.0625, 0.5, 0.5);
    return clamp(mat3(
        1.1689, 1.1689, 1.1689,
        0.0, -0.1881, 2.1502,
        1.6853, -0.6530, 0.0
    ) * yuv, 0.0, 1.0);
}

float hlgToSceneLinear(float signal) {
    const float a = 0.17883277;
    const float b = 0.28466892;
    const float c = 0.55991073;
    signal = clamp(signal, 0.0, 1.0);
    return signal <= 0.5 ? signal * signal / 3.0 : (exp((signal - c) / a) + b) / 12.0;
}

vec3 hlgToWorkingLinear(vec3 signal) {
    vec3 scene = vec3(
        hlgToSceneLinear(signal.r),
        hlgToSceneLinear(signal.g),
        hlgToSceneLinear(signal.b)
    );
    float sceneLuma = max(dot(scene, vec3(0.2627, 0.6780, 0.0593)), 0.0);
    return scene * pow(sceneLuma, 0.2) * (1000.0 / 203.0);
}

float pqToWorkingLinear(float signal) {
    const float m1 = 2610.0 / 16384.0;
    const float m2 = 2523.0 / 32.0;
    const float c1 = 3424.0 / 4096.0;
    const float c2 = 2413.0 / 128.0;
    const float c3 = 2392.0 / 128.0;
    signal = clamp(signal, 0.0, 1.0);
    float power = pow(signal, 1.0 / m2);
    float numerator = max(power - c1, 0.0);
    float nits = 10000.0 * pow(numerator / max(c2 - c3 * power, 0.000001), 1.0 / m1);
    return nits / 203.0;
}

void main() {
    if (any(lessThan(vTexCoord, vec2(0.0))) || any(greaterThan(vTexCoord, vec2(1.0)))) discard;

    vec3 signal = sampleLimitedRangeBt2020(vTexCoord);
    if (uTransfer == 2) {
        outColor = vec4(
            pqToWorkingLinear(signal.r),
            pqToWorkingLinear(signal.g),
            pqToWorkingLinear(signal.b),
            1.0
        );
        return;
    }
    if (uTransfer == 1) {
        outColor = vec4(hlgToWorkingLinear(signal), 1.0);
        return;
    }
    outColor = vec4(0.0, 0.0, 0.0, 1.0);
}
