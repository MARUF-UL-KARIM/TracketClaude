package defpackage;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class jb5 {
    public final wb5 a;
    public final wb5 b;

    public jb5(wb5 wb5Var, wb5 wb5Var2) {
        this.a = wb5Var;
        this.b = wb5Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jb5)) {
            return false;
        }
        jb5 jb5Var = (jb5) obj;
        return this.a.equals(jb5Var.a) && this.b.equals(jb5Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "MotionCorrespondence(previous=" + this.a + ", current=" + this.b + ")";
    }
}
