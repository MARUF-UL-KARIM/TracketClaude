package defpackage;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class s96 {
    public final String a;
    public final Long b;

    public s96(long j, String str) {
        this.a = str;
        this.b = Long.valueOf(j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s96)) {
            return false;
        }
        s96 s96Var = (s96) obj;
        if (!this.a.equals(s96Var.a)) {
            return false;
        }
        Long l = s96Var.b;
        Long l2 = this.b;
        if (l2 != null) {
            return l2.equals(l);
        }
        return l == null;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Long l = this.b;
        return iHashCode + (l != null ? l.hashCode() : 0);
    }
}
