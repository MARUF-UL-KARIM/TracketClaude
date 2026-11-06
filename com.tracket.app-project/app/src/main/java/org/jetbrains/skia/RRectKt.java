package org.jetbrains.skia;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes4.dex */
public final class RRectKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final float[] normalizeRadii(float[] fArr) {
        int length = fArr.length;
        int i = 0;
        if (length == 0) {
            float[] fArr2 = new float[8];
            while (i < 8) {
                fArr2[i] = 0.0f;
                i++;
            }
            return fArr2;
        }
        if (length == 1) {
            float[] fArr3 = new float[8];
            for (int i2 = 0; i2 < 8; i2++) {
                fArr3[i2] = fArr[0];
            }
            return fArr3;
        }
        if (length == 2) {
            float[] fArr4 = new float[8];
            while (i < 8) {
                fArr4[i] = fArr[i % 2];
                i++;
            }
            return fArr4;
        }
        if (length != 4) {
            if (length == 8) {
                return fArr;
            }
            throw new Error("illegal radii array");
        }
        float[] fArr5 = new float[8];
        while (i < 8) {
            fArr5[i] = fArr[i / 2];
            i++;
        }
        return fArr5;
    }
}
