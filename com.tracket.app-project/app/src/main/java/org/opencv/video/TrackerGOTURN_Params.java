package org.opencv.video;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes4.dex */
public class TrackerGOTURN_Params {
    private static native long TrackerGOTURN_Params_0();

    private static native void delete(long j);

    private static native String get_modelBin_0(long j);

    private static native String get_modelTxt_0(long j);

    private static native void set_modelBin_0(long j, String str);

    private static native void set_modelTxt_0(long j, String str);

    public final void finalize() {
        delete(0L);
    }
}
