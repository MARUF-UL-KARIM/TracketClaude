package org.jetbrains.skia.paragraph;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes4.dex */
public final class ParagraphKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final native long Paragraph_nGetFinalizer();

    /* JADX INFO: Access modifiers changed from: private */
    public static final native boolean _nDidExceedMaxLines(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native float _nGetAlphabeticBaseline(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native int _nGetGlyphPositionAtCoordinate(long j, float f, float f2);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native float _nGetHeight(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native float _nGetIdeographicBaseline(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native Object _nGetLineMetrics(long j, long j2);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native int _nGetLineNumber(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native float _nGetLongestLine(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native float _nGetMaxIntrinsicWidth(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native float _nGetMaxWidth(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native float _nGetMinIntrinsicWidth(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native Object _nGetRectsForPlaceholders(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native Object _nGetRectsForRange(long j, int i, int i2, int i3, int i4);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native int _nGetUnresolvedGlyphsCount(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void _nGetWordBoundary(long j, int i, Object obj);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void _nLayout(long j, float f);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void _nMarkDirty(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void _nPaint(long j, long j2, float f, float f2);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void _nUpdateAlignment(long j, int i);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void _nUpdateBackgroundPaint(long j, int i, int i2, long j2, long j3);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void _nUpdateFontSize(long j, int i, int i2, float f, long j2);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void _nUpdateForegroundPaint(long j, int i, int i2, long j2, long j3);
}
