package org.opencv.imgproc;

import org.opencv.core.Algorithm;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes4.dex */
public class LineSegmentDetector extends Algorithm {
    private static native int compareSegments_0(long j, double d, double d2, long j2, long j3, long j4);

    private static native int compareSegments_1(long j, double d, double d2, long j2, long j3);

    private static native void delete(long j);

    private static native void detect_0(long j, long j2, long j3, long j4, long j5, long j6);

    private static native void detect_1(long j, long j2, long j3, long j4, long j5);

    private static native void detect_2(long j, long j2, long j3, long j4);

    private static native void detect_3(long j, long j2, long j3);

    private static native void drawSegments_0(long j, long j2, long j3);

    @Override // org.opencv.core.Algorithm
    public final void finalize() {
        delete(this.a);
    }
}
