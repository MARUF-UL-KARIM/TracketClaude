package org.jetbrains.skia;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes4.dex */
public final class MaskFilterKt {
    private static final float kBLUR_SIGMA_SCALE = 0.57735f;

    /* JADX INFO: Access modifiers changed from: private */
    public static final native long MaskFilter_nMakeTable(Object obj);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native long _nMakeBlur(int i, float f, boolean z);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native long _nMakeClip(byte b, byte b2);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native long _nMakeGamma(float f);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native long _nMakeShader(long j);
}
