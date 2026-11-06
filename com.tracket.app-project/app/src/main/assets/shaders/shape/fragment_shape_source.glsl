#extension GL_OES_standard_derivatives : enable

#if !defined(SHAPE_FAMILY_BASIC) && !defined(SHAPE_FAMILY_POLYGON) && !defined(SHAPE_FAMILY_SYMBOL) && !defined(SHAPE_FAMILY_ARROW) && !defined(SHAPE_FAMILY_RADIAL) && !defined(SHAPE_FAMILY_ORGANIC)
#define SHAPE_FAMILY_ALL
#endif

precision highp float;

uniform vec2 uContentCenter;
uniform vec2 uContentHalfSize;
uniform vec4 uFillStartColor;
uniform vec4 uFillEndColor;
uniform vec4 uFillPaintTransform;
uniform vec4 uFillPaintOptions;
uniform vec4 uStrokeStartColor;
uniform vec4 uStrokeEndColor;
uniform vec4 uStrokePaintTransform;
uniform vec4 uStrokePaintOptions;
uniform vec4 uShadowStartColor;
uniform vec4 uShadowEndColor;
uniform vec4 uShadowPaintTransform;
uniform vec4 uShadowPaintOptions;
uniform vec4 uGlowStartColor;
uniform vec4 uGlowEndColor;
uniform vec4 uGlowPaintTransform;
uniform vec4 uGlowPaintOptions;
uniform vec4 uStyle;
uniform vec4 uGeometry;
uniform vec2 uStrokeStyle;
uniform vec4 uShadowStyle;
uniform vec4 uGlowStyle;

varying vec2 vLocal;
varying vec2 vUv;
uniform vec4 uCropBounds;

float positiveMod(float value, float divisor) {
    return mod(mod(value, divisor) + divisor, divisor);
}

float paintExtend(float value, float mode) {
    if (mode < 0.5) return clamp(value, 0.0, 1.0);
    if (mode < 1.5) return 1.0 - abs(positiveMod(value, 2.0) - 1.0);
    return positiveMod(value, 1.0);
}

vec4 paintColor(
    vec4 startColor,
    vec4 endColor,
    vec4 transform,
    vec4 options,
    vec2 point
) {
    float type = transform.x;
    if (type < 0.5) return vec4(0.0);
    if (type < 1.5) return startColor;

    vec2 uv = (point - uContentCenter) / (uContentHalfSize * 2.0) + 0.5;
    vec2 p = uv - transform.yz;
    float c = transform.w;
    float s = options.w;
    p = vec2(p.x * c + p.y * s, -p.x * s + p.y * c);
    float size = max(options.x, 0.0001);
    float aspect = max(options.y, 0.0001);
    float t;
    if (type < 2.5) {
        t = p.x / size + 0.5;
    } else if (type < 3.5) {
        t = length(vec2(p.x, p.y * aspect)) * 2.0 / size;
    } else if (type < 4.5) {
        float phase = positiveMod(atan(p.y, p.x) / 6.28318530718, 1.0);
        t = 1.0 - abs(phase * 2.0 - 1.0);
    } else {
        t = (abs(p.x) + abs(p.y) * aspect) * 2.0 / size;
    }
    return mix(startColor, endColor, paintExtend(t, options.z));
}

float dot2(vec2 v) {
    return dot(v, v);
}

float cross2(vec2 a, vec2 b) {
    return a.x * b.y - a.y * b.x;
}

#if defined(SHAPE_FAMILY_BASIC) || defined(SHAPE_FAMILY_SYMBOL) || defined(SHAPE_FAMILY_ALL)
float sdRoundedBox(vec2 p, vec2 b, float r) {
    vec2 q = abs(p) - b + r;
    return min(max(q.x, q.y), 0.0) + length(max(q, 0.0)) - r;
}
#endif

#if defined(SHAPE_FAMILY_BASIC) || defined(SHAPE_FAMILY_ALL)
float sdSquircle(vec2 p, float roundness) {
    float exponent = mix(12.0, 2.0, clamp(roundness, 0.0, 1.0));
    return pow(pow(abs(p.x), exponent) + pow(abs(p.y), exponent), 1.0 / exponent) - 1.0;
}
#endif

#if defined(SHAPE_FAMILY_BASIC) || defined(SHAPE_FAMILY_RADIAL) || defined(SHAPE_FAMILY_ORGANIC) || defined(SHAPE_FAMILY_ALL)
float sdEllipse(vec2 p, vec2 ab) {
    p = abs(p);
    float k0 = length(p / ab);
    float k1 = length(p / (ab * ab));
    return k0 * (k0 - 1.0) / max(k1, 0.00001);
}
#endif

#if defined(SHAPE_FAMILY_BASIC) || defined(SHAPE_FAMILY_ARROW) || defined(SHAPE_FAMILY_ALL)
float sdTriangle(vec2 p, vec2 p0, vec2 p1, vec2 p2) {
    vec2 e0 = p1 - p0;
    vec2 e1 = p2 - p1;
    vec2 e2 = p0 - p2;
    vec2 v0 = p - p0;
    vec2 v1 = p - p1;
    vec2 v2 = p - p2;
    vec2 pq0 = v0 - e0 * clamp(dot(v0, e0) / dot(e0, e0), 0.0, 1.0);
    vec2 pq1 = v1 - e1 * clamp(dot(v1, e1) / dot(e1, e1), 0.0, 1.0);
    vec2 pq2 = v2 - e2 * clamp(dot(v2, e2) / dot(e2, e2), 0.0, 1.0);
    float s = sign(e0.x * e2.y - e0.y * e2.x);
    vec2 d = min(
        min(vec2(dot2(pq0), s * (v0.x * e0.y - v0.y * e0.x)),
            vec2(dot2(pq1), s * (v1.x * e1.y - v1.y * e1.x))),
        vec2(dot2(pq2), s * (v2.x * e2.y - v2.y * e2.x))
    );
    return -sqrt(d.x) * sign(d.y);
}
#endif

