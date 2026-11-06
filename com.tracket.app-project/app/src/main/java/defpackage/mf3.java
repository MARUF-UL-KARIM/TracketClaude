package defpackage;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class mf3 implements cf3 {
    public final int a;
    public final tq2 b;
    public final long c;
    public final long d;

    public mf3(int i, int i2, tq2 tq2Var) {
        this.a = i;
        this.b = tq2Var;
        this.c = ((long) i) * 1000000;
        this.d = ((long) i2) * 1000000;
    }

    @Override // defpackage.cf3
    public final float b(long j, float f, float f2, float f3) {
        long j2 = j - this.d;
        if (j2 < 0) {
            j2 = 0;
        }
        long j3 = this.c;
        long j4 = j2 > j3 ? j3 : j2;
        if (j4 == 0) {
            return f3;
        }
        return (e(j4, f, f2, f3) - e(j4 - 1000000, f, f2, f3)) * 1000.0f;
    }

    @Override // defpackage.cf3
    public final long c(float f, float f2, float f3) {
        return this.d + this.c;
    }

    @Override // defpackage.cf3
    public final float e(long j, float f, float f2, float f3) {
        long j2 = j - this.d;
        if (j2 < 0) {
            j2 = 0;
        }
        long j3 = this.c;
        if (j2 > j3) {
            j2 = j3;
        }
        float fB = this.b.b(this.a == 0 ? 1.0f : j2 / j3);
        return (f2 * fB) + ((1.0f - fB) * f);
    }
}
