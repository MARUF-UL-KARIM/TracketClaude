package defpackage;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class sp6 {
    public static final sp6 e = new sp6(0.0f, 0.0f, 0.0f, 0.0f);
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public sp6(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public static sp6 b(sp6 sp6Var, float f, float f2, int i) {
        if ((i & 1) != 0) {
            f = sp6Var.a;
        }
        float f3 = (i & 2) != 0 ? sp6Var.b : Float.NEGATIVE_INFINITY;
        if ((i & 4) != 0) {
            f2 = sp6Var.c;
        }
        return new sp6(f, f3, f2, (i & 8) != 0 ? sp6Var.d : Float.POSITIVE_INFINITY);
    }

    public final boolean a(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        return (fIntBitsToFloat >= this.a) & (fIntBitsToFloat < this.c) & (fIntBitsToFloat2 >= this.b) & (fIntBitsToFloat2 < this.d);
    }

    public final long c() {
        float f = this.c;
        float f2 = this.a;
        float f3 = ((f - f2) / 2.0f) + f2;
        float f4 = this.d;
        float f5 = this.b;
        return (((long) Float.floatToRawIntBits(((f4 - f5) / 2.0f) + f5)) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32);
    }

    public final long d() {
        float f = this.c - this.a;
        return (((long) Float.floatToRawIntBits(this.d - this.b)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    public final long e() {
        return (((long) Float.floatToRawIntBits(this.a)) << 32) | (((long) Float.floatToRawIntBits(this.b)) & 4294967295L);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sp6)) {
            return false;
        }
        sp6 sp6Var = (sp6) obj;
        return Float.compare(this.a, sp6Var.a) == 0 && Float.compare(this.b, sp6Var.b) == 0 && Float.compare(this.c, sp6Var.c) == 0 && Float.compare(this.d, sp6Var.d) == 0;
    }

    public final sp6 f(sp6 sp6Var) {
        return new sp6(Math.max(this.a, sp6Var.a), Math.max(this.b, sp6Var.b), Math.min(this.c, sp6Var.c), Math.min(this.d, sp6Var.d));
    }

    public final boolean g() {
        return (this.a >= this.c) | (this.b >= this.d);
    }

    public final boolean h(sp6 sp6Var) {
        return (this.a < sp6Var.c) & (sp6Var.a < this.c) & (this.b < sp6Var.d) & (sp6Var.b < this.d);
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + zd2.a(zd2.a(Float.hashCode(this.a) * 31, this.b, 31), this.c, 31);
    }

    public final sp6 i(float f, float f2) {
        return new sp6(this.a + f, this.b + f2, this.c + f, this.d + f2);
    }

    public final sp6 j(long j) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        return new sp6(Float.intBitsToFloat(i) + this.a, Float.intBitsToFloat(i2) + this.b, Float.intBitsToFloat(i) + this.c, Float.intBitsToFloat(i2) + this.d);
    }

    public final String toString() {
        return "Rect.fromLTRB(" + sqe.b(this.a) + ", " + sqe.b(this.b) + ", " + sqe.b(this.c) + ", " + sqe.b(this.d) + ')';
    }
}
