package androidx.compose.ui.input.pointer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class PointerEventPass {
    public static final PointerEventPass A;
    public static final /* synthetic */ PointerEventPass[] B;
    public static final PointerEventPass y;
    public static final PointerEventPass z;

    static {
        PointerEventPass pointerEventPass = new PointerEventPass("Initial", 0);
        y = pointerEventPass;
        PointerEventPass pointerEventPass2 = new PointerEventPass("Main", 1);
        z = pointerEventPass2;
        PointerEventPass pointerEventPass3 = new PointerEventPass("Final", 2);
        A = pointerEventPass3;
        B = new PointerEventPass[]{pointerEventPass, pointerEventPass2, pointerEventPass3};
    }

    public static PointerEventPass valueOf(String str) {
        return (PointerEventPass) Enum.valueOf(PointerEventPass.class, str);
    }

    public static PointerEventPass[] values() {
        return (PointerEventPass[]) B.clone();
    }
}
