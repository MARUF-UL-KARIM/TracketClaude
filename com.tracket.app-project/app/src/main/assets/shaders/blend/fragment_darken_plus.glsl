precision highp float;

/* ============================================================
 * Darken Plus  (aka *Linear Burn*) with premultiplied-alpha
 *
 * 1.  Both inputs are premultiplied (RGB already × α).
 * 2.  Convert to straight RGB, apply Linear-Burn:
 *         C = max(S + D − 1, 0)
 * 3.  Mix result over dst with   w = src.α × uOpacity
 * 4.  Convert back to premul and output.
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
    vec4 src = texture2D(uSrc, vSrcTexCoord) * inside;   // black outside bounds

    float invSrcA = 1.0 / max(src.a, 1e-6);
    float invDstA = 1.0 / max(dst.a, 1e-6);

    vec3 srcStraight = src.rgb * invSrcA;
    vec3 dstStraight = dst.rgb * invDstA;

    vec3 burnStraight = max(srcStraight + dstStraight - 1.0, 0.0);

    float w = src.a * uOpacity;                      // 0‥1
    vec3 outStraight = mix(dstStraight, burnStraight, w);

    float outA = dst.a + (1.0 - dst.a) * w;

    gl_FragColor = vec4(outStraight * outA, outA);
}