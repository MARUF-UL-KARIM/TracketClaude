package defpackage;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class ia7 {
    public float a;
    public boolean b;
    public boolean c;

    public final float a(float f, float f2) {
        if (f2 != 0.0f) {
            if (this.b) {
                float f3 = this.a + f2;
                this.a = f3;
                if (Math.abs(f3) >= (this.c ? 15.0f : 10.0f)) {
                    this.b = false;
                    this.c = false;
                    this.a = 0.0f;
                }
            }
            float f4 = f + f2;
            Float fValueOf = null;
            if (f2 > 0.0f) {
                float fCeil = ((float) Math.ceil(((Math.signum(f2) * 0.001f) + f) / 90.0f)) * 90.0f;
                if (f4 >= fCeil) {
                    fValueOf = Float.valueOf(fCeil);
                }
            } else {
                float fFloor = ((float) Math.floor(((Math.signum(f2) * 0.001f) + f) / 90.0f)) * 90.0f;
                if (f4 <= fFloor) {
                    fValueOf = Float.valueOf(fFloor);
                }
            }
            if (fValueOf == null) {
                return f2;
            }
            d18 d18Var = d18.a;
            d18.a();
            this.b = true;
            this.a = 0.0f;
            return fValueOf.floatValue() - f;
        }
        return 0.0f;
    }
}