#if defined(SHAPE_FAMILY_BASIC) || defined(SHAPE_FAMILY_ALL)
vec2 insetLineIntersection(vec2 a, vec2 b, vec2 c, float r) {
    vec2 e0 = b - a;
    vec2 e1 = c - b;
    vec2 n0 = normalize(vec2(-e0.y, e0.x));
    vec2 n1 = normalize(vec2(-e1.y, e1.x));
    vec2 p0 = a + n0 * r;
    vec2 p1 = b + n1 * r;
    return p0 + e0 * (cross2(p1 - p0, e1) / max(cross2(e0, e1), 0.0001));
}

float sdRoundedTriangle(vec2 p, vec2 p0, vec2 p1, vec2 p2, float r) {
    if (r <= 0.0001) {
        return sdTriangle(p, p0, p1, p2);
    }
    if (cross2(p1 - p0, p2 - p0) < 0.0) {
        vec2 swap = p1;
        p1 = p2;
        p2 = swap;
    }
    float area2 = abs(cross2(p1 - p0, p2 - p0));
    float perimeter = length(p1 - p0) + length(p2 - p1) + length(p0 - p2);
    float radius = min(r, area2 / max(perimeter, 0.0001) * 0.95);
    vec2 i0 = insetLineIntersection(p2, p0, p1, radius);
    vec2 i1 = insetLineIntersection(p0, p1, p2, radius);
    vec2 i2 = insetLineIntersection(p1, p2, p0, radius);
    return sdTriangle(p, i0, i1, i2) - radius;
}
#endif

#if defined(SHAPE_FAMILY_ARROW) || defined(SHAPE_FAMILY_RADIAL) || defined(SHAPE_FAMILY_ALL)
float sdSegment(vec2 p, vec2 a, vec2 b) {
    vec2 pa = p - a;
    vec2 ba = b - a;
    float h = clamp(dot(pa, ba) / max(dot(ba, ba), 0.00001), 0.0, 1.0);
    return length(pa - ba * h);
}
#endif

#if defined(SHAPE_FAMILY_ORGANIC) || defined(SHAPE_FAMILY_ALL)
float opSmoothUnion(float a, float b, float radius) {
    float h = clamp(0.5 + 0.5 * (b - a) / radius, 0.0, 1.0);
    return mix(b, a, h) - radius * h * (1.0 - h);
}
#endif

#if defined(SHAPE_FAMILY_POLYGON) || defined(SHAPE_FAMILY_ALL)
vec2 rotateDirection(vec2 direction, vec2 rotation) {
    return vec2(
        direction.x * rotation.x - direction.y * rotation.y,
        direction.x * rotation.y + direction.y * rotation.x
    );
}

float sdRegularPolygon(vec2 p, float count, float roundness) {
    float radius = roundness * 0.3;
    float vertexRadius = 1.0 - radius;
    vec2 minPoint = vec2(1.0);
    vec2 maxPoint = vec2(-1.0);
    vec2 boundsDirection = vec2(0.0, 1.0);
    float boundsStep = 6.28318530718 / count;
    vec2 boundsRotation = vec2(cos(boundsStep), sin(boundsStep));
    for (int i = 0; i < 12; i++) {
        if (float(i) < count) {
            minPoint = min(minPoint, boundsDirection);
            maxPoint = max(maxPoint, boundsDirection);
            boundsDirection = rotateDirection(boundsDirection, boundsRotation);
        }
    }
    vec2 center = (minPoint + maxPoint) * 0.5;
    vec2 halfSize = (maxPoint - minPoint) * 0.5;
    float scale = max(halfSize.x, halfSize.y);
    p = p * scale + center;
    float d2 = 100000.0;
    bool inside = false;
    vec2 direction = vec2(0.0, 1.0);
    vec2 rotation = boundsRotation;
    for (int i = 0; i < 12; i++) {
        if (float(i) < count) {
            vec2 nextDirection = float(i + 1) >= count
                ? vec2(0.0, 1.0)
                : rotateDirection(direction, rotation);
            vec2 a = direction * vertexRadius;
            vec2 b = nextDirection * vertexRadius;
            vec2 e = b - a;
            vec2 w = p - a;
            vec2 closest = w - e * clamp(dot(w, e) / max(dot(e, e), 0.00001), 0.0, 1.0);
            d2 = min(d2, dot(closest, closest));
            if ((a.y > p.y) != (b.y > p.y) &&
                p.x < (b.x - a.x) * (p.y - a.y) / (b.y - a.y) + a.x) {
                inside = !inside;
            }
            direction = nextDirection;
        }
    }
    return ((inside ? -sqrt(d2) : sqrt(d2)) - radius) / scale;
}

float sdStarPolygon(vec2 p, float points, float innerRadius, float roundness) {
    float radius = roundness * 0.2;
    float vertexRadius = 1.0 - radius;
    float count = points * 2.0;
    vec2 minPoint = vec2(1.0);
    vec2 maxPoint = vec2(-1.0);
    vec2 boundsDirection = vec2(0.0, 1.0);
    float boundsStep = 6.28318530718 / points;
    vec2 boundsRotation = vec2(cos(boundsStep), sin(boundsStep));
    for (int i = 0; i < 12; i++) {
        if (float(i) < points) {
            minPoint = min(minPoint, boundsDirection);
            maxPoint = max(maxPoint, boundsDirection);
            boundsDirection = rotateDirection(boundsDirection, boundsRotation);
        }
    }
    vec2 center = (minPoint + maxPoint) * 0.5;
    vec2 halfSize = (maxPoint - minPoint) * 0.5;
    float scale = max(halfSize.x, halfSize.y);
    p = p * scale + center;
    float d2 = 100000.0;
    bool inside = false;
    vec2 direction = vec2(0.0, 1.0);
    float step = 6.28318530718 / count;
    vec2 rotation = vec2(cos(step), sin(step));
    for (int i = 0; i < 24; i++) {
        if (float(i) < count) {
            float fi = float(i);
            vec2 nextDirection = float(i + 1) >= count
                ? vec2(0.0, 1.0)
                : rotateDirection(direction, rotation);
            float r0 = mod(fi, 2.0) < 0.5 ? vertexRadius : vertexRadius * innerRadius;
            float r1 = mod(fi, 2.0) < 0.5 ? vertexRadius * innerRadius : vertexRadius;
            vec2 a = direction * r0;
            vec2 b = nextDirection * r1;
            vec2 e = b - a;
            vec2 w = p - a;
            vec2 closest = w - e * clamp(dot(w, e) / max(dot(e, e), 0.00001), 0.0, 1.0);
            d2 = min(d2, dot(closest, closest));
            if ((a.y > p.y) != (b.y > p.y) &&
                p.x < (b.x - a.x) * (p.y - a.y) / (b.y - a.y) + a.x) {
                inside = !inside;
            }
            direction = nextDirection;
        }
    }
    return ((inside ? -sqrt(d2) : sqrt(d2)) - radius) / scale;
}
#endif

