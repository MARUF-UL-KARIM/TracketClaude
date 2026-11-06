package defpackage;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class gz7 {
    public double a;
    public double b;

    public gz7(double d, double d2) {
        this.a = d;
        this.b = d2;
    }

    public final Object clone() {
        return new gz7(this.a, this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gz7)) {
            return false;
        }
        gz7 gz7Var = (gz7) obj;
        return this.a == gz7Var.a && this.b == gz7Var.b;
    }

    public final int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.b);
        int i = ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32))) + 31;
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.a);
        return (i * 31) + ((int) ((jDoubleToLongBits2 >>> 32) ^ jDoubleToLongBits2));
    }

    public final String toString() {
        return ((int) this.a) + "x" + ((int) this.b);
    }
}
