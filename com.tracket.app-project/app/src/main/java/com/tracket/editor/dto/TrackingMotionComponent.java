package com.tracket.editor.dto;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes4.dex */
public final class TrackingMotionComponent {
    public static final TrackingMotionComponent A;
    public static final TrackingMotionComponent B;
    public static final TrackingMotionComponent C;
    public static final TrackingMotionComponent D;
    public static final /* synthetic */ TrackingMotionComponent[] E;
    public static final TrackingMotionComponent y;
    public static final TrackingMotionComponent z;

    static {
        TrackingMotionComponent trackingMotionComponent = new TrackingMotionComponent("HORIZONTAL", 0);
        y = trackingMotionComponent;
        TrackingMotionComponent trackingMotionComponent2 = new TrackingMotionComponent("VERTICAL", 1);
        z = trackingMotionComponent2;
        TrackingMotionComponent trackingMotionComponent3 = new TrackingMotionComponent("SCALE", 2);
        A = trackingMotionComponent3;
        TrackingMotionComponent trackingMotionComponent4 = new TrackingMotionComponent("ROTATION", 3);
        B = trackingMotionComponent4;
        TrackingMotionComponent trackingMotionComponent5 = new TrackingMotionComponent("AFFINE", 4);
        C = trackingMotionComponent5;
        TrackingMotionComponent trackingMotionComponent6 = new TrackingMotionComponent("PERSPECTIVE", 5);
        D = trackingMotionComponent6;
        E = new TrackingMotionComponent[]{trackingMotionComponent, trackingMotionComponent2, trackingMotionComponent3, trackingMotionComponent4, trackingMotionComponent5, trackingMotionComponent6};
    }

    public static TrackingMotionComponent valueOf(String str) {
        return (TrackingMotionComponent) Enum.valueOf(TrackingMotionComponent.class, str);
    }

    public static TrackingMotionComponent[] values() {
        return (TrackingMotionComponent[]) E.clone();
    }
}
