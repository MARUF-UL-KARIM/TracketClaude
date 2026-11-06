package defpackage;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class ja5 {
    public final String a;
    public final int b;

    public ja5(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ja5)) {
            return false;
        }
        ja5 ja5Var = (ja5) obj;
        return this.a.equals(ja5Var.a) && this.b == ja5Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ModeTitleState(text=" + this.a + ", depth=" + this.b + ")";
    }
}
