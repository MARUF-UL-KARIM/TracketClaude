#extension GL_OES_standard_derivatives : require
precision highp float;

/* Inputs */
uniform sampler2D uTexture;      // 2D source (NOT ExternalOES)
uniform vec2      uTextureSize;  // source size in texels (w,h)
uniform float     uSupport;      // 3.0 for Lanczos-3 (filter radius in px OR texels, adaptively)
uniform vec4      uCropUv;       // (minU, minV, maxU, maxV) in transformed UV

// Optional: small extra crispness only during upscaling (0..0.4 is sane)
uniform float     uUpscaleSharpen; // set 0.0 if not needed

varying vec2      vTexCoord;

/*** Helpers ***/
const int   N  = 24;                 // sample pairs (12..24 is fine)
const float PI = 3.141592653589793;
const float GOLDEN_ANGLE = 2.39996323;

float sinc(float x){
    float ax = abs(x);
    if (ax < 1e-5) return 1.0;
    float pix = PI * ax;
    return sin(pix) / pix;
}

float lanczos3(float r){
    float ar = abs(r);
    if (ar >= 3.0) return 0.0;
    return sinc(ar) * sinc(ar / 3.0);
}

vec2 spiral01(int i){
    float fi = float(i) + 0.5;
    float r  = sqrt(fi / float(N));
    float a  = fi * GOLDEN_ANGLE;
    return r * vec2(cos(a), sin(a));
}

// Sample with crop guard (transparent outside)
vec4 texture2D_cropped(sampler2D tex, vec2 uv) {
    bvec4 inside = bvec4(uv.x >= uCropUv.x, uv.y >= uCropUv.y, uv.x < uCropUv.z, uv.y < uCropUv.w);
    return all(inside) ? texture2D(tex, uv) : vec4(0.0);
}

void main(){
    vec2 uv = vTexCoord;

    // Derivatives in TEXEL units: how many texels per screen pixel
    vec2 dx  = dFdx(uv) * uTextureSize;
    float s0 = length(dx);
    vec2 e0  = (s0 > 1e-6) ? (dx / s0) : vec2(1.0, 0.0);

    vec2 dy  = dFdy(uv) * uTextureSize;
    // Make e1 orthogonal to e0
    dy  -= dot(dy, e0) * e0;
    float s1 = length(dy);
    vec2 e1  = (s1 > 1e-6) ? (dy / s1) : vec2(-e0.y, e0.x);

    s0 = max(s0, 1e-6);
    s1 = max(s1, 1e-6);

    // Decide minify vs magnify per-axis by looking at texels-per-pixel:
    //  - if s>1: minification → radius grows with s (low-pass)
    //  - if s<1: magnification → fixed reconstruction radius in source texels
    float r0 = uSupport * max(1.0, s0);
    float r1 = uSupport * max(1.0, s1);

    // Accumulators
    vec4  acc  = texture2D_cropped(uTexture, uv);
    float wsum = 1.0;

    // Symmetric EWA Lanczos-3 pairs
    for (int i = 0; i < N; ++i){
        vec2 p      = spiral01(i);                           // unit disk sample
        vec2 offTex = e0 * (p.x * r0) + e1 * (p.y * r1);     // offset in TEXEL space
        vec2 uvOff  = offTex / uTextureSize;                 // convert to UV

        // Radial distance for kernel window (normalize by uSupport)
        float r = length(vec2(p.x * max(1.0, s0), p.y * max(1.0, s1)));
        r = uSupport * r;

        float w = lanczos3(r);
        if (w <= 0.0) continue;

        vec4 sA = texture2D_cropped(uTexture, uv + uvOff);
        vec4 sB = texture2D_cropped(uTexture, uv - uvOff);

        acc  += (sA + sB) * w;
        wsum += 2.0 * w;
    }

    vec4 color = (wsum > 0.0) ? (acc / wsum) : vec4(0.0);

    // Optional tiny crispness only when magnifying (prevents perceived softness)
    // Unsharp-like: add a fraction of (color - local blur). We approximate the blur
    // by reusing the central sample vs the averaged result.
    float aniso = max(s0, s1);
    if (uUpscaleSharpen > 0.0 && aniso < 1.0) {
        // Edge-aware gain using derivatives to avoid over-sharpening at high zoom
        float gain = uUpscaleSharpen * (1.0 - aniso); // fades out as we approach 1:1
        // Since 'color' is already a local average, treat 'center' as detail proxy
        vec4 center = texture2D_cropped(uTexture, uv);
        color = clamp(color + gain * (center - color), 0.0, 1.0);
    }

    gl_FragColor = color;
}