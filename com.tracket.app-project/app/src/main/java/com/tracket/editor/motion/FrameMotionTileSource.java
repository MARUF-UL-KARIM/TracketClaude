package com.tracket.editor.motion;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class FrameMotionTileSource {
    public static final FrameMotionTileSource A;
    public static final FrameMotionTileSource B;
    public static final /* synthetic */ FrameMotionTileSource[] C;
    public static final FrameMotionTileSource y;
    public static final FrameMotionTileSource z;

    static {
        FrameMotionTileSource frameMotionTileSource = new FrameMotionTileSource("NONE", 0);
        y = frameMotionTileSource;
        FrameMotionTileSource frameMotionTileSource2 = new FrameMotionTileSource("SPARSE", 1);
        z = frameMotionTileSource2;
        FrameMotionTileSource frameMotionTileSource3 = new FrameMotionTileSource("DENSE", 2);
        A = frameMotionTileSource3;
        FrameMotionTileSource frameMotionTileSource4 = new FrameMotionTileSource("FUSED", 3);
        B = frameMotionTileSource4;
        C = new FrameMotionTileSource[]{frameMotionTileSource, frameMotionTileSource2, frameMotionTileSource3, frameMotionTileSource4};
    }

    public static FrameMotionTileSource valueOf(String str) {
        return (FrameMotionTileSource) Enum.valueOf(FrameMotionTileSource.class, str);
    }

    public static FrameMotionTileSource[] values() {
        return (FrameMotionTileSource[]) C.clone();
    }
}
