package org.opencv.video;

import org.opencv.core.Algorithm;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes4.dex */
public class DenseOpticalFlow extends Algorithm {
    private static native void calc_0(long j, long j2, long j3, long j4);

    private static native void collectGarbage_0(long j);

    private static native void delete(long j);

    @Override // org.opencv.core.Algorithm
    public void finalize() {
        delete(this.a);
    }
}
