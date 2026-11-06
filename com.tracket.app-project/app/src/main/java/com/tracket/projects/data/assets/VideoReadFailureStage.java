package com.tracket.projects.data.assets;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class VideoReadFailureStage {
    public static final VideoReadFailureStage A;
    public static final VideoReadFailureStage B;
    public static final /* synthetic */ VideoReadFailureStage[] C;
    public static final VideoReadFailureStage y;
    public static final VideoReadFailureStage z;

    static {
        VideoReadFailureStage videoReadFailureStage = new VideoReadFailureStage("PROBE", 0);
        y = videoReadFailureStage;
        VideoReadFailureStage videoReadFailureStage2 = new VideoReadFailureStage("SOURCE_PREPARATION", 1);
        z = videoReadFailureStage2;
        VideoReadFailureStage videoReadFailureStage3 = new VideoReadFailureStage("INVALID_METADATA", 2);
        A = videoReadFailureStage3;
        VideoReadFailureStage videoReadFailureStage4 = new VideoReadFailureStage("UNKNOWN", 3);
        B = videoReadFailureStage4;
        C = new VideoReadFailureStage[]{videoReadFailureStage, videoReadFailureStage2, videoReadFailureStage3, videoReadFailureStage4};
    }

    public static VideoReadFailureStage valueOf(String str) {
        return (VideoReadFailureStage) Enum.valueOf(VideoReadFailureStage.class, str);
    }

    public static VideoReadFailureStage[] values() {
        return (VideoReadFailureStage[]) C.clone();
    }
}
