package androidx.compose.ui.layout;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class IntrinsicWidthHeight {
    public static final /* synthetic */ IntrinsicWidthHeight[] A;
    public static final IntrinsicWidthHeight y;
    public static final IntrinsicWidthHeight z;

    static {
        IntrinsicWidthHeight intrinsicWidthHeight = new IntrinsicWidthHeight("Width", 0);
        y = intrinsicWidthHeight;
        IntrinsicWidthHeight intrinsicWidthHeight2 = new IntrinsicWidthHeight("Height", 1);
        z = intrinsicWidthHeight2;
        A = new IntrinsicWidthHeight[]{intrinsicWidthHeight, intrinsicWidthHeight2};
    }

    public static IntrinsicWidthHeight valueOf(String str) {
        return (IntrinsicWidthHeight) Enum.valueOf(IntrinsicWidthHeight.class, str);
    }

    public static IntrinsicWidthHeight[] values() {
        return (IntrinsicWidthHeight[]) A.clone();
    }
}
