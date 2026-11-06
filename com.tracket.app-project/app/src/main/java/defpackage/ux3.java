package defpackage;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class ux3 {
    public final long a;
    public final long b;
    public final float c;
    public final long d;
    public final long e;

    public ux3(long j, long j2, long j3, float f, long j4) {
        this.a = j;
        this.b = j2;
        this.c = f;
        this.d = j3;
        this.e = j4;
    }

    public final String toString() {
        return "HistoricalChange(uptimeMillis=" + this.a + ", position=" + ((Object) lm5.j(this.b)) + ", scaleFactor=" + this.c + ", panOffset=" + ((Object) lm5.j(this.d)) + ')';
    }
}
