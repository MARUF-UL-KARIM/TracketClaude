precision highp float;

uniform sampler2D uTexture;
uniform float uOpacity;

varying vec2 vTexCoord;
varying vec2 vTileCoord;

uniform vec2 uTileSpan;
uniform float uEdgeFadeTiles;
uniform mat4 uSourceTexMatrix;

vec2 repeatWrap(vec2 uv) {
    return fract(uv);
}

float safeFade() {
    vec2 halfExt = 0.5 * (uTileSpan - vec2(1.0));
    vec2 distToEdge = halfExt - abs(vTileCoord);
    float edge = min(distToEdge.x, distToEdge.y);

    if (uEdgeFadeTiles <= 0.001) return 1.0;

    float f = smoothstep(0.0, uEdgeFadeTiles, edge);
    return clamp(f, 0.0, 1.0);
}

void main() {
    float fade = safeFade();

    vec2 sourceUv = (uSourceTexMatrix * vec4(repeatWrap(vTexCoord), 0.0, 1.0)).xy;
    vec4 c = texture2D(uTexture, sourceUv);

    c.rgb *= (uOpacity * fade);
    c.a *= (uOpacity * fade);

    if (c.a <= 0.001) discard;
    gl_FragColor = c;
}
