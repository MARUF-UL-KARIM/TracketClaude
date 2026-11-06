package defpackage;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class hh0 {
    public final String a;
    public final nq3 b;

    public hh0(String str, nq3 nq3Var) {
        this.a = str;
        this.b = nq3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hh0)) {
            return false;
        }
        hh0 hh0Var = (hh0) obj;
        return this.a.equals(hh0Var.a) && this.b.equals(hh0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "OperationHandler(pluginId=" + this.a + ", block=" + this.b + ")";
    }
}
