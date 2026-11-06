package defpackage;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class gx1 implements sf9 {
    public static final gx1 e = new gx1(0.5f, 0.5f, 1.0f, 1.0f);
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public gx1(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public static gx1 h(gx1 gx1Var, float f, float f2, float f3, float f4, int i) {
        if ((i & 1) != 0) {
            f = gx1Var.a;
        }
        if ((i & 2) != 0) {
            f2 = gx1Var.b;
        }
        if ((i & 4) != 0) {
            f3 = gx1Var.c;
        }
        if ((i & 8) != 0) {
            f4 = gx1Var.d;
        }
        gx1Var.getClass();
        return new gx1(f, f2, f3, f4);
    }

    @Override // defpackage.sf9
    public final /* bridge */ sf9 b(float f) {
        return (gx1) super.b(f);
    }

    @Override // defpackage.sf9
    public final sf9 c(float f) {
        return new gx1(this.a * f, this.b * f, this.c * f, this.d * f);
    }

    @Override // defpackage.sf9
    public final sf9 e(sf9 sf9Var) {
        gx1 gx1Var = (gx1) sf9Var;
        gx1Var.getClass();
        return new gx1(this.a - gx1Var.a, this.b - gx1Var.b, this.c - gx1Var.c, this.d - gx1Var.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gx1)) {
            return false;
        }
        gx1 gx1Var = (gx1) obj;
        return Float.compare(this.a, gx1Var.a) == 0 && Float.compare(this.b, gx1Var.b) == 0 && Float.compare(this.c, gx1Var.c) == 0 && Float.compare(this.d, gx1Var.d) == 0;
    }

    @Override // defpackage.sf9
    public final sf9 f(sf9 sf9Var) {
        gx1 gx1Var = (gx1) sf9Var;
        gx1Var.getClass();
        return new gx1(this.a + gx1Var.a, this.b + gx1Var.b, this.c + gx1Var.c, this.d + gx1Var.d);
    }

    public final gx1 g() {
        float fE = b9e.e(0.001f, 0.0f, 1.0f);
        float f = this.c;
        Float fValueOf = Float.valueOf(f);
        if (Math.abs(f) > Float.MAX_VALUE) {
            fValueOf = null;
        }
        float fE2 = fValueOf != null ? b9e.e(fValueOf.floatValue(), fE, 1.0f) : 1.0f;
        float f2 = this.d;
        Float fValueOf2 = Float.valueOf(f2);
        if (Math.abs(f2) > Float.MAX_VALUE) {
            fValueOf2 = null;
        }
        float fE3 = fValueOf2 != null ? b9e.e(fValueOf2.floatValue(), fE, 1.0f) : 1.0f;
        float f3 = fE2 * 0.5f;
        float f4 = fE3 * 0.5f;
        float f5 = this.a;
        Float fValueOf3 = Float.valueOf(f5);
        if (Math.abs(f5) > Float.MAX_VALUE) {
            fValueOf3 = null;
        }
        float fE4 = fValueOf3 != null ? b9e.e(fValueOf3.floatValue(), f3, 1.0f - f3) : 0.5f;
        float f6 = this.b;
        Float fValueOf4 = Math.abs(f6) <= Float.MAX_VALUE ? Float.valueOf(f6) : null;
        return new gx1(fE4, fValueOf4 != null ? b9e.e(fValueOf4.floatValue(), f4, 1.0f - f4) : 0.5f, fE2, fE3);
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + zd2.a(zd2.a(Float.hashCode(this.a) * 31, this.b, 31), this.c, 31);
    }

    public final float i() {
        return (this.d * 0.5f) + this.b;
    }

    public final float j() {
        return this.a - (this.c * 0.5f);
    }

    public final float k() {
        return (this.c * 0.5f) + this.a;
    }

    public final float l() {
        return this.b - (this.d * 0.5f);
    }

    @Override // defpackage.sf9
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public final gx1 d(gx1 gx1Var, float f) {
        gx1Var.getClass();
        float f2 = this.a;
        float fA = iu1.a(gx1Var.a, f2, f, f2);
        float f3 = this.b;
        float fA2 = iu1.a(gx1Var.b, f3, f, f3);
        float f4 = this.c;
        float fA3 = iu1.a(gx1Var.c, f4, f, f4);
        float f5 = this.d;
        return new gx1(fA, fA2, fA3, iu1.a(gx1Var.d, f5, f, f5)).g();
    }

    public final String toString() {
        return iu1.g(this.c, this.d, ", height=", ")", wd0.r("CropBounds(centerX=", this.a, ", centerY=", this.b, ", width="));
    }
}
