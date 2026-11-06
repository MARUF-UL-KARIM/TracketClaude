package defpackage;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class p93 {
    public final u59 a;
    public final u59 b;

    public p93(u59 u59Var, u59 u59Var2) {
        this.a = u59Var;
        this.b = u59Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p93)) {
            return false;
        }
        p93 p93Var = (p93) obj;
        return this.a.equals(p93Var.a) && this.b.equals(p93Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "FaceLandmarkCorrespondence(previous=" + this.a + ", current=" + this.b + ")";
    }
}
