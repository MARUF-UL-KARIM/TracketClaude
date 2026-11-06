package androidx.compose.ui.unit;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class LayoutDirection {
    public static final /* synthetic */ LayoutDirection[] A;
    public static final LayoutDirection y;
    public static final LayoutDirection z;

    static {
        LayoutDirection layoutDirection = new LayoutDirection("Ltr", 0);
        y = layoutDirection;
        LayoutDirection layoutDirection2 = new LayoutDirection("Rtl", 1);
        z = layoutDirection2;
        A = new LayoutDirection[]{layoutDirection, layoutDirection2};
    }

    public static LayoutDirection valueOf(String str) {
        return (LayoutDirection) Enum.valueOf(LayoutDirection.class, str);
    }

    public static LayoutDirection[] values() {
        return (LayoutDirection[]) A.clone();
    }
}
