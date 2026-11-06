package defpackage;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public abstract class qx1 {
    public static final gx1 a(float f, float f2, float f3, float f4, gx1 gx1Var) {
        gx1 gx1VarG = new gx1((f + f3) * 0.5f, (f2 + f4) * 0.5f, f3 - f, f4 - f2).g();
        if (Math.abs(gx1VarG.a - gx1Var.a) > 1.0E-6f || Math.abs(gx1VarG.b - gx1Var.b) > 1.0E-6f || Math.abs(gx1VarG.c - gx1Var.c) > 1.0E-6f || Math.abs(gx1VarG.d - gx1Var.d) > 1.0E-6f) {
            gx1Var = null;
        }
        return gx1Var == null ? gx1VarG : gx1Var;
    }

    public static gx1 b(gx1 gx1Var) {
        float fFloatValue;
        float f = gx1Var.c;
        Float fValueOf = Float.valueOf(f);
        if (Math.abs(f) > Float.MAX_VALUE) {
            fValueOf = null;
        }
        float f2 = 0.001f;
        if (fValueOf != null) {
            fFloatValue = fValueOf.floatValue();
            if (fFloatValue < 0.001f) {
                fFloatValue = 0.001f;
            }
        } else {
            fFloatValue = 1.0f;
        }
        float f3 = gx1Var.d;
        Float fValueOf2 = Math.abs(f3) <= Float.MAX_VALUE ? Float.valueOf(f3) : null;
        if (fValueOf2 != null) {
            float fFloatValue2 = fValueOf2.floatValue();
            if (fFloatValue2 >= 0.001f) {
                f2 = fFloatValue2;
            }
        } else {
            f2 = 1.0f;
        }
        float fMin = Math.min(1.0f, Math.min(1.0f / fFloatValue, 1.0f / f2));
        return gx1.h(gx1Var, 0.0f, 0.0f, fFloatValue * fMin, f2 * fMin, 3).g();
    }
}
