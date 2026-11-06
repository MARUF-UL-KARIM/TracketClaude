package defpackage;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class p68 {
    public final c88 a;
    public final long b;

    public p68(c88 c88Var, long j) {
        this.a = c88Var;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p68)) {
            return false;
        }
        p68 p68Var = (p68) obj;
        return this.a.equals(p68Var.a) && this.b == p68Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "CachedRenderFrames(window=" + this.a + ", retainedBytes=" + this.b + ")";
    }
}