#if defined(SHAPE_FAMILY_ARROW) || defined(SHAPE_FAMILY_SYMBOL) || defined(SHAPE_FAMILY_ORGANIC) || defined(SHAPE_FAMILY_ALL)
vec2 catalogPolygonPoint(float kind, int index, vec4 geometry) {
    float thickness = clamp(geometry.x, 0.02, 0.9);
    if (kind < 0.5) {
        float headStart = 1.0 - geometry.z * 1.5;
        float headWidth = min(max(geometry.w, thickness + 0.02), 1.0);
        if (index == 0) return vec2(-1.0, -thickness);
        if (index == 1) return vec2(headStart, -thickness);
        if (index == 2) return vec2(headStart, -headWidth);
        if (index == 3) return vec2(1.0, 0.0);
        if (index == 4) return vec2(headStart, headWidth);
        if (index == 5) return vec2(headStart, thickness);
        return vec2(-1.0, thickness);
    }
    if (kind < 1.5) {
        float headStart = max(1.0 - geometry.z * 1.5, 0.08);
        float headWidth = min(max(geometry.w, thickness + 0.02), 1.0);
        if (index == 0) return vec2(-1.0, 0.0);
        if (index == 1) return vec2(-headStart, -headWidth);
        if (index == 2) return vec2(-headStart, -thickness);
        if (index == 3) return vec2(headStart, -thickness);
        if (index == 4) return vec2(headStart, -headWidth);
        if (index == 5) return vec2(1.0, 0.0);
        if (index == 6) return vec2(headStart, headWidth);
        if (index == 7) return vec2(headStart, thickness);
        if (index == 8) return vec2(-headStart, thickness);
        return vec2(-headStart, headWidth);
    }
    if (kind < 2.5) {
        float tailHeight = geometry.z * 1.2;
        float bodyBottom = -1.0 + tailHeight;
        float tailX = mix(-0.7, 0.7, geometry.w);
        float tailHalfWidth = max(min(geometry.x, 0.95 - abs(tailX)), 0.04);
        if (index == 0) return vec2(-1.0, bodyBottom);
        if (index == 1) return vec2(tailX - tailHalfWidth, bodyBottom);
        if (index == 2) return vec2(tailX, -1.0);
        if (index == 3) return vec2(tailX + tailHalfWidth, bodyBottom);
        if (index == 4) return vec2(1.0, bodyBottom);
        if (index == 5) return vec2(1.0, 1.0);
        return vec2(-1.0, 1.0);
    }
    if (kind < 3.5) {
        float joinOffset = geometry.z * 0.2;
        if (index == 0) return vec2(-0.2, -1.0);
        if (index == 1) return vec2(0.72, -0.12);
        if (index == 2) return vec2(-0.08 + joinOffset, 0.18);
        if (index == 3) return vec2(0.2, 1.0);
        if (index == 4) return vec2(-0.72, 0.12);
        return vec2(0.08 - joinOffset, -0.18);
    }
    float inset = geometry.z * 0.55;
    if (index == 0) return vec2(-1.0, 1.0);
    if (index == 1) return vec2(-1.0 + inset, -1.0);
    if (index == 2) return vec2(1.0 - inset, -1.0);
    return vec2(1.0, 1.0);
}

vec2 insetPolygonPoint(vec2 previous, vec2 current, vec2 next, float radius) {
    if (radius <= 0.0001) return current;
    vec2 incoming = normalize(current - previous);
    vec2 outgoing = normalize(next - current);
    vec2 incomingNormal = vec2(-incoming.y, incoming.x);
    vec2 outgoingNormal = vec2(-outgoing.y, outgoing.x);
    vec2 incomingPoint = current + incomingNormal * radius;
    vec2 outgoingPoint = current + outgoingNormal * radius;
    float denominator = cross2(incoming, outgoing);
    if (abs(denominator) <= 0.0001) {
        return current + normalize(incomingNormal + outgoingNormal) * radius;
    }
    return incomingPoint +
        incoming * (cross2(outgoingPoint - incomingPoint, outgoing) / denominator);
}

vec2 roundedCatalogPolygonPoint(
    float kind,
    int index,
    int count,
    vec4 geometry,
    float radius
) {
    int previousIndex = index == 0 ? count - 1 : index - 1;
    int nextIndex = index + 1 == count ? 0 : index + 1;
    return insetPolygonPoint(
        catalogPolygonPoint(kind, previousIndex, geometry),
        catalogPolygonPoint(kind, index, geometry),
        catalogPolygonPoint(kind, nextIndex, geometry),
        radius
    );
}

