package com.tracket.processing;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class VideoEncoderInputPixelFormat {
    public static final VideoEncoderInputPixelFormat y;
    public static final /* synthetic */ VideoEncoderInputPixelFormat[] z;

    static {
        VideoEncoderInputPixelFormat videoEncoderInputPixelFormat = new VideoEncoderInputPixelFormat("BGRA_SDR", 0);
        y = videoEncoderInputPixelFormat;
        z = new VideoEncoderInputPixelFormat[]{videoEncoderInputPixelFormat, new VideoEncoderInputPixelFormat("NV12_VIDEO_RANGE", 1)};
    }

    public static VideoEncoderInputPixelFormat valueOf(String str) {
        return (VideoEncoderInputPixelFormat) Enum.valueOf(VideoEncoderInputPixelFormat.class, str);
    }

    public static VideoEncoderInputPixelFormat[] values() {
        return (VideoEncoderInputPixelFormat[]) z.clone();
    }
}
