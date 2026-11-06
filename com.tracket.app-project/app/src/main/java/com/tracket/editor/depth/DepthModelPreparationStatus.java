package com.tracket.editor.depth;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class DepthModelPreparationStatus {
    public static final DepthModelPreparationStatus A;
    public static final DepthModelPreparationStatus B;
    public static final /* synthetic */ DepthModelPreparationStatus[] C;
    public static final DepthModelPreparationStatus y;
    public static final DepthModelPreparationStatus z;

    static {
        DepthModelPreparationStatus depthModelPreparationStatus = new DepthModelPreparationStatus("IDLE", 0);
        y = depthModelPreparationStatus;
        DepthModelPreparationStatus depthModelPreparationStatus2 = new DepthModelPreparationStatus("PREPARING", 1);
        z = depthModelPreparationStatus2;
        DepthModelPreparationStatus depthModelPreparationStatus3 = new DepthModelPreparationStatus("READY", 2);
        A = depthModelPreparationStatus3;
        DepthModelPreparationStatus depthModelPreparationStatus4 = new DepthModelPreparationStatus("FAILED", 3);
        B = depthModelPreparationStatus4;
        C = new DepthModelPreparationStatus[]{depthModelPreparationStatus, depthModelPreparationStatus2, depthModelPreparationStatus3, depthModelPreparationStatus4};
    }

    public static DepthModelPreparationStatus valueOf(String str) {
        return (DepthModelPreparationStatus) Enum.valueOf(DepthModelPreparationStatus.class, str);
    }

    public static DepthModelPreparationStatus[] values() {
        return (DepthModelPreparationStatus[]) C.clone();
    }
}
