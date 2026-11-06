package defpackage;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class z15 {
    public static final z15 j = new z15(1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f);
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;
    public final float i;

    public z15(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
        this.f = f6;
        this.g = f7;
        this.h = f8;
        this.i = f9;
    }

    public static z15 a(z15 z15Var, float f, float f2, float f3, float f4, float f5, float f6, int i) {
        if ((i & 1) != 0) {
            f = z15Var.a;
        }
        float f7 = f;
        if ((i & 2) != 0) {
            f2 = z15Var.b;
        }
        float f8 = f2;
        if ((i & 8) != 0) {
            f4 = z15Var.d;
        }
        return new z15(f7, f8, f3, f4, (i & 16) != 0 ? z15Var.e : f5, f6, z15Var.g, z15Var.h, z15Var.i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z15)) {
            return false;
        }
        z15 z15Var = (z15) obj;
        return Float.compare(this.a, z15Var.a) == 0 && Float.compare(this.b, z15Var.b) == 0 && Float.compare(this.c, z15Var.c) == 0 && Float.compare(this.d, z15Var.d) == 0 && Float.compare(this.e, z15Var.e) == 0 && Float.compare(this.f, z15Var.f) == 0 && Float.compare(this.g, z15Var.g) == 0 && Float.compare(this.h, z15Var.h) == 0 && Float.compare(this.i, z15Var.i) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.i) + zd2.a(zd2.a(zd2.a(zd2.a(zd2.a(zd2.a(zd2.a(Float.hashCode(this.a) * 31, this.b, 31), this.c, 31), this.d, 31), this.e, 31), this.f, 31), this.g, 31), this.h, 31);
    }

    public final String toString() {
        StringBuilder sbR = wd0.r("Matrix3x3(m00=", this.a, ", m01=", this.b, ", m02=");
        wd0.u(this.c, this.d, ", m10=", ", m11=", sbR);
        wd0.u(this.e, this.f, ", m12=", ", m20=", sbR);
        wd0.u(this.g, this.h, ", m21=", ", m22=", sbR);
        return zd2.h(this.i, ")", sbR);
    }
}
