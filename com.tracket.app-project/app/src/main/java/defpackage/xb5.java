package defpackage;

import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class xb5 {
    public final int[] b;
    public final float[] c;
    public int e;
    public final HashMap a = new HashMap();
    public final float d = 64.0f;

    public xb5(int i) {
        this.b = new int[i];
        this.c = new float[i * 2];
    }

    public final void a(float f, float f2) {
        long jFloor = (((long) ((int) Math.floor(((double) f2) / 8.0d))) & 4294967295L) | (((long) ((int) Math.floor(((double) f) / 8.0d))) << 32);
        int i = this.e;
        Long lValueOf = Long.valueOf(jFloor);
        HashMap map = this.a;
        Integer num = (Integer) map.get(lValueOf);
        this.b[i] = num != null ? num.intValue() : -1;
        int i2 = this.e * 2;
        float[] fArr = this.c;
        fArr[i2] = f;
        fArr[i2 + 1] = f2;
        Long lValueOf2 = Long.valueOf(jFloor);
        int i3 = this.e;
        this.e = i3 + 1;
        map.put(lValueOf2, Integer.valueOf(i3));
    }

    public final boolean b(float f, float f2) {
        int iFloor = (int) Math.floor(((double) f) / 8.0d);
        int iFloor2 = (int) Math.floor(((double) f2) / 8.0d);
        for (int i = -1; i < 2; i++) {
            for (int i2 = -1; i2 < 2; i2++) {
                Integer num = (Integer) this.a.get(Long.valueOf((((long) (iFloor2 + i)) & 4294967295L) | (((long) (iFloor + i2)) << 32)));
                int iIntValue = num != null ? num.intValue() : -1;
                while (iIntValue >= 0) {
                    int i3 = iIntValue * 2;
                    float[] fArr = this.c;
                    float f3 = f - fArr[i3];
                    float f4 = f2 - fArr[i3 + 1];
                    if ((f4 * f4) + (f3 * f3) < this.d) {
                        return true;
                    }
                    iIntValue = this.b[iIntValue];
                }
            }
        }
        return false;
    }
}
