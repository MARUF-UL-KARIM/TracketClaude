package org.jetbrains.skia.shaper;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes4.dex */
public final class ShaperKt {
    public static final native long RunHandler_nCreate();

    public static final native void RunHandler_nGetClusters(long j, Object obj);

    public static final native long RunHandler_nGetFinalizer();

    public static final native void RunHandler_nGetGlyphs(long j, Object obj);

    public static final native void RunHandler_nGetPositions(long j, Object obj);

    public static final native long RunHandler_nGetRunInfo(long j, Object obj);

    public static final native void RunHandler_nInit(long j, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6);

    public static final native void RunHandler_nSetOffset(long j, float f, float f2);

    public static final native long RunIterator_nCreateRunIterator(int i, long j);

    public static final native long RunIterator_nGetFinalizer();

    public static final native void RunIterator_nInitRunIterator(long j, int i, Object obj, Object obj2, Object obj3, Object obj4);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native long Shaper_nGetFinalizer();

    /* JADX INFO: Access modifiers changed from: private */
    public static final native long Shaper_nMake(long j);

    public static final native void Shaper_nShape(long j, long j2, Object obj, Object obj2, Object obj3, Object obj4, int i, Object obj5, int i2, float f, Object obj6);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native long _nMakeCoreText();

    /* JADX INFO: Access modifiers changed from: private */
    public static final native long _nMakePrimitive();

    /* JADX INFO: Access modifiers changed from: private */
    public static final native long _nMakeShapeDontWrapOrReorder(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native long _nMakeShapeThenWrap(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native long _nMakeShaperDrivenWrapper(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native long _nShapeBlob(long j, long j2, long j3, int i, Object obj, int i2, float f, float f2, float f3);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native long _nShapeLine(long j, long j2, long j3, int i, Object obj, int i2);
}
