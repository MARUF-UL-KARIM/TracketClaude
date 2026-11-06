package defpackage;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class nx0 {
    public final long a;
    public final String b;

    public nx0(long j, String str) {
        this.a = j;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nx0)) {
            return false;
        }
        nx0 nx0Var = (nx0) obj;
        return this.a == nx0Var.a && this.b.equals(nx0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "Request(id=" + this.a + ", action=" + this.b + ")";
    }
}
