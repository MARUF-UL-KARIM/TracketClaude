
attribute vec4 aPosition;
attribute vec2 aTexCoord;

uniform mat4 uMaskTexMatrix; // matrix for src/mask (padded space) — usually identity
uniform mat4 uDstTexMatrix;  // matrix for dst/background (cropped to center)

varying vec2 vMaskUV;
varying vec2 vDstUV;

void main() {
    gl_Position = aPosition;

    vec4 uvMask = uMaskTexMatrix * vec4(aTexCoord, 0.0, 1.0);
    vec4 uvDst  = uDstTexMatrix  * vec4(aTexCoord, 0.0, 1.0);

    vMaskUV = uvMask.xy;
    vDstUV  = uvDst.xy;
}