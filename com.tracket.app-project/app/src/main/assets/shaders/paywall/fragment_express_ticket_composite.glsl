precision highp float;

uniform sampler2D uShapes;
uniform sampler2D uBlurredShapes;
uniform sampler2D uContent;
uniform float uTime;
uniform vec2 uTilt;
uniform vec2 uResolution;
uniform vec4 uTicketRect;
uniform float uDensity;
uniform float uContentFlipY;
uniform vec2 uCardTranslation;
uniform vec2 uNoiseOffset;
uniform float uCardScale;
uniform float uShineIntensity;
uniform float uGlassReveal;
uniform vec2 uShinePosition;
uniform float uShinePositionWeight;
varying vec2 vTexCoord;

float roundedBox(vec2 point, vec2 halfSize, float radius) {
    vec2 delta = abs(point) - halfSize + radius;
    return length(max(delta, 0.0)) + min(max(delta.x, delta.y), 0.0) - radius;
}

float hash(vec2 point) {
    return fract(sin(dot(point, vec2(127.1, 311.7))) * 43758.5453123);
}

vec3 softLightBlend(vec3 base, vec3 blend) {
    vec3 low = base - (1.0 - 2.0 * blend) * base * (1.0 - base);
    vec3 high = base + (2.0 * blend - 1.0) * (sqrt(max(base, vec3(0.0))) - base);
    return mix(low, high, step(vec3(0.5), blend));
}

vec3 screenBlend(vec3 base, vec3 blend) {
    return 1.0 - (1.0 - base) * (1.0 - blend);
}

float valueNoise(vec2 point) {
    vec2 cell = floor(point);
    vec2 local = fract(point);
    local = local * local * (3.0 - 2.0 * local);
    float a = hash(cell);
    float b = hash(cell + vec2(1.0, 0.0));
    float c = hash(cell + vec2(0.0, 1.0));
    float d = hash(cell + vec2(1.0, 1.0));
    return mix(mix(a, b, local.x), mix(c, d, local.x), local.y);
}

vec2 rotatePoint(vec2 point, float angle) {
    float sine = sin(angle);
    float cosine = cos(angle);
    return mat2(cosine, -sine, sine, cosine) * point;
}

vec2 inversePerspective(vec2 point, vec2 halfSize, vec2 tilt) {
    float pitch = clamp(tilt.y, -2.0, 2.0) * 0.44;
    float yaw = clamp(-tilt.x, -1.0, 1.0) * 0.38;
    float sinePitch = sin(pitch);
    float cosinePitch = cos(pitch);
    float sineYaw = sin(yaw);
    float cosineYaw = cos(yaw);
    float focalLength = max(max(halfSize.x, halfSize.y) * 2.6, 1.0);
    float projectionX = -sineYaw / focalLength;
    float projectionY = cosineYaw * sinePitch / focalLength;
    float a = point.x * projectionX - cosineYaw;
    float b = point.x * projectionY - sineYaw * sinePitch;
    float c = point.y * projectionX;
    float d = point.y * projectionY - cosinePitch;
    float determinant = a * d - b * c;
    if (abs(determinant) < 0.0001) return point;
    return vec2(
        (-point.x * d + b * point.y) / determinant,
        (-a * point.y + point.x * c) / determinant
    );
}

float ticketSdf(vec2 point, vec2 halfSize, float radius) {
    float body = roundedBox(point, halfSize, radius);
    float notchRadius = min(halfSize.x, halfSize.y) * 0.105;
    float seamX = halfSize.x * 0.34 + notchRadius * 2.0;
    float notchTop = length(point - vec2(seamX, -halfSize.y)) - notchRadius;
    float notchBottom = length(point - vec2(seamX, halfSize.y)) - notchRadius;
    float perforationHalfSpan = halfSize.y - notchRadius;
    float targetRadius = max(3.2, notchRadius * 0.32);
    float circleCount = max(2.0, floor(
        ((perforationHalfSpan * 2.0 / targetRadius - 1.0) / 3.0) + 1.5
    ));
    float circleRadius = perforationHalfSpan * 2.0 / (3.0 * (circleCount - 1.0) + 1.0);
    float firstCenterY = -perforationHalfSpan + circleRadius * 0.5;
    float circleIndex = clamp(
        floor((point.y - firstCenterY) / (circleRadius * 3.0) + 0.5),
        0.0,
        circleCount - 1.0
    );
    float circleCenterY = firstCenterY + circleIndex * circleRadius * 3.0;
    float perforation = length(point - vec2(seamX, circleCenterY)) - circleRadius;
    return max(body, -min(min(notchTop, notchBottom), perforation));
}

