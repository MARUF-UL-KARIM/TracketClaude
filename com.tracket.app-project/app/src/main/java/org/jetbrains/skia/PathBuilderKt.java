package org.jetbrains.skia;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes4.dex */
public final class PathBuilderKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final native void PathBuilder_nAddArc(long j, float f, float f2, float f3, float f4, float f5, float f6);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void PathBuilder_nAddCircle(long j, float f, float f2, float f3, int i);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void PathBuilder_nAddOval(long j, float f, float f2, float f3, float f4, int i, int i2);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void PathBuilder_nAddPath(long j, long j2, int i);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void PathBuilder_nAddPathOffset(long j, long j2, float f, float f2, int i);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void PathBuilder_nAddPathTransform(long j, long j2, Object obj, int i);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void PathBuilder_nAddPoly(long j, Object obj, int i, boolean z);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void PathBuilder_nAddRRect(long j, float f, float f2, float f3, float f4, Object obj, int i, int i2, int i3);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void PathBuilder_nAddRect(long j, float f, float f2, float f3, float f4, int i, int i2);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void PathBuilder_nArcTo(long j, float f, float f2, float f3, float f4, float f5, float f6, boolean z);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void PathBuilder_nClosePath(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void PathBuilder_nConicTo(long j, float f, float f2, float f3, float f4, float f5);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void PathBuilder_nCubicTo(long j, float f, float f2, float f3, float f4, float f5, float f6);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native long PathBuilder_nDetach(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void PathBuilder_nEllipticalArcTo(long j, float f, float f2, float f3, int i, int i2, float f4, float f5);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native long PathBuilder_nGetFinalizer();

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void PathBuilder_nIncReserve(long j, int i);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void PathBuilder_nLineTo(long j, float f, float f2);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native long PathBuilder_nMake();

    /* JADX INFO: Access modifiers changed from: private */
    public static final native long PathBuilder_nMakeFromPath(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native long PathBuilder_nMakeWithFillType(int i);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void PathBuilder_nMoveTo(long j, float f, float f2);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void PathBuilder_nOffset(long j, float f, float f2);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void PathBuilder_nQuadTo(long j, float f, float f2, float f3, float f4);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void PathBuilder_nRConicTo(long j, float f, float f2, float f3, float f4, float f5);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void PathBuilder_nRCubicTo(long j, float f, float f2, float f3, float f4, float f5, float f6);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void PathBuilder_nREllipticalArcTo(long j, float f, float f2, float f3, int i, int i2, float f4, float f5);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void PathBuilder_nRLineTo(long j, float f, float f2);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void PathBuilder_nRMoveTo(long j, float f, float f2);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void PathBuilder_nRQuadTo(long j, float f, float f2, float f3, float f4);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void PathBuilder_nReset(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void PathBuilder_nSetFillType(long j, int i);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void PathBuilder_nSetLastPt(long j, float f, float f2);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native long PathBuilder_nSnapshot(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void PathBuilder_nTangentArcTo(long j, float f, float f2, float f3, float f4, float f5);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void PathBuilder_nTransform(long j, Object obj);
}
