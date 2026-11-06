precision highp float;

uniform sampler2D uSub;
uniform sampler2D uAccum;
uniform float uWeight;

varying vec2 vTexCoord;

void main() {
    vec4 a = texture2D(uAccum, vTexCoord);
    vec4 s = texture2D(uSub,   vTexCoord);
    gl_FragColor = a + s * uWeight;
}
