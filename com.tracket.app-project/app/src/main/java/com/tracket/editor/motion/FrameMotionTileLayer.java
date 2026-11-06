package com.tracket.editor.motion;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class FrameMotionTileLayer {
    public static final FrameMotionTileLayer A;
    public static final FrameMotionTileLayer B;
    public static final /* synthetic */ FrameMotionTileLayer[] C;
    public static final FrameMotionTileLayer y;
    public static final FrameMotionTileLayer z;

    static {
        FrameMotionTileLayer frameMotionTileLayer = new FrameMotionTileLayer("EMPTY", 0);
        y = frameMotionTileLayer;
        FrameMotionTileLayer frameMotionTileLayer2 = new FrameMotionTileLayer("BACKGROUND", 1);
        z = frameMotionTileLayer2;
        FrameMotionTileLayer frameMotionTileLayer3 = new FrameMotionTileLayer("FOREGROUND", 2);
        A = frameMotionTileLayer3;
        FrameMotionTileLayer frameMotionTileLayer4 = new FrameMotionTileLayer("AMBIGUOUS", 3);
        B = frameMotionTileLayer4;
        C = new FrameMotionTileLayer[]{frameMotionTileLayer, frameMotionTileLayer2, frameMotionTileLayer3, frameMotionTileLayer4};
    }

    public static FrameMotionTileLayer valueOf(String str) {
        return (FrameMotionTileLayer) Enum.valueOf(FrameMotionTileLayer.class, str);
    }

    public static FrameMotionTileLayer[] values() {
        return (FrameMotionTileLayer[]) C.clone();
    }
}
