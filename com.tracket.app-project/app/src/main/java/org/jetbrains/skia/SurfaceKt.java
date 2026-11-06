package org.jetbrains.skia;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes4.dex */
public final class SurfaceKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final native int Surface_nGetHeight(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void Surface_nGetImageInfo(long j, Object obj, Object obj2);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native int Surface_nGetWidth(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native boolean Surface_nReadPixels(long j, long j2, int i, int i2);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void Surface_nWritePixels(long j, long j2, int i, int i2);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void _nDraw(long j, long j2, float f, float f2, int i, int i2, long j3);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native int _nGenerationId(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native long _nGetCanvas(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native long _nGetRecordingContext(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native long _nMakeFromBackendRenderTarget(long j, long j2, int i, int i2, long j3, Object obj);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native long _nMakeFromMTKView(long j, long j2, int i, int i2, int i3, long j3, Object obj);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native long _nMakeImageSnapshot(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native long _nMakeImageSnapshotR(long j, int i, int i2, int i3, int i4);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native long _nMakeNull(int i, int i2);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native long _nMakeRaster(int i, int i2, int i3, int i4, long j, int i5, Object obj);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native long _nMakeRasterDirect(int i, int i2, int i3, int i4, long j, long j2, int i5, Object obj);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native long _nMakeRasterDirectWithPixmap(long j, Object obj);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native long _nMakeRasterN32Premul(int i, int i2);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native long _nMakeRenderTarget(long j, boolean z, int i, int i2, int i3, int i4, long j2, int i5, int i6, Object obj, boolean z2);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native long _nMakeSurface(long j, int i, int i2);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native long _nMakeSurfaceI(long j, int i, int i2, int i3, int i4, long j2);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void _nNotifyContentWillChange(long j, int i);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native boolean _nPeekPixels(long j, long j2);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native boolean _nReadPixelsToPixmap(long j, long j2, int i, int i2);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native boolean _nUnique(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void _nWritePixelsFromPixmap(long j, long j2, int i, int i2);
}
