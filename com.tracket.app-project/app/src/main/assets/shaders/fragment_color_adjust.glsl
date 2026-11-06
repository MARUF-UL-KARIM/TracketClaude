precision highp float;

uniform sampler2D uTexture;
uniform float uOpacity;
uniform vec2 uTextureSize;
uniform int uUseCubic;
uniform vec4 uColorAdjustments0;
uniform vec4 uColorAdjustments1;
uniform vec4 uColorAdjustments2;
uniform vec4 uColorAdjustments3;
varying vec2 vTexCoord;

float catmullRomWeight(float x) {
    float ax = abs(x);
    float ax2 = ax * ax;
    float ax3 = ax2 * ax;
    if (ax <= 1.0) return 1.5 * ax3 - 2.5 * ax2 + 1.0;
    if (ax < 2.0) return -0.5 * ax3 + 2.5 * ax2 - 4.0 * ax + 2.0;
    return 0.0;
}

vec4 sampleCatmullRomTexel(vec2 base, float x, float y) {
    vec2 uv = (base + vec2(x, y) + 0.5) / uTextureSize;
    return texture2D(uTexture, clamp(uv, vec2(0.0), vec2(1.0)));
}

vec4 sampleCatmullRomTexture(vec2 uv) {
    vec2 src = uv * uTextureSize - 0.5;
    vec2 base = floor(src);
    vec2 f = src - base;
    vec4 color = vec4(0.0);
    float weightSum = 0.0;
    vec4 neighborhoodMin = vec4(1.0);
    vec4 neighborhoodMax = vec4(0.0);

    for (int y = -1; y <= 2; ++y) {
        float wy = catmullRomWeight(float(y) - f.y);
        for (int x = -1; x <= 2; ++x) {
            float wx = catmullRomWeight(float(x) - f.x);
            float weight = wx * wy;
            vec4 sampleColor = sampleCatmullRomTexel(base, float(x), float(y));
            color += sampleColor * weight;
            weightSum += weight;
            if (x >= 0 && x <= 1 && y >= 0 && y <= 1) {
                neighborhoodMin = min(neighborhoodMin, sampleColor);
                neighborhoodMax = max(neighborhoodMax, sampleColor);
            }
        }
    }

    return clamp(color / max(weightSum, 0.0001), neighborhoodMin, neighborhoodMax);
}

float srgbToLinear(float value) {
    value = max(value, 0.0);
    return value <= 0.04045 ? value / 12.92 : pow((value + 0.055) / 1.055, 2.4);
}

float linearToSrgbAdjusted(float value) {
    value = max(value, 0.0);
    return value <= 0.0031308 ? 12.92 * value : 1.055 * pow(value, 1.0 / 2.4) - 0.055;
}

float adjustmentSmoothStep(float edge0, float edge1, float value) {
    float t = clamp((value - edge0) / (edge1 - edge0), 0.0, 1.0);
    return t * t * (3.0 - 2.0 * t);
}

float adjustmentLinearToGradingLog(float value) {
    return value < 0.0041318374739483946
        ? value * 363.034608563 - 7.0
        : log2((value - 0.000157849851665374) / 0.17984215014833463);
}

float adjustmentGradingLogToLinear(float value) {
    return value < -5.5
        ? (value + 7.0) / 363.034608563
        : exp2(value) * 0.17984215014833463 + 0.000157849851665374;
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

vec3 applyLinearColorAdjustments(vec3 source, vec3 luma) {
    float exposure = uColorAdjustments0.x;
    float brightness = uColorAdjustments0.y;
    float contrast = uColorAdjustments0.z;
    float highlightsAmount = uColorAdjustments0.w;
    float shadowsAmount = uColorAdjustments1.x;
    float whitesAmount = uColorAdjustments1.y;
    float blacksAmount = uColorAdjustments1.z;
    float temperature = uColorAdjustments1.w;
    float tint = uColorAdjustments2.x;
    float saturation = uColorAdjustments2.y;
    float vibrance = uColorAdjustments2.z;
    float hueDegrees = uColorAdjustments2.w;
    float fade = uColorAdjustments3.x;

    vec3 color = max(source, vec3(0.0));
    float originalLuma = dot(color, luma);
    vec3 balanced = color * exp2(vec3(
        0.25 * temperature + 0.10 * tint,
        -0.20 * tint,
        -0.25 * temperature + 0.10 * tint
    ));
    float balancedLuma = dot(balanced, luma);
    color = originalLuma > 0.00000001 && balancedLuma > 0.00000001
        ? balanced * (originalLuma / balancedLuma)
        : balanced;
    color *= exp2(exposure);

    float y = max(dot(color, luma), 0.0);
    float brightnessLuma = adjustmentMidtoneBrightness(y, brightness);
    color = y > 0.00000001 ? color * (brightnessLuma / y) : vec3(brightnessLuma);
    y = max(dot(color, luma), 0.0);
    float compressed = y / (1.0 + y);
    float shadows = 1.0 - adjustmentSmoothStep(0.15, 0.55, compressed);
    float highlights = adjustmentSmoothStep(0.18, 0.50, compressed);
    float blacks = 1.0 - adjustmentSmoothStep(0.02, 0.22, compressed);
    float whites = adjustmentSmoothStep(0.35, 0.50, compressed);
    float stops = shadowsAmount * shadows +
        highlightsAmount * highlights + blacksAmount * blacks * 0.75 +
        whitesAmount * whites * 0.75;
    color *= exp2(stops);

    y = max(dot(color, luma), 0.0);
    float targetLuma = y > 0.0 ? 0.18 * pow(y / 0.18, exp2(contrast)) : 0.0;
    color = y > 0.00000001 ? color * (targetLuma / y) : vec3(targetLuma);
    color = color * (1.0 - 0.25 * fade) + vec3(0.08 * fade);

    float angle = radians(hueDegrees);
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
    float saturationScale = max(0.0, 1.0 + saturation);
    float vibranceScale = max(0.0, 1.0 + vibrance * (1.0 - chromaRatio) * 0.75);
    return max(vec3(y) + (color - vec3(y)) * saturationScale * vibranceScale, vec3(0.0));
}

void main() {
    if (any(lessThan(vTexCoord, vec2(0.0))) || any(greaterThan(vTexCoord, vec2(1.0)))) discard;
    vec4 source = uUseCubic == 1
        ? sampleCatmullRomTexture(vTexCoord)
        : texture2D(uTexture, vTexCoord);
    float alpha = clamp(source.a, 0.0, 1.0);
    vec3 straight = alpha > 0.000001 ? source.rgb / alpha : vec3(0.0);
    vec3 linear = vec3(srgbToLinear(straight.r), srgbToLinear(straight.g), srgbToLinear(straight.b));
    vec3 adjusted = applyLinearColorAdjustments(linear, vec3(0.2126, 0.7152, 0.0722));
    vec3 encoded = vec3(
        linearToSrgbAdjusted(adjusted.r),
        linearToSrgbAdjusted(adjusted.g),
        linearToSrgbAdjusted(adjusted.b)
    );
    float opacity = clamp(uOpacity, 0.0, 1.0);
    gl_FragColor = vec4(encoded * alpha * opacity, alpha * opacity);
}
