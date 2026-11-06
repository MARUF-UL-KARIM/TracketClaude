precision highp float;

uniform sampler2D uTexture;
uniform vec2 uTextureSize;
varying vec2 vTexCoord;

void main() {
    if (any(lessThan(vTexCoord, vec2(0.0))) || any(greaterThan(vTexCoord, vec2(1.0)))) discard;

    vec2 uv = vTexCoord * uTextureSize + 0.5;
    vec2 iuv = floor(uv);
    vec2 fuv = fract(uv);
    fuv = fuv * fuv * (3.0 - 2.0 * fuv);
    uv = (iuv + fuv - 0.5) / uTextureSize;

    vec4 c = texture2D(uTexture, uv);
    if (c.a <= 0.0) discard;

    gl_FragColor = c;
}
