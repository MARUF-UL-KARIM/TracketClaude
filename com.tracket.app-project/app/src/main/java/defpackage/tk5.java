package defpackage;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class tk5 {
    public final z15 a;
    public final z15 b;

    public tk5(z15 z15Var, z15 z15Var2) {
        this.a = z15Var;
        this.b = z15Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tk5)) {
            return false;
        }
        tk5 tk5Var = (tk5) obj;
        return this.a.equals(tk5Var.a) && this.b.equals(tk5Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "NormalizedMotion(matrix=" + this.a + ", inverse=" + this.b + ")";
    }
}
