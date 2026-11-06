package org.jetbrains.skia;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes4.dex */
public final class RegionKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final native boolean Region_nAddBoundaryPath(long j, long j2);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native int Region_nComputeRegionComplexity(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native boolean Region_nContainsIPoint(long j, int i, int i2);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native boolean Region_nContainsIRect(long j, int i, int i2, int i3, int i4);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native boolean Region_nContainsRegion(long j, long j2);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native long Region_nGetBoundaryPath(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void Region_nGetBounds(long j, Object obj);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native long Region_nGetFinalizer();

    /* JADX INFO: Access modifiers changed from: private */
    public static final native boolean Region_nIntersectsIRect(long j, int i, int i2, int i3, int i4);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native boolean Region_nIntersectsRegion(long j, long j2);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native boolean Region_nIsComplex(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native boolean Region_nIsEmpty(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native boolean Region_nIsRect(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native long Region_nMake();

    /* JADX INFO: Access modifiers changed from: private */
    public static final native boolean Region_nOpIRect(long j, int i, int i2, int i3, int i4, int i5);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native boolean Region_nOpIRectRegion(long j, int i, int i2, int i3, int i4, long j2, int i5);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native boolean Region_nOpRegion(long j, long j2, int i);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native boolean Region_nOpRegionIRect(long j, long j2, int i, int i2, int i3, int i4, int i5);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native boolean Region_nOpRegionRegion(long j, long j2, long j3, int i);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native boolean Region_nQuickContains(long j, int i, int i2, int i3, int i4);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native boolean Region_nQuickRejectIRect(long j, int i, int i2, int i3, int i4);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native boolean Region_nQuickRejectRegion(long j, long j2);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native boolean Region_nSet(long j, long j2);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native boolean Region_nSetEmpty(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native boolean Region_nSetPath(long j, long j2, long j3);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native boolean Region_nSetRect(long j, int i, int i2, int i3, int i4);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native boolean Region_nSetRects(long j, Object obj, int i);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native boolean Region_nSetRegion(long j, long j2);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void Region_nTranslate(long j, int i, int i2);
}
