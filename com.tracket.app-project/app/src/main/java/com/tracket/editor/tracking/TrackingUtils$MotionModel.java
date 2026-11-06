package com.tracket.editor.tracking;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class TrackingUtils$MotionModel {
    public static final TrackingUtils$MotionModel A;
    public static final /* synthetic */ TrackingUtils$MotionModel[] B;
    public static final TrackingUtils$MotionModel y;
    public static final TrackingUtils$MotionModel z;

    static {
        TrackingUtils$MotionModel trackingUtils$MotionModel = new TrackingUtils$MotionModel("TRANSLATION", 0);
        y = trackingUtils$MotionModel;
        TrackingUtils$MotionModel trackingUtils$MotionModel2 = new TrackingUtils$MotionModel("SIMILARITY", 1);
        z = trackingUtils$MotionModel2;
        TrackingUtils$MotionModel trackingUtils$MotionModel3 = new TrackingUtils$MotionModel("AFFINE", 2);
        A = trackingUtils$MotionModel3;
        B = new TrackingUtils$MotionModel[]{trackingUtils$MotionModel, trackingUtils$MotionModel2, trackingUtils$MotionModel3};
    }

    public static TrackingUtils$MotionModel valueOf(String str) {
        return (TrackingUtils$MotionModel) Enum.valueOf(TrackingUtils$MotionModel.class, str);
    }

    public static TrackingUtils$MotionModel[] values() {
        return (TrackingUtils$MotionModel[]) B.clone();
    }
}
