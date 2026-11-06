package defpackage;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class ic1 {
    public final float a;
    public final float b;

    public ic1(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean b(Comparable comparable, Comparable comparable2) {
        return ((Number) comparable).floatValue() <= ((Number) comparable2).floatValue();
    }

    public final boolean a() {
        return this.a > this.b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ic1)) {
            return false;
        }
        if (a() && ((ic1) obj).a()) {
            return true;
        }
        ic1 ic1Var = (ic1) obj;
        return this.a == ic1Var.a && this.b == ic1Var.b;
    }

    public final int hashCode() {
        if (a()) {
            return -1;
        }
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return this.a + ".." + this.b;
    }
}
