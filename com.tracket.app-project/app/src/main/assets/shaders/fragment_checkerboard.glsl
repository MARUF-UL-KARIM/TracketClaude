precision mediump float;

varying vec2 vTexCoord;

const float CHECKER_TILE_SIZE = 40.0;
uniform vec4 uColor1;
uniform vec4 uColor2;

void main() {
    vec2 tile = floor(gl_FragCoord.xy / CHECKER_TILE_SIZE);
    float parity = mod(tile.x + tile.y, 2.0);
    gl_FragColor = mix(uColor1, uColor2, parity);
}
