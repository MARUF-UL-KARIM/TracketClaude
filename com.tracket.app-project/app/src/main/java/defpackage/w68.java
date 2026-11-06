package defpackage;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class w68 implements x68 {
    public final long a;
    public final gc2 b;

    public w68(long j, gc2 gc2Var) {
        this.a = j;
        this.b = gc2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w68)) {
            return false;
        }
        w68 w68Var = (w68) obj;
        return this.a == w68Var.a && this.b.equals(w68Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "InFlight(generation=" + this.a + ", deferred=" + this.b + ")";
    }
}