float sdCatalogPolygon(
    vec2 p,
    float kind,
    int count,
    vec4 geometry,
    float radius
) {
    vec2 first;
    if (radius <= 0.0001) {
        first = catalogPolygonPoint(kind, 0, geometry);
    } else {
        first = roundedCatalogPolygonPoint(kind, 0, count, geometry, radius);
    }
    vec2 a = first;
    float d2 = 100000.0;
    bool inside = false;
    for (int i = 0; i < 10; i++) {
        if (i < count) {
            int nextIndex = i + 1 == count ? 0 : i + 1;
            vec2 b = first;
            if (nextIndex != 0) {
                b = radius <= 0.0001
                    ? catalogPolygonPoint(kind, nextIndex, geometry)
                    : roundedCatalogPolygonPoint(kind, nextIndex, count, geometry, radius);
            }
            vec2 edge = b - a;
            vec2 pointFromA = p - a;
            vec2 closest = pointFromA -
                edge * clamp(dot(pointFromA, edge) / max(dot(edge, edge), 0.00001), 0.0, 1.0);
            d2 = min(d2, dot(closest, closest));
            if ((a.y > p.y) != (b.y > p.y) &&
                p.x < (b.x - a.x) * (p.y - a.y) / (b.y - a.y) + a.x) {
                inside = !inside;
            }
            a = b;
        }
    }
    return (inside ? -sqrt(d2) : sqrt(d2)) - radius;
}
#endif

#if defined(SHAPE_FAMILY_ORGANIC) || defined(SHAPE_FAMILY_ALL)
float sdHeart(vec2 p, float notchDepth) {
    vec2 scale = vec2(0.603553, 0.551777);
    p = p * scale + vec2(0.0, scale.y);
    p.x = abs(p.x);
    p.y += (notchDepth - 0.5) * 0.08;
    float distance;
    if (p.x + p.y > 1.0) {
        distance = length(p - vec2(0.25, 0.75)) - 0.353553;
    } else {
        vec2 a = p - vec2(0.0, 1.0);
        vec2 b = p - 0.5 * max(p.x + p.y, 0.0);
        distance = sqrt(min(dot(a, a), dot(b, b))) * sign(p.x - p.y);
    }
    return distance / scale.y;
}

vec2 cubicCoefficientA(vec2 a, vec2 b, vec2 c, vec2 d) {
    return -a + 3.0 * b - 3.0 * c + d;
}

vec2 cubicCoefficientB(vec2 a, vec2 b, vec2 c) {
    return 3.0 * a - 6.0 * b + 3.0 * c;
}

vec2 cubicCoefficientC(vec2 a, vec2 b) {
    return -3.0 * a + 3.0 * b;
}

vec2 cubicBezier(vec2 start, vec2 a, vec2 b, vec2 c, float t) {
    return ((a * t + b) * t + c) * t + start;
}

float cubicParameterForY(float y, vec2 start, vec2 a, vec2 b, vec2 c, float endY) {
    if (y >= start.y) return 0.0;
    if (y <= endY) return 1.0;

    float low = 0.0;
    float high = 1.0;
    float t = clamp((start.y - y) / max(start.y - endY, 0.0001), 0.0, 1.0);
    for (int i = 0; i < 4; i++) {
        float curveY = cubicBezier(start, a, b, c, t).y;
        if (abs(curveY - y) <= 0.00001) return t;
        if (curveY > y) low = t;
        else high = t;
        float derivativeY = (3.0 * a.y * t + 2.0 * b.y) * t + c.y;
        float candidate = abs(derivativeY) > 0.0001
            ? t - (curveY - y) / derivativeY
            : -1.0;
        t = candidate >= low && candidate <= high ? candidate : (low + high) * 0.5;
    }
    return t;
}

float sdCubicBezier(vec2 p, vec2 start, vec2 a, vec2 b, vec2 c, float t) {
    vec2 delta = cubicBezier(start, a, b, c, t) - p;
    float bestDistanceSquared = dot(delta, delta);
    for (int i = 0; i < 2; i++) {
        vec2 curve = cubicBezier(start, a, b, c, t);
        vec2 derivative = (3.0 * a * t + 2.0 * b) * t + c;
        vec2 secondDerivative = 6.0 * a * t + 2.0 * b;
        delta = curve - p;
        float denominator = dot(derivative, derivative) + dot(delta, secondDerivative);
        if (abs(denominator) > 0.0001) {
            float candidateT = clamp(t - dot(delta, derivative) / denominator, 0.0, 1.0);
            for (int attempt = 0; attempt < 3; attempt++) {
                vec2 candidateDelta = cubicBezier(start, a, b, c, candidateT) - p;
                float candidateDistanceSquared = dot(candidateDelta, candidateDelta);
                if (candidateDistanceSquared < bestDistanceSquared) {
                    t = candidateT;
                    bestDistanceSquared = candidateDistanceSquared;
                    break;
                }
                candidateT = (t + candidateT) * 0.5;
            }
        }
    }
    return sqrt(bestDistanceSquared);
}

float sdTeardrop(vec2 p, float detail, float roundness) {
    float radius = roundness * 0.06;
    float scale = max(1.0 - radius, 0.0001);
    vec2 q = vec2(abs(p.x), p.y) / scale;
    float width = mix(0.68, 0.92, detail);
    vec2 top = vec2(0.0, 0.96);
    vec2 side = vec2(width, -0.1);
    vec2 bottom = vec2(0.0, -0.96);
    vec2 upperControl1 = vec2(width * 0.25, 0.82);
    vec2 upperControl2 = vec2(width, 0.22);
    vec2 lowerControl1 = vec2(width, -0.55);
    vec2 lowerControl2 = vec2(width * 0.55, -0.96);
    vec2 upperA = cubicCoefficientA(top, upperControl1, upperControl2, side);
    vec2 upperB = cubicCoefficientB(top, upperControl1, upperControl2);
    vec2 upperC = cubicCoefficientC(top, upperControl1);
    float upperT = cubicParameterForY(q.y, top, upperA, upperB, upperC, side.y);
    float upperDistance = sdCubicBezier(q, top, upperA, upperB, upperC, upperT);
    float upperBoundaryX = cubicBezier(top, upperA, upperB, upperC, upperT).x;
    vec2 lowerA = cubicCoefficientA(side, lowerControl1, lowerControl2, bottom);
    vec2 lowerB = cubicCoefficientB(side, lowerControl1, lowerControl2);
    vec2 lowerC = cubicCoefficientC(side, lowerControl1);
    float lowerT = cubicParameterForY(q.y, side, lowerA, lowerB, lowerC, bottom.y);
    float lowerDistance = sdCubicBezier(q, side, lowerA, lowerB, lowerC, lowerT);
    float lowerBoundaryX = cubicBezier(side, lowerA, lowerB, lowerC, lowerT).x;
    float distance = min(upperDistance, lowerDistance);
    float boundaryX = q.y >= side.y ? upperBoundaryX : lowerBoundaryX;
    bool inside = q.y >= bottom.y && q.y <= top.y && q.x <= boundaryX;
    return (inside ? -distance : distance) * scale - radius;
}

