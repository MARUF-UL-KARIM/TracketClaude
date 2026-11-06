package androidx.room;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class ObservedTableStates$ObserveOp {
    public static final ObservedTableStates$ObserveOp A;
    public static final /* synthetic */ ObservedTableStates$ObserveOp[] B;
    public static final ObservedTableStates$ObserveOp y;
    public static final ObservedTableStates$ObserveOp z;

    static {
        ObservedTableStates$ObserveOp observedTableStates$ObserveOp = new ObservedTableStates$ObserveOp("NO_OP", 0);
        y = observedTableStates$ObserveOp;
        ObservedTableStates$ObserveOp observedTableStates$ObserveOp2 = new ObservedTableStates$ObserveOp("ADD", 1);
        z = observedTableStates$ObserveOp2;
        ObservedTableStates$ObserveOp observedTableStates$ObserveOp3 = new ObservedTableStates$ObserveOp("REMOVE", 2);
        A = observedTableStates$ObserveOp3;
        B = new ObservedTableStates$ObserveOp[]{observedTableStates$ObserveOp, observedTableStates$ObserveOp2, observedTableStates$ObserveOp3};
    }

    public static ObservedTableStates$ObserveOp valueOf(String str) {
        return (ObservedTableStates$ObserveOp) Enum.valueOf(ObservedTableStates$ObserveOp.class, str);
    }

    public static ObservedTableStates$ObserveOp[] values() {
        return (ObservedTableStates$ObserveOp[]) B.clone();
    }
}
