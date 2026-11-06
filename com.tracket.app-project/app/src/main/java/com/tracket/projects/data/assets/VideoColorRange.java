package com.tracket.projects.data.assets;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class VideoColorRange {
    public static final VideoColorRange A;
    public static final /* synthetic */ VideoColorRange[] B;
    public static final VideoColorRange y;
    public static final VideoColorRange z;

    static {
        VideoColorRange videoColorRange = new VideoColorRange("LIMITED", 0);
        y = videoColorRange;
        VideoColorRange videoColorRange2 = new VideoColorRange("FULL", 1);
        z = videoColorRange2;
        VideoColorRange videoColorRange3 = new VideoColorRange("UNKNOWN", 2);
        A = videoColorRange3;
        B = new VideoColorRange[]{videoColorRange, videoColorRange2, videoColorRange3};
    }

    public static VideoColorRange valueOf(String str) {
        return (VideoColorRange) Enum.valueOf(VideoColorRange.class, str);
    }

    public static VideoColorRange[] values() {
        return (VideoColorRange[]) B.clone();
    }
}
