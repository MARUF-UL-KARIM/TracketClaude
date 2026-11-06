package defpackage;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class tv7 {
    public final float a;
    public final float b;

    public tv7(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final float a(tv7 tv7Var) {
        return (this.a * tv7Var.b) - (this.b * tv7Var.a);
    }

    public final tv7 b(tv7 tv7Var) {
        return new tv7(this.a / tv7Var.a, this.b / tv7Var.b);
    }

    public final float c(tv7 tv7Var) {
        return (this.b * tv7Var.b) + (this.a * tv7Var.a);
    }

    public final float d() {
        return (float) Math.sqrt(c(this));
    }

    public final tv7 e(tv7 tv7Var) {
        tv7Var.getClass();
        return new tv7(this.a - tv7Var.a, this.b - tv7Var.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tv7)) {
            return false;
        }
        tv7 tv7Var = (tv7) obj;
        return Float.compare(this.a, tv7Var.a) == 0 && Float.compare(this.b, tv7Var.b) == 0;
    }

    public final tv7 f() {
        float fMax = Math.max(d(), 1.0E-5f);
        return new tv7(this.a / fMax, this.b / fMax);
    }

    public final tv7 g(tv7 tv7Var) {
        tv7Var.getClass();
        return new tv7(this.a + tv7Var.a, this.b + tv7Var.b);
    }

    public final tv7 h(float f) {
        return new tv7(this.a * f, this.b * f);
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return iu1.i("Vec2(x=", this.a, ", y=", this.b, ")");
    }
}
