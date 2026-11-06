precision highp float;

uniform sampler2D uSharpTexture; // original (sharp)
uniform sampler2D uBlurTexture;  // blurred

uniform float uAspect;           // width / height
uniform vec2  uCenter;           // [0..1] in LOCAL space
uniform float uFocusRadius;      // [0..1]
uniform float uFeather;          // [0..1]

varying vec2 vTexCoord;

void main() {
    vec2 dst_uv = vTexCoord;

    // uLocalFromDst removed; evaluate directly in dst UV space
    vec2 local_uv = dst_uv;

    vec2 d = local_uv - uCenter;
    d.x *= uAspect;
    float dist = length(d);

    float inner = uFocusRadius;
    float outer = uFocusRadius + max(uFeather, 1e-4);

    float t = smoothstep(inner, outer, dist);

    vec4 sharpCol = texture2D(uSharpTexture, dst_uv);
    vec4 blurCol  = texture2D(uBlurTexture,  dst_uv);

    gl_FragColor = mix(sharpCol, blurCol, t);
}