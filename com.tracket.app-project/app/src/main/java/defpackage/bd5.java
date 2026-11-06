package defpackage;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class bd5 {
    public final int a;
    public final int b;
    public final float c;

    public bd5(int i, float f, int i2) {
        this.a = i;
        this.b = i2;
        this.c = f;
    }

    public static bd5 a(int i) {
        int i2 = (i >> 13) & 7;
        if (i2 == 0) {
            return null;
        }
        return new bd5(i2, ((i & 511) * ((i & 512) != 0 ? -1 : 1)) / 10.0f, (i >> 10) & 7);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof bd5)) {
            return false;
        }
        bd5 bd5Var = (bd5) obj;
        return this.a == bd5Var.a && this.b == bd5Var.b && Float.compare(this.c, bd5Var.c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + (((this.a * 31) + this.b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GainField{name=");
        sb.append(this.a);
        sb.append(", originator=");
        sb.append(this.b);
        sb.append(", gain=");
        return iu1.j(sb, this.c, '}');
    }
}
