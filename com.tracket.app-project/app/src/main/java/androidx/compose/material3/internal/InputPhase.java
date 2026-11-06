package androidx.compose.material3.internal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
final class InputPhase {
    public static final InputPhase A;
    public static final /* synthetic */ InputPhase[] B;
    public static final InputPhase y;
    public static final InputPhase z;

    static {
        InputPhase inputPhase = new InputPhase("Focused", 0);
        y = inputPhase;
        InputPhase inputPhase2 = new InputPhase("UnfocusedEmpty", 1);
        z = inputPhase2;
        InputPhase inputPhase3 = new InputPhase("UnfocusedNotEmpty", 2);
        A = inputPhase3;
        B = new InputPhase[]{inputPhase, inputPhase2, inputPhase3};
    }

    public static InputPhase valueOf(String str) {
        return (InputPhase) Enum.valueOf(InputPhase.class, str);
    }

    public static InputPhase[] values() {
        return (InputPhase[]) B.clone();
    }
}
