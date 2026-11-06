package defpackage;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class kec {
    public long a = 0;
    public int b = 0;
    public long c = 0;
    public long d = 0;
    public long e = 0;
    public final Object f = new Object();
    public final Object g = new Object();
    public final Object h = new Object();
    public final Object i = new Object();
    public final Object j = new Object();

    public final synchronized long a() {
        long j;
        synchronized (this.f) {
            j = this.a;
        }
        return j;
    }

    public final synchronized long b() {
        long j;
        synchronized (this.i) {
            j = this.d;
        }
        return j;
    }
}