float sdShield(vec2 p, float detail, float roundness) {
    float radius = roundness * 0.06;
    float scale = max(1.0 - radius, 0.0001);
    vec2 q = vec2(abs(p.x), p.y) / scale;
    vec2 top = vec2(0.0, 1.0);
    vec2 shoulder = vec2(1.0, 0.6666667);
    vec2 side = vec2(1.0, 0.1111111);
    vec2 bottom = vec2(0.0, -1.0);
    vec2 control1 = vec2(1.0, mix(-0.35, -0.5833333, detail));
    vec2 control2 = vec2(mix(0.45, 0.7, detail), -0.8);
    vec2 topDelta = q - top;
    vec2 topEdge = shoulder - top;
    float topPosition = clamp(dot(topDelta, topEdge) / dot(topEdge, topEdge), 0.0, 1.0);
    float topDistance = length(topDelta - topEdge * topPosition);
    float sideDistance = length(vec2(q.x - side.x, q.y - clamp(q.y, side.y, shoulder.y)));
    vec2 a = cubicCoefficientA(side, control1, control2, bottom);
    vec2 b = cubicCoefficientB(side, control1, control2);
    vec2 c = cubicCoefficientC(side, control1);
    float t = cubicParameterForY(q.y, side, a, b, c, bottom.y);
    float lowerDistance = sdCubicBezier(q, side, a, b, c, t);
    float distance = min(
        min(topDistance, sideDistance),
        lowerDistance
    );
    float boundaryX;
    if (q.y >= shoulder.y) {
        boundaryX = clamp((top.y - q.y) / (top.y - shoulder.y), 0.0, 1.0);
    } else if (q.y >= side.y) {
        boundaryX = 1.0;
    } else {
        boundaryX = cubicBezier(side, a, b, c, t).x;
    }
    bool inside = q.y >= bottom.y && q.y <= top.y && q.x <= boundaryX;
    return (inside ? -distance : distance) * scale - radius;
}
#endif

#if defined(SHAPE_FAMILY_RADIAL) || defined(SHAPE_FAMILY_ALL)
float sdPie(vec2 p, float sweepValue, float offsetValue) {
    float radius = length(p);
    float angle = atan(p.y, p.x);
    float start = offsetValue * 6.28318530718 - 1.57079632679;
    float sweep = clamp(sweepValue, 0.02, 0.98) * 6.28318530718;
    float delta = mod(angle - start + 12.56637061436, 6.28318530718);
    float edgeAngle = min(delta, abs(sweep - delta));
    float angular = sin(min(edgeAngle, 1.57079632679)) * radius;
    if (delta <= sweep) angular = -angular;
    return max(radius - 1.0, angular);
}

float sdArc(vec2 p, float thicknessValue, float sweepValue, float offsetValue) {
    float radius = length(p);
    float innerRadius = 1.0 - clamp(thicknessValue, 0.02, 1.0);
    if (sweepValue >= 0.995) return max(radius - 1.0, innerRadius - radius);
    float start = offsetValue * 6.28318530718 - 1.57079632679;
    float sweep = clamp(sweepValue, 0.02, 0.98) * 6.28318530718;
    float delta = mod(atan(p.y, p.x) - start + 12.56637061436, 6.28318530718);
    bool insideAngle = delta <= sweep;
    vec2 startDirection = vec2(cos(start), sin(start));
    vec2 endDirection = vec2(cos(start + sweep), sin(start + sweep));
    float capDistance = min(
        sdSegment(p, startDirection * innerRadius, startDirection),
        sdSegment(p, endDirection * innerRadius, endDirection)
    );
    float ringDistance = insideAngle
        ? min(abs(radius - 1.0), abs(radius - innerRadius))
        : 100000.0;
    float distance = min(ringDistance, capDistance);
    bool inside = insideAngle && radius >= innerRadius && radius <= 1.0;
    return inside ? -distance : distance;
}
#endif

#if defined(SHAPE_FAMILY_ORGANIC) || defined(SHAPE_FAMILY_ALL)
float sdCloud(vec2 p, float detail) {
    float left = length(p - vec2(-0.5, 0.02)) - 0.43;
    float center = length(p - vec2(-0.08, 0.3)) - (0.54 + detail * 0.1);
    float right = length(p - vec2(0.5, 0.02)) - 0.43;
    float upper = opSmoothUnion(opSmoothUnion(left, center, 0.12), right, 0.12);
    float base = sdEllipse(p - vec2(0.0, -0.35), vec2(0.84, 0.48));
    return opSmoothUnion(upper, base, 0.14);
}
#endif

#if defined(SHAPE_FAMILY_SYMBOL) || defined(SHAPE_FAMILY_ALL)
vec2 bookmarkPoint(int index, float notch, float radius) {
    vec2 vertex;
    if (index == 0) vertex = vec2(-0.82, 1.0);
    else if (index == 1) vertex = vec2(0.82, 1.0);
    else if (index == 2) vertex = vec2(0.82, -1.0);
    else if (index == 3) vertex = vec2(0.0, -1.0 + notch);
    else vertex = vec2(-0.82, -1.0);
    return vertex * (1.0 - radius);
}

float sdBookmark(vec2 p, float detail, float roundness) {
    float notch = 0.18 + detail * 0.45;
    float radius = roundness * 0.08;
    float d2 = 100000.0;
    bool inside = false;
    for (int i = 0; i < 5; i++) {
        vec2 a = bookmarkPoint(i, notch, radius);
        vec2 b = bookmarkPoint(i == 4 ? 0 : i + 1, notch, radius);
        vec2 edge = b - a;
        vec2 pointFromA = p - a;
        vec2 closest = pointFromA -
            edge * clamp(dot(pointFromA, edge) / max(dot(edge, edge), 0.00001), 0.0, 1.0);
        d2 = min(d2, dot(closest, closest));
        if ((a.y > p.y) != (b.y > p.y) &&
            p.x < (b.x - a.x) * (p.y - a.y) / (b.y - a.y) + a.x) {
            inside = !inside;
        }
    }
    return (inside ? -sqrt(d2) : sqrt(d2)) - radius;
}
#endif

