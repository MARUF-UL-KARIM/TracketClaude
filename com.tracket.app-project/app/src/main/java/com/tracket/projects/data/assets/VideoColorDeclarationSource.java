package com.tracket.projects.data.assets;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class VideoColorDeclarationSource {
    public static final VideoColorDeclarationSource A;
    public static final VideoColorDeclarationSource B;
    public static final VideoColorDeclarationSource C;
    public static final VideoColorDeclarationSource D;
    public static final /* synthetic */ VideoColorDeclarationSource[] E;
    public static final VideoColorDeclarationSource y;
    public static final VideoColorDeclarationSource z;

    static {
        VideoColorDeclarationSource videoColorDeclarationSource = new VideoColorDeclarationSource("CONTAINER", 0);
        y = videoColorDeclarationSource;
        VideoColorDeclarationSource videoColorDeclarationSource2 = new VideoColorDeclarationSource("BITSTREAM", 1);
        z = videoColorDeclarationSource2;
        VideoColorDeclarationSource videoColorDeclarationSource3 = new VideoColorDeclarationSource("FRAME_ATTACHMENT", 2);
        A = videoColorDeclarationSource3;
        VideoColorDeclarationSource videoColorDeclarationSource4 = new VideoColorDeclarationSource("SAFELY_INFERRED", 3);
        B = videoColorDeclarationSource4;
        VideoColorDeclarationSource videoColorDeclarationSource5 = new VideoColorDeclarationSource("PLATFORM_CONVERSION", 4);
        C = videoColorDeclarationSource5;
        VideoColorDeclarationSource videoColorDeclarationSource6 = new VideoColorDeclarationSource("UNKNOWN", 5);
        D = videoColorDeclarationSource6;
        E = new VideoColorDeclarationSource[]{videoColorDeclarationSource, videoColorDeclarationSource2, videoColorDeclarationSource3, videoColorDeclarationSource4, videoColorDeclarationSource5, videoColorDeclarationSource6};
    }

    public static VideoColorDeclarationSource valueOf(String str) {
        return (VideoColorDeclarationSource) Enum.valueOf(VideoColorDeclarationSource.class, str);
    }

    public static VideoColorDeclarationSource[] values() {
        return (VideoColorDeclarationSource[]) E.clone();
    }
}
