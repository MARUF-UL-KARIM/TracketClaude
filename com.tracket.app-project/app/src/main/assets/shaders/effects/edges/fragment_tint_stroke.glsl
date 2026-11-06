precision highp float;

uniform sampler2D uTexture;     // premultiplied RGBA input
uniform vec3  uTintColor;       // linear RGB 0..1
uniform float uStrength;        // 0..1, how strongly to tint
uniform float uPreserveLuma;    // 0..1, 1 = keep original luminance

uniform float uAlphaThreshold;  // 0..1, threshold for alpha binarization (e.g. 0.5)
uniform float uAlphaSoftness;   // 0..1, 0 = hard edge, >0 = smooth edge width (~soft zone)

varying vec2 vTexCoord;

const vec3 LUMA = vec3(0.299, 0.587, 0.114);

void main() {
    // Read premultiplied source
    vec4 src = texture2D(uTexture, vTexCoord);
    float aIn = src.a;

    // --- 1) Convert to straight RGB for correct tint math ---
    // If alpha is zero, keep rgb as-is to avoid NaNs
    vec3 rgb = (aIn > 0.0) ? (src.rgb / aIn) : src.rgb;

    // --- 2) Tint toward uTintColor with strength uStrength ---
    float k = clamp(uStrength, 0.0, 1.0);
    vec3 tinted = mix(rgb, uTintColor, k);

    // Optional luminance preservation
    float keepY = clamp(uPreserveLuma, 0.0, 1.0);
    if (keepY > 0.0) {
        float y0 = dot(rgb,    LUMA) + 1e-6;
        float y1 = dot(tinted, LUMA) + 1e-6;
        float scale = mix(1.0, y0 / y1, keepY);
        tinted *= scale;
    }

    // Clamp color in straight space
    tinted = clamp(tinted, 0.0, 1.0);

    // --- 3) Alpha thresholding ---
    // Hard edge by default: aOut = 0.0 or 1.0 around uAlphaThreshold.
    // If uAlphaSoftness > 0, use smoothstep band around the threshold.
    float T = clamp(uAlphaThreshold, 0.0, 1.0);
    float S = clamp(uAlphaSoftness,  0.0, 1.0);

    float aOut;
    if (S <= 0.0) {
        // Hard binary threshold
        aOut = step(T, aIn);            // aIn < T -> 0, aIn >= T -> 1
    } else {
        // Soft transition in a band of width ~S around T.
        // Map: [T - S, T + S] -> [0..1]
        float edge0 = clamp(T - S, 0.0, 1.0);
        float edge1 = clamp(T + S, 0.0, 1.0);
        aOut = smoothstep(edge0, edge1, aIn);
        // If you still want a near-binary feel with a tiny feather,
        // you can sharpen with a power curve, e.g.:
        // aOut = pow(aOut, 0.7); // optional
    }

    // --- 4) Back to premultiplied for output ---
    gl_FragColor = vec4(tinted * aOut, aOut);
}