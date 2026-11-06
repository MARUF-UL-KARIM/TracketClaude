package org.jetbrains.skia;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes4.dex */
public final class PathKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final native boolean Path_nEquals(long j, long j2);

    public static final native long Path_nGetFinalizer();

    /* JADX INFO: Access modifiers changed from: private */
    public static final native int Path_nGetGenerationId(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native boolean Path_nIsVolatile(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native long Path_nMake();

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void Path_nReset(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void Path_nSetVolatile(long j, boolean z);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void Path_nSwap(long j, long j2);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void _nAddArc(long j, float f, float f2, float f3, float f4, float f5, float f6);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void _nAddCircle(long j, float f, float f2, float f3, int i);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void _nAddOval(long j, float f, float f2, float f3, float f4, int i, int i2);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void _nAddPath(long j, long j2, boolean z);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void _nAddPathOffset(long j, long j2, float f, float f2, boolean z);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void _nAddPathTransform(long j, long j2, Object obj, boolean z);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void _nAddPoly(long j, Object obj, int i, boolean z);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void _nAddRRect(long j, float f, float f2, float f3, float f4, Object obj, int i, int i2, int i3);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void _nAddRect(long j, float f, float f2, float f3, float f4, int i, int i2);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native int _nApproximateBytesUsed(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void _nArcTo(long j, float f, float f2, float f3, float f4, float f5, float f6, boolean z);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void _nClosePath(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void _nComputeTightBounds(long j, Object obj);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void _nConicTo(long j, float f, float f2, float f3, float f4, float f5);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native boolean _nConservativelyContainsRect(long j, float f, float f2, float f3, float f4);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native boolean _nContains(long j, float f, float f2);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native int _nConvertConicToQuads(float f, float f2, float f3, float f4, float f5, float f6, float f7, int i, Object obj);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native int _nCountVerbs(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void _nCubicTo(long j, float f, float f2, float f3, float f4, float f5, float f6);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void _nDump(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void _nDumpHex(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void _nEllipticalArcTo(long j, float f, float f2, float f3, int i, int i2, float f4, float f5);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void _nGetBounds(long j, Object obj);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native int _nGetFillMode(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native boolean _nGetLastPt(long j, Object obj);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void _nGetPoint(long j, int i, Object obj);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native int _nGetPoints(long j, Object obj, int i);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native int _nGetPointsCount(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native int _nGetSegmentMasks(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native int _nGetVerbs(long j, Object obj, int i);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void _nIncReserve(long j, int i);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native boolean _nIsConvex(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native boolean _nIsCubicDegenerate(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, boolean z);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native boolean _nIsEmpty(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native boolean _nIsFinite(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native boolean _nIsInterpolatable(long j, long j2);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native boolean _nIsLastContourClosed(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native boolean _nIsLineDegenerate(float f, float f2, float f3, float f4, boolean z);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native boolean _nIsOval(long j, Object obj);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native boolean _nIsQuadDegenerate(float f, float f2, float f3, float f4, float f5, float f6, boolean z);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native boolean _nIsRRect(long j, Object obj);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native boolean _nIsRect(long j, Object obj);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native boolean _nIsValid(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void _nLineTo(long j, float f, float f2);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native long _nMakeCombining(long j, long j2, int i);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native long _nMakeFromBytes(Object obj, int i);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native long _nMakeFromCircle(float f, float f2, float f3, int i);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native long _nMakeFromOval(float f, float f2, float f3, float f4, int i, int i2);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native long _nMakeFromPolygon(Object obj, int i, boolean z, int i2, boolean z2);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native long _nMakeFromRRect(Object obj, float f, float f2, float f3, float f4, int i, int i2);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native long _nMakeFromRRectXY(float f, float f2, float f3, float f4, float f5, float f6, int i);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native long _nMakeFromRaw(Object obj, int i, Object obj2, int i2, Object obj3, int i3, int i4, boolean z);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native long _nMakeFromRect(float f, float f2, float f3, float f4, int i, int i2, int i3);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native long _nMakeFromSVGString(Object obj);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native long _nMakeLerp(long j, long j2, float f);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native boolean _nMaybeGetAsLine(long j, Object obj);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void _nMoveTo(long j, float f, float f2);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void _nOffset(long j, float f, float f2, long j2);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void _nQuadTo(long j, float f, float f2, float f3, float f4);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void _nRConicTo(long j, float f, float f2, float f3, float f4, float f5);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void _nRCubicTo(long j, float f, float f2, float f3, float f4, float f5, float f6);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void _nREllipticalArcTo(long j, float f, float f2, float f3, int i, int i2, float f4, float f5);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void _nRLineTo(long j, float f, float f2);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void _nRMoveTo(long j, float f, float f2);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void _nRQuadTo(long j, float f, float f2, float f3, float f4);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void _nReverseAddPath(long j, long j2);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void _nRewind(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native int _nSerializeToBytes(long j, Object obj);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void _nSetFillMode(long j, int i);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void _nSetLastPt(long j, float f, float f2);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void _nTangentArcTo(long j, float f, float f2, float f3, float f4, float f5);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void _nTransform(long j, Object obj, long j2, boolean z);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void _nUpdateBoundsCache(long j);
}
