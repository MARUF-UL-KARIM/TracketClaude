precision highp float;

uniform sampler2D uSrc;
uniform sampler2D uDepth;
uniform sampler2D uBlur;
uniform float uDepthUseAlpha;
uniform float uMode;
uniform float uInvert;
uniform float uPalette;
uniform float uValue0;
uniform float uValue1;
uniform float uValue2;
uniform float uValue3;
uniform float uValue4;
uniform float uValue5;
uniform vec4 uColor0;
uniform vec4 uColor1;
uniform vec4 uToneCurve0;
uniform vec4 uToneCurve1;
uniform vec4 uToneCurve2;
uniform vec4 uToneCurve3;

varying vec2 vSrcTexCoord;
varying vec2 vMaskTexCoord;

float readDepth(vec2 uv) {
    vec4 sampleValue = texture2D(uDepth, clamp(uv, vec2(0.0), vec2(1.0)));
    float value = mix(sampleValue.r, sampleValue.a, clamp(uDepthUseAlpha, 0.0, 1.0));
    return mix(value, 1.0 - value, clamp(uInvert, 0.0, 1.0));
}

float toneCurvePoint(float index) {
    if (index < 4.0) {
        if (index < 1.0) return uToneCurve0.x;
        if (index < 2.0) return uToneCurve0.y;
        if (index < 3.0) return uToneCurve0.z;
        return uToneCurve0.w;
    }
    if (index < 8.0) {
        if (index < 5.0) return uToneCurve1.x;
        if (index < 6.0) return uToneCurve1.y;
        if (index < 7.0) return uToneCurve1.z;
        return uToneCurve1.w;
    }
    if (index < 12.0) {
        if (index < 9.0) return uToneCurve2.x;
        if (index < 10.0) return uToneCurve2.y;
        if (index < 11.0) return uToneCurve2.z;
        return uToneCurve2.w;
    }
    if (index < 13.0) return uToneCurve3.x;
    if (index < 14.0) return uToneCurve3.y;
    if (index < 15.0) return uToneCurve3.z;
    return uToneCurve3.w;
}

float toneCurve(float value) {
    float position = clamp(value, 0.0, 1.0) * 15.0;
    float lower = floor(position);
    return mix(toneCurvePoint(lower), toneCurvePoint(min(lower + 1.0, 15.0)), fract(position));
}

float orientedToneCurve(float value) {
    float normal = toneCurve(value);
    float inverted = 1.0 - toneCurve(1.0 - value);
    return mix(normal, inverted, clamp(uInvert, 0.0, 1.0));
}

float depthTone(float depth, float focus, float range, float detail) {
    float halfRange = max(range, 0.01) * 0.5;
    float lower = clamp(focus - halfRange, 0.0, 1.0);
    float upper = clamp(focus + halfRange, 0.0, 1.0);
    float linear = clamp((depth - lower) / max(upper - lower, 0.001), 0.0, 1.0);
    float curveLower = orientedToneCurve(lower);
    float equalized = clamp(
        (orientedToneCurve(depth) - curveLower) /
            max(orientedToneCurve(upper) - curveLower, 0.001),
        0.0,
        1.0
    );
    return mix(linear, equalized, clamp(detail, 0.0, 1.0));
}

vec3 turbo(float x) {
    vec4 kRed = vec4(0.13572138, 4.61539260, -42.66032258, 132.13108234);
    vec4 kGreen = vec4(0.09140261, 2.19418839, 4.84296658, -14.18503333);
    vec4 kBlue = vec4(0.10667330, 12.64194608, -60.58204836, 110.36276771);
    vec2 kRed2 = vec2(-152.94239396, 59.28637943);
    vec2 kGreen2 = vec2(4.27729857, 2.82956604);
    vec2 kBlue2 = vec2(-89.90310912, 27.34824973);
    vec4 v4 = vec4(1.0, x, x * x, x * x * x);
    vec2 v2 = v4.zw * v4.z;
    return vec3(dot(v4, kRed) + dot(v2, kRed2), dot(v4, kGreen) + dot(v2, kGreen2), dot(v4, kBlue) + dot(v2, kBlue2));
}

vec3 palette(float depth) {
    if (uPalette < 0.5) return clamp(turbo(depth), 0.0, 1.0);
    if (uPalette < 1.5) return mix(vec3(0.267, 0.005, 0.329), vec3(0.993, 0.906, 0.144), smoothstep(0.0, 1.0, depth));
    return mix(vec3(0.002, 0.001, 0.014), vec3(0.988, 0.998, 0.645), pow(depth, 0.75));
}

