package org.opencv.video;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes4.dex */
public class TrackerVit_Params {
    private static native long TrackerVit_Params_0();

    private static native void delete(long j);

    private static native int get_backend_0(long j);

    private static native double[] get_meanvalue_0(long j);

    private static native String get_net_0(long j);

    private static native double[] get_stdvalue_0(long j);

    private static native int get_target_0(long j);

    private static native void set_backend_0(long j, int i);

    private static native void set_meanvalue_0(long j, double d, double d2, double d3, double d4);

    private static native void set_net_0(long j, String str);

    private static native void set_stdvalue_0(long j, double d, double d2, double d3, double d4);

    private static native void set_target_0(long j, int i);

    public final void finalize() {
        delete(0L);
    }
}
