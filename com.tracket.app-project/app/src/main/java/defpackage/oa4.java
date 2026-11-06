package defpackage;

import android.graphics.Insets;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class oa4 {
    public static final oa4 e = new oa4(0, 0, 0, 0);
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public oa4(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public static oa4 a(oa4 oa4Var, oa4 oa4Var2) {
        return c(Math.max(oa4Var.a, oa4Var2.a), Math.max(oa4Var.b, oa4Var2.b), Math.max(oa4Var.c, oa4Var2.c), Math.max(oa4Var.d, oa4Var2.d));
    }

    public static oa4 b(oa4 oa4Var, oa4 oa4Var2) {
        return c(Math.min(oa4Var.a, oa4Var2.a), Math.min(oa4Var.b, oa4Var2.b), Math.min(oa4Var.c, oa4Var2.c), Math.min(oa4Var.d, oa4Var2.d));
    }

    public static oa4 c(int i, int i2, int i3, int i4) {
        return (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) ? e : new oa4(i, i2, i3, i4);
    }

    public static oa4 d(Insets insets) {
        return c(insets.left, insets.top, insets.right, insets.bottom);
    }

    public final Insets e() {
        return io.p(this.a, this.b, this.c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || oa4.class != obj.getClass()) {
            return false;
        }
        oa4 oa4Var = (oa4) obj;
        return this.d == oa4Var.d && this.a == oa4Var.a && this.c == oa4Var.c && this.b == oa4Var.b;
    }

    public final int hashCode() {
        return (((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Insets{left=");
        sb.append(this.a);
        sb.append(", top=");
        sb.append(this.b);
        sb.append(", right=");
        sb.append(this.c);
        sb.append(", bottom=");
        return zd2.n(sb, this.d, '}');
    }
}
