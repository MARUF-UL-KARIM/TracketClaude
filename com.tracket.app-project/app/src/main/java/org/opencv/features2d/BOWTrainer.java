package org.opencv.features2d;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes4.dex */
public class BOWTrainer {
    private static native void add_0(long j, long j2);

    private static native void clear_0(long j);

    private static native long cluster_0(long j);

    private static native long cluster_1(long j, long j2);

    private static native void delete(long j);

    private static native int descriptorsCount_0(long j);

    private static native long getDescriptors_0(long j);

    public void finalize() {
        delete(0L);
    }
}