#if defined(SHAPE_FAMILY_ARROW) || defined(SHAPE_FAMILY_ALL)
float sdCurvedArrow(
    vec2 p,
    float thickness,
    float sweepValue,
    float headLengthValue,
    float roundness,
    bool circular
) {
    float safeThickness = clamp(thickness, 0.06, 0.55);
    float sweep = circular ? max(sweepValue, 0.65) : clamp(sweepValue, 0.12, 0.72);
    float cornerRadius = min(roundness * 0.03, safeThickness * 0.2);
    float outerRadius = 1.0 - cornerRadius;
    float innerRadius = min(1.0 - safeThickness + cornerRadius, outerRadius - 0.02);
    float start = 1.57079632679;
    vec2 startDirection = vec2(0.0, 1.0);
    vec2 endDirection = vec2(cos(start + sweep * 6.28318530718), sin(start + sweep * 6.28318530718));
    vec2 outerEnd = endDirection * outerRadius;
    vec2 innerEnd = endDirection * innerRadius;
    vec2 forward = vec2(1.0, 0.0);
    float headLength = mix(0.2, 0.5, headLengthValue);
    float halfWidth = max(safeThickness * 0.72, 0.14);
    float centerRadius = (outerRadius + innerRadius) * 0.5;
    vec2 center = startDirection * centerRadius;
    vec2 base = center - forward * headLength * 0.18;
    vec2 upperBase = base + startDirection * halfWidth;
    vec2 tip = center + forward * headLength;
    vec2 lowerBase = base - startDirection * halfWidth;
    vec2 outerJoin = vec2(base.x, sqrt(max(outerRadius * outerRadius - base.x * base.x, 0.0)));
    vec2 innerJoin = vec2(base.x, sqrt(max(innerRadius * innerRadius - base.x * base.x, 0.0)));
    float angle = atan(p.y, p.x);
    float delta = mod(angle - start + 12.56637061436, 6.28318530718);
    float endAngle = start + sweep * 6.28318530718;
    float outerJoinAngle = atan(outerJoin.y, outerJoin.x);
    float innerJoinAngle = atan(innerJoin.y, innerJoin.x);
    float outerDelta = mod(angle - outerJoinAngle + 12.56637061436, 6.28318530718);
    float innerDelta = mod(angle - innerJoinAngle + 12.56637061436, 6.28318530718);
    float outerArcDistance = outerDelta <= endAngle - outerJoinAngle
        ? abs(length(p) - outerRadius)
        : 100000.0;
    float innerArcDistance = innerDelta <= endAngle - innerJoinAngle
        ? abs(length(p) - innerRadius)
        : 100000.0;
    float distance = min(
        min(
            min(outerArcDistance, innerArcDistance),
            sdSegment(p, outerEnd, innerEnd)
        ),
        min(
            min(sdSegment(p, outerJoin, upperBase), sdSegment(p, upperBase, tip)),
            min(sdSegment(p, tip, lowerBase), sdSegment(p, lowerBase, innerJoin))
        )
    );
    float radius = length(p);
    bool insideArc =
        delta <= sweep * 6.28318530718 && radius >= innerRadius && radius <= outerRadius;
    bool insideHead = sdTriangle(p, upperBase, tip, lowerBase) <= 0.0;
    return (insideArc || insideHead ? -distance : distance) - cornerRadius;
}
#endif

float shapeDistanceScale(float normalizedDistance, vec2 normalized, vec2 halfSize) {
    vec2 normalizedDx = dFdx(normalized);
    vec2 normalizedDy = dFdy(normalized);
    vec2 distanceDerivative = vec2(dFdx(normalizedDistance), dFdy(normalizedDistance));
    float determinant = normalizedDx.x * normalizedDy.y - normalizedDx.y * normalizedDy.x;
    if (abs(determinant) > 0.00000001) {
        vec2 gradient = vec2(
            (distanceDerivative.x * normalizedDy.y - normalizedDx.y * distanceDerivative.y) / determinant,
            (normalizedDx.x * distanceDerivative.y - distanceDerivative.x * normalizedDy.x) / determinant
        );
        float gradientLength = length(gradient / halfSize);
        if (gradientLength > 0.0001) return 1.0 / gradientLength;
    }
    return min(halfSize.x, halfSize.y);
}

float scaledShapeDistance(float normalizedDistance, vec2 normalized, vec2 halfSize) {
    return normalizedDistance * shapeDistanceScale(normalizedDistance, normalized, halfSize);
}

float radialScaledShapeDistance(float normalizedDistance, vec2 normalized, vec2 halfSize) {
    float normalizedLength = length(normalized);
    float scale = normalizedLength > 0.0001
        ? length(normalized * halfSize) / normalizedLength
        : min(halfSize.x, halfSize.y);
    return normalizedDistance * scale;
}

