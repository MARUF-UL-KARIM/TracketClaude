precision highp float;

attribute vec4 aPosition;
attribute vec4 aTexCoord;

uniform mat4 uPosMatrix;
uniform mat4 uTexMatrix;
uniform vec2 uTileSpan;

varying vec2 vTexCoord;
varying vec2 vTileCoord;

void main() {
    vec4 pos = aPosition;
    pos.xy *= uTileSpan;
    gl_Position = uPosMatrix * pos;

    vec2 uv01 = (uTexMatrix * aTexCoord).xy;
    vec2 halfExt = 0.5 * (uTileSpan - vec2(1.0));

    vTexCoord = uv01 * uTileSpan - halfExt;

    vTileCoord = vTexCoord;
}