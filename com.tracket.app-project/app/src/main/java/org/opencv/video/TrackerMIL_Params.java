package org.opencv.video;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes4.dex */
public class TrackerMIL_Params {
    private static native long TrackerMIL_Params_0();

    private static native void delete(long j);

    private static native int get_featureSetNumFeatures_0(long j);

    private static native float get_samplerInitInRadius_0(long j);

    private static native int get_samplerInitMaxNegNum_0(long j);

    private static native float get_samplerSearchWinSize_0(long j);

    private static native float get_samplerTrackInRadius_0(long j);

    private static native int get_samplerTrackMaxNegNum_0(long j);

    private static native int get_samplerTrackMaxPosNum_0(long j);

    private static native void set_featureSetNumFeatures_0(long j, int i);

    private static native void set_samplerInitInRadius_0(long j, float f);

    private static native void set_samplerInitMaxNegNum_0(long j, int i);

    private static native void set_samplerSearchWinSize_0(long j, float f);

    private static native void set_samplerTrackInRadius_0(long j, float f);

    private static native void set_samplerTrackMaxNegNum_0(long j, int i);

    private static native void set_samplerTrackMaxPosNum_0(long j, int i);

    public final void finalize() {
        delete(0L);
    }
}
