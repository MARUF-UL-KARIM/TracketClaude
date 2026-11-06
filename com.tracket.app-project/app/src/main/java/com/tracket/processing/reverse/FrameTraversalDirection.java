package com.tracket.processing.reverse;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class FrameTraversalDirection {
    public static final FrameTraversalDirection y;
    public static final /* synthetic */ FrameTraversalDirection[] z;

    /* JADX INFO: Fake field, exist only in values array */
    FrameTraversalDirection EF0;

    static {
        FrameTraversalDirection frameTraversalDirection = new FrameTraversalDirection("FORWARD", 0);
        FrameTraversalDirection frameTraversalDirection2 = new FrameTraversalDirection("REVERSE", 1);
        y = frameTraversalDirection2;
        z = new FrameTraversalDirection[]{frameTraversalDirection, frameTraversalDirection2};
    }

    public static FrameTraversalDirection valueOf(String str) {
        return (FrameTraversalDirection) Enum.valueOf(FrameTraversalDirection.class, str);
    }

    public static FrameTraversalDirection[] values() {
        return (FrameTraversalDirection[]) z.clone();
    }
}
