package androidx.compose.foundation.layout;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class LayoutOrientation {
    public static final LayoutOrientation y;
    public static final /* synthetic */ LayoutOrientation[] z;

    static {
        LayoutOrientation layoutOrientation = new LayoutOrientation("Horizontal", 0);
        y = layoutOrientation;
        z = new LayoutOrientation[]{layoutOrientation, new LayoutOrientation("Vertical", 1)};
    }

    public static LayoutOrientation valueOf(String str) {
        return (LayoutOrientation) Enum.valueOf(LayoutOrientation.class, str);
    }

    public static LayoutOrientation[] values() {
        return (LayoutOrientation[]) z.clone();
    }
}
