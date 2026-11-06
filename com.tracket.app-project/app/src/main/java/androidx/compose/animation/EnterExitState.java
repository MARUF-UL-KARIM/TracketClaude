package androidx.compose.animation;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class EnterExitState {
    public static final EnterExitState A;
    public static final /* synthetic */ EnterExitState[] B;
    public static final EnterExitState y;
    public static final EnterExitState z;

    static {
        EnterExitState enterExitState = new EnterExitState("PreEnter", 0);
        y = enterExitState;
        EnterExitState enterExitState2 = new EnterExitState("Visible", 1);
        z = enterExitState2;
        EnterExitState enterExitState3 = new EnterExitState("PostExit", 2);
        A = enterExitState3;
        B = new EnterExitState[]{enterExitState, enterExitState2, enterExitState3};
    }

    public static EnterExitState valueOf(String str) {
        return (EnterExitState) Enum.valueOf(EnterExitState.class, str);
    }

    public static EnterExitState[] values() {
        return (EnterExitState[]) B.clone();
    }
}
