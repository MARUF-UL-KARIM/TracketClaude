package org.jetbrains.skia;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes4.dex */
public final class PixmapKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final native int Pixmap_nComputeByteSize(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native boolean Pixmap_nComputeIsOpaque(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native boolean Pixmap_nExtractSubset(long j, long j2, int i, int i2, int i3, int i4);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native int Pixmap_nGetColor(long j, int i, int i2);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native long Pixmap_nGetFinalizer();

    /* JADX INFO: Access modifiers changed from: private */
    public static final native int Pixmap_nGetRowBytes(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native int Pixmap_nGetRowBytesAsPixels(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native long Pixmap_nMake(int i, int i2, int i3, int i4, long j, long j2, int i5);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void Pixmap_nReset(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native boolean _nErase(long j, int i);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native boolean _nEraseSubset(long j, int i, int i2, int i3, int i4, int i5);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native long _nGetAddr(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native long _nGetAddrAt(long j, int i, int i2);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native float _nGetAlphaF(long j, int i, int i2);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void _nGetInfo(long j, Object obj, Object obj2);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native long _nMakeNull();

    /* JADX INFO: Access modifiers changed from: private */
    public static final native boolean _nReadPixels(long j, int i, int i2, int i3, int i4, long j2, long j3, int i5);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native boolean _nReadPixelsFromPoint(long j, int i, int i2, int i3, int i4, long j2, long j3, int i5, int i6, int i7);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native boolean _nReadPixelsToPixmap(long j, long j2);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native boolean _nReadPixelsToPixmapFromPoint(long j, long j2, int i, int i2);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void _nResetWithInfo(long j, int i, int i2, int i3, int i4, long j2, long j3, int i5);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native boolean _nScalePixels(long j, long j2, int i, int i2);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void _nSetColorSpace(long j, long j2);
}
