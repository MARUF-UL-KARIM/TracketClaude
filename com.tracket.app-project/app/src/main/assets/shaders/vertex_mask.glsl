attribute vec4 aPosition;
attribute vec2 aTexCoord;

uniform mat4 uSrcTexMatrix;
uniform mat4 uMaskTexMatrix;

varying vec2 vSrcTexCoord;
varying vec2 vMaskTexCoord;

void main() {
    gl_Position = aPosition;

    vec4 base = vec4(aTexCoord, 0.0, 1.0);
    vSrcTexCoord  = (uSrcTexMatrix  * base).xy;
    vMaskTexCoord = (uMaskTexMatrix * base).xy;
}