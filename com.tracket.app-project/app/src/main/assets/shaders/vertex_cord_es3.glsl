#version 300 es

in vec4 aPosition;
in vec4 aTexCoord;

uniform mat4 uTexMatrix;
out vec2 vTexCoord;

void main() {
    gl_Position = aPosition;
    vTexCoord = (uTexMatrix * aTexCoord).xy;
}
