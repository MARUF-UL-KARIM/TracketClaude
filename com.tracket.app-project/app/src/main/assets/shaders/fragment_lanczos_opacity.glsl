#extension GL_OES_standard_derivatives : require
precision highp float;

/* Inputs */
uniform sampler2D uTexture;      // 2D source (NOT ExternalOES)
uniform vec2      uTextureSize;  // source size in texels (w,h)
uniform float     uOpacity;      // 0..1
uniform float     uSupport;      // 3.0 for Lanczos-3 (filter radius in px)
uniform vec4      uCropUv;       // (minU, minV, maxU, maxV) in transformed UV

varying vec2      vTexCoord;

/*** Minimal helpers ***/
const int   N  = 24;                 // sample pairs (12..24 is fine)
const float PI = 3.141592653589793;
const float GOLDEN_ANGLE = 2.39996323;

// sinc(x) = sin(pi x)/(pi x)
float sinc(float x){
    float ax = abs(x);
    if (ax < 1e-5) return 1.0;
    float pix = PI * ax;
    return sin(pix) / pix;
}

// Lanczos-3 kernel
float lanczos3(float r){
    float ar = abs(r);
    if (ar >= 3.0) return 0.0;
    return sinc(ar) * sinc(ar / 3.0);
}

// Even Poisson-like placements inside unit disk (no const arrays)
vec2 spiral01(int i){
    float fi = float(i) + 0.5;
    float r  = sqrt(fi / float(N));
    float a  = fi * GOLDEN_ANGLE;
    return r * vec2(cos(a), sin(a));
}

// ** NEW HELPER FUNCTION **
// Samples the texture, but returns transparent black if outside the crop rectangle.
// This allows the Lanczos filter to correctly anti-alias the crop edge.
vec4 texture2D_cropped(sampler2D tex, vec2 uv) {
    // Check if the UV coordinate is within the uCropUv bounds
    bvec4 inside = bvec4(uv.x >= uCropUv.x, uv.y >= uCropUv.y, uv.x < uCropUv.z, uv.y < uCropUv.w);
    if (all(inside)) {
        return texture2D(tex, uv);
    } else {
        return vec4(0.0); // Return transparent black for samples outside the crop area
    }
}


void main(){
    vec2 uv = vTexCoord;

    // Derivatives in TEXEL units (pseudo-SVD directions e0/e1)
    vec2 e0 = dFdx(uv) * uTextureSize;
    float s0 = length(e0);
    if (s0 > 1e-6) e0 /= s0; else { e0 = vec2(1.0, 0.0); s0 = 1e-6; }

    vec2 tmp = dFdy(uv) * uTextureSize;
    tmp -= dot(tmp, e0) * e0;
    float s1 = length(tmp);
    vec2 e1 = (s1 > 1e-6) ? (tmp / s1) : vec2(-e0.y, e0.x);
    s1 = max(s1, 1e-6);

    // Ellipse semi-axes in texels (screen-radius ≈ uSupport)
    float r0 = uSupport * s0;
    float r1 = uSupport * s1;

    // The central sample has a weight of lanczos3(0.0) which is 1.0
    vec4 acc  = texture2D_cropped(uTexture, uv);
    float wsum = 1.0;

    // Symmetric EWA Lanczos-3 pairs
    for (int i = 0; i < N; ++i){
        vec2 p      = spiral01(i);                           // unit disk
        vec2 offTex = e0 * (p.x * r0) + e1 * (p.y * r1);     // texel space
        vec2 uvOff  = offTex / uTextureSize;

        float r = uSupport * length(p);
        float w = lanczos3(r);
        if (w <= 0.0) continue;

        vec2 uv1 = uv + uvOff;
        vec2 uv2 = uv - uvOff;

        // Sample using the new cropped helper. No more coverage calculations needed.
        vec4 sA = texture2D_cropped(uTexture, uv1);
        vec4 sB = texture2D_cropped(uTexture, uv2);

        acc  += (sA + sB) * w;
        wsum += 2.0 * w;
    }

    // Normalize and premultiply alpha for correct composition
    vec4 outC = (wsum > 0.0) ? (acc / wsum) : vec4(0.0);
    outC.a   *= uOpacity;
    outC.rgb *= outC.a;

    gl_FragColor = outC;
}