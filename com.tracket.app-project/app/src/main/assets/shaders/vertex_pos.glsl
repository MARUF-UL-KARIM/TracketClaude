// vertex_geom_uv.glsl
attribute vec4 aPosition; // usually (-1..+1) quad positions
attribute vec4 aTexCoord; // usually (0..1) UV

uniform mat4 uPosMatrix;  // transforms GEOMETRY (clip space)
uniform mat4 uTexMatrix;  // transforms UVs (0..1)

varying vec2 vTexCoord;

void main() {
    gl_Position = uPosMatrix * aPosition;
    vTexCoord = (uTexMatrix * aTexCoord).xy;
}
