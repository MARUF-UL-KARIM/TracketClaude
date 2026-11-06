package com.tracket.editor.tracking;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class TrackingBoundingBoxOverlayRole {
    public static final TrackingBoundingBoxOverlayRole A;
    public static final TrackingBoundingBoxOverlayRole B;
    public static final /* synthetic */ TrackingBoundingBoxOverlayRole[] C;
    public static final TrackingBoundingBoxOverlayRole y;
    public static final TrackingBoundingBoxOverlayRole z;

    static {
        TrackingBoundingBoxOverlayRole trackingBoundingBoxOverlayRole = new TrackingBoundingBoxOverlayRole("DEFAULT", 0);
        y = trackingBoundingBoxOverlayRole;
        TrackingBoundingBoxOverlayRole trackingBoundingBoxOverlayRole2 = new TrackingBoundingBoxOverlayRole("TRACKED", 1);
        z = trackingBoundingBoxOverlayRole2;
        TrackingBoundingBoxOverlayRole trackingBoundingBoxOverlayRole3 = new TrackingBoundingBoxOverlayRole("DETECTED", 2);
        A = trackingBoundingBoxOverlayRole3;
        TrackingBoundingBoxOverlayRole trackingBoundingBoxOverlayRole4 = new TrackingBoundingBoxOverlayRole("SEARCHING", 3);
        B = trackingBoundingBoxOverlayRole4;
        C = new TrackingBoundingBoxOverlayRole[]{trackingBoundingBoxOverlayRole, trackingBoundingBoxOverlayRole2, trackingBoundingBoxOverlayRole3, trackingBoundingBoxOverlayRole4};
    }

    public static TrackingBoundingBoxOverlayRole valueOf(String str) {
        return (TrackingBoundingBoxOverlayRole) Enum.valueOf(TrackingBoundingBoxOverlayRole.class, str);
    }

    public static TrackingBoundingBoxOverlayRole[] values() {
        return (TrackingBoundingBoxOverlayRole[]) C.clone();
    }
}
