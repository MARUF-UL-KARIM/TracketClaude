package defpackage;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public interface ty8 {
    long b();

    default long c(long j) {
        return g() + j;
    }

    default long d(long j) {
        return j - g();
    }

    long g();

    default qx4 m() {
        return new qx4(g(), n());
    }

    default long n() {
        return b() + g();
    }

    default qx4 r() {
        return new qx4(v(), s());
    }

    default long s() {
        return b();
    }

    default long v() {
        return 0L;
    }
}
