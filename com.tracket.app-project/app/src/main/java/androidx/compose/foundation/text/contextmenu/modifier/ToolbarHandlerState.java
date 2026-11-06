package androidx.compose.foundation.text.contextmenu.modifier;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class ToolbarHandlerState {
    public static final ToolbarHandlerState A;
    public static final /* synthetic */ ToolbarHandlerState[] B;
    public static final ToolbarHandlerState y;
    public static final ToolbarHandlerState z;

    static {
        ToolbarHandlerState toolbarHandlerState = new ToolbarHandlerState("Uninitialized", 0);
        y = toolbarHandlerState;
        ToolbarHandlerState toolbarHandlerState2 = new ToolbarHandlerState("Detached", 1);
        z = toolbarHandlerState2;
        ToolbarHandlerState toolbarHandlerState3 = new ToolbarHandlerState("Attached", 2);
        A = toolbarHandlerState3;
        B = new ToolbarHandlerState[]{toolbarHandlerState, toolbarHandlerState2, toolbarHandlerState3};
    }

    public static ToolbarHandlerState valueOf(String str) {
        return (ToolbarHandlerState) Enum.valueOf(ToolbarHandlerState.class, str);
    }

    public static ToolbarHandlerState[] values() {
        return (ToolbarHandlerState[]) B.clone();
    }
}
