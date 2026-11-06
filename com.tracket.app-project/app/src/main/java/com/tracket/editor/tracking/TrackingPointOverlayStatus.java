package com.tracket.editor.tracking;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class TrackingPointOverlayStatus {
    public static final TrackingPointOverlayStatus A;
    public static final TrackingPointOverlayStatus B;
    public static final /* synthetic */ TrackingPointOverlayStatus[] C;
    public static final TrackingPointOverlayStatus y;
    public static final TrackingPointOverlayStatus z;

    static {
        TrackingPointOverlayStatus trackingPointOverlayStatus = new TrackingPointOverlayStatus("INLIER", 0);
        y = trackingPointOverlayStatus;
        TrackingPointOverlayStatus trackingPointOverlayStatus2 = new TrackingPointOverlayStatus("LANDMARK", 1);
        z = trackingPointOverlayStatus2;
        TrackingPointOverlayStatus trackingPointOverlayStatus3 = new TrackingPointOverlayStatus("OUTLIER", 2);
        A = trackingPointOverlayStatus3;
        TrackingPointOverlayStatus trackingPointOverlayStatus4 = new TrackingPointOverlayStatus("LOST", 3);
        B = trackingPointOverlayStatus4;
        C = new TrackingPointOverlayStatus[]{trackingPointOverlayStatus, trackingPointOverlayStatus2, trackingPointOverlayStatus3, trackingPointOverlayStatus4};
    }

    public static TrackingPointOverlayStatus valueOf(String str) {
        return (TrackingPointOverlayStatus) Enum.valueOf(TrackingPointOverlayStatus.class, str);
    }

    public static TrackingPointOverlayStatus[] values() {
        return (TrackingPointOverlayStatus[]) C.clone();
    }
}
