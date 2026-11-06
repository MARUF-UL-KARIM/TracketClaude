precision highp float;

uniform sampler2D uTexture;     // input to blur (can be intermediate)
uniform sampler2D uGuide;       // edge-aware guide (original source)
uniform vec2  uBlurDirection;   // 1D pass direction in UV units (e.g., (1/width,0))
uniform float uSpatialSigma;    // spatial sigma (pixels, mapped into support)
uniform float uRangeSigma;      // color sigma in YCbCr space (0..1 scale)
uniform float uChromaWeight;    // scale for Cb/Cr vs luma (e.g., 0.5)

varying vec2 vTexCoord;

float gauss1D(float x, float sigma) {
    return exp(-0.5 * (x * x) / (sigma * sigma));
}

// Simple RGB -> Y'CbCr (BT.601-ish)
vec3 rgb2ycbcr(vec3 c) {
    float Y  = dot(c, vec3(0.299, 0.587, 0.114));
    float Cb = (c.b - Y) * 0.564; // ~ (B - Y) / 1.772
    float Cr = (c.r - Y) * 0.713; // ~ (R - Y) / 1.402
    return vec3(Y, Cb, Cr);
}

bool in01(vec2 uv) {
    return uv.x >= 0.0 && uv.x <= 1.0 && uv.y >= 0.0 && uv.y <= 1.0;
}

vec4 bilateral1D() {
    // Support radius ~ 3*sigma (same idea as your Gaussian blur)
    int support = int(uSpatialSigma * 3.0);

    // Center guide sample (for range weight)
    vec4 centerG = texture2D(uGuide, vTexCoord);
    vec3 centerYCbCr = rgb2ycbcr(centerG.rgb);

    vec4 acc = vec4(0.0);
    float wsum = 0.0;

    // Always include the center tap
    {
        float w = 1.0;
        vec4 s = texture2D(uTexture, vTexCoord);
        acc += s * w;
        wsum += w;
    }

    // Symmetric 1D kernel along uBlurDirection
    for (int i = 1; i <= support; i++) {
        float fi = float(i);

        vec2 oPosP = vTexCoord + fi * uBlurDirection;
        vec2 oPosN = vTexCoord - fi * uBlurDirection;

        if (in01(oPosP)) {
            vec4 sp  = texture2D(uTexture, oPosP);
            vec3 gpYCC = rgb2ycbcr(texture2D(uGuide, oPosP).rgb);

            // Range weight in YCbCr: luma full weight, chroma scaled
            vec3 d = gpYCC - centerYCbCr;
            float d2 = (d.x * d.x) + uChromaWeight * ((d.y * d.y) + (d.z * d.z));
            float wr = exp(-0.5 * d2 / (uRangeSigma * uRangeSigma));

            float ws = gauss1D(fi, uSpatialSigma);
            float w  = wr * ws;

            acc += sp * w;
            wsum += w;
        }

        if (in01(oPosN)) {
            vec4 sn  = texture2D(uTexture, oPosN);
            vec3 gnYCC = rgb2ycbcr(texture2D(uGuide, oPosN).rgb);

            vec3 d = gnYCC - centerYCbCr;
            float d2 = (d.x * d.x) + uChromaWeight * ((d.y * d.y) + (d.z * d.z));
            float wr = exp(-0.5 * d2 / (uRangeSigma * uRangeSigma));

            float ws = gauss1D(fi, uSpatialSigma);
            float w  = wr * ws;

            acc += sn * w;
            wsum += w;
        }
    }

    if (wsum > 0.0) {
        acc *= 1.0 / wsum;
    } else {
        acc = texture2D(uTexture, vTexCoord);
    }

    return acc;
}

void main() {
    // Clamp to zero outside to match your other blur shaders' behavior
    if (!in01(vTexCoord)) {
        gl_FragColor = vec4(0.0);
        return;
    }
    gl_FragColor = bilateral1D();
}