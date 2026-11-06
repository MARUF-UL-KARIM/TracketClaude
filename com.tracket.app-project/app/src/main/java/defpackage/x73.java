package defpackage;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class x73 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;
    public final float i;
    public final float j;
    public final float k;
    public final float l;
    public final float m;

    public /* synthetic */ x73(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, int i) {
        this((i & 1) != 0 ? 0.0f : f, (i & 2) != 0 ? 0.0f : f2, (i & 4) != 0 ? 0.0f : f3, (i & 8) != 0 ? 0.0f : f4, (i & 16) != 0 ? 1.0f : f5, (i & 32) != 0 ? 0.0f : f6, (i & 64) != 0 ? 0.0f : f7, (i & 128) != 0 ? 1.0f : f8, (i & 256) != 0 ? 0.0f : f9, (i & 512) != 0 ? 0.0f : f10, (i & 1024) != 0 ? 0.0f : f11, (i & 2048) == 0 ? f12 : 0.0f, (i & 4096) != 0 ? 1.0f : f13);
    }

    public final x73 a(x73 x73Var) {
        float f;
        x73Var.getClass();
        float f2 = x73Var.l;
        float f3 = this.l;
        float f4 = f3 + f2;
        float f5 = 0.0f;
        if (f4 > 0.0f) {
            f = ((x73Var.j * f2) + (this.j * f3)) / f4;
        } else {
            f = 0.0f;
        }
        if (f4 > 0.0f) {
            f5 = ((x73Var.k * f2) + (this.k * f3)) / f4;
        }
        return new x73(this.a + x73Var.a, this.b + x73Var.b, this.c + x73Var.c, this.d + x73Var.d, this.e * x73Var.e, this.f + x73Var.f, this.g + x73Var.g, this.h * x73Var.h, this.i + x73Var.i, f, f5, f4, this.m * x73Var.m).b();
    }

    public final x73 b() {
        return new x73(b9e.e(this.a, -1.0f, 1.0f), b9e.e(this.b, -2.0f, 2.0f), b9e.e(this.c, -12.0f, 12.0f), b9e.e(this.d, -14.0f, 14.0f), b9e.e(this.e, 0.6f, 1.4f), this.f, this.g, b9e.e(this.h, 0.15f, 1.5f), b9e.e(this.i, 0.0f, 1.0f), b9e.e(this.j, -1.0f, 1.0f), b9e.e(this.k, -1.0f, 1.0f), b9e.e(this.l, 0.0f, 1.0f), b9e.e(this.m, 0.0f, 1.0f));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x73)) {
            return false;
        }
        x73 x73Var = (x73) obj;
        return Float.compare(this.a, x73Var.a) == 0 && Float.compare(this.b, x73Var.b) == 0 && Float.compare(this.c, x73Var.c) == 0 && Float.compare(this.d, x73Var.d) == 0 && Float.compare(this.e, x73Var.e) == 0 && Float.compare(this.f, x73Var.f) == 0 && Float.compare(this.g, x73Var.g) == 0 && Float.compare(this.h, x73Var.h) == 0 && Float.compare(this.i, x73Var.i) == 0 && Float.compare(this.j, x73Var.j) == 0 && Float.compare(this.k, x73Var.k) == 0 && Float.compare(this.l, x73Var.l) == 0 && Float.compare(this.m, x73Var.m) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.m) + zd2.a(zd2.a(zd2.a(zd2.a(zd2.a(zd2.a(zd2.a(zd2.a(zd2.a(zd2.a(zd2.a(Float.hashCode(this.a) * 31, this.b, 31), this.c, 31), this.d, 31), this.e, 31), this.f, 31), this.g, 31), this.h, 31), this.i, 31), this.j, 31), this.k, 31), this.l, 31);
    }

    public final String toString() {
        StringBuilder sbR = wd0.r("ExpressTicketMotion(horizontal=", this.a, ", vertical=", this.b, ", cardTranslationX=");
        wd0.u(this.c, this.d, ", cardTranslationY=", ", cardScale=", sbR);
        wd0.u(this.e, this.f, ", noiseOffsetX=", ", noiseOffsetY=", sbR);
        wd0.u(this.g, this.h, ", shapeSpeed=", ", shineIntensity=", sbR);
        wd0.u(this.i, this.j, ", shinePositionX=", ", shinePositionY=", sbR);
        wd0.u(this.k, this.l, ", shinePositionWeight=", ", glassReveal=", sbR);
        return zd2.h(this.m, ")", sbR);
    }

    public x73(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
        this.f = f6;
        this.g = f7;
        this.h = f8;
        this.i = f9;
        this.j = f10;
        this.k = f11;
        this.l = f12;
        this.m = f13;
    }
}
