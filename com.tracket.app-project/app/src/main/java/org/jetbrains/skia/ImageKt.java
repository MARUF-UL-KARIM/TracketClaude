package org.jetbrains.skia;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes4.dex */
public final class ImageKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final native void Image_nGetImageInfo(long j, Object obj, Object obj2);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native long Image_nMakeShader(long j, int i, int i2, int i3, int i4, Object obj);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native long Image_nPeekPixels(long j);

    public static final native long _nAdoptTextureFrom(long j, long j2, int i, int i2);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native long _nEncodeToData(long j, int i, int i2);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native long _nMakeFromBitmap(long j);

    public static final native long _nMakeFromEncoded(Object obj, int i);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native long _nMakeFromPixmap(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native long _nMakeRaster(int i, int i2, int i3, int i4, long j, Object obj, int i5);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native long _nMakeRasterData(int i, int i2, int i3, int i4, long j, long j2, int i5);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native boolean _nPeekPixelsToPixmap(long j, long j2);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native boolean _nReadPixelsBitmap(long j, long j2, long j3, int i, int i2, boolean z);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native boolean _nReadPixelsPixmap(long j, long j2, int i, int i2, boolean z);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native boolean _nScalePixels(long j, long j2, int i, int i2, boolean z);
}