float shapeDistance(vec2 p) {
    vec2 q = p - uContentCenter;
    if (uContentHalfSize.x <= 0.0 || uContentHalfSize.y <= 0.0) return 100000.0;
    vec2 contentHalfSize = max(uContentHalfSize, vec2(0.0001));
    float type = uStyle.z;
#if defined(SHAPE_FAMILY_BASIC) || defined(SHAPE_FAMILY_ALL)
    if (type < 0.5) {
        if (uGeometry.y > 0.5) {
            vec2 normalized = q / contentHalfSize;
            return scaledShapeDistance(sdSquircle(normalized, uGeometry.x), normalized, contentHalfSize);
        }
        return sdRoundedBox(q, contentHalfSize, min(uGeometry.x, min(contentHalfSize.x, contentHalfSize.y)));
    }
    if (type < 1.5) {
        return sdEllipse(q, contentHalfSize);
    }
    if (type < 2.5) {
        vec2 p0 = vec2(0.0, contentHalfSize.y);
        vec2 p1 = vec2(-contentHalfSize.x, -contentHalfSize.y);
        vec2 p2 = vec2(contentHalfSize.x, -contentHalfSize.y);
        return sdRoundedTriangle(q, p0, p1, p2, uGeometry.x);
    }
#endif
    float minHalf = min(contentHalfSize.x, contentHalfSize.y);
    vec2 normalized = q / contentHalfSize;
#if defined(SHAPE_FAMILY_ARROW) || defined(SHAPE_FAMILY_ALL)
    if (type < 3.5) {
        float radius = min(uGeometry.y * 0.18, clamp(uGeometry.x, 0.02, 0.9) * 0.65);
        return scaledShapeDistance(sdCatalogPolygon(normalized, 0.0, 7, uGeometry, radius), normalized, contentHalfSize);
    }
    if (type < 4.5) {
        float radius = min(uGeometry.y * 0.18, clamp(uGeometry.x, 0.02, 0.9) * 0.65);
        return scaledShapeDistance(sdCatalogPolygon(normalized, 1.0, 10, uGeometry, radius), normalized, contentHalfSize);
    }
    if (type < 5.5) {
        float thickness = clamp(uGeometry.x, 0.02, 0.45);
        float chevron = min(
            sdSegment(
                normalized,
                vec2(-1.0 + thickness, -1.0 + thickness),
                vec2(1.0 - thickness, 0.0)
            ),
            sdSegment(
                normalized,
                vec2(1.0 - thickness, 0.0),
                vec2(-1.0 + thickness, 1.0 - thickness)
            )
        ) - thickness;
        return scaledShapeDistance(chevron, normalized, contentHalfSize);
    }
#endif
#if defined(SHAPE_FAMILY_POLYGON) || defined(SHAPE_FAMILY_ALL)
    if (type < 6.5) return scaledShapeDistance(sdRegularPolygon(normalized, 4.0, uGeometry.y), normalized, contentHalfSize);
    if (type < 7.5) return scaledShapeDistance(sdRegularPolygon(normalized, 5.0, uGeometry.y), normalized, contentHalfSize);
    if (type < 8.5) return scaledShapeDistance(sdRegularPolygon(normalized, 6.0, uGeometry.y), normalized, contentHalfSize);
    if (type < 9.5) {
        float points = floor(3.0 + uGeometry.z * 9.0 + 0.5);
        return scaledShapeDistance(sdStarPolygon(normalized, points, uGeometry.x, uGeometry.y), normalized, contentHalfSize);
    }
    if (type < 10.5) return scaledShapeDistance(sdStarPolygon(normalized, 12.0, uGeometry.x, uGeometry.y), normalized, contentHalfSize);
#endif
#if defined(SHAPE_FAMILY_ORGANIC) || defined(SHAPE_FAMILY_ALL)
    if (type < 11.5) return scaledShapeDistance(sdHeart(normalized, uGeometry.z), normalized, contentHalfSize);
#endif
#if defined(SHAPE_FAMILY_RADIAL) || defined(SHAPE_FAMILY_ALL)
    if (type < 12.5) {
        float ring = abs(sdEllipse(q, contentHalfSize)) - uGeometry.x * minHalf;
        return ring;
    }
    if (type < 13.5) return scaledShapeDistance(sdPie(normalized, uGeometry.z, uGeometry.w), normalized, contentHalfSize);
#endif
#if defined(SHAPE_FAMILY_ORGANIC) || defined(SHAPE_FAMILY_ALL)
    if (type < 14.5) {
        return scaledShapeDistance(
            sdCatalogPolygon(normalized, 2.0, 7, uGeometry, uGeometry.y * 0.22),
            normalized,
            contentHalfSize
        );
    }
#endif
#if defined(SHAPE_FAMILY_SYMBOL) || defined(SHAPE_FAMILY_ALL)
    if (type < 15.5) {
        float radius = uGeometry.y * 0.2;
        float horizontal = sdRoundedBox(normalized, vec2(1.0, uGeometry.x), radius);
        float vertical = sdRoundedBox(normalized, vec2(uGeometry.x, 1.0), radius);
        return scaledShapeDistance(min(horizontal, vertical), normalized, contentHalfSize);
    }
#endif
#if defined(SHAPE_FAMILY_RADIAL) || defined(SHAPE_FAMILY_ALL)
    if (type < 16.5) {
        float innerScale = mix(0.45, 0.9, uGeometry.x);
        float shift = 1.0 - innerScale + 0.16 + uGeometry.w * 0.55;
        float outer = length(normalized) - 1.0;
        float inner = length(normalized - vec2(shift, 0.0)) - innerScale;
        return scaledShapeDistance(max(outer, -inner), normalized, contentHalfSize);
    }
#endif
#if defined(SHAPE_FAMILY_SYMBOL) || defined(SHAPE_FAMILY_ALL)
    if (type < 17.5) {
        return scaledShapeDistance(
            sdCatalogPolygon(normalized, 3.0, 6, uGeometry, uGeometry.y * 0.12),
            normalized,
            contentHalfSize
        );
    }
#endif
#if defined(SHAPE_FAMILY_POLYGON) || defined(SHAPE_FAMILY_ALL)
    if (type < 18.5) {
        float sides = floor(3.0 + uGeometry.z * 9.0 + 0.5);
        return scaledShapeDistance(sdRegularPolygon(normalized, sides, uGeometry.y), normalized, contentHalfSize);
    }
#endif
#if defined(SHAPE_FAMILY_RADIAL) || defined(SHAPE_FAMILY_ALL)
    if (type < 19.5) return scaledShapeDistance(sdArc(normalized, uGeometry.x, uGeometry.z, uGeometry.w), normalized, contentHalfSize);
#endif
#if defined(SHAPE_FAMILY_ORGANIC) || defined(SHAPE_FAMILY_ALL)
    if (type < 20.5) return radialScaledShapeDistance(sdTeardrop(normalized, uGeometry.z, uGeometry.y), normalized, contentHalfSize);
    if (type < 21.5) return scaledShapeDistance(sdShield(normalized, uGeometry.z, uGeometry.y), normalized, contentHalfSize);
    if (type < 22.5) return scaledShapeDistance(sdCloud(normalized, uGeometry.z), normalized, contentHalfSize);
#endif
#if defined(SHAPE_FAMILY_SYMBOL) || defined(SHAPE_FAMILY_ALL)
    if (type < 23.5) {
        return scaledShapeDistance(
            sdCatalogPolygon(normalized, 4.0, 4, uGeometry, uGeometry.y * 0.08),
            normalized,
            contentHalfSize
        );
    }
    if (type < 24.5) return scaledShapeDistance(sdBookmark(normalized, uGeometry.z, uGeometry.y), normalized, contentHalfSize);
#endif
#if defined(SHAPE_FAMILY_ARROW) || defined(SHAPE_FAMILY_ALL)
    if (type >= 24.5) return scaledShapeDistance(
        sdCurvedArrow(
            normalized,
            uGeometry.x,
            uGeometry.z,
            uGeometry.w,
            uGeometry.y,
            type >= 25.5
        ),
        normalized,
        contentHalfSize
    );
#endif
    return 100000.0;
}

