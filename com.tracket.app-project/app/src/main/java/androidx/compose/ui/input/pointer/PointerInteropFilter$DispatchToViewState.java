package androidx.compose.ui.input.pointer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
final class PointerInteropFilter$DispatchToViewState {
    public static final PointerInteropFilter$DispatchToViewState A;
    public static final /* synthetic */ PointerInteropFilter$DispatchToViewState[] B;
    public static final PointerInteropFilter$DispatchToViewState y;
    public static final PointerInteropFilter$DispatchToViewState z;

    static {
        PointerInteropFilter$DispatchToViewState pointerInteropFilter$DispatchToViewState = new PointerInteropFilter$DispatchToViewState("Unknown", 0);
        y = pointerInteropFilter$DispatchToViewState;
        PointerInteropFilter$DispatchToViewState pointerInteropFilter$DispatchToViewState2 = new PointerInteropFilter$DispatchToViewState("Dispatching", 1);
        z = pointerInteropFilter$DispatchToViewState2;
        PointerInteropFilter$DispatchToViewState pointerInteropFilter$DispatchToViewState3 = new PointerInteropFilter$DispatchToViewState("NotDispatching", 2);
        A = pointerInteropFilter$DispatchToViewState3;
        B = new PointerInteropFilter$DispatchToViewState[]{pointerInteropFilter$DispatchToViewState, pointerInteropFilter$DispatchToViewState2, pointerInteropFilter$DispatchToViewState3};
    }

    public static PointerInteropFilter$DispatchToViewState valueOf(String str) {
        return (PointerInteropFilter$DispatchToViewState) Enum.valueOf(PointerInteropFilter$DispatchToViewState.class, str);
    }

    public static PointerInteropFilter$DispatchToViewState[] values() {
        return (PointerInteropFilter$DispatchToViewState[]) B.clone();
    }
}
