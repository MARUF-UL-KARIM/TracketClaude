package com.tracket.rendering.producers;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class VideoFrameProducerRole {
    public static final VideoFrameProducerRole A;
    public static final /* synthetic */ VideoFrameProducerRole[] B;
    public static final VideoFrameProducerRole y;
    public static final VideoFrameProducerRole z;

    static {
        VideoFrameProducerRole videoFrameProducerRole = new VideoFrameProducerRole("MAIN", 0);
        y = videoFrameProducerRole;
        VideoFrameProducerRole videoFrameProducerRole2 = new VideoFrameProducerRole("OVERLAY", 1);
        z = videoFrameProducerRole2;
        VideoFrameProducerRole videoFrameProducerRole3 = new VideoFrameProducerRole("PLATFORM", 2);
        A = videoFrameProducerRole3;
        B = new VideoFrameProducerRole[]{videoFrameProducerRole, videoFrameProducerRole2, videoFrameProducerRole3};
    }

    public static VideoFrameProducerRole valueOf(String str) {
        return (VideoFrameProducerRole) Enum.valueOf(VideoFrameProducerRole.class, str);
    }

    public static VideoFrameProducerRole[] values() {
        return (VideoFrameProducerRole[]) B.clone();
    }
}
