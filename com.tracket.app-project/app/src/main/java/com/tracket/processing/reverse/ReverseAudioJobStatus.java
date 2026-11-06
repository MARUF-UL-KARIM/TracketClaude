package com.tracket.processing.reverse;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class ReverseAudioJobStatus {
    public static final ReverseAudioJobStatus A;
    public static final ReverseAudioJobStatus B;
    public static final ReverseAudioJobStatus C;
    public static final /* synthetic */ ReverseAudioJobStatus[] D;
    public static final ReverseAudioJobStatus y;
    public static final ReverseAudioJobStatus z;

    static {
        ReverseAudioJobStatus reverseAudioJobStatus = new ReverseAudioJobStatus("QUEUED", 0);
        y = reverseAudioJobStatus;
        ReverseAudioJobStatus reverseAudioJobStatus2 = new ReverseAudioJobStatus("RUNNING", 1);
        z = reverseAudioJobStatus2;
        ReverseAudioJobStatus reverseAudioJobStatus3 = new ReverseAudioJobStatus("COMPLETED", 2);
        A = reverseAudioJobStatus3;
        ReverseAudioJobStatus reverseAudioJobStatus4 = new ReverseAudioJobStatus("FAILED", 3);
        B = reverseAudioJobStatus4;
        ReverseAudioJobStatus reverseAudioJobStatus5 = new ReverseAudioJobStatus("CANCELLED", 4);
        C = reverseAudioJobStatus5;
        D = new ReverseAudioJobStatus[]{reverseAudioJobStatus, reverseAudioJobStatus2, reverseAudioJobStatus3, reverseAudioJobStatus4, reverseAudioJobStatus5};
    }

    public static ReverseAudioJobStatus valueOf(String str) {
        return (ReverseAudioJobStatus) Enum.valueOf(ReverseAudioJobStatus.class, str);
    }

    public static ReverseAudioJobStatus[] values() {
        return (ReverseAudioJobStatus[]) D.clone();
    }
}
