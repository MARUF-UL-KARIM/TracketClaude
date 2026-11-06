package com.tracket.projects.data.assets;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class VideoColorTransfer {
    public static final VideoColorTransfer A;
    public static final VideoColorTransfer B;
    public static final VideoColorTransfer C;
    public static final VideoColorTransfer D;
    public static final /* synthetic */ VideoColorTransfer[] E;
    public static final VideoColorTransfer y;
    public static final VideoColorTransfer z;

    static {
        VideoColorTransfer videoColorTransfer = new VideoColorTransfer("BT709", 0);
        y = videoColorTransfer;
        VideoColorTransfer videoColorTransfer2 = new VideoColorTransfer("SMPTE_240M", 1);
        VideoColorTransfer videoColorTransfer3 = new VideoColorTransfer("SRGB", 2);
        z = videoColorTransfer3;
        VideoColorTransfer videoColorTransfer4 = new VideoColorTransfer("LINEAR", 3);
        A = videoColorTransfer4;
        VideoColorTransfer videoColorTransfer5 = new VideoColorTransfer("HLG", 4);
        B = videoColorTransfer5;
        VideoColorTransfer videoColorTransfer6 = new VideoColorTransfer("PQ", 5);
        C = videoColorTransfer6;
        VideoColorTransfer videoColorTransfer7 = new VideoColorTransfer("UNKNOWN", 6);
        D = videoColorTransfer7;
        E = new VideoColorTransfer[]{videoColorTransfer, videoColorTransfer2, videoColorTransfer3, videoColorTransfer4, videoColorTransfer5, videoColorTransfer6, videoColorTransfer7};
    }

    public static VideoColorTransfer valueOf(String str) {
        return (VideoColorTransfer) Enum.valueOf(VideoColorTransfer.class, str);
    }

    public static VideoColorTransfer[] values() {
        return (VideoColorTransfer[]) E.clone();
    }
}
