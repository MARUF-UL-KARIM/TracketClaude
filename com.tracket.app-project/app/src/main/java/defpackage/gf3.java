package defpackage;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class gf3 implements ff3 {
    public final float y = Math.max(1.0E-7f, Math.abs(0.1f));
    public final float z = Math.max(1.0E-4f, 1.0f) * (-4.2f);

    @Override // defpackage.ff3
    public final float f() {
        return this.y;
    }

    @Override // defpackage.ff3
    public final float h(float f, long j) {
        return f * ((float) Math.exp(((j / 1000000) / 1000.0f) * this.z));
    }

    @Override // defpackage.ff3
    public final float j(float f, float f2, long j) {
        float f3 = this.z;
        return ((f2 / f3) * ((float) Math.exp((f3 * (j / 1000000)) / 1000.0f))) + (f - (f2 / f3));
    }

    @Override // defpackage.ff3
    public final long o(float f) {
        return ((long) ((((float) Math.log(this.y / Math.abs(f))) * 1000.0f) / this.z)) * 1000000;
    }

    @Override // defpackage.ff3
    public final float q(float f, float f2) {
        float fAbs = Math.abs(f2);
        float f3 = this.y;
        if (fAbs <= f3) {
            return f;
        }
        double dLog = Math.log(Math.abs(f3 / f2));
        float f4 = this.z;
        return ((f2 / f4) * ((float) Math.exp((((double) f4) * ((dLog / ((double) f4)) * 1000.0d)) / 1000.0d))) + (f - (f2 / f4));
    }
}
