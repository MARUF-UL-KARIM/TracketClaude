package androidx.compose.foundation.text.selection;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class CrossStatus {
    public static final CrossStatus A;
    public static final /* synthetic */ CrossStatus[] B;
    public static final CrossStatus y;
    public static final CrossStatus z;

    static {
        CrossStatus crossStatus = new CrossStatus("CROSSED", 0);
        y = crossStatus;
        CrossStatus crossStatus2 = new CrossStatus("NOT_CROSSED", 1);
        z = crossStatus2;
        CrossStatus crossStatus3 = new CrossStatus("COLLAPSED", 2);
        A = crossStatus3;
        B = new CrossStatus[]{crossStatus, crossStatus2, crossStatus3};
    }

    public static CrossStatus valueOf(String str) {
        return (CrossStatus) Enum.valueOf(CrossStatus.class, str);
    }

    public static CrossStatus[] values() {
        return (CrossStatus[]) B.clone();
    }
}
