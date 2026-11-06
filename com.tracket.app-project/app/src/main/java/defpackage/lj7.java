package defpackage;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class lj7 {
    public final hj7 a;
    public final u59 b;

    public lj7(hj7 hj7Var, u59 u59Var) {
        this.a = hj7Var;
        this.b = u59Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lj7)) {
            return false;
        }
        lj7 lj7Var = (lj7) obj;
        return this.a.equals(lj7Var.a) && this.b.equals(lj7Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SemanticSelectedPoint(key=" + this.a + ", point=" + this.b + ")";
    }
}
