#extension GL_OES_EGL_image_external: require
precision highp float;

uniform samplerExternalOES uTexture;
varying vec2 vTexCoord;

void main() {
    if (any(lessThan(vTexCoord, vec2(0.0))) || any(greaterThan(vTexCoord, vec2(1.0)))) discard;

    vec4 c = texture2D(uTexture, vTexCoord);

    float a = c.a;
    if (a <= 0.0) discard;

    gl_FragColor = c;
}