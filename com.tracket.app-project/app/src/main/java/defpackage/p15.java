package defpackage;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class p15 {
    public final String a;
    public final ec4 b;

    public p15(String str, ec4 ec4Var) {
        this.a = str;
        this.b = ec4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p15)) {
            return false;
        }
        p15 p15Var = (p15) obj;
        return this.a.equals(p15Var.a) && this.b.equals(p15Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "MatchGroup(value=" + this.a + ", range=" + this.b + ')';
    }
}