float roundedPerimeter(vec2 halfSize, float radius) {
    vec2 straight = max(halfSize - radius, 0.0) * 2.0;
    return straight.x * 2.0 + straight.y * 2.0 + 6.283185307 * radius;
}

float roundedPerimeterCoordinate(vec2 point, vec2 halfSize, float radius) {
    vec2 corner = max(halfSize - radius, 0.0);
    float horizontal = corner.x * 2.0;
    float vertical = corner.y * 2.0;
    float arc = 1.570796327 * radius;
    if (point.y < -corner.y) {
        if (point.x > corner.x) {
            float angle = atan(point.y + corner.y, point.x - corner.x);
            return horizontal + (angle + 1.570796327) * radius;
        }
        if (point.x < -corner.x) {
            float angle = atan(point.y + corner.y, point.x + corner.x);
            if (angle < 0.0) angle += 6.283185307;
            return horizontal * 2.0 + vertical * 2.0 + arc * 3.0 + (angle - 3.141592654) * radius;
        }
        return point.x + corner.x;
    }
    if (point.y > corner.y) {
        if (point.x > corner.x) {
            float angle = atan(point.y - corner.y, point.x - corner.x);
            return horizontal + arc + vertical + angle * radius;
        }
        if (point.x < -corner.x) {
            float angle = atan(point.y - corner.y, point.x + corner.x);
            return horizontal * 2.0 + vertical + arc * 2.0 + (angle - 1.570796327) * radius;
        }
        return horizontal + vertical + arc * 2.0 + (corner.x - point.x);
    }
    if (point.x > corner.x) return horizontal + arc + point.y + corner.y;
    if (point.x < -corner.x) return horizontal * 2.0 + vertical + arc * 3.0 + corner.y - point.y;
    return 0.0;
}

vec2 pointOnRoundedPerimeter(float coordinate, vec2 halfSize, float radius) {
    vec2 corner = max(halfSize - radius, 0.0);
    float horizontal = corner.x * 2.0;
    float vertical = corner.y * 2.0;
    float arc = 1.570796327 * radius;
    float perimeter = roundedPerimeter(halfSize, radius);
    float value = mod(coordinate, perimeter);
    if (value < horizontal) return vec2(-corner.x + value, -halfSize.y);
    value -= horizontal;
    if (value < arc) {
        float angle = -1.570796327 + value / radius;
        return vec2(corner.x, -corner.y) + vec2(cos(angle), sin(angle)) * radius;
    }
    value -= arc;
    if (value < vertical) return vec2(halfSize.x, -corner.y + value);
    value -= vertical;
    if (value < arc) {
        float angle = value / radius;
        return vec2(corner.x, corner.y) + vec2(cos(angle), sin(angle)) * radius;
    }
    value -= arc;
    if (value < horizontal) return vec2(corner.x - value, halfSize.y);
    value -= horizontal;
    if (value < arc) {
        float angle = 1.570796327 + value / radius;
        return vec2(-corner.x, corner.y) + vec2(cos(angle), sin(angle)) * radius;
    }
    value -= arc;
    if (value < vertical) return vec2(-halfSize.x, corner.y - value);
    value -= vertical;
    float angle = 3.141592654 + value / radius;
    return vec2(-corner.x, -corner.y) + vec2(cos(angle), sin(angle)) * radius;
}

