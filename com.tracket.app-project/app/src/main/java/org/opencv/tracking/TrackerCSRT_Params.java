package org.opencv.tracking;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes4.dex */
public class TrackerCSRT_Params {
    private static native long TrackerCSRT_Params_0();

    private static native void delete(long j);

    private static native int get_admm_iterations_0(long j);

    private static native int get_background_ratio_0(long j);

    private static native float get_cheb_attenuation_0(long j);

    private static native float get_filter_lr_0(long j);

    private static native float get_gsl_sigma_0(long j);

    private static native int get_histogram_bins_0(long j);

    private static native float get_histogram_lr_0(long j);

    private static native float get_hog_clip_0(long j);

    private static native float get_hog_orientations_0(long j);

    private static native float get_kaiser_alpha_0(long j);

    private static native int get_num_hog_channels_used_0(long j);

    private static native int get_number_of_scales_0(long j);

    private static native float get_padding_0(long j);

    private static native float get_psr_threshold_0(long j);

    private static native float get_scale_lr_0(long j);

    private static native float get_scale_model_max_area_0(long j);

    private static native float get_scale_sigma_factor_0(long j);

    private static native float get_scale_step_0(long j);

    private static native float get_template_size_0(long j);

    private static native boolean get_use_channel_weights_0(long j);

    private static native boolean get_use_color_names_0(long j);

    private static native boolean get_use_gray_0(long j);

    private static native boolean get_use_hog_0(long j);

    private static native boolean get_use_rgb_0(long j);

    private static native boolean get_use_segmentation_0(long j);

    private static native float get_weights_lr_0(long j);

    private static native String get_window_function_0(long j);

    private static native void set_admm_iterations_0(long j, int i);

    private static native void set_background_ratio_0(long j, int i);

    private static native void set_cheb_attenuation_0(long j, float f);

    private static native void set_filter_lr_0(long j, float f);

    private static native void set_gsl_sigma_0(long j, float f);

    private static native void set_histogram_bins_0(long j, int i);

    private static native void set_histogram_lr_0(long j, float f);

    private static native void set_hog_clip_0(long j, float f);

    private static native void set_hog_orientations_0(long j, float f);

    private static native void set_kaiser_alpha_0(long j, float f);

    private static native void set_num_hog_channels_used_0(long j, int i);

    private static native void set_number_of_scales_0(long j, int i);

    private static native void set_padding_0(long j, float f);

    private static native void set_psr_threshold_0(long j, float f);

    private static native void set_scale_lr_0(long j, float f);

    private static native void set_scale_model_max_area_0(long j, float f);

    private static native void set_scale_sigma_factor_0(long j, float f);

    private static native void set_scale_step_0(long j, float f);

    private static native void set_template_size_0(long j, float f);

    private static native void set_use_channel_weights_0(long j, boolean z);

    private static native void set_use_color_names_0(long j, boolean z);

    private static native void set_use_gray_0(long j, boolean z);

    private static native void set_use_hog_0(long j, boolean z);

    private static native void set_use_rgb_0(long j, boolean z);

    private static native void set_use_segmentation_0(long j, boolean z);

    private static native void set_weights_lr_0(long j, float f);

    private static native void set_window_function_0(long j, String str);

    public final void finalize() {
        delete(0L);
    }
}
