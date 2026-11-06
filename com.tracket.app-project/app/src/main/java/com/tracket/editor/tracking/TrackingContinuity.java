package com.tracket.editor.tracking;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class TrackingContinuity {
    public static final /* synthetic */ TrackingContinuity[] A;
    public static final TrackingContinuity y;
    public static final TrackingContinuity z;

    static {
        TrackingContinuity trackingContinuity = new TrackingContinuity("TRACKED", 0);
        y = trackingContinuity;
        TrackingContinuity trackingContinuity2 = new TrackingContinuity("SEARCHING", 1);
        z = trackingContinuity2;
        A = new TrackingContinuity[]{trackingContinuity, trackingContinuity2};
    }

    public static TrackingContinuity valueOf(String str) {
        return (TrackingContinuity) Enum.valueOf(TrackingContinuity.class, str);
    }

    public static TrackingContinuity[] values() {
        return (TrackingContinuity[]) A.clone();
    }
}