void main() {
    vec2 uv = vTexCoord;
    vec2 pixel = uv * uResolution;
    vec2 rectMin = uTicketRect.xy * uResolution;
    vec2 rectMax = uTicketRect.zw * uResolution;
    vec2 ticketSize = rectMax - rectMin;
    vec2 center = (rectMin + rectMax) * 0.5;
    vec2 halfSize = ticketSize * 0.5;
    float scale = min(ticketSize.x, ticketSize.y);
    float density = max(uDensity, 0.1);
    float radius = min(24.0 * density, scale * 0.12);

    vec2 fixedLocal = pixel - center;
    float fixedDistance = roundedBox(fixedLocal, halfSize, radius);
    float outsideDistance = max(fixedDistance, 0.0);
    float fadeDistance = max(min(rectMin.y, uResolution.y - rectMax.y), 1.0);
    float dotGap = 2.0 * density;
    float radialSpacing = 5.4 * density;
    float radialGrowth = 0.10 * density;
    float radialEstimate = (-radialSpacing + sqrt(
        radialSpacing * radialSpacing + 4.0 * radialGrowth * max(outsideDistance - dotGap, 0.0)
    )) / (2.0 * radialGrowth);
    float radialStep = max(0.0, floor(radialEstimate + 0.5));
    float radialOffset = dotGap + radialSpacing * radialStep + radialGrowth * radialStep * radialStep;
    vec2 expandedHalfSize = halfSize + radialOffset;
    float expandedRadius = radius + radialOffset;
    float basePerimeter = roundedPerimeter(halfSize, radius);
    float expandedPerimeter = roundedPerimeter(expandedHalfSize, expandedRadius);
    float expandedCoordinate = roundedPerimeterCoordinate(fixedLocal, expandedHalfSize, expandedRadius);
    float baseCoordinate = expandedCoordinate * basePerimeter / expandedPerimeter;
    float rayCount = max(4.0, floor(basePerimeter / (11.5 * density) + 0.5));
    float raySpacing = basePerimeter / rayCount;
    float ray = floor(baseCoordinate / raySpacing + 0.5);
    float rayCoordinate = ray * raySpacing;
    vec2 dotCenter = center + pointOnRoundedPerimeter(
        rayCoordinate * expandedPerimeter / basePerimeter,
        expandedHalfSize,
        expandedRadius
    );
    float dotStart = smoothstep(dotGap - density, dotGap + density, outsideDistance);
    float fadeProgress = clamp(outsideDistance / fadeDistance, 0.0, 1.0);
    float distanceFade = 1.0 - smoothstep(0.0, 1.0, fadeProgress);
    float noiseAngle = uTilt.x * 0.25 + uTilt.y * 0.17 + uTime * 0.012;
    vec2 noisePoint = rotatePoint(fixedLocal - uNoiseOffset * density, noiseAngle) / (55.0 * density);
    float coarsePearl = valueNoise(noisePoint + vec2(uTime * 0.010, -uTime * 0.008));
    float finePearl = valueNoise(noisePoint * 2.2 + vec2(-uTime * 0.014, uTime * 0.011));
    float pearlNoise = smoothstep(0.40, 0.60, coarsePearl * 0.68 + finePearl * 0.32);
    float dotScale = 1.0 + pearlNoise * 0.20;
    float dotPoint = 1.0 - smoothstep(
        0.70 * density * dotScale,
        1.08 * density * dotScale,
        length(pixel - dotCenter)
    );
    float dotAlpha = dotPoint * dotStart * distanceFade * (0.42 + pearlNoise * 0.58) * 0.60;

    vec3 backgroundColor = vec3(29.0, 31.0, 32.0) / 255.0;
    vec3 color = backgroundColor;
    color = mix(color, vec3(0.92, 0.95, 0.98), dotAlpha);

    vec4 sharpShapes = texture2D(uShapes, uv);
    vec3 shapeColor = sharpShapes.rgb / max(sharpShapes.a, 0.001);
    color = mix(color, shapeColor, sharpShapes.a);

    vec2 screenLocal = (fixedLocal - uCardTranslation * density) / clamp(uCardScale, 0.60, 1.40);
    vec2 local = inversePerspective(screenLocal, halfSize, uTilt);
    float distanceToTicket = ticketSdf(local, halfSize, radius);
    float ticket = 1.0 - smoothstep(-0.75 * density, 0.75 * density, distanceToTicket);
    vec2 shadowScreenLocal = screenLocal - vec2(
        uTilt.x * 3.5 * density,
        10.0 * density + uTilt.y * 3.0 * density
    );
    vec2 shadowLocal = inversePerspective(shadowScreenLocal, halfSize, uTilt);
    float shadowDistance = ticketSdf(shadowLocal, halfSize, radius * 1.04);
    float shadow = (1.0 - smoothstep(-2.0 * density, 23.0 * density, shadowDistance)) * (1.0 - ticket) * 0.48;
    color *= 1.0 - shadow;

    vec4 blurredShapes = texture2D(uBlurredShapes, uv);
    vec3 blurredShapeColor = blurredShapes.rgb / max(blurredShapes.a, 0.001);
    vec2 cardNoisePoint = local + halfSize;
    float coarseNoise = hash(floor(cardNoisePoint / (1.65 * density)) + 37.0);
    float microNoise = hash(floor(cardNoisePoint / (0.62 * density)) + 19.0);
    vec2 chromaticCell = floor(cardNoisePoint / (0.82 * density));
    vec3 chromaticNoise = vec3(
        hash(chromaticCell + vec2(13.0, 7.0)),
        hash(chromaticCell + vec2(31.0, 17.0)),
        hash(chromaticCell + vec2(47.0, 29.0))
    );
    float rim = (1.0 - smoothstep(0.0, 2.2 * density, abs(distanceToTicket))) * ticket;
    vec2 lightDirection = normalize(vec2(-0.72, -0.42) + uTilt * 0.42);
    float light = clamp(0.56 + dot(lightDirection, normalize(local + vec2(0.001))), 0.0, 1.0);
    float shineIntensity = clamp(uShineIntensity, 0.0, 1.0);
    float sheetGlassStrength = mix(0.2, 1.0, clamp(uGlassReveal, 0.0, 1.0));
    float glassEffectStrength = sheetGlassStrength * mix(1.0, 0.2, shineIntensity);
    vec3 blurredBackdrop = mix(backgroundColor, blurredShapeColor, blurredShapes.a);
    vec3 glass = mix(blurredBackdrop, vec3(0.955, 0.965, 0.975), 0.65 * glassEffectStrength);
    vec3 noiseLayer = clamp(
        vec3(0.5) + (coarseNoise - 0.5) * 0.30 + (microNoise - 0.5) * 0.18
            + (chromaticNoise - 0.5) * 0.20,
        0.0,
        1.0
    );
    glass = mix(glass, softLightBlend(glass, noiseLayer), 0.52 * glassEffectStrength);

    vec2 defaultHighlightCenter = -uTilt * vec2(halfSize.x * 0.86, halfSize.y * 1.05)
        - lightDirection * scale * 0.12;
    vec2 touchHighlightCenter = vec2(uShinePosition.x, -uShinePosition.y) * halfSize;
    vec2 highlightCenter = mix(
        defaultHighlightCenter,
        touchHighlightCenter,
        clamp(uShinePositionWeight, 0.0, 1.0)
    );
    vec2 highlightPoint = (local - highlightCenter) / vec2(ticketSize.x * 0.68, ticketSize.y * 0.88);
    float highlightDistance = length(highlightPoint);
    float radialHighlight = (1.0 - smoothstep(0.04, 0.92, highlightDistance))
        * (0.28 + shineIntensity * 0.46);
    float radialShade = smoothstep(0.46, 1.05, highlightDistance) * 0.08;
    float rimHighlight = rim * (0.06 + light * 0.16 + shineIntensity * 0.22);
    glass = clamp(glass, 0.0, 1.0);

    vec2 contentUv = local / ticketSize + 0.5;
    contentUv.y = mix(contentUv.y, 1.0 - contentUv.y, uContentFlipY);
    vec4 content = texture2D(uContent, contentUv);
    vec3 glassWithContent = content.rgb + glass * (1.0 - content.a);
    color = mix(color, glassWithContent, ticket);
    color = mix(color, clamp(color * (1.0 - radialShade) + vec3(radialHighlight), 0.0, 1.0), ticket);
    color = screenBlend(color, vec3(rimHighlight * ticket));
    gl_FragColor = vec4(color, 1.0);
}