vec2 shapeMasksFromDistance(float d, float strokeWidth, float feather, float innerFeather, float aa) {
    float fill = 1.0 - smoothstep(-innerFeather - aa, innerFeather + aa, d);
    float outer = 1.0 - smoothstep(strokeWidth - feather - aa, strokeWidth + feather + aa, d);
    return vec2(fill, outer);
}

vec4 overColor(vec4 foreground, vec4 background) {
    return foreground + background * (1.0 - foreground.a);
}

void main() {
    vec2 cropUv = vec2(vUv.x, 1.0 - vUv.y);
    if (cropUv.x < uCropBounds.x || cropUv.y < uCropBounds.y ||
        cropUv.x > uCropBounds.z || cropUv.y > uCropBounds.w) discard;
    float baseDistance = shapeDistance(vLocal);
    float d = baseDistance - uStyle.w;
    float strokeWidth = max(uStyle.x, 0.0);
    float feather = max(uStyle.y, 0.0);
    float aa = max(fwidth(d), 0.0001);
    if (uStyle.z >= 19.5 && uStyle.z < 21.5) {
        float localAa = max(max(fwidth(vLocal.x), fwidth(vLocal.y)), 0.0001);
        aa = min(aa, localAa * 1.5);
    }
    float strokeAlignment = clamp(uStrokeStyle.x, 0.0, 1.0);
    float innerEdge = -strokeWidth * (1.0 - strokeAlignment);
    float outerEdge = strokeWidth * strokeAlignment;
    float innerFeather = max(feather - strokeWidth, 0.0);
    float fill = 1.0 - smoothstep(
        innerEdge - innerFeather - aa,
        innerEdge + innerFeather + aa,
        d
    );
    float strokeOuter = 1.0 - smoothstep(
        outerEdge - feather - aa,
        outerEdge + feather + aa,
        d
    );
    float stroke = clamp(strokeOuter - fill, 0.0, 1.0);

    float styledCoverage = strokeOuter;

    float glowRadius = max(uGlowStyle.x, 0.0);
    float glowSoftness = mix(0.35, 1.0, clamp(uGlowStyle.y, 0.0, 1.0));
    float outerGlow = (
        1.0 - smoothstep(
            0.0,
            max(glowRadius * glowSoftness, aa),
            max(d - outerEdge, 0.0)
        )
    ) * (1.0 - styledCoverage);
    float innerGlow = (
        1.0 - smoothstep(
            0.0,
            max(glowRadius * glowSoftness, aa),
            max(innerEdge - d, 0.0)
        )
    ) * fill;
    float outerGlowWeight = 1.0 - smoothstep(0.0, 1.0, uGlowStyle.w);
    float innerGlowWeight = smoothstep(-1.0, 0.0, uGlowStyle.w);
    outerGlow *= outerGlowWeight * clamp(uGlowStyle.z, 0.0, 1.0);
    innerGlow *= innerGlowWeight * clamp(uGlowStyle.z, 0.0, 1.0);

    float dropShadow = 0.0;
    float innerShadow = 0.0;
    if (uShadowPaintTransform.x > 0.5) {
        float shiftedDistance = shapeDistance(vLocal - uShadowStyle.xy) - uStyle.w;
        float shadowInner = step(0.5, uStrokeStyle.y);
        dropShadow = (
            1.0 - smoothstep(
                -aa,
                max(uShadowStyle.z, aa) + aa,
                shiftedDistance - outerEdge - uShadowStyle.w
            )
        ) * (1.0 - shadowInner);
        innerShadow = fill * smoothstep(
            -max(uShadowStyle.z, aa) - aa,
            max(uShadowStyle.z, aa) + aa,
            shiftedDistance + uShadowStyle.w
        ) * shadowInner;
    }

    vec2 shadowPoint = vLocal - uShadowStyle.xy;
    vec4 shadowColor = paintColor(
        uShadowStartColor,
        uShadowEndColor,
        uShadowPaintTransform,
        uShadowPaintOptions,
        shadowPoint
    );
    vec4 glowColor = paintColor(
        uGlowStartColor,
        uGlowEndColor,
        uGlowPaintTransform,
        uGlowPaintOptions,
        vLocal
    );
    vec4 c = shadowColor * dropShadow;
    c = overColor(glowColor * outerGlow, c);
    c = overColor(paintColor(
        uStrokeStartColor,
        uStrokeEndColor,
        uStrokePaintTransform,
        uStrokePaintOptions,
        vLocal
    ) * stroke, c);
    c = overColor(paintColor(
        uFillStartColor,
        uFillEndColor,
        uFillPaintTransform,
        uFillPaintOptions,
        vLocal
    ) * fill, c);
    c = overColor(glowColor * innerGlow, c);
    c = overColor(shadowColor * innerShadow, c);
    if (c.a <= 0.001) discard;
    gl_FragColor = c;
}
