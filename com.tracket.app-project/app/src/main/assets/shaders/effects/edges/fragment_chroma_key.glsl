precision highp float;

uniform sampler2D uTexture;

uniform vec3 uKeyColor;          // colour picked with pipette (linear RGB 0-1)
uniform float uTolerance;         // matte softness (distance in Cb-Cr)
uniform float uShadowThreshold;   // luminance below which pixels become “shadow”
uniform float uShadowOpacity;     // 0-1 visibility of those shadows
uniform float uDespill;           // 0-1 strength of spill suppression

varying vec2 vTexCoord;

const vec3 LUMA = vec3(0.299, 0.587, 0.114);   // ITU-R BT.601

/* Convert RGB to (Cb,Cr) — Y is not needed here */
vec2 toCbCr(vec3 c) {
    return vec2(
    -0.169 * c.r - 0.331 * c.g + 0.500 * c.b, // Cb
    0.500 * c.r - 0.419 * c.g - 0.081 * c.b);  // Cr
}

/* Generic despill (works for red / green / blue key):
   – chan 0 = R, 1 = G, 2 = B
   – removes ONLY the excess of that channel over the other two
   – re-adds half of that energy to each remaining channel to keep luma */
vec3 despillGeneric(vec3 col, int chan, float strength) {
    float over;   // amount of keyed channel above the others
    float remove; // amount to subtract

    if (chan == 0) {
        over = max(col.r - max(col.g, col.b), 0.0);
        remove = over * strength;
        col.r -= remove;
        col.g += remove * 0.5;
        col.b += remove * 0.5;
    } else if (chan == 1) {
        over = max(col.g - max(col.r, col.b), 0.0);
        remove = over * strength;
        col.g -= remove;
        col.r += remove * 0.5;
        col.b += remove * 0.5;
    } else {
        over = max(col.b - max(col.r, col.g), 0.0);
        remove = over * strength;
        col.b -= remove;
        col.r += remove * 0.5;
        col.g += remove * 0.5;
    }

    return clamp(col, 0.0, 1.0);      // keep result in [0-1]
}

void main() {
    vec4 src = texture2D(uTexture, vTexCoord);   // premultiplied

    float lumSrc = dot(src.rgb, LUMA);
    float lumKey = dot(uKeyColor, LUMA);

    const float yWeight = 0.25;

    float chromaD = distance(toCbCr(src.rgb), toCbCr(uKeyColor));
    float lumaD = abs(lumSrc - lumKey) * yWeight;
    float dist = sqrt(chromaD * chromaD + lumaD * lumaD);

    float objMask = smoothstep(uTolerance, uTolerance * 1.5, dist);   // 0 = bg, 1 = fg
    float shadow = 0.0;
    float shadowRaw = clamp((uShadowThreshold - lumSrc) / uShadowThreshold, 0.0, 1.0);
    float shadowK = smoothstep(uShadowThreshold * 0.5, uShadowThreshold * 1.5, lumKey);

    shadow = shadowRaw * uShadowOpacity * shadowK;

    int keyChan = (uKeyColor.r >= uKeyColor.g && uKeyColor.r >= uKeyColor.b) ? 0 :
    (uKeyColor.g >= uKeyColor.b) ? 1 : 2;

    float spillMask = 1.0 - objMask;               // 1 = bg / edge
    vec3 despilled = despillGeneric(src.rgb, keyChan, uDespill);
    vec3 cleaned = mix(src.rgb, despilled, spillMask);

    float finalA = max(objMask, shadow) * src.a;
    vec3 finalRGB = cleaned * finalA;              // premultiply

    gl_FragColor = vec4(finalRGB, finalA);
}