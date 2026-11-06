package com.tracket.projects.data.assets;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class VideoColorResolution {
    public static final VideoColorResolution A;
    public static final VideoColorResolution B;
    public static final VideoColorResolution C;
    public static final /* synthetic */ VideoColorResolution[] D;
    public static final VideoColorResolution y;
    public static final VideoColorResolution z;

    static {
        VideoColorResolution videoColorResolution = new VideoColorResolution("DECLARED", 0);
        y = videoColorResolution;
        VideoColorResolution videoColorResolution2 = new VideoColorResolution("SAFELY_INFERRED", 1);
        z = videoColorResolution2;
        VideoColorResolution videoColorResolution3 = new VideoColorResolution("PLATFORM_SDR_FALLBACK", 2);
        A = videoColorResolution3;
        VideoColorResolution videoColorResolution4 = new VideoColorResolution("UNKNOWN_SDR", 3);
        B = videoColorResolution4;
        VideoColorResolution videoColorResolution5 = new VideoColorResolution("REJECTED", 4);
        C = videoColorResolution5;
        D = new VideoColorResolution[]{videoColorResolution, videoColorResolution2, videoColorResolution3, videoColorResolution4, videoColorResolution5};
    }

    public static VideoColorResolution valueOf(String str) {
        return (VideoColorResolution) Enum.valueOf(VideoColorResolution.class, str);
    }

    public static VideoColorResolution[] values() {
        return (VideoColorResolution[]) D.clone();
    }
}
