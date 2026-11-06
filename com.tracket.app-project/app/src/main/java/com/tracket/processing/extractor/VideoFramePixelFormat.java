package com.tracket.processing.extractor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class VideoFramePixelFormat {
    public static final VideoFramePixelFormat y;
    public static final /* synthetic */ VideoFramePixelFormat[] z;

    static {
        VideoFramePixelFormat videoFramePixelFormat = new VideoFramePixelFormat("ARGB_8888", 0);
        y = videoFramePixelFormat;
        z = new VideoFramePixelFormat[]{videoFramePixelFormat, new VideoFramePixelFormat("BGRA_8888", 1)};
    }

    public static VideoFramePixelFormat valueOf(String str) {
        return (VideoFramePixelFormat) Enum.valueOf(VideoFramePixelFormat.class, str);
    }

    public static VideoFramePixelFormat[] values() {
        return (VideoFramePixelFormat[]) z.clone();
    }
}
