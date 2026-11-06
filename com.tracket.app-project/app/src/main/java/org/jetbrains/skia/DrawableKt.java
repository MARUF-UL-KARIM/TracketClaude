package org.jetbrains.skia;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes4.dex */
public final class DrawableKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final native void Drawable_nGetBounds(long j, Object obj);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native long Drawable_nGetFinalizer();

    /* JADX INFO: Access modifiers changed from: private */
    public static final native int Drawable_nGetGenerationId(long j);

    public static final native void Drawable_nInit(long j, Object obj, Object obj2);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native long Drawable_nMake();

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void _nDraw(long j, long j2, Object obj);

    public static final native long _nGetOnDrawCanvas(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native long _nMakePictureSnapshot(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void _nNotifyDrawingChanged(long j);

    public static final native void _nSetBounds(long j, float f, float f2, float f3, float f4);
}
