package androidx.compose.ui.state;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class ToggleableState {
    public static final /* synthetic */ ToggleableState[] A;
    public static final ToggleableState y;
    public static final ToggleableState z;

    static {
        ToggleableState toggleableState = new ToggleableState("On", 0);
        y = toggleableState;
        ToggleableState toggleableState2 = new ToggleableState("Off", 1);
        z = toggleableState2;
        A = new ToggleableState[]{toggleableState, toggleableState2, new ToggleableState("Indeterminate", 2)};
    }

    public static ToggleableState valueOf(String str) {
        return (ToggleableState) Enum.valueOf(ToggleableState.class, str);
    }

    public static ToggleableState[] values() {
        return (ToggleableState[]) A.clone();
    }
}
