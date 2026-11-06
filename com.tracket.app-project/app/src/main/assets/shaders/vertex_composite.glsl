attribute vec4 aPosition;
attribute vec2 aTexCoord;

uniform mat4 uTexMatrix;

varying vec2 vSrcTexCoord;
varying vec2 vDstTexCoord;

void main() {
    gl_Position = aPosition;

    vSrcTexCoord = (uTexMatrix * vec4(aTexCoord, 0, 1)).xy;
    vDstTexCoord = aTexCoord;
}
