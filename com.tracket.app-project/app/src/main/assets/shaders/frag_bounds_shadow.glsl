#extension GL_OES_standard_derivatives: require
precision highp float;

varying vec2 vTexCoord;

uniform vec4  uLineColor;
uniform vec4  uShadowColor;
uniform float uOpacity;

uniform float uLinePx;        // width of border in pixels
uniform float uShadowPx;      // width of shadow in pixels
uniform float uPadScale;      // scale factor used in vertex step

void main() {
    // 1. Calculate pixel scale
    vec2 dx = dFdx(vTexCoord);
    vec2 dy = dFdy(vTexCoord);

    // Pixels per UV (based on the padded geometry)
    float uvPerPxX = length(vec2(dx.x, dy.x));
    float uvPerPxY = length(vec2(dx.y, dy.y));

    vec2 pxPerUV = vec2(
        uvPerPxX > 0.0 ? 1.0 / uvPerPxX : 1000.0,
        uvPerPxY > 0.0 ? 1.0 / uvPerPxY : 1000.0
    );

    // 2. Real Content Box Size
    // The quad is scaled by uPadScale, so UV 0..1 corresponds to the padded area.
    // The original content is 1/uPadScale of that area, centered.
    vec2 contentHalfSizePx = (0.5 / uPadScale) * pxPerUV;

    // Pixel Position from center
    vec2 center = vec2(0.5);
    vec2 posPx = (vTexCoord - center) * pxPerUV;

    // 3. Sharp Box Distance (0 at edge, positive outside)
    vec2 d = abs(posPx) - contentHalfSizePx;
    float dist = max(d.x, d.y);

    // 4. Rendering
    // Bias the outer edge of the line slightly outwards (1px)
    // to cleanly cover any aliased pixels of the underlying texture.
    float bias = 1.0;

    // Line Alpha
    // Extends from inside (-uLinePx) to slightly outside (bias)
    float outerEdge = 1.0 - smoothstep(bias - 1.0, bias, dist);
    float innerEdge = smoothstep(-uLinePx - 1.0, -uLinePx, dist);
    float lineAlpha = outerEdge * innerEdge;

    // Shadow Alpha
    // Starts at bias, fades out over uShadowPx
    float shadowAlpha = 1.0 - smoothstep(bias, bias + uShadowPx, dist);
    // Smooth sigmoid falloff for "softer" look
    shadowAlpha = smoothstep(0.0, 1.0, shadowAlpha);

    // Don't double-draw shadow under opaque line
    float shadowVis = shadowAlpha * (1.0 - lineAlpha);

    // 5. Composite
    vec4 lColor = uLineColor;
    vec4 sColor = uShadowColor;

    vec4 outC = vec4(0.0);
    outC.rgb = (lColor.rgb * lColor.a * lineAlpha) + (sColor.rgb * sColor.a * shadowVis);
    outC.a   = (lColor.a * lineAlpha) + (sColor.a * shadowVis);

    outC *= uOpacity;

    if (outC.a <= 0.001) discard;
    gl_FragColor = outC;
}