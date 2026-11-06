package defpackage;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class e78 implements f78 {
    public final long a;
    public final gc2 b;

    public e78(long j, gc2 gc2Var) {
        this.a = j;
        this.b = gc2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e78)) {
            return false;
        }
        e78 e78Var = (e78) obj;
        return this.a == e78Var.a && this.b.equals(e78Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "InFlight(generation=" + this.a + ", deferred=" + this.b + ")";
    }
}
