package defpackage;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class u88 {
    public final int a;
    public final int b;
    public final int c;
    public final long d;
    public final long e;
    public final int f;

    public u88(long j, int i, int i2, int i3, int i4, long j2) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = j;
        this.e = j2;
        this.f = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u88)) {
            return false;
        }
        u88 u88Var = (u88) obj;
        return this.a == u88Var.a && this.b == u88Var.b && this.c == u88Var.c && this.d == u88Var.d && this.e == u88Var.e && this.f == u88Var.f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f) + ot5.c(ot5.c(zd2.b(this.c, zd2.b(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbS = zd2.s(this.a, this.b, "StabilizationMotionFallbackMetrics(frameCount=", ", fallbackFrameCount=", ", identityFrameCount=");
        mi9.u(sbS, this.c, ", longestFallbackSegmentUs=", this.d);
        iu1.y(sbS, ", longestIdentitySegmentUs=", this.e, ", sourceSwitchCount=");
        return zd2.o(sbS, this.f, ")");
    }
}
