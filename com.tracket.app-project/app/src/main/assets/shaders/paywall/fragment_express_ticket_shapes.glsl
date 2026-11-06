precision highp float;

uniform float uTime;
uniform vec2 uTilt;
uniform vec2 uResolution;
uniform vec4 uTicketRect;
uniform float uDensity;
varying vec2 vTexCoord;

float roundedBox(vec2 point, vec2 halfSize, float radius) {
    vec2 delta = abs(point) - halfSize + radius;
    return length(max(delta, 0.0)) + min(max(delta.x, delta.y), 0.0) - radius;
}

float squircle(vec2 point, vec2 halfSize, float exponent) {
    vec2 normalized = abs(point) / halfSize;
    return (pow(pow(normalized.x, exponent) + pow(normalized.y, exponent), 1.0 / exponent) - 1.0)
        * min(halfSize.x, halfSize.y);
}

vec2 rotateShape(vec2 point, float angle) {
    float sine = sin(angle);
    float cosine = cos(angle);
    return mat2(cosine, -sine, sine, cosine) * point;
}

float shapeMask(float distanceToShape, float feather) {
    return 1.0 - smoothstep(-feather, feather, distanceToShape);
}

void blendShape(inout vec3 premultiplied, inout float alpha, vec3 color, float shape) {
    float contribution = shape * (1.0 - alpha);
    premultiplied += color * contribution;
    alpha += contribution;
}

vec3 gradientShapeColor(vec3 baseColor, vec2 local, float scale, float angle) {
    vec2 axis = vec2(cos(angle), sin(angle));
    float position = clamp(0.5 + dot(local, axis) / max(scale * 2.0, 1.0), 0.0, 1.0);
    return clamp(baseColor * mix(0.76, 1.08, position), 0.0, 1.0);
}

vec2 orbitShapeCenter(
    vec2 ticketCenter,
    vec2 ticketSize,
    float phase,
    float extent,
    float feather,
    float maximumProtrusion,
    float phaseOffset,
    float direction,
    vec2 orbitScale
) {
    vec2 available = max(ticketSize * 0.5 + maximumProtrusion - extent - feather, vec2(1.0));
    float angle = phase * direction + phaseOffset;
    return ticketCenter + vec2(cos(angle), sin(angle)) * available * orbitScale;
}

void main() {
    vec2 pixel = vTexCoord * uResolution;
    vec2 rectMin = uTicketRect.xy * uResolution;
    vec2 rectMax = uTicketRect.zw * uResolution;
    vec2 ticketSize = rectMax - rectMin;
    vec2 center = (rectMin + rectMax) * 0.5;
    float scale = min(ticketSize.x, ticketSize.y);
    float phase = mod(uTime, 60.0) * 0.104719755;
    vec2 parallax = uTilt * vec2(scale * 0.035, scale * 0.022);

    float maximumProtrusion = 30.0 * uDensity;
    float size0 = scale * 0.44;
    float size1 = scale * 0.475;
    float size2 = scale * 0.51;
    float size3 = scale * 0.545;
    float size4 = scale * 0.58;
    float size5 = scale * 0.615;
    vec2 centers[6];
    centers[0] = orbitShapeCenter(center, ticketSize, phase, size0, 3.5 * uDensity, maximumProtrusion, 0.15, 1.0, vec2(0.98)) + parallax;
    centers[1] = orbitShapeCenter(center, ticketSize, phase, size1 * 0.90, 4.0 * uDensity, maximumProtrusion, 1.20, -1.0, vec2(0.98)) - parallax * 0.30;
    centers[2] = orbitShapeCenter(center, ticketSize, phase, size2 * 0.91, 4.5 * uDensity, maximumProtrusion, 2.25, 1.0, vec2(0.98)) + parallax * 0.24;
    centers[3] = orbitShapeCenter(center, ticketSize, phase, size3, 5.0 * uDensity, maximumProtrusion, 3.30, -1.0, vec2(0.98)) - parallax * 0.42;
    centers[4] = orbitShapeCenter(center, ticketSize, phase, size4 * 0.90, 4.0 * uDensity, maximumProtrusion, 4.35, 1.0, vec2(0.98)) + parallax * 0.37;
    centers[5] = orbitShapeCenter(center, ticketSize, phase, size5 * 0.91, 5.0 * uDensity, maximumProtrusion, 5.40, -1.0, vec2(0.98)) - parallax * 0.26;

    float shapes[6];
    shapes[0] = shapeMask(length(pixel - centers[0]) - size0, 3.5 * uDensity);
    shapes[1] = shapeMask(roundedBox(rotateShape(pixel - centers[1], 0.18), size1 * vec2(0.90, 0.62), size1 * 0.32), 4.0 * uDensity);
    shapes[2] = shapeMask(squircle(rotateShape(pixel - centers[2], -0.16), size2 * vec2(0.91, 0.68), 4.5), 4.5 * uDensity);
    shapes[3] = shapeMask(length(pixel - centers[3]) - size3, 5.0 * uDensity);
    shapes[4] = shapeMask(roundedBox(rotateShape(pixel - centers[4], 0.28), size4 * vec2(0.90, 0.64), size4 * 0.32), 4.0 * uDensity);
    shapes[5] = shapeMask(squircle(rotateShape(pixel - centers[5], -0.25), size5 * vec2(0.91, 0.66), 5.0), 5.0 * uDensity);

    vec3 color = vec3(0.0);
    float alpha = 0.0;
    blendShape(color, alpha, gradientShapeColor(vec3(1.00, 0.24, 0.04), pixel - centers[0], scale, 0.35), shapes[0]);
    blendShape(color, alpha, gradientShapeColor(vec3(0.52, 0.15, 1.00), pixel - centers[1], scale, 0.82), shapes[1]);
    blendShape(color, alpha, gradientShapeColor(vec3(0.02, 0.70, 0.95), pixel - centers[2], scale, -0.28), shapes[2]);
    blendShape(color, alpha, gradientShapeColor(vec3(0.10, 0.43, 1.00), pixel - centers[3], scale, 1.12), shapes[3]);
    blendShape(color, alpha, gradientShapeColor(vec3(0.98, 0.58, 0.05), pixel - centers[4], scale, -0.48), shapes[4]);
    blendShape(color, alpha, gradientShapeColor(vec3(0.16, 0.78, 0.55), pixel - centers[5], scale, 0.42), shapes[5]);
    gl_FragColor = vec4(color, alpha);
}
