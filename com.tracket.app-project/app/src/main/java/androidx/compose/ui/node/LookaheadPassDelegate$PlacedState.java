package androidx.compose.ui.node;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
final class LookaheadPassDelegate$PlacedState {
    public static final LookaheadPassDelegate$PlacedState A;
    public static final /* synthetic */ LookaheadPassDelegate$PlacedState[] B;
    public static final LookaheadPassDelegate$PlacedState y;
    public static final LookaheadPassDelegate$PlacedState z;

    static {
        LookaheadPassDelegate$PlacedState lookaheadPassDelegate$PlacedState = new LookaheadPassDelegate$PlacedState("IsPlacedInLookahead", 0);
        y = lookaheadPassDelegate$PlacedState;
        LookaheadPassDelegate$PlacedState lookaheadPassDelegate$PlacedState2 = new LookaheadPassDelegate$PlacedState("IsPlacedInApproach", 1);
        z = lookaheadPassDelegate$PlacedState2;
        LookaheadPassDelegate$PlacedState lookaheadPassDelegate$PlacedState3 = new LookaheadPassDelegate$PlacedState("IsNotPlaced", 2);
        A = lookaheadPassDelegate$PlacedState3;
        B = new LookaheadPassDelegate$PlacedState[]{lookaheadPassDelegate$PlacedState, lookaheadPassDelegate$PlacedState2, lookaheadPassDelegate$PlacedState3};
    }

    public static LookaheadPassDelegate$PlacedState valueOf(String str) {
        return (LookaheadPassDelegate$PlacedState) Enum.valueOf(LookaheadPassDelegate$PlacedState.class, str);
    }

    public static LookaheadPassDelegate$PlacedState[] values() {
        return (LookaheadPassDelegate$PlacedState[]) B.clone();
    }
}
