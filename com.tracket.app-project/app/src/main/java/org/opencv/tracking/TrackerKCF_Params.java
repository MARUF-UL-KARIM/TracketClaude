package org.opencv.tracking;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes4.dex */
public class TrackerKCF_Params {
    private static native long TrackerKCF_Params_0();

    private static native void delete(long j);

    private static native boolean get_compress_feature_0(long j);

    private static native int get_compressed_size_0(long j);

    private static native int get_desc_npca_0(long j);

    private static native int get_desc_pca_0(long j);

    private static native float get_detect_thresh_0(long j);

    private static native float get_interp_factor_0(long j);

    private static native float get_lambda_0(long j);

    private static native int get_max_patch_size_0(long j);

    private static native float get_output_sigma_factor_0(long j);

    private static native float get_pca_learning_rate_0(long j);

    private static native boolean get_resize_0(long j);

    private static native float get_sigma_0(long j);

    private static native boolean get_split_coeff_0(long j);

    private static native boolean get_wrap_kernel_0(long j);

    private static native void set_compress_feature_0(long j, boolean z);

    private static native void set_compressed_size_0(long j, int i);

    private static native void set_desc_npca_0(long j, int i);

    private static native void set_desc_pca_0(long j, int i);

    private static native void set_detect_thresh_0(long j, float f);

    private static native void set_interp_factor_0(long j, float f);

    private static native void set_lambda_0(long j, float f);

    private static native void set_max_patch_size_0(long j, int i);

    private static native void set_output_sigma_factor_0(long j, float f);

    private static native void set_pca_learning_rate_0(long j, float f);

    private static native void set_resize_0(long j, boolean z);

    private static native void set_sigma_0(long j, float f);

    private static native void set_split_coeff_0(long j, boolean z);

    private static native void set_wrap_kernel_0(long j, boolean z);

    public final void finalize() {
        delete(0L);
    }
}
