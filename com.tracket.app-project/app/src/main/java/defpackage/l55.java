package defpackage;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class l55 {
    public final Object a;
    public final int b;
    public final int c;
    public final long d;
    public final int e;

    public l55(long j, Object obj, int i, int i2, int i3) {
        this.a = obj;
        this.b = i;
        this.c = i2;
        this.d = j;
        this.e = i3;
    }

    public final l55 a(Object obj) {
        if (this.a.equals(obj)) {
            return this;
        }
        return new l55(this.d, obj, this.b, this.c, this.e);
    }

    public final boolean b() {
        return this.b != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l55)) {
            return false;
        }
        l55 l55Var = (l55) obj;
        return this.a.equals(l55Var.a) && this.b == l55Var.b && this.c == l55Var.c && this.d == l55Var.d && this.e == l55Var.e;
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() + 527) * 31) + this.b) * 31) + this.c) * 31) + ((int) this.d)) * 31) + this.e;
    }

    public l55(long j, Object obj) {
        this(j, obj, -1, -1, -1);
    }

    public l55(Object obj, long j, int i) {
        this(j, obj, -1, -1, i);
    }

    public l55(Object obj) {
        this(-1L, obj);
    }
}
