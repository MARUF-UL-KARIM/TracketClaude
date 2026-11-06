package com.tracket.processing.reverse;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class ReverseVideoJobStatus {
    public static final ReverseVideoJobStatus A;
    public static final ReverseVideoJobStatus B;
    public static final ReverseVideoJobStatus C;
    public static final /* synthetic */ ReverseVideoJobStatus[] D;
    public static final ReverseVideoJobStatus y;
    public static final ReverseVideoJobStatus z;

    static {
        ReverseVideoJobStatus reverseVideoJobStatus = new ReverseVideoJobStatus("QUEUED", 0);
        y = reverseVideoJobStatus;
        ReverseVideoJobStatus reverseVideoJobStatus2 = new ReverseVideoJobStatus("RUNNING", 1);
        z = reverseVideoJobStatus2;
        ReverseVideoJobStatus reverseVideoJobStatus3 = new ReverseVideoJobStatus("COMPLETED", 2);
        A = reverseVideoJobStatus3;
        ReverseVideoJobStatus reverseVideoJobStatus4 = new ReverseVideoJobStatus("FAILED", 3);
        B = reverseVideoJobStatus4;
        ReverseVideoJobStatus reverseVideoJobStatus5 = new ReverseVideoJobStatus("CANCELLED", 4);
        C = reverseVideoJobStatus5;
        D = new ReverseVideoJobStatus[]{reverseVideoJobStatus, reverseVideoJobStatus2, reverseVideoJobStatus3, reverseVideoJobStatus4, reverseVideoJobStatus5};
    }

    public static ReverseVideoJobStatus valueOf(String str) {
        return (ReverseVideoJobStatus) Enum.valueOf(ReverseVideoJobStatus.class, str);
    }

    public static ReverseVideoJobStatus[] values() {
        return (ReverseVideoJobStatus[]) D.clone();
    }

    public final boolean a() {
        return this == y || this == z;
    }
}
