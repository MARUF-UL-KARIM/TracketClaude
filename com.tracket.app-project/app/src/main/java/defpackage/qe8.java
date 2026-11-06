package defpackage;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class qe8 {
    public final n55 a;
    public final int b;
    public final int c;

    public qe8(n55 n55Var, int i, int i2) {
        n55Var.getClass();
        this.a = n55Var;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qe8)) {
            return false;
        }
        qe8 qe8Var = (qe8) obj;
        return ff4.h(this.a, qe8Var.a) && this.b == qe8Var.b && this.c == qe8Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + zd2.b(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StickerOverlayPreviewKey(source=");
        sb.append(this.a);
        sb.append(", width=");
        sb.append(this.b);
        sb.append(", height=");
        return zd2.o(sb, this.c, ")");
    }
}
