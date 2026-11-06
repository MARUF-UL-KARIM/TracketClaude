precision highp float;

uniform sampler2D uTexture;     // premultiplied RGBA
uniform float uThreshold;       // 0..1, luma at which the matte crosses 0.5
uniform float uTolerance;       // 0..1, feather width around threshold

varying vec2 vTexCoord;

const vec3 LUMA = vec3(0.299, 0.587, 0.114); // BT.601

void main() {
    vec4 src = texture2D(uTexture, vTexCoord);   // premultiplied

    vec3 straightRgb = src.a > 1e-5 ? (src.rgb / src.a) : vec3(0.0);
    float lum = dot(straightRgb, LUMA);

    // Feathered ramp: below t0 => bg (0), above t1 => fg (1)
    float halfTol = max(uTolerance * 0.5, 1e-5);
    float t0 = clamp(uThreshold - halfTol, 0.0, 1.0);
    float t1 = clamp(uThreshold + halfTol, 0.0, 1.0);

    float objMask = smoothstep(t0, t1, lum);

    // Premultiplied output
    float outA = objMask * src.a;
    vec3  outRGB = src.rgb * objMask;

    gl_FragColor = vec4(outRGB, outA);
}
