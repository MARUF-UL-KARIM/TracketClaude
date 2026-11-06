precision highp float;

uniform sampler2D uSharpTexture;
uniform sampler2D uBlurTexture;
uniform float uAngleDeg;
uniform float uFocusWidth;
uniform float uFeather;
uniform float uOffset;
uniform float uAspect;

varying vec2 vTexCoord;

void main() {
    vec2 p = vTexCoord - vec2(0.5, 0.5);
    p.y *= uAspect;

    float a = radians(uAngleDeg);
    vec2 n = vec2(-sin(a), cos(a));

    float d = dot(p, n) - (uOffset * 0.5);

    float inner = max(0.0, 0.5 * uFocusWidth);
    float feather = max(uFeather, 1e-6);

    float w = smoothstep(inner, inner + feather, abs(d));

    vec4 sharpCol = texture2D(uSharpTexture, vTexCoord);
    vec4 blurCol  = texture2D(uBlurTexture,  vTexCoord);

    gl_FragColor = mix(sharpCol, blurCol, w);
}