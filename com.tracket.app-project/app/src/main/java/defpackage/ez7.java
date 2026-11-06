package defpackage;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class ez7 {
    public static final ez7 c;
    public final mj2 a;
    public final mj2 b;

    static {
        lj2 lj2Var = lj2.a;
        c = new ez7(lj2Var, lj2Var);
    }

    public ez7(mj2 mj2Var, mj2 mj2Var2) {
        this.a = mj2Var;
        this.b = mj2Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ez7)) {
            return false;
        }
        ez7 ez7Var = (ez7) obj;
        return this.a.equals(ez7Var.a) && this.b.equals(ez7Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Size(width=" + this.a + ", height=" + this.b + ")";
    }
}
