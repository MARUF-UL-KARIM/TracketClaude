precision highp float;

attribute vec4 aPosition;   // local quad position (e.g. [-1..1] or whatever your mesh uses)
attribute vec2 aTexCoord;

uniform mat4 uCurrMvp;
uniform mat4 uPrevMvp;

varying vec2 vTexCoord;
varying vec2 vCurrNdc;
varying vec2 vPrevNdc;

void main() {
    vTexCoord = aTexCoord;

    vec4 currClip = uCurrMvp * aPosition;
    vec4 prevClip = uPrevMvp * aPosition;

    // NDC in [-1..1]
    float invCurrW = 1.0 / max(currClip.w, 1e-6);
    float invPrevW = 1.0 / max(prevClip.w, 1e-6);
    vCurrNdc = currClip.xy * invCurrW;
    vPrevNdc = prevClip.xy * invPrevW;

    gl_Position = currClip;
}