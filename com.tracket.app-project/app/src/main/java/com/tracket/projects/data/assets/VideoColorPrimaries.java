package com.tracket.projects.data.assets;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class VideoColorPrimaries {
    public static final VideoColorPrimaries A;
    public static final VideoColorPrimaries B;
    public static final VideoColorPrimaries C;
    public static final VideoColorPrimaries D;
    public static final /* synthetic */ VideoColorPrimaries[] E;
    public static final VideoColorPrimaries y;
    public static final VideoColorPrimaries z;

    static {
        VideoColorPrimaries videoColorPrimaries = new VideoColorPrimaries("BT709", 0);
        y = videoColorPrimaries;
        VideoColorPrimaries videoColorPrimaries2 = new VideoColorPrimaries("BT601_625", 1);
        z = videoColorPrimaries2;
        VideoColorPrimaries videoColorPrimaries3 = new VideoColorPrimaries("BT601_525", 2);
        A = videoColorPrimaries3;
        VideoColorPrimaries videoColorPrimaries4 = new VideoColorPrimaries("BT2020", 3);
        B = videoColorPrimaries4;
        VideoColorPrimaries videoColorPrimaries5 = new VideoColorPrimaries("P3_D65", 4);
        VideoColorPrimaries videoColorPrimaries6 = new VideoColorPrimaries("DCI_P3", 5);
        C = videoColorPrimaries6;
        VideoColorPrimaries videoColorPrimaries7 = new VideoColorPrimaries("UNKNOWN", 6);
        D = videoColorPrimaries7;
        E = new VideoColorPrimaries[]{videoColorPrimaries, videoColorPrimaries2, videoColorPrimaries3, videoColorPrimaries4, videoColorPrimaries5, videoColorPrimaries6, videoColorPrimaries7};
    }

    public static VideoColorPrimaries valueOf(String str) {
        return (VideoColorPrimaries) Enum.valueOf(VideoColorPrimaries.class, str);
    }

    public static VideoColorPrimaries[] values() {
        return (VideoColorPrimaries[]) E.clone();
    }
}
