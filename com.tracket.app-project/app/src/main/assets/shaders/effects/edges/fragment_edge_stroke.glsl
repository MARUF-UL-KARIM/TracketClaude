precision highp float;

uniform sampler2D uTexture;

uniform vec2 uTexel;          // size of one pixel: (1/width, 1/height)
uniform float uWidthPx;       // stroke width in pixels
uniform float uFeatherPx;     // stroke feather in pixels
uniform vec4 uStrokeColor;    // premultiplied stroke color RGBA

varying vec2 vTexCoord;

void main() {
    // 1. Get the original color and alpha from the source texture.
    // The source is expected to have premultiplied alpha.
    vec4 originalColor = texture2D(uTexture, vTexCoord);

    // 2. Dilate the alpha channel to find the outer edge.
    // We sample neighboring pixels in a circular pattern up to uWidthPx away
    // and find the maximum alpha value.
    float maxAlpha = 0.0;
    int radius = int(ceil(uWidthPx));

    if (radius > 0) {
        for (int y = -radius; y <= radius; y++) {
            for (int x = -radius; x <= radius; x++) {
                // Check if the sample is within the circular radius to avoid a boxy look.
                if (length(vec2(x, y)) <= uWidthPx) {
                    vec2 offset = vec2(float(x), float(y)) * uTexel;
                    maxAlpha = max(maxAlpha, texture2D(uTexture, vTexCoord + offset).a);
                }
            }
        }
    }

    // 3. Calculate the stroke's alpha.
    // The stroke exists where the dilated alpha (maxAlpha) is greater than the original alpha.
    // This difference represents the outline area.
    float rawStrokeAlpha = max(0.0, maxAlpha - originalColor.a);

    // 4. Feather the stroke alpha to create a soft edge.
    // We use smoothstep to create a soft transition based on the feather amount.
    // A feather of 0 should be a hard edge, while a larger feather softens it.
    float featherScale = uWidthPx / max(uFeatherPx, 0.001);
    float finalStrokeAlpha = clamp(rawStrokeAlpha * featherScale, 0.0, 1.0);

    // 5. Create the premultiplied stroke color.
    // The final stroke is the uniform color modulated by the calculated alpha.
    vec4 stroke = uStrokeColor * finalStrokeAlpha;

    // 6. Composite the original image OVER the stroke.
    // Using the standard Porter-Duff "over" operator for premultiplied alpha:
    // result = foreground + background * (1 - foreground.alpha)
    vec3 finalRGB = originalColor.rgb + stroke.rgb * (1.0 - originalColor.a);
    float finalA = originalColor.a + stroke.a * (1.0 - originalColor.a);

    gl_FragColor = vec4(finalRGB, finalA);
}