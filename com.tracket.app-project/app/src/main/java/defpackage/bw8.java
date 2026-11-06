package defpackage;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class bw8 implements oz9 {
    public final int a;
    public final float b;

    public bw8(int i, float f) {
        this.a = i;
        this.b = f;
    }

    @Override // defpackage.oz9
    public final float a(float f, float f2, float f3) {
        return this.a * Math.max(f2, f3) * 0.12f * this.b * f;
    }
}
