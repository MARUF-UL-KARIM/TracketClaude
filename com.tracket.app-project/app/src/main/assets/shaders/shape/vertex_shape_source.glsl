precision highp float;

attribute vec4 aPosition;
attribute vec4 aTexCoord;

uniform mat4 uPosMatrix;
uniform vec2 uLocalHalfSize;

varying vec2 vLocal;
varying vec2 vUv;

void main() {
    gl_Position = uPosMatrix * aPosition;
    vLocal = aPosition.xy * uLocalHalfSize;
    vUv = aTexCoord.xy;
}
