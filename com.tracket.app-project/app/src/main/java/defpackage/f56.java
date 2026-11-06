package defpackage;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class f56 {
    public final e46 a;
    public final e46 b;

    public f56(e46 e46Var, e46 e46Var2) {
        this.a = e46Var;
        this.b = e46Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f56)) {
            return false;
        }
        f56 f56Var = (f56) obj;
        return this.a.equals(f56Var.a) && this.b.equals(f56Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PlaybackPositionUpdate(previousState=" + this.a + ", newState=" + this.b + ")";
    }
}
