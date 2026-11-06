package defpackage;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class bs5 {
    public final ah a;
    public final boolean b;

    public bs5(ah ahVar, boolean z) {
        this.a = ahVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bs5) {
            bs5 bs5Var = (bs5) obj;
            if (this.a == bs5Var.a && this.b == bs5Var.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "OverlayImagePreview(bitmap=" + this.a + ", isOpaque=" + this.b + ")";
    }
}
