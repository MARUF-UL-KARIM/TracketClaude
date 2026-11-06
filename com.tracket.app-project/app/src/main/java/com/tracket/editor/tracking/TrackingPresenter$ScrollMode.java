package com.tracket.editor.tracking;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class TrackingPresenter$ScrollMode {
    public static final TrackingPresenter$ScrollMode A;
    public static final TrackingPresenter$ScrollMode B;
    public static final TrackingPresenter$ScrollMode C;
    public static final TrackingPresenter$ScrollMode D;
    public static final TrackingPresenter$ScrollMode E;
    public static final /* synthetic */ TrackingPresenter$ScrollMode[] F;
    public static final TrackingPresenter$ScrollMode y;
    public static final TrackingPresenter$ScrollMode z;

    static {
        TrackingPresenter$ScrollMode trackingPresenter$ScrollMode = new TrackingPresenter$ScrollMode("DRAG", 0);
        y = trackingPresenter$ScrollMode;
        TrackingPresenter$ScrollMode trackingPresenter$ScrollMode2 = new TrackingPresenter$ScrollMode("RESIZE", 1);
        z = trackingPresenter$ScrollMode2;
        TrackingPresenter$ScrollMode trackingPresenter$ScrollMode3 = new TrackingPresenter$ScrollMode("TOP_LEFT", 2);
        A = trackingPresenter$ScrollMode3;
        TrackingPresenter$ScrollMode trackingPresenter$ScrollMode4 = new TrackingPresenter$ScrollMode("TOP_RIGHT", 3);
        B = trackingPresenter$ScrollMode4;
        TrackingPresenter$ScrollMode trackingPresenter$ScrollMode5 = new TrackingPresenter$ScrollMode("BOTTOM_RIGHT", 4);
        C = trackingPresenter$ScrollMode5;
        TrackingPresenter$ScrollMode trackingPresenter$ScrollMode6 = new TrackingPresenter$ScrollMode("BOTTOM_LEFT", 5);
        D = trackingPresenter$ScrollMode6;
        TrackingPresenter$ScrollMode trackingPresenter$ScrollMode7 = new TrackingPresenter$ScrollMode("NONE", 6);
        E = trackingPresenter$ScrollMode7;
        F = new TrackingPresenter$ScrollMode[]{trackingPresenter$ScrollMode, trackingPresenter$ScrollMode2, trackingPresenter$ScrollMode3, trackingPresenter$ScrollMode4, trackingPresenter$ScrollMode5, trackingPresenter$ScrollMode6, trackingPresenter$ScrollMode7};
    }

    public static TrackingPresenter$ScrollMode valueOf(String str) {
        return (TrackingPresenter$ScrollMode) Enum.valueOf(TrackingPresenter$ScrollMode.class, str);
    }

    public static TrackingPresenter$ScrollMode[] values() {
        return (TrackingPresenter$ScrollMode[]) F.clone();
    }
}
