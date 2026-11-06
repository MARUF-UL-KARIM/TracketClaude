package androidx.compose.ui.text.style;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class ResolvedTextDirection {
    public static final /* synthetic */ ResolvedTextDirection[] A;
    public static final ResolvedTextDirection y;
    public static final ResolvedTextDirection z;

    static {
        ResolvedTextDirection resolvedTextDirection = new ResolvedTextDirection("Ltr", 0);
        y = resolvedTextDirection;
        ResolvedTextDirection resolvedTextDirection2 = new ResolvedTextDirection("Rtl", 1);
        z = resolvedTextDirection2;
        A = new ResolvedTextDirection[]{resolvedTextDirection, resolvedTextDirection2};
    }

    public static ResolvedTextDirection valueOf(String str) {
        return (ResolvedTextDirection) Enum.valueOf(ResolvedTextDirection.class, str);
    }

    public static ResolvedTextDirection[] values() {
        return (ResolvedTextDirection[]) A.clone();
    }
}
