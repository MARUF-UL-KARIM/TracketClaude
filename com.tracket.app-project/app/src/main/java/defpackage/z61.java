package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class z61 extends j54 {
    public final String b;
    public final int c;
    public final int d;
    public final long e;
    public final long f;
    public final j54[] g;

    public z61(String str, int i, int i2, long j, long j2, j54[] j54VarArr) {
        super("CHAP");
        this.b = str;
        this.c = i;
        this.d = i2;
        this.e = j;
        this.f = j2;
        this.g = j54VarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || z61.class != obj.getClass()) {
            return false;
        }
        z61 z61Var = (z61) obj;
        return this.c == z61Var.c && this.d == z61Var.d && this.e == z61Var.e && this.f == z61Var.f && this.b.equals(z61Var.b) && Arrays.equals(this.g, z61Var.g);
    }

    public final int hashCode() {
        return this.b.hashCode() + ((((((((527 + this.c) * 31) + this.d) * 31) + ((int) this.e)) * 31) + ((int) this.f)) * 31);
    }
}
