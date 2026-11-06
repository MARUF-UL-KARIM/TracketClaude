package com.tracket.projects.data.assets;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class VideoReadFailureReason {
    public static final /* synthetic */ VideoReadFailureReason[] A;
    public static final VideoReadFailureReason y;
    public static final VideoReadFailureReason z;

    static {
        VideoReadFailureReason videoReadFailureReason = new VideoReadFailureReason("SOURCE_UNAVAILABLE", 0);
        y = videoReadFailureReason;
        VideoReadFailureReason videoReadFailureReason2 = new VideoReadFailureReason("READ_FAILURE", 1);
        z = videoReadFailureReason2;
        A = new VideoReadFailureReason[]{videoReadFailureReason, videoReadFailureReason2};
    }

    public static VideoReadFailureReason valueOf(String str) {
        return (VideoReadFailureReason) Enum.valueOf(VideoReadFailureReason.class, str);
    }

    public static VideoReadFailureReason[] values() {
        return (VideoReadFailureReason[]) A.clone();
    }
}
