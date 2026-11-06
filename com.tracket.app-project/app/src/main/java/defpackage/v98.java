package defpackage;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class v98 implements y98 {
    public final long a;
    public final String b;

    public v98(long j, String str) {
        this.a = j;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v98)) {
            return false;
        }
        v98 v98Var = (v98) obj;
        return this.a == v98Var.a && this.b.equals(v98Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "Failed(generation=" + this.a + ", message=" + this.b + ")";
    }
}
