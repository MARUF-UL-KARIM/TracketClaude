package defpackage;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class sj4 {
    public static final sj4 b = new sj4(63, null);
    public final xp3 a;

    public sj4(int i, xp3 xp3Var) {
        this.a = (i & 1) != 0 ? null : xp3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof sj4) {
            return this.a == ((sj4) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        xp3 xp3Var = this.a;
        return (xp3Var != null ? xp3Var.hashCode() : 0) * 28629151;
    }
}
