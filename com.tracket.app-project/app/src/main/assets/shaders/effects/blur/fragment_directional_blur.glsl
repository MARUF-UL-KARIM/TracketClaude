// Directional Gaussian Blur (premultiplied alpha)
// ----------------------------------------------
// This shader applies a 1D Gaussian blur along an arbitrary direction.
// The host supplies uBlurDirection as the per-tap UV step in the same space as vTexCoord.

precision highp float;

// ---- Inputs --------------------------------------------------------------------
uniform sampler2D uTexture;      // Premultiplied RGBA input
uniform vec2  uBlurDirection;    // Step per tap in UV units (0..1)
uniform float uSigma;            // Blur sigma in "pixel taps" along uBlurDirection
uniform float uHardness;         // 0..1: 0 = pure Gaussian, 1 = "hard-edged" alpha mix

varying vec2 vTexCoord;          // Current fragment UV (0..1)


// ---- Hard safety caps (tweak as needed) ----------------------------------------
// Max samples to avoid long loops on some ES drivers. support ∈ [0..MAX_SUPPORT].
const int   MAX_SUPPORT     = 64;     // => up to 129 taps (-64..+64) if ever needed
// Sigma clamp to keep the kernel finite even under huge scales.
const float MAX_SIGMA_PIX   = 64.0;   // in "tap units" (roughly pixels along dir)
// Clamp the effective step length per tap to avoid exploding offsets.
// Values are in UV units (0..1). Keep MIN > 0 to prevent denorm/precision issues.
const float MIN_DST_STEP    = 1.0 / 8192.0;
const float MAX_DST_STEP    = 1.0 / 256.0;


// ---- 1D Gaussian blur along arbitrary direction (premultiplied) ----------------
vec4 gaussianDirectionalBlur(vec2 stepUv, float sigmaPix, vec2 uv) {
    // Support = ±3σ (classic Gaussian cutoff). Also clamp to driver-safe bound.
    int support = int(min(float(MAX_SUPPORT), ceil(sigmaPix * 3.0)));

    vec4 acc = vec4(0.0);     // premultiplied RGBA accumulator
    float wSum = 0.0;         // sum of all weights (including out-of-bounds taps)

    // Center tap (i=0)
    {
        float w0 = 1.0;       // exp(0) = 1
        vec4 c0 = texture2D(uTexture, uv);
        acc += c0 * w0;
        wSum += w0;
    }

    // Symmetric taps (±i)
    for (int i = 1; i <= MAX_SUPPORT; ++i) {
        if (i > support) break;

        float fi = float(i);
        // Standard discrete Gaussian coefficient
        float w = exp(-0.5 * (fi * fi) / (sigmaPix * sigmaPix));

        vec2 d = fi * stepUv;

        // +i
        vec2 uvP = uv + d;
        if (uvP.x >= 0.0 && uvP.x <= 1.0 && uvP.y >= 0.0 && uvP.y <= 1.0) {
            acc += texture2D(uTexture, uvP) * w;
        }
        // -i
        vec2 uvM = uv - d;
        if (uvM.x >= 0.0 && uvM.x <= 1.0 && uvM.y >= 0.0 && uvM.y <= 1.0) {
            acc += texture2D(uTexture, uvM) * w;
        }

        // Always add both weights to wSum (keeps energy near borders)
        wSum += 2.0 * w;
    }

    // Normalize (still in premultiplied space)
    if (wSum > 0.0) acc *= (1.0 / wSum);
    return acc;
}


void main() {
    // 1) Clamp sigma for stability. Interpret uSigma as "tap units" (pixels along dir).
    float sigmaPix = clamp(uSigma, 0.0, MAX_SIGMA_PIX);

    // Fast path for tiny sigma (no-op).
    if (sigmaPix < 1.0) {
        gl_FragColor = texture2D(uTexture, vTexCoord);
        return;
    }

    // 2) Use provided blur direction directly (but clamp step length for stability).
    vec2 stepUv = uBlurDirection;
    float len = length(stepUv);
    if (len > 0.0) {
        float clamped = clamp(len, MIN_DST_STEP, MAX_DST_STEP);
        stepUv *= (clamped / len);
    } else {
        stepUv = vec2(MIN_DST_STEP, 0.0);
    }

    // 3) Run Gaussian blur along that direction.
    vec4 blurred = gaussianDirectionalBlur(stepUv, sigmaPix, vTexCoord);

    // 4) Optional "hardness" mix to keep inner alpha crisper if desired.
    vec4 center = texture2D(uTexture, vTexCoord);
    float hardAlpha = max(center.a, blurred.a);

    // Convert blurred premultiplied to straight for RGB rescale, then re-premultiply.
    vec3 hardRgb = (blurred.a > 0.001) ? (blurred.rgb / blurred.a) * hardAlpha : vec3(0.0);
    vec4 hardColor = vec4(hardRgb, hardAlpha);

    // 5) Final mix: uHardness=0 → pure Gaussian; uHardness=1 → hard alpha preserved.
    gl_FragColor = mix(blurred, hardColor, clamp(uHardness, 0.0, 1.0));
}