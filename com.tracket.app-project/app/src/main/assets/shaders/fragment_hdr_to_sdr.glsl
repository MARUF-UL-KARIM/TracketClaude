precision highp float;

uniform sampler2D uTexture;
uniform float uOpacity;
varying vec2 vTexCoord;

float bt2446MethodALuma(float y) {
    y = clamp(y, 0.0, 1.0);
    float rhoHdr = 1.0 + 32.0 * pow(0.1, 1.0 / 2.4);
    float rhoSdr = 1.0 + 32.0 * pow(0.01, 1.0 / 2.4);
    float perceptual = log(1.0 + (rhoHdr - 1.0) * y) / log(rhoHdr);
    float compressed = perceptual <= 0.7399
        ? 1.0770 * perceptual
        : perceptual < 0.9909
            ? -1.1510 * perceptual * perceptual + 2.7811 * perceptual - 0.6302
            : 0.5 * perceptual + 0.5;
    return (pow(rhoSdr, compressed) - 1.0) / (rhoSdr - 1.0);
}

vec3 linearBt2020ToLinearSrgb(vec3 color) {
    return vec3(
        1.6604910021 * color.r - 0.5876411388 * color.g - 0.0728498633 * color.b,
        -0.1245504745 * color.r + 1.1328998971 * color.g - 0.0083494226 * color.b,
        -0.0181507634 * color.r - 0.1005788980 * color.g + 1.1187296614 * color.b
    );
}

float linearToSrgb(float linear) {
    linear = max(linear, 0.0);
    return linear <= 0.0031308 ? 12.92 * linear : 1.055 * pow(linear, 1.0 / 2.4) - 0.055;
}

vec3 toneMapWorkingBt2020ToSrgb(vec3 workingLinear) {
    vec3 nonlinear = pow(clamp(workingLinear * (203.0 / 1000.0), 0.0, 1.0), vec3(1.0 / 2.4));
    float y = dot(nonlinear, vec3(0.2627, 0.6780, 0.0593));
    if (y <= 0.000001) return vec3(0.0);

    float ySdr = bt2446MethodALuma(y);
    float colorScale = ySdr / (1.1 * y);
    float cb = colorScale * (nonlinear.b - y) / 1.8814;
    float cr = colorScale * (nonlinear.r - y) / 1.4746;
    float adjustedY = ySdr - max(0.1 * cr, 0.0);
    vec3 nonlinearBt2020 = clamp(vec3(
        adjustedY + 1.4746 * cr,
        adjustedY - 0.1645531268 * cb - 0.5713531268 * cr,
        adjustedY + 1.8814 * cb
    ), 0.0, 1.0);
    vec3 linearSrgb = linearBt2020ToLinearSrgb(pow(nonlinearBt2020, vec3(2.4)));
    return clamp(vec3(
        linearToSrgb(linearSrgb.r),
        linearToSrgb(linearSrgb.g),
        linearToSrgb(linearSrgb.b)
    ), 0.0, 1.0);
}

void main() {
    vec4 source = texture2D(uTexture, vTexCoord);
    float alpha = clamp(source.a, 0.0, 1.0);
    vec3 straight = alpha > 0.000001 ? source.rgb / alpha : vec3(0.0);
    float opacity = clamp(uOpacity, 0.0, 1.0);
    gl_FragColor = vec4(toneMapWorkingBt2020ToSrgb(straight) * alpha * opacity, alpha * opacity);
}