float randomValue(vec2 p) {
    return fract(sin(dot(p, vec2(127.1, 311.7))) * 43758.5453);
}

float valueNoise(vec2 p) {
    vec2 cell = floor(p);
    vec2 local = fract(p);
    local = local * local * (3.0 - 2.0 * local);
    return mix(
        mix(randomValue(cell), randomValue(cell + vec2(1.0, 0.0)), local.x),
        mix(randomValue(cell + vec2(0.0, 1.0)), randomValue(cell + vec2(1.0, 1.0)), local.x),
        local.y
    );
}

float fractalNoise(vec2 p, float detail) {
    float amount = clamp(detail, 0.0, 1.0);
    float noise = valueNoise(p);
    noise += valueNoise(p * 2.03 + vec2(7.1, 3.7)) * 0.5 * amount;
    noise += valueNoise(p * 4.11 + vec2(2.3, 9.2)) * 0.25 * amount;
    return noise / (1.0 + 0.75 * amount);
}

void main() {
    vec4 src = texture2D(uSrc, vSrcTexCoord);
    float depth = readDepth(vMaskTexCoord);
    if (uMode < 0.5) {
        float value = uValue3 > 0.5
            ? pow(clamp((depth - 0.5) * max(uValue0, 0.0) + 0.5, 0.0, 1.0), 1.0 / max(uValue1, 0.01))
            : depthTone(depth, uValue0, uValue1, uValue2);
        gl_FragColor = vec4(vec3(value) * src.a, src.a);
    } else if (uMode < 1.5) {
        float bands = floor(max(uValue0, 0.0) + 0.5);
        float mapped = bands > 1.0 ? floor(depth * bands) / max(bands - 1.0, 1.0) : depth;
        mapped = mix(mapped, depth, clamp(uValue1, 0.0, 1.0));
        gl_FragColor = vec4(palette(mapped) * src.a, src.a);
    } else if (uMode < 2.5) {
        float value = depthTone(depth, uValue0, uValue1, uValue2);
        vec4 color = mix(uColor0, uColor1, value);
        gl_FragColor = vec4(color.rgb * src.a * color.a, src.a * color.a);
    } else if (uMode < 3.5) {
        float softness = max(uValue2, 0.0001);
        float mask = smoothstep(uValue0 - softness, uValue0 + softness, depth) * (1.0 - smoothstep(uValue1 - softness, uValue1 + softness, depth));
        gl_FragColor = vec4(src.rgb * mask, src.a * mask);
    } else if (uMode < 4.5) {
        float spacing = max(uValue0, 0.01);
        float distanceToLine = abs(fract((depth + uValue2) / spacing) - 0.5) * spacing;
        float thickness = max(uValue1, 0.001);
        float line = 1.0 - smoothstep(thickness, thickness + max(uValue3, 0.0001), distanceToLine);
        gl_FragColor = vec4(mix(src.rgb, uColor0.rgb * src.a, line * uColor0.a), src.a);
    } else if (uMode < 5.5) {
        float scale = mix(2.0, 16.0, clamp(uValue4, 0.0, 1.0));
        float noise = 0.65 + fractalNoise(vSrcTexCoord * scale, uValue5) * 0.7;
        float textureAmount = mix(1.0, noise, clamp(uValue2, 0.0, 1.0));
        float fogDepth = clamp((uValue1 - depth) / max(uValue3, 0.001), 0.0, 1.0);
        float fog = clamp(fogDepth * clamp(uValue0, 0.0, 1.0) * textureAmount * uColor0.a, 0.0, 1.0);
        gl_FragColor = vec4(mix(src.rgb, uColor0.rgb * src.a, fog), src.a);
    } else if (uMode < 6.5) {
        float blur = clamp((abs(depth - uValue0) - uValue1) * 4.0, 0.0, 1.0) * clamp(uValue2, 0.0, 1.0);
        gl_FragColor = mix(src, texture2D(uBlur, vSrcTexCoord), blur);
    } else {
        float distanceToFocus = abs(depth - uValue0);
        float selected = 1.0 - smoothstep(max(uValue1, 0.0), max(uValue1 + uValue2, 0.001), distanceToFocus);
        float luminance = dot(src.rgb, vec3(0.2126, 0.7152, 0.0722));
        gl_FragColor = vec4(mix(vec3(luminance), src.rgb, selected), src.a);
    }
}
