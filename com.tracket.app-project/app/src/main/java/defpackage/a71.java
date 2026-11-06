package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class a71 extends j54 {
    public final String b;
    public final boolean c;
    public final boolean d;
    public final String[] e;
    public final j54[] f;

    public a71(String str, boolean z, boolean z2, String[] strArr, j54[] j54VarArr) {
        super("CTOC");
        this.b = str;
        this.c = z;
        this.d = z2;
        this.e = strArr;
        this.f = j54VarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a71.class != obj.getClass()) {
            return false;
        }
        a71 a71Var = (a71) obj;
        return this.c == a71Var.c && this.d == a71Var.d && this.b.equals(a71Var.b) && Arrays.equals(this.e, a71Var.e) && Arrays.equals(this.f, a71Var.f);
    }

    public final int hashCode() {
        return this.b.hashCode() + ((((527 + (this.c ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31);
    }
}
