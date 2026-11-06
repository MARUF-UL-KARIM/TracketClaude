#version 300 es
precision highp float;

layout(location = 0) in vec4 aPosition; // (-1..+1)
layout(location = 1) in vec4 aTexCoord; // (0..1)

uniform mat4 uPosMatrix;
uniform mat4 uTexMatrix;

out vec2 vTexCoord;

void main() {
    gl_Position = uPosMatrix * aPosition;
    vTexCoord = (uTexMatrix * aTexCoord).xy;
}