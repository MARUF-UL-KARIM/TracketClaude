package androidx.compose.runtime;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class PausedCompositionState {
    public static final PausedCompositionState A;
    public static final PausedCompositionState B;
    public static final PausedCompositionState C;
    public static final PausedCompositionState D;
    public static final PausedCompositionState E;
    public static final /* synthetic */ PausedCompositionState[] F;
    public static final PausedCompositionState y;
    public static final PausedCompositionState z;

    static {
        PausedCompositionState pausedCompositionState = new PausedCompositionState("Invalid", 0);
        y = pausedCompositionState;
        PausedCompositionState pausedCompositionState2 = new PausedCompositionState("Cancelled", 1);
        z = pausedCompositionState2;
        PausedCompositionState pausedCompositionState3 = new PausedCompositionState("InitialPending", 2);
        A = pausedCompositionState3;
        PausedCompositionState pausedCompositionState4 = new PausedCompositionState("RecomposePending", 3);
        B = pausedCompositionState4;
        PausedCompositionState pausedCompositionState5 = new PausedCompositionState("Recomposing", 4);
        C = pausedCompositionState5;
        PausedCompositionState pausedCompositionState6 = new PausedCompositionState("ApplyPending", 5);
        D = pausedCompositionState6;
        PausedCompositionState pausedCompositionState7 = new PausedCompositionState("Applied", 6);
        E = pausedCompositionState7;
        F = new PausedCompositionState[]{pausedCompositionState, pausedCompositionState2, pausedCompositionState3, pausedCompositionState4, pausedCompositionState5, pausedCompositionState6, pausedCompositionState7};
    }

    public static PausedCompositionState valueOf(String str) {
        return (PausedCompositionState) Enum.valueOf(PausedCompositionState.class, str);
    }

    public static PausedCompositionState[] values() {
        return (PausedCompositionState[]) F.clone();
    }
}
