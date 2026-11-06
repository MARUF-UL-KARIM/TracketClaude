#extension GL_OES_EGL_image_external : require
precision highp float;

uniform samplerExternalOES uTexture;
varying vec2 vTexCoord;

// ---- Controls (set from Kotlin) ----
uniform int   uExpandVideoRange; // 1 = expand 16–235 -> 0–1, 0 = off
uniform float uContrast;         // ~1.00..1.08  (1.05 is a good start)
uniform float uSaturation;       // ~1.00..1.08  (1.05 is a good start)
uniform float uGammaComp;        // ~0.96..1.04  (1.02 removes gray veil)
uniform float uHueRadians;       // small hue shift, e.g. ±0.02 rad (~±1.1°)

// ---- sRGB helpers ----
vec3 srgbToLinear(vec3 c) {
    bvec3 cut = lessThanEqual(c, vec3(0.04045));
    vec3 low  = c / 12.92;
    vec3 high = pow(max((c + 0.055) / 1.055, 0.0), vec3(2.4));
    return mix(high, low, vec3(cut));
}
vec3 linearToSrgb(vec3 c) {
    bvec3 cut = lessThanEqual(c, vec3(0.0031308));
    vec3 low  = c * 12.92;
    vec3 high = 1.055 * pow(max(c, 0.0), vec3(1.0/2.4)) - 0.055;
    return mix(high, low, vec3(cut));
}

// ---- tiny hue-rotate around luma/chroma (Rec.709-ish) ----
vec3 hueRotate(vec3 lin, float angle) {
    if (abs(angle) < 1e-5) return lin;
    float Y  = dot(lin, vec3(0.2126, 0.7152, 0.0722));
    float Cb = dot(lin, vec3(-0.1146, -0.3854, 0.5000));
    float Cr = dot(lin, vec3( 0.5000, -0.4542, -0.0458));
    float ca = cos(angle), sa = sin(angle);
    float Cb2 = Cb * ca - Cr * sa;
    float Cr2 = Cb * sa + Cr * ca;
    // back to RGB (approx)
    vec3 rgb = vec3(
    Y + 1.5748 * Cr2,
    Y - 0.1873 * Cb2 - 0.4681 * Cr2,
    Y + 1.8556 * Cb2
    );
    return rgb;
}

void main() {
    // keep your bounds/alpha early-outs
    if (any(lessThan(vTexCoord, vec2(0.0))) || any(greaterThan(vTexCoord, vec2(1.0)))) discard;

    vec4 c = texture2D(uTexture, vTexCoord);
    if (c.a <= 0.0) discard;

    // ---- 1) sRGB -> linear (do math in linear) ----
    vec3 lin = srgbToLinear(c.rgb);

    // ---- 2) optional Limited(16–235) -> Full(0–1) in sRGB space for better perception ----
    if (uExpandVideoRange == 1) {
        vec3 g = linearToSrgb(lin);
        g = clamp((g - (16.0/255.0)) * (255.0/219.0), 0.0, 1.0);
        lin = srgbToLinear(g);
    }

    // ---- 3) gentle contrast around mid-gray (~0.214 linear ≈ 0.5 sRGB) ----
    float mid = 0.214;
    lin = (lin - vec3(mid)) * uContrast + vec3(mid);

    // ---- 4) gentle saturation in linear using Rec.709 luma ----
    float luma = dot(lin, vec3(0.2126, 0.7152, 0.0722));
    lin = mix(vec3(luma), lin, uSaturation);

    // ---- 4.5) optional tiny hue adjustment ----
    lin = hueRotate(lin, uHueRadians);

    // ---- 5) tiny gamma compensation in sRGB space, then output ----
    vec3 srgb = linearToSrgb(lin);
    srgb = pow(max(srgb, 0.0), vec3(uGammaComp));

    // Force opaque in this pass (avoid premult alpha darkening if blending is on)
    gl_FragColor = vec4(clamp(srgb, 0.0, 1.0), 1.0);
}