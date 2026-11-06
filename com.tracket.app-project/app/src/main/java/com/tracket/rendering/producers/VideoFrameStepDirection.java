package com.tracket.rendering.producers;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class VideoFrameStepDirection {
    public static final /* synthetic */ VideoFrameStepDirection[] A;
    public static final VideoFrameStepDirection y;
    public static final VideoFrameStepDirection z;

    static {
        VideoFrameStepDirection videoFrameStepDirection = new VideoFrameStepDirection("PREVIOUS", 0);
        y = videoFrameStepDirection;
        VideoFrameStepDirection videoFrameStepDirection2 = new VideoFrameStepDirection("NEXT", 1);
        z = videoFrameStepDirection2;
        A = new VideoFrameStepDirection[]{videoFrameStepDirection, videoFrameStepDirection2};
    }

    public static VideoFrameStepDirection valueOf(String str) {
        return (VideoFrameStepDirection) Enum.valueOf(VideoFrameStepDirection.class, str);
    }

    public static VideoFrameStepDirection[] values() {
        return (VideoFrameStepDirection[]) A.clone();
    }
}
