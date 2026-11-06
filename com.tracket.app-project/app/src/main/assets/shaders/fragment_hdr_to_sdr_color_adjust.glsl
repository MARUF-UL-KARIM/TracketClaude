precision highp float;

uniform sampler2D uTexture;
uniform float uOpacity;
uniform vec4 uColorAdjustments0;
uniform vec4 uColorAdjustments1;
uniform vec4 uColorAdjustments2;
uniform vec4 uColorAdjustments3;
varying vec2 vTexCoord;

float adjustmentSmoothStep(float edge0, float edge1, float value) {
    float t = clamp((value - edge0) / (edge1 - edge0), 0.0, 1.0);
    return t * t * (3.0 - 2.0 * t);
}

float adjustmentLinearToGradingLog(float value) {
    return value < 0.0041318374739483946 ? value * 363.034608563 - 7.0 : log2((value - 0.000157849851665374) / 0.17984215014833463);
}

float adjustmentGradingLogToLinear(float value) {
    return value < -5.5 ? (value + 7.0) / 363.034608563 : exp2(value) * 0.17984215014833463 + 0.000157849851665374;
}

float adjustmentToneSegment(float value, float x0, float x1, float y0, float m0, float m1) {
    float position = (value - x0) / (x1 - x0);
    return y0 + position * (x1 - x0) * (m0 + position * 0.5 * (m1 - m0));
}

float adjustmentMidtoneBrightness(float value, float amount) {
    if (amount == 0.0) return value;
    float t = adjustmentLinearToGradingLog(value);
    float adjustment = amount * 0.45;
    float m0 = 1.0;
    float m1 = 1.0 + adjustment * 0.4;
    float m2 = 1.0 + adjustment;
    float m3 = 1.0 - adjustment;
    float m4 = 1.0 - adjustment * 0.2545454545454545;
    float m5 = 1.0;
    float y0 = -5.5;
    float y1 = y0 + (m0 + m1) * 0.75;
    float y2 = y1 + (m1 + m2);
    float y3 = y2 + (m2 + m3) * 2.0;
    float y4 = y3 + (m3 + m4);
    float y5 = y4 + (m4 + m5) * 1.75;
    float adjusted = t < -5.5 ? y0 + (t + 5.5) * m0 :
        t < -4.0 ? adjustmentToneSegment(t, -5.5, -4.0, y0, m0, m1) :
        t < -2.0 ? adjustmentToneSegment(t, -4.0, -2.0, y1, m1, m2) :
        t < 2.0 ? adjustmentToneSegment(t, -2.0, 2.0, y2, m2, m3) :
        t < 4.0 ? adjustmentToneSegment(t, 2.0, 4.0, y3, m3, m4) :
        t <= 7.5 ? adjustmentToneSegment(t, 4.0, 7.5, y4, m4, m5) :
        y5 + (t - 7.5) * m5;
    return max(adjustmentGradingLogToLinear(adjusted), 0.0);
}

vec3 applyLinearColorAdjustments(vec3 source) {
    vec3 luma = vec3(0.2627, 0.6780, 0.0593);
    float temperature = uColorAdjustments1.w;
    float tint = uColorAdjustments2.x;
    vec3 color = max(source, vec3(0.0));
    float originalLuma = dot(color, luma);
    vec3 balanced = color * exp2(vec3(0.25 * temperature + 0.10 * tint, -0.20 * tint, -0.25 * temperature + 0.10 * tint));
    float balancedLuma = dot(balanced, luma);
    color = originalLuma > 0.00000001 && balancedLuma > 0.00000001 ? balanced * (originalLuma / balancedLuma) : balanced;
    color *= exp2(uColorAdjustments0.x);
    float y = max(dot(color, luma), 0.0);
    float brightnessLuma = adjustmentMidtoneBrightness(y, uColorAdjustments0.y);
    color = y > 0.00000001 ? color * (brightnessLuma / y) : vec3(brightnessLuma);
    y = max(dot(color, luma), 0.0);
    float compressed = y / (1.0 + y);
    float shadows = 1.0 - adjustmentSmoothStep(0.15, 0.55, compressed);
    float highlights = adjustmentSmoothStep(0.18, 0.50, compressed);
    float blacks = 1.0 - adjustmentSmoothStep(0.02, 0.22, compressed);
    float whites = adjustmentSmoothStep(0.35, 0.50, compressed);
    float stops = uColorAdjustments1.x * shadows +
        uColorAdjustments0.w * highlights + uColorAdjustments1.z * blacks * 0.75 +
        uColorAdjustments1.y * whites * 0.75;
    color *= exp2(stops);
    y = max(dot(color, luma), 0.0);
    float targetLuma = y > 0.0 ? 0.18 * pow(y / 0.18, exp2(uColorAdjustments0.z)) : 0.0;
    color = y > 0.00000001 ? color * (targetLuma / y) : vec3(targetLuma);
    color = color * (1.0 - 0.25 * uColorAdjustments3.x) + vec3(0.08 * uColorAdjustments3.x);
    float angle = radians(uColorAdjustments2.w);
    float c = cos(angle);
    float s = sin(angle);
    float k = 0.3333333333 * (1.0 - c);
    float q = 0.5773502692 * s;
    color = max(vec3(
        color.r * (c + k) + color.g * (k - q) + color.b * (k + q),
        color.r * (k + q) + color.g * (c + k) + color.b * (k - q),
        color.r * (k - q) + color.g * (k + q) + color.b * (c + k)
    ), vec3(0.0));
    y = dot(color, luma);
    float maximum = max(color.r, max(color.g, color.b));
    float minimum = min(color.r, min(color.g, color.b));
    float chromaRatio = maximum > 0.00000001 ? clamp((maximum - minimum) / maximum, 0.0, 1.0) : 0.0;
    float scale = max(0.0, 1.0 + uColorAdjustments2.y) *
        max(0.0, 1.0 + uColorAdjustments2.z * (1.0 - chromaRatio) * 0.75);
    return max(vec3(y) + (color - vec3(y)) * scale, vec3(0.0));
}

float bt2446MethodALuma(float y) {
    y = clamp(y, 0.0, 1.0);
    float rhoHdr = 1.0 + 32.0 * pow(0.1, 1.0 / 2.4);
    float rhoSdr = 1.0 + 32.0 * pow(0.01, 1.0 / 2.4);
    float perceptual = log(1.0 + (rhoHdr - 1.0) * y) / log(rhoHdr);
    float compressed = perceptual <= 0.7399 ? 1.0770 * perceptual : perceptual < 0.9909 ? -1.1510 * perceptual * perceptual + 2.7811 * perceptual - 0.6302 : 0.5 * perceptual + 0.5;
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
    return clamp(vec3(linearToSrgb(linearSrgb.r), linearToSrgb(linearSrgb.g), linearToSrgb(linearSrgb.b)), 0.0, 1.0);
}

void main() {
    vec4 source = texture2D(uTexture, vTexCoord);
    float alpha = clamp(source.a, 0.0, 1.0);
    vec3 straight = alpha > 0.000001 ? source.rgb / alpha : vec3(0.0);
    float opacity = clamp(uOpacity, 0.0, 1.0);
    vec3 adjusted = applyLinearColorAdjustments(straight);
    gl_FragColor = vec4(toneMapWorkingBt2020ToSrgb(adjusted) * alpha * opacity, alpha * opacity);
}
