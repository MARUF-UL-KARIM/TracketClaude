attribute vec4 aPosition;
attribute vec4 aTexCoord;

uniform mat4 uPosMatrix;

varying vec2 vViewportUv;

void main() {
    gl_Position = uPosMatrix * aPosition;
    vViewportUv = aTexCoord.xy;
}
