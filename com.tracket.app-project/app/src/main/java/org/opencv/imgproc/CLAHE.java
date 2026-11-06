package org.opencv.imgproc;

import org.opencv.core.Algorithm;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes4.dex */
public class CLAHE extends Algorithm {
    private static native void apply_0(long j, long j2, long j3);

    private static native void collectGarbage_0(long j);

    private static native void delete(long j);

    private static native double getClipLimit_0(long j);

    private static native double[] getTilesGridSize_0(long j);

    private static native void setClipLimit_0(long j, double d);

    private static native void setTilesGridSize_0(long j, double d, double d2);

    @Override // org.opencv.core.Algorithm
    public final void finalize() {
        delete(this.a);
    }
}
