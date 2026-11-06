package org.opencv.calib3d;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes4.dex */
public class UsacParams {
    private static native long UsacParams_0();

    private static native void delete(long j);

    private static native double get_confidence_0(long j);

    private static native int get_final_polisher_0(long j);

    private static native int get_final_polisher_iterations_0(long j);

    private static native boolean get_isParallel_0(long j);

    private static native int get_loIterations_0(long j);

    private static native int get_loMethod_0(long j);

    private static native int get_loSampleSize_0(long j);

    private static native int get_maxIterations_0(long j);

    private static native int get_neighborsSearch_0(long j);

    private static native int get_randomGeneratorState_0(long j);

    private static native int get_sampler_0(long j);

    private static native int get_score_0(long j);

    private static native double get_threshold_0(long j);

    private static native void set_confidence_0(long j, double d);

    private static native void set_final_polisher_0(long j, int i);

    private static native void set_final_polisher_iterations_0(long j, int i);

    private static native void set_isParallel_0(long j, boolean z);

    private static native void set_loIterations_0(long j, int i);

    private static native void set_loMethod_0(long j, int i);

    private static native void set_loSampleSize_0(long j, int i);

    private static native void set_maxIterations_0(long j, int i);

    private static native void set_neighborsSearch_0(long j, int i);

    private static native void set_randomGeneratorState_0(long j, int i);

    private static native void set_sampler_0(long j, int i);

    private static native void set_score_0(long j, int i);

    private static native void set_threshold_0(long j, double d);

    public final void finalize() {
        delete(0L);
    }
}
