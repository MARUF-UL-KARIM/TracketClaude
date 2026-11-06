package androidx.compose.ui.graphics.drawscope;

import defpackage.c15;
import defpackage.tw5;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
@DrawScopeMarker
public interface DrawTransform {

    /* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
    public static final class DefaultImpls {
        @Deprecated
        /* JADX INFO: renamed from: getCenter-F1C5BW0, reason: not valid java name */
        public static long m230getCenterF1C5BW0(DrawTransform drawTransform) {
            return DrawTransform.super.mo93getCenterF1C5BW0();
        }
    }

    /* JADX INFO: renamed from: clipPath-mtrdD-E$default, reason: not valid java name */
    static void m224clipPathmtrdDE$default(DrawTransform drawTransform, tw5 tw5Var, int i, int i2, Object obj) {
        if (obj != null) {
            c15.r("Super calls with default arguments not supported in this target, function: clipPath-mtrdD-E");
            return;
        }
        if ((i2 & 2) != 0) {
            i = 1;
        }
        drawTransform.mo91clipPathmtrdDE(tw5Var, i);
    }

    /* JADX INFO: renamed from: clipRect-N_I0leg$default, reason: not valid java name */
    static void m225clipRectN_I0leg$default(DrawTransform drawTransform, float f, float f2, float f3, float f4, int i, int i2, Object obj) {
        if (obj != null) {
            c15.r("Super calls with default arguments not supported in this target, function: clipRect-N_I0leg");
            return;
        }
        if ((i2 & 1) != 0) {
            f = 0.0f;
        }
        if ((i2 & 2) != 0) {
            f2 = 0.0f;
        }
        if ((i2 & 4) != 0) {
            f3 = Float.intBitsToFloat((int) (drawTransform.mo94getSizeNHjbRc() >> 32));
        }
        if ((i2 & 8) != 0) {
            f4 = Float.intBitsToFloat((int) (drawTransform.mo94getSizeNHjbRc() & 4294967295L));
        }
        if ((i2 & 16) != 0) {
            i = 1;
        }
        drawTransform.mo92clipRectN_I0leg(f, f2, f3, f4, i);
    }

    /* JADX INFO: renamed from: rotate-Uv8p0NA$default, reason: not valid java name */
    static /* synthetic */ void m226rotateUv8p0NA$default(DrawTransform drawTransform, float f, long j, int i, Object obj) {
        if (obj != null) {
            c15.r("Super calls with default arguments not supported in this target, function: rotate-Uv8p0NA");
            return;
        }
        if ((i & 2) != 0) {
            j = drawTransform.mo93getCenterF1C5BW0();
        }
        drawTransform.mo95rotateUv8p0NA(f, j);
    }

    /* JADX INFO: renamed from: scale-0AR0LA0$default, reason: not valid java name */
    static /* synthetic */ void m227scale0AR0LA0$default(DrawTransform drawTransform, float f, float f2, long j, int i, Object obj) {
        if (obj != null) {
            c15.r("Super calls with default arguments not supported in this target, function: scale-0AR0LA0");
            return;
        }
        if ((i & 4) != 0) {
            j = drawTransform.mo93getCenterF1C5BW0();
        }
        drawTransform.mo96scale0AR0LA0(f, f2, j);
    }

    static /* synthetic */ void translate$default(DrawTransform drawTransform, float f, float f2, int i, Object obj) {
        if (obj != null) {
            c15.r("Super calls with default arguments not supported in this target, function: translate");
            return;
        }
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        drawTransform.translate(f, f2);
    }

    /* JADX INFO: renamed from: clipPath-mtrdD-E */
    void mo91clipPathmtrdDE(tw5 tw5Var, int i);

    /* JADX INFO: renamed from: clipRect-N_I0leg */
    void mo92clipRectN_I0leg(float f, float f2, float f3, float f4, int i);

    /* JADX INFO: renamed from: getCenter-F1C5BW0 */
    default long mo93getCenterF1C5BW0() {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (mo94getSizeNHjbRc() >> 32)) / 2.0f;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (mo94getSizeNHjbRc() & 4294967295L)) / 2.0f;
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
    }

    /* JADX INFO: renamed from: getSize-NH-jbRc */
    long mo94getSizeNHjbRc();

    void inset(float f, float f2, float f3, float f4);

    /* JADX INFO: renamed from: rotate-Uv8p0NA */
    void mo95rotateUv8p0NA(float f, long j);

    /* JADX INFO: renamed from: scale-0AR0LA0 */
    void mo96scale0AR0LA0(float f, float f2, long j);

    /* JADX INFO: renamed from: transform-58bKbWc */
    void mo97transform58bKbWc(float[] fArr);

    void translate(float f, float f2);
}
