package org.jetbrains.skia;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes4.dex */
public final class BitmapKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final native int Bitmap_nGetColor(long j, int i, int i2);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native long Bitmap_nGetFinalizer();

    /* JADX INFO: Access modifiers changed from: private */
    public static final native boolean _nAllocPixels(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native boolean _nAllocPixelsFlags(long j, int i, int i2, int i3, int i4, long j2, int i5);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native boolean _nAllocPixelsRowBytes(long j, int i, int i2, int i3, int i4, long j2, int i5);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native int _nComputeByteSize(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native boolean _nComputeIsOpaque(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void _nErase(long j, int i, int i2, int i3, int i4, int i5);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void _nEraseColor(long j, int i);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native boolean _nExtractAlpha(long j, long j2, long j3, Object obj);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native boolean _nExtractSubset(long j, long j2, int i, int i2, int i3, int i4);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native float _nGetAlphaf(long j, int i, int i2);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native int _nGetGenerationId(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void _nGetImageInfo(long j, Object obj, Object obj2);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native long _nGetPixelRef(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native int _nGetPixelRefOriginX(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native int _nGetPixelRefOriginY(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native int _nGetRowBytes(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native int _nGetRowBytesAsPixels(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native boolean _nInstallPixels(long j, int i, int i2, int i3, int i4, long j2, Object obj, int i5, int i6);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native boolean _nIsImmutable(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native boolean _nIsNull(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native boolean _nIsReadyToDraw(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native long _nMake();

    /* JADX INFO: Access modifiers changed from: private */
    public static final native long _nMakeClone(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native long _nMakeShader(long j, int i, int i2, int i3, int i4, Object obj);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void _nNotifyPixelsChanged(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native long _nPeekPixels(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native boolean _nReadPixels(long j, int i, int i2, int i3, int i4, long j2, int i5, int i6, int i7, Object obj);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void _nReset(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native boolean _nSetAlphaType(long j, int i);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native boolean _nSetImageInfo(long j, int i, int i2, int i3, int i4, long j2, int i5);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void _nSetImmutable(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void _nSetPixelRef(long j, long j2, int i, int i2);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void _nSwap(long j, long j2);
}
