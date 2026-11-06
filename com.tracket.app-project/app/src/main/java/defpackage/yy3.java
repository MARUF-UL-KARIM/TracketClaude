package defpackage;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class yy3 {
    public final boolean a;
    public final boolean b;

    public yy3(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yy3)) {
            return false;
        }
        yy3 yy3Var = (yy3) obj;
        return this.a == yy3Var.a && this.b == yy3Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "State(undoEnabled=" + this.a + ", redoEnabled=" + this.b + ")";
    }
}
