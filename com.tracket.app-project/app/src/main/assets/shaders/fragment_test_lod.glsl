#version 300 es
precision highp float;

uniform sampler2D uTexture;
uniform float uOpacity;

in vec2 vTexCoord;
out vec4 outColor;

void main() {
    // Keep your clamp/discard logic
    if (any(lessThan(vTexCoord, vec2(0.0))) || any(greaterThan(vTexCoord, vec2(1.0)))) discard;

    // Automatic LOD selection happens here
    vec4 c = texture(uTexture, vTexCoord);

    c *= uOpacity;
    if (c.a <= 0.0) discard;

    outColor = c;
}