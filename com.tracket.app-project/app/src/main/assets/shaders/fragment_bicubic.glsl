precision highp float;

uniform sampler2D uTexture;
uniform vec2 uTextureSize;
varying vec2 vTexCoord;

vec4 cubic(float v) {
    vec4 n = vec4(1.0, 2.0, 3.0, 4.0) - v;
    vec4 s = n * n * n;
    float x = s.x;
    float y = s.y - 4.0 * s.x;
    float z = s.z - 4.0 * s.y + 6.0 * s.x;
    float w = 6.0 - x - y - z;
    return vec4(x, y, z, w) / 6.0;
}

void main() {
    if (any(lessThan(vTexCoord, vec2(0.0))) || any(greaterThan(vTexCoord, vec2(1.0)))) discard;

    vec2 texel = 1.0 / uTextureSize;
    vec2 uv = vTexCoord * uTextureSize - 0.5;
    vec2 fxy = fract(uv);
    uv -= fxy;

    vec4 xcubic = cubic(fxy.x);
    vec4 ycubic = cubic(fxy.y);

    vec4 c = uv.xxyy + vec2(-0.5, 1.5).xyxy;
    vec4 s = vec4(xcubic.xz + xcubic.yw, ycubic.xz + ycubic.yw);
    vec4 offset = c + vec4(xcubic.yw, ycubic.yw) / s;
    offset *= texel.xxyy;

    vec4 sample0 = texture2D(uTexture, offset.xz);
    vec4 sample1 = texture2D(uTexture, offset.yz);
    vec4 sample2 = texture2D(uTexture, offset.xw);
    vec4 sample3 = texture2D(uTexture, offset.yw);

    float sx = s.x / (s.x + s.y);
    float sy = s.z / (s.z + s.w);
    vec4 c0 = mix(sample1, sample0, sx);
    vec4 c1 = mix(sample3, sample2, sx);
    vec4 color = mix(c1, c0, sy);

    if (color.a <= 0.0) discard;
    gl_FragColor = color;
}
