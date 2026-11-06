// Tint (premultiplied) with offset
// --------------------------------
// This shader tints the input using a target color with optional luminance
// preservation. Additionally, it supports shifting (offsetting) the sampled
// texture by (offsetX, offsetY) expressed in DST/viewport UV space.
//
// Notes:
// - Input texture is premultiplied RGBA.
// - All math preserves premultiplied correctness.
// - Safety limits are hardcoded to keep offsets stable.

precision highp float;

// ---- Inputs --------------------------------------------------------------------
uniform sampler2D uTexture;      // premultiplied RGBA input
uniform vec3  uTintColor;        // linear RGB 0..1
uniform float uStrength;         // 0..1, how strongly to tint
uniform float uPreserveLuma;     // 0..1, 1 = keep original luminance

// Offset in DST/viewport UV units
uniform float uOffsetX;
uniform float uOffsetY;

varying vec2 vTexCoord;          // current fragment UV in DST space (0..1)

const vec3 LUMA = vec3(0.299, 0.587, 0.114);

// ---- Safety caps ---------------------------------------------------------------
const float MIN_DST_OFFSET = 0.0;
const float MAX_DST_OFFSET = 0.5;

bool inside01(vec2 uv) {
    return uv.x >= 0.0 && uv.x <= 1.0 && uv.y >= 0.0 && uv.y <= 1.0;
}

// Clamp the provided DST-space UV offset length to avoid excessive sampling jumps.
vec2 clampDstOffset(vec2 offDst) {
    float len = length(offDst);
    if (len > 0.0) {
        float clamped = clamp(len, MIN_DST_OFFSET, MAX_DST_OFFSET);
        offDst *= (clamped / len);
    }
    return offDst;
}

void main() {
    // 1) Compute sampling UV (vTexCoord is already in DST).
    vec2 sampleUV = vTexCoord + clampDstOffset(vec2(uOffsetX, uOffsetY));

    // 2) Sample source (premultiplied). If outside, use transparent.
    vec4 src = inside01(sampleUV) ? texture2D(uTexture, sampleUV)
    : vec4(0.0);
    float a = src.a;

    // 3) Work in straight RGB for tint math
    vec3 rgb = (a > 0.0) ? (src.rgb / a) : src.rgb;

    // 4) Move color toward the tint color
    float k = clamp(uStrength, 0.0, 1.0);
    vec3 tinted = mix(rgb, uTintColor, k);

    // 5) Optionally preserve original luminance
    float keepY = clamp(uPreserveLuma, 0.0, 1.0);
    if (keepY > 0.0) {
        float y0 = dot(rgb,    LUMA) + 1e-6;
        float y1 = dot(tinted, LUMA) + 1e-6;
        float scale = mix(1.0, y0 / y1, keepY);
        tinted *= scale;
    }

    // 6) Back to premultiplied
    tinted = clamp(tinted, 0.0, 1.0);
    gl_FragColor = vec4(tinted * a, a);
}