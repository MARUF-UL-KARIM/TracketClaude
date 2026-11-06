package org.jetbrains.skia;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes4.dex */
public final class TextBlobKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final native long Iter_nCreate(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native boolean Iter_nFetch(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native long Iter_nGetFinalizer();

    /* JADX INFO: Access modifiers changed from: private */
    public static final native int Iter_nGetGlyphCount(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native int Iter_nGetGlyphs(long j, Object obj, int i);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native long Iter_nGetTypeface(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native boolean Iter_nHasNext(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native long TextBlob_nGetFinalizer();

    /* JADX INFO: Access modifiers changed from: private */
    public static final native int TextBlob_nGetUniqueId(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native long TextBlob_nMakeFromData(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native long TextBlob_nSerializeToData(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void _nBounds(long j, Object obj);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native boolean _nGetBlockBounds(long j, Object obj);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native boolean _nGetClusters(long j, Object obj);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native int _nGetClustersLength(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native boolean _nGetFirstBaseline(long j, Object obj);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void _nGetGlyphs(long j, Object obj);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native int _nGetGlyphsLength(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void _nGetIntercepts(long j, float f, float f2, long j2, Object obj);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native int _nGetInterceptsLength(long j, float f, float f2, long j2);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native boolean _nGetLastBaseline(long j, Object obj);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void _nGetPositions(long j, Object obj);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native int _nGetPositionsLength(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native boolean _nGetTightBounds(long j, Object obj);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native long _nMakeFromPos(Object obj, int i, Object obj2, long j);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native long _nMakeFromPosH(Object obj, int i, Object obj2, float f, long j);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native long _nMakeFromRSXform(Object obj, int i, Object obj2, long j);
}
