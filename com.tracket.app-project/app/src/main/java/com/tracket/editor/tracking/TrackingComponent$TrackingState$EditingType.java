package com.tracket.editor.tracking;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class TrackingComponent$TrackingState$EditingType {
    public static final TrackingComponent$TrackingState$EditingType A;
    public static final /* synthetic */ TrackingComponent$TrackingState$EditingType[] B;
    public static final TrackingComponent$TrackingState$EditingType y;
    public static final TrackingComponent$TrackingState$EditingType z;

    static {
        TrackingComponent$TrackingState$EditingType trackingComponent$TrackingState$EditingType = new TrackingComponent$TrackingState$EditingType("NONE", 0);
        y = trackingComponent$TrackingState$EditingType;
        TrackingComponent$TrackingState$EditingType trackingComponent$TrackingState$EditingType2 = new TrackingComponent$TrackingState$EditingType("EDITING", 1);
        z = trackingComponent$TrackingState$EditingType2;
        TrackingComponent$TrackingState$EditingType trackingComponent$TrackingState$EditingType3 = new TrackingComponent$TrackingState$EditingType("FILTER", 2);
        A = trackingComponent$TrackingState$EditingType3;
        B = new TrackingComponent$TrackingState$EditingType[]{trackingComponent$TrackingState$EditingType, trackingComponent$TrackingState$EditingType2, trackingComponent$TrackingState$EditingType3};
    }

    public static TrackingComponent$TrackingState$EditingType valueOf(String str) {
        return (TrackingComponent$TrackingState$EditingType) Enum.valueOf(TrackingComponent$TrackingState$EditingType.class, str);
    }

    public static TrackingComponent$TrackingState$EditingType[] values() {
        return (TrackingComponent$TrackingState$EditingType[]) B.clone();
    }
}
