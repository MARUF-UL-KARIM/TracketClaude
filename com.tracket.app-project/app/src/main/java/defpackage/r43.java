package defpackage;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class r43 {
    public final boolean a;
    public final boolean b;

    public r43(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r43)) {
            return false;
        }
        r43 r43Var = (r43) obj;
        return this.a == r43Var.a && this.b == r43Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "ExportOptions(videoEnabled=" + this.a + ", audioEnabled=" + this.b + ")";
    }
}
