package defpackage;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class v02 {
    public final long a;
    public final r07 b;

    public v02(long j, r07 r07Var) {
        this.a = j;
        this.b = r07Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v02)) {
            return false;
        }
        v02 v02Var = (v02) obj;
        return this.a == v02Var.a && this.b.equals(v02Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "PreparedCutoutFrame(positionInClipUs=" + this.a + ", frame=" + this.b + ")";
    }
}
