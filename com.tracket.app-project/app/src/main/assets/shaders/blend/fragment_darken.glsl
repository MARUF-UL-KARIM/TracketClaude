precision highp float;

/* ============================================================
 * Darken-blend with correct premultiplied-alpha handling
 *
 * 1.  Both input textures are premultiplied (RGB already × α).
 * 2.  Convert to straight RGB        →   do the Darken in straight.
 * 3.  Blend result over dst          →   weight = src.α × uOpacity.
 * 4.  Convert back to premul & out.
 * ========================================================== */

uniform sampler2D uSrc;
uniform sampler2D uDst;
uniform float uOpacity;

varying vec2 vSrcTexCoord;
varying vec2 vDstTexCoord;

void main() {
    vec4 dst = texture2D(uDst, vDstTexCoord);

    vec2 in01 = step(vec2(0.0), vSrcTexCoord) * step(vSrcTexCoord, vec2(1.0));
    float inside = in01.x * in01.y;
    vec4 src = texture2D(uSrc, vSrcTexCoord) * inside;

    float invSrcA = 1.0 / max(src.a, 1e-6);
    float invDstA = 1.0 / max(dst.a, 1e-6);

    vec3 srcStraight = src.rgb * invSrcA;
    vec3 dstStraight = dst.rgb * invDstA;

    vec3 darkStraight = min(srcStraight, dstStraight);

    float w = src.a * uOpacity;
    vec3 outStraight = mix(dstStraight, darkStraight, w);

    float outA = dst.a + (1.0 - dst.a) * w;

    gl_FragColor = vec4(outStraight * outA, outA);
}