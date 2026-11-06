package com.tracket.editor.depth;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class DepthModelDeliveryStatus {
    public static final DepthModelDeliveryStatus A;
    public static final DepthModelDeliveryStatus B;
    public static final /* synthetic */ DepthModelDeliveryStatus[] C;
    public static final DepthModelDeliveryStatus y;
    public static final DepthModelDeliveryStatus z;

    static {
        DepthModelDeliveryStatus depthModelDeliveryStatus = new DepthModelDeliveryStatus("IDLE", 0);
        y = depthModelDeliveryStatus;
        DepthModelDeliveryStatus depthModelDeliveryStatus2 = new DepthModelDeliveryStatus("DOWNLOADING", 1);
        z = depthModelDeliveryStatus2;
        DepthModelDeliveryStatus depthModelDeliveryStatus3 = new DepthModelDeliveryStatus("READY", 2);
        A = depthModelDeliveryStatus3;
        DepthModelDeliveryStatus depthModelDeliveryStatus4 = new DepthModelDeliveryStatus("FAILED", 3);
        B = depthModelDeliveryStatus4;
        C = new DepthModelDeliveryStatus[]{depthModelDeliveryStatus, depthModelDeliveryStatus2, depthModelDeliveryStatus3, depthModelDeliveryStatus4};
    }

    public static DepthModelDeliveryStatus valueOf(String str) {
        return (DepthModelDeliveryStatus) Enum.valueOf(DepthModelDeliveryStatus.class, str);
    }

    public static DepthModelDeliveryStatus[] values() {
        return (DepthModelDeliveryStatus[]) C.clone();
    }
}
