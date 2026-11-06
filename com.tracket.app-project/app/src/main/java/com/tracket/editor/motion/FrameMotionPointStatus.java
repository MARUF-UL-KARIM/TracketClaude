package com.tracket.editor.motion;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class FrameMotionPointStatus {
    public static final FrameMotionPointStatus A;
    public static final FrameMotionPointStatus B;
    public static final FrameMotionPointStatus C;
    public static final FrameMotionPointStatus D;
    public static final /* synthetic */ FrameMotionPointStatus[] E;
    public static final FrameMotionPointStatus y;
    public static final FrameMotionPointStatus z;

    static {
        FrameMotionPointStatus frameMotionPointStatus = new FrameMotionPointStatus("SEEDED", 0);
        y = frameMotionPointStatus;
        FrameMotionPointStatus frameMotionPointStatus2 = new FrameMotionPointStatus("TRACKED", 1);
        z = frameMotionPointStatus2;
        FrameMotionPointStatus frameMotionPointStatus3 = new FrameMotionPointStatus("PATCH_RESCUED", 2);
        FrameMotionPointStatus frameMotionPointStatus4 = new FrameMotionPointStatus("INLIER", 3);
        A = frameMotionPointStatus4;
        FrameMotionPointStatus frameMotionPointStatus5 = new FrameMotionPointStatus("OUTLIER_FB", 4);
        B = frameMotionPointStatus5;
        FrameMotionPointStatus frameMotionPointStatus6 = new FrameMotionPointStatus("OUTLIER_RANSAC", 5);
        C = frameMotionPointStatus6;
        FrameMotionPointStatus frameMotionPointStatus7 = new FrameMotionPointStatus("LOST", 6);
        D = frameMotionPointStatus7;
        E = new FrameMotionPointStatus[]{frameMotionPointStatus, frameMotionPointStatus2, frameMotionPointStatus3, frameMotionPointStatus4, frameMotionPointStatus5, frameMotionPointStatus6, frameMotionPointStatus7};
    }

    public static FrameMotionPointStatus valueOf(String str) {
        return (FrameMotionPointStatus) Enum.valueOf(FrameMotionPointStatus.class, str);
    }

    public static FrameMotionPointStatus[] values() {
        return (FrameMotionPointStatus[]) E.clone();
    }
}
