package defpackage;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class fc4 {
    public static final fc4 e = new fc4(0, 0, 0, 0);
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public fc4(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final long a() {
        return (((long) ((b() / 2) + this.b)) & 4294967295L) | (((long) ((d() / 2) + this.a)) << 32);
    }

    public final int b() {
        return this.d - this.b;
    }

    public final long c() {
        return (((long) this.a) << 32) | (((long) this.b) & 4294967295L);
    }

    public final int d() {
        return this.c - this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fc4)) {
            return false;
        }
        fc4 fc4Var = (fc4) obj;
        return this.a == fc4Var.a && this.b == fc4Var.b && this.c == fc4Var.c && this.d == fc4Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + zd2.b(this.c, zd2.b(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IntRect.fromLTRB(");
        sb.append(this.a);
        sb.append(", ");
        sb.append(this.b);
        sb.append(", ");
        sb.append(this.c);
        sb.append(", ");
        return zd2.n(sb, this.d, ')');
    }
}
