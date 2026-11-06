package com.tracket.editor.coloradjustments;

import defpackage.ic1;
import defpackage.jd1;
import defpackage.ug1;
import defpackage.x03;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 com.tracket.editor.coloradjustments.ColorAdjustmentParameter[], still in use, count: 1, list:
  (r0v1 com.tracket.editor.coloradjustments.ColorAdjustmentParameter[]) from 0x00ef: CONSTRUCTOR (r0v1 com.tracket.editor.coloradjustments.ColorAdjustmentParameter[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:240) call: x03.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class ColorAdjustmentParameter {
    EXPOSURE(new ic1(-4.0f, 4.0f), 6, 1.0f),
    /* JADX INFO: Fake field, exist only in values array */
    BRIGHTNESS(new ic1(-100.0f, 100.0f), 6, 25.0f),
    /* JADX INFO: Fake field, exist only in values array */
    CONTRAST(new ic1(-100.0f, 100.0f), 6, 25.0f),
    /* JADX INFO: Fake field, exist only in values array */
    HIGHLIGHTS(new ic1(-100.0f, 100.0f), 6, 25.0f),
    /* JADX INFO: Fake field, exist only in values array */
    SHADOWS(new ic1(-100.0f, 100.0f), 6, 25.0f),
    /* JADX INFO: Fake field, exist only in values array */
    WHITES(new ic1(-100.0f, 100.0f), 6, 25.0f),
    /* JADX INFO: Fake field, exist only in values array */
    BLACKS(new ic1(-100.0f, 100.0f), 6, 25.0f),
    /* JADX INFO: Fake field, exist only in values array */
    TEMPERATURE(new ic1(-100.0f, 100.0f), 6, 25.0f),
    /* JADX INFO: Fake field, exist only in values array */
    TINT(new ic1(-100.0f, 100.0f), 6, 25.0f),
    /* JADX INFO: Fake field, exist only in values array */
    SATURATION(new ic1(-100.0f, 100.0f), 6, 25.0f),
    /* JADX INFO: Fake field, exist only in values array */
    VIBRANCE(new ic1(-100.0f, 100.0f), 6, 25.0f),
    /* JADX INFO: Fake field, exist only in values array */
    HUE(new ic1(-180.0f, 180.0f), 4, 30.0f),
    /* JADX INFO: Fake field, exist only in values array */
    FADE(new ic1(0.0f, 100.0f), 12, 25.0f);

    public static final /* synthetic */ x03 D;
    public final float A;
    public final ic1 y;
    public final int z;

    static {
        D = new x03(colorAdjustmentParameterArr);
    }

    public ColorAdjustmentParameter(ic1 ic1Var, int i, float f) {
        super(str, i);
        this.y = ic1Var;
        this.z = i;
        this.A = f;
    }

    public static ColorAdjustmentParameter valueOf(String str) {
        return (ColorAdjustmentParameter) Enum.valueOf(ColorAdjustmentParameter.class, str);
    }

    public static ColorAdjustmentParameter[] values() {
        return (ColorAdjustmentParameter[]) C.clone();
    }

    public final float a(jd1 jd1Var) {
        jd1Var.getClass();
        switch (this) {
            case EXPOSURE:
                return jd1Var.a;
            case BRIGHTNESS:
                return jd1Var.b * 100.0f;
            case CONTRAST:
                return jd1Var.c * 100.0f;
            case HIGHLIGHTS:
                return jd1Var.d * 100.0f;
            case SHADOWS:
                return jd1Var.e * 100.0f;
            case WHITES:
                return jd1Var.f * 100.0f;
            case BLACKS:
                return jd1Var.g * 100.0f;
            case TEMPERATURE:
                return jd1Var.h * 100.0f;
            case TINT:
                return jd1Var.i * 100.0f;
            case SATURATION:
                return jd1Var.j * 100.0f;
            case VIBRANCE:
                return jd1Var.k * 100.0f;
            case HUE:
                return jd1Var.l;
            case FADE:
                return jd1Var.m * 100.0f;
            default:
                ug1.a();
                return 0.0f;
        }
    }
}
