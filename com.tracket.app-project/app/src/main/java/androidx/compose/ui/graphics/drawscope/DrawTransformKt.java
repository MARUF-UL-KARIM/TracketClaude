package androidx.compose.ui.graphics.drawscope;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class DrawTransformKt {
    public static final void inset(DrawTransform drawTransform, float f, float f2) {
        drawTransform.inset(f, f2, f, f2);
    }

    public static /* synthetic */ void inset$default(DrawTransform drawTransform, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        drawTransform.inset(f, f2, f, f2);
    }

    /* JADX INFO: renamed from: rotateRad-0AR0LA0, reason: not valid java name */
    public static final void m233rotateRad0AR0LA0(DrawTransform drawTransform, float f, long j) {
        drawTransform.mo95rotateUv8p0NA(f * 57.29578f, j);
    }

    /* JADX INFO: renamed from: rotateRad-0AR0LA0$default, reason: not valid java name */
    public static void m234rotateRad0AR0LA0$default(DrawTransform drawTransform, float f, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = drawTransform.mo93getCenterF1C5BW0();
        }
        drawTransform.mo95rotateUv8p0NA(f * 57.29578f, j);
    }

    /* JADX INFO: renamed from: scale-0AR0LA0, reason: not valid java name */
    public static final void m235scale0AR0LA0(DrawTransform drawTransform, float f, long j) {
        drawTransform.mo96scale0AR0LA0(f, f, j);
    }

    /* JADX INFO: renamed from: scale-0AR0LA0$default, reason: not valid java name */
    public static /* synthetic */ void m236scale0AR0LA0$default(DrawTransform drawTransform, float f, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = drawTransform.mo93getCenterF1C5BW0();
        }
        drawTransform.mo96scale0AR0LA0(f, f, j);
    }

    public static final void inset(DrawTransform drawTransform, float f) {
        drawTransform.inset(f, f, f, f);
    }
}
