package org.jetbrains.skia;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes4.dex */
public final class ColorFilterKt {
    private static final native long _nGetLinearToSRGBGamma();

    /* JADX INFO: Access modifiers changed from: private */
    public static final native long _nGetLuma();

    /* JADX INFO: Access modifiers changed from: private */
    public static final native long _nGetSRGBToLinearGamma();

    /* JADX INFO: Access modifiers changed from: private */
    public static final native long _nMakeBlend(int i, int i2);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native long _nMakeComposed(long j, long j2);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native long _nMakeHSLAMatrix(Object obj);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native long _nMakeHighContrast(boolean z, int i, float f);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native long _nMakeLerp(float f, long j, long j2);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native long _nMakeLighting(int i, int i2);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native long _nMakeMatrix(Object obj);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native long _nMakeOverdraw(int i, int i2, int i3, int i4, int i5, int i6);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native long _nMakeTable(Object obj);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native long _nMakeTableARGB(Object obj, Object obj2, Object obj3, Object obj4);
}
