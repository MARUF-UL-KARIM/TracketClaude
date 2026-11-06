package androidx.compose.ui.node;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class LayoutNode$LayoutState {
    public static final LayoutNode$LayoutState A;
    public static final LayoutNode$LayoutState B;
    public static final LayoutNode$LayoutState C;
    public static final /* synthetic */ LayoutNode$LayoutState[] D;
    public static final LayoutNode$LayoutState y;
    public static final LayoutNode$LayoutState z;

    static {
        LayoutNode$LayoutState layoutNode$LayoutState = new LayoutNode$LayoutState("Measuring", 0);
        y = layoutNode$LayoutState;
        LayoutNode$LayoutState layoutNode$LayoutState2 = new LayoutNode$LayoutState("LookaheadMeasuring", 1);
        z = layoutNode$LayoutState2;
        LayoutNode$LayoutState layoutNode$LayoutState3 = new LayoutNode$LayoutState("LayingOut", 2);
        A = layoutNode$LayoutState3;
        LayoutNode$LayoutState layoutNode$LayoutState4 = new LayoutNode$LayoutState("LookaheadLayingOut", 3);
        B = layoutNode$LayoutState4;
        LayoutNode$LayoutState layoutNode$LayoutState5 = new LayoutNode$LayoutState("Idle", 4);
        C = layoutNode$LayoutState5;
        D = new LayoutNode$LayoutState[]{layoutNode$LayoutState, layoutNode$LayoutState2, layoutNode$LayoutState3, layoutNode$LayoutState4, layoutNode$LayoutState5};
    }

    public static LayoutNode$LayoutState valueOf(String str) {
        return (LayoutNode$LayoutState) Enum.valueOf(LayoutNode$LayoutState.class, str);
    }

    public static LayoutNode$LayoutState[] values() {
        return (LayoutNode$LayoutState[]) D.clone();
    }
}
