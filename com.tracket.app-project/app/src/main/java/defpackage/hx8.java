package defpackage;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class hx8 {
    public final ii1 a;
    public final boolean b;

    public hx8(ii1 ii1Var, boolean z) {
        this.a = ii1Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hx8)) {
            return false;
        }
        hx8 hx8Var = (hx8) obj;
        return this.a.equals(hx8Var.a) && this.b == hx8Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Request(deferred=" + this.a + ", isOwner=" + this.b + ")";
    }
}
