package defpackage;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class tp8 {
    public final String a;
    public final int b;

    public tp8(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tp8)) {
            return false;
        }
        tp8 tp8Var = (tp8) obj;
        if (this.b != tp8Var.b) {
            return false;
        }
        return this.a.equals(tp8Var.a);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }
}
