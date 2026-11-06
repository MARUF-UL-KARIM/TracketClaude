package org.tensorflow.lite;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
final class NativeSignatureRunnerWrapper {
    private static native void nativeAllocateTensors(long j, long j2);

    private static native int nativeGetInputIndex(long j, String str);

    private static native int nativeGetOutputIndex(long j, String str);

    private static native long nativeGetSignatureRunner(long j, String str);

    private static native int nativeGetSubgraphIndex(long j);

    private static native String[] nativeInputNames(long j);

    private static native void nativeInvoke(long j, long j2);

    private static native String[] nativeOutputNames(long j);

    private static native boolean nativeResizeInput(long j, long j2, String str, int[] iArr);
}
