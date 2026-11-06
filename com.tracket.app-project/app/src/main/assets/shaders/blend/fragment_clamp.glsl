precision highp float;

uniform sampler2D uTexture;
uniform float uOpacity;
varying vec2 vTexCoord;

void main() {
    if (any(lessThan(vTexCoord, vec2(0.0))) || any(greaterThan(vTexCoord, vec2(1.0)))) discard;

    vec4 c = texture2D(uTexture, vTexCoord);

    c.rgb *= uOpacity;
    c.a *= uOpacity;

    if (c.a <= 0.0) discard;

    gl_FragColor = c;
}