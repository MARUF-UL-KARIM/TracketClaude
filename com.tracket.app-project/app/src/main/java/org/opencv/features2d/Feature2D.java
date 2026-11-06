package org.opencv.features2d;

import org.opencv.core.Algorithm;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes4.dex */
public class Feature2D extends Algorithm {
    private static native void compute_0(long j, long j2, long j3, long j4);

    private static native void compute_1(long j, long j2, long j3, long j4);

    private static native int defaultNorm_0(long j);

    private static native void delete(long j);

    private static native int descriptorSize_0(long j);

    private static native int descriptorType_0(long j);

    private static native void detectAndCompute_0(long j, long j2, long j3, long j4, long j5, boolean z);

    private static native void detectAndCompute_1(long j, long j2, long j3, long j4, long j5);

    private static native void detect_0(long j, long j2, long j3, long j4);

    private static native void detect_1(long j, long j2, long j3);

    private static native void detect_2(long j, long j2, long j3, long j4);

    private static native void detect_3(long j, long j2, long j3);

    private static native boolean empty_0(long j);

    private static native String getDefaultName_0(long j);

    private static native void read_0(long j, String str);

    private static native void write_0(long j, String str);

    @Override // org.opencv.core.Algorithm
    public void finalize() {
        delete(this.a);
    }
}
