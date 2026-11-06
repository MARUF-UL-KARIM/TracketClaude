package com.tracket.projects.data.assets;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class VideoColorMatrix {
    public static final VideoColorMatrix A;
    public static final VideoColorMatrix B;
    public static final VideoColorMatrix C;
    public static final VideoColorMatrix D;
    public static final /* synthetic */ VideoColorMatrix[] E;
    public static final VideoColorMatrix y;
    public static final VideoColorMatrix z;

    static {
        VideoColorMatrix videoColorMatrix = new VideoColorMatrix("BT709", 0);
        y = videoColorMatrix;
        VideoColorMatrix videoColorMatrix2 = new VideoColorMatrix("BT601", 1);
        z = videoColorMatrix2;
        VideoColorMatrix videoColorMatrix3 = new VideoColorMatrix("SMPTE_240M", 2);
        VideoColorMatrix videoColorMatrix4 = new VideoColorMatrix("BT2020_NCL", 3);
        A = videoColorMatrix4;
        VideoColorMatrix videoColorMatrix5 = new VideoColorMatrix("BT2020_CL", 4);
        B = videoColorMatrix5;
        VideoColorMatrix videoColorMatrix6 = new VideoColorMatrix("IDENTITY", 5);
        C = videoColorMatrix6;
        VideoColorMatrix videoColorMatrix7 = new VideoColorMatrix("UNKNOWN", 6);
        D = videoColorMatrix7;
        E = new VideoColorMatrix[]{videoColorMatrix, videoColorMatrix2, videoColorMatrix3, videoColorMatrix4, videoColorMatrix5, videoColorMatrix6, videoColorMatrix7};
    }

    public static VideoColorMatrix valueOf(String str) {
        return (VideoColorMatrix) Enum.valueOf(VideoColorMatrix.class, str);
    }

    public static VideoColorMatrix[] values() {
        return (VideoColorMatrix[]) E.clone();
    }
}
