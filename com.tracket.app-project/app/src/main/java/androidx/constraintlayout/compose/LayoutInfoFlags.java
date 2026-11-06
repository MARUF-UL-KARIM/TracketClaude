package androidx.constraintlayout.compose;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class LayoutInfoFlags {
    public static final /* synthetic */ LayoutInfoFlags[] y = {new LayoutInfoFlags("NONE", 0), new LayoutInfoFlags("BOUNDS", 1)};

    /* JADX INFO: Fake field, exist only in values array */
    LayoutInfoFlags EF5;

    public static LayoutInfoFlags valueOf(String str) {
        return (LayoutInfoFlags) Enum.valueOf(LayoutInfoFlags.class, str);
    }

    public static LayoutInfoFlags[] values() {
        return (LayoutInfoFlags[]) y.clone();
    }
}
