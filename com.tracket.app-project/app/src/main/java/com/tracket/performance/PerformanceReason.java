package com.tracket.performance;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class PerformanceReason {
    public static final PerformanceReason A;
    public static final PerformanceReason B;
    public static final PerformanceReason C;
    public static final PerformanceReason D;
    public static final PerformanceReason E;
    public static final PerformanceReason F;
    public static final /* synthetic */ PerformanceReason[] G;
    public static final PerformanceReason y;
    public static final PerformanceReason z;

    static {
        PerformanceReason performanceReason = new PerformanceReason("PLAYBACK", 0);
        y = performanceReason;
        PerformanceReason performanceReason2 = new PerformanceReason("SEEK", 1);
        z = performanceReason2;
        PerformanceReason performanceReason3 = new PerformanceReason("TIMELINE_PREVIEW_GENERATION", 2);
        A = performanceReason3;
        PerformanceReason performanceReason4 = new PerformanceReason("TRACKING", 3);
        B = performanceReason4;
        PerformanceReason performanceReason5 = new PerformanceReason("CUTOUT_TRACKING", 4);
        C = performanceReason5;
        PerformanceReason performanceReason6 = new PerformanceReason("DEPTH_ANALYSIS", 5);
        D = performanceReason6;
        PerformanceReason performanceReason7 = new PerformanceReason("EXPORT", 6);
        E = performanceReason7;
        PerformanceReason performanceReason8 = new PerformanceReason("FRAME_PRODUCER_BUSY", 7);
        F = performanceReason8;
        G = new PerformanceReason[]{performanceReason, performanceReason2, performanceReason3, performanceReason4, performanceReason5, performanceReason6, performanceReason7, performanceReason8};
    }

    public static PerformanceReason valueOf(String str) {
        return (PerformanceReason) Enum.valueOf(PerformanceReason.class, str);
    }

    public static PerformanceReason[] values() {
        return (PerformanceReason[]) G.clone();
    }
}
