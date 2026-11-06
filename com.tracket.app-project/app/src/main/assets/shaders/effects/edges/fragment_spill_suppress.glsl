precision highp float;

uniform sampler2D uTexture;

uniform vec3  uKeyColor;   // linear RGB in [0..1]
uniform float uTolerance;  // influence falloff radius in (Cb,Cr) (+ a bit of Y)
uniform float uDespill;    // base strength 0..1

varying vec2 vTexCoord;

const vec3 LUMA = vec3(0.299, 0.587, 0.114); // BT.601

// RGB -> (Cb,Cr). We ignore Y for distance core and blend a little separately.
vec2 toCbCr(vec3 c) {
    return vec2(
    -0.169 * c.r - 0.331 * c.g + 0.500 * c.b, // Cb
    0.500 * c.r - 0.419 * c.g - 0.081 * c.b  // Cr
    );
}

/*
 Generic despill (channel-agnostic):
  - chan: 0=R, 1=G, 2=B
  - removes only the channel's EXCESS over the other two
  - re-adds half of removed energy to each remaining channel (keeps luma steadier)
*/
vec3 despillGeneric(vec3 col, int chan, float strength) {
    float over, remove;
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
    return clamp(col, 0.0, 1.0);
}

void main() {
    // Source is premultiplied in your pipeline
    vec4 src = texture2D(uTexture, vTexCoord);

    // Distance to the key colour, primarily in chroma with light Y influence
    float lumSrc = dot(src.rgb, LUMA);
    float lumKey = dot(uKeyColor, LUMA);
    float chromaD = distance(toCbCr(src.rgb), toCbCr(uKeyColor));
    float lumaD   = abs(lumSrc - lumKey) * 0.25;     // small Y weight
    float dist    = sqrt(chromaD*chromaD + lumaD*lumaD);

    // Influence mask: 1 near key colour, 0 far away
    float w = 1.0 - smoothstep(uTolerance, uTolerance * 1.5, dist);

    // Determine which channel is the key (max component of uKeyColor)
    int keyChan = (uKeyColor.r >= uKeyColor.g && uKeyColor.r >= uKeyColor.b) ? 0
    : (uKeyColor.g >= uKeyColor.b) ? 1 : 2;

    // Apply despill with spatially varying strength
    float strength = uDespill * w;
    vec3  cleaned  = despillGeneric(src.rgb, keyChan, strength);

    // Keep alpha unchanged; output premultiplied RGB
    gl_FragColor = vec4(cleaned, src.a);
}