package defpackage;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class y73 {
    public Float a;
    public Float b;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;
    public float j;
    public float k;
    public float l;
    public float m;
    public float n;

    public static float a(float f, float f2) {
        float f3 = f - f2;
        while (f3 > 3.1415927f) {
            f3 -= 6.2831855f;
        }
        while (f3 < -3.1415927f) {
            f3 += 6.2831855f;
        }
        if (Math.abs(f3) < 6.0E-4f) {
            return 0.0f;
        }
        return f3;
    }

    public final x73 b() {
        return new x73(this.g, this.h, this.c, this.d, 0.0f, this.k, this.l, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 8080);
    }
}
