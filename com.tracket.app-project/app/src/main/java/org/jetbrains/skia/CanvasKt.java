package org.jetbrains.skia;

import defpackage.xp3;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes4.dex */
public final class CanvasKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final native long Canvas_nGetFinalizer();

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void _nClear(long j, int i);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void _nClipPath(long j, long j2, int i, boolean z);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void _nClipRRect(long j, float f, float f2, float f3, float f4, Object obj, int i, int i2, boolean z);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void _nClipRect(long j, float f, float f2, float f3, float f4, int i, boolean z);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void _nClipRegion(long j, long j2, int i);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void _nConcat(long j, Object obj);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void _nConcat44(long j, Object obj);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void _nDrawArc(long j, float f, float f2, float f3, float f4, float f5, float f6, boolean z, long j2);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void _nDrawDRRect(long j, float f, float f2, float f3, float f4, Object obj, int i, float f5, float f6, float f7, float f8, Object obj2, int i2, long j2);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void _nDrawDrawable(long j, long j2, Object obj);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void _nDrawImageNine(long j, long j2, int i, int i2, int i3, int i4, float f, float f2, float f3, float f4, int i5, long j3);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void _nDrawImageRect(long j, long j2, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, int i, int i2, long j3, boolean z);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void _nDrawLine(long j, float f, float f2, float f3, float f4, long j2);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void _nDrawOval(long j, float f, float f2, float f3, float f4, long j2);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void _nDrawPaint(long j, long j2);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void _nDrawPatch(long j, Object obj, Object obj2, Object obj3, int i, long j2);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void _nDrawPath(long j, long j2, long j3);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void _nDrawPicture(long j, long j2, Object obj, long j3);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void _nDrawPoint(long j, float f, float f2, long j2);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void _nDrawPoints(long j, int i, int i2, Object obj, long j2);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void _nDrawRRect(long j, float f, float f2, float f3, float f4, Object obj, int i, long j2);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void _nDrawRect(long j, float f, float f2, float f3, float f4, long j2);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void _nDrawRegion(long j, long j2, long j3);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void _nDrawString(long j, Object obj, float f, float f2, long j2, long j3);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void _nDrawTextBlob(long j, long j2, float f, float f2, long j3);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void _nDrawVertices(long j, int i, int i2, Object obj, Object obj2, Object obj3, int i3, Object obj4, int i4, long j2);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void _nGetLocalToDevice(long j, Object obj);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native int _nGetSaveCount(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native long _nMakeFromBitmap(long j, int i, int i2);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native boolean _nReadPixels(long j, long j2, int i, int i2);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void _nResetMatrix(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void _nRestore(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void _nRestoreToCount(long j, int i);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void _nRotate(long j, float f, float f2, float f3);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native int _nSave(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native int _nSaveLayer(long j, long j2);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native int _nSaveLayerRect(long j, float f, float f2, float f3, float f4, long j2);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native int _nSaveLayerSaveLayerRec(long j, long j2, long j3, long j4, int i);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native int _nSaveLayerSaveLayerRecRect(long j, float f, float f2, float f3, float f4, long j2, long j3, long j4, int i);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void _nScale(long j, float f, float f2);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void _nSetMatrix(long j, Object obj);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void _nSkew(long j, float f, float f2);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void _nTranslate(long j, float f, float f2);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native boolean _nWritePixels(long j, long j2, int i, int i2);

    public static final void runRestoringState(Canvas canvas, xp3 xp3Var) {
        canvas.getClass();
        xp3Var.getClass();
        int iSave = canvas.save();
        try {
            xp3Var.invoke(canvas);
        } finally {
            canvas.restoreToCount(iSave);
        }
    }
}
