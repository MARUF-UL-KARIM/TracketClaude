package defpackage;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class ew7 implements oz9 {
    public final float a;

    public ew7(float f) {
        this.a = f;
    }

    @Override // defpackage.oz9
    public final float a(float f, float f2, float f3) {
        float fMax = Math.max(f2, f3);
        if (fMax <= 0.0f) {
            return 0.0f;
        }
        float f4 = fMax * 0.3f;
        float f5 = this.a;
        if (f5 < 0.0f) {
            f5 = 0.0f;
        }
        float f6 = f4 * f5;
        if (Math.abs(f6) <= Float.MAX_VALUE) {
            return f6;
        }
        return 0.0f;
    }
}
