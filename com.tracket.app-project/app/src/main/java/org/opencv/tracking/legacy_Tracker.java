package org.opencv.tracking;

import org.opencv.core.Algorithm;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes4.dex */
public class legacy_Tracker extends Algorithm {
    private static native void delete(long j);

    private static native boolean init_0(long j, long j2, double d, double d2, double d3, double d4);

    private static native boolean update_0(long j, long j2, double[] dArr);

    @Override // org.opencv.core.Algorithm
    public void finalize() {
        delete(this.a);
    }
}
