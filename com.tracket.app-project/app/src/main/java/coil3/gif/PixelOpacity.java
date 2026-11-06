package coil3.gif;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes4.dex */
public final class PixelOpacity {
    public static final /* synthetic */ PixelOpacity[] y = {new PixelOpacity("UNCHANGED", 0), new PixelOpacity("TRANSLUCENT", 1), new PixelOpacity("OPAQUE", 2)};

    /* JADX INFO: Fake field, exist only in values array */
    PixelOpacity EF5;

    public static PixelOpacity valueOf(String str) {
        return (PixelOpacity) Enum.valueOf(PixelOpacity.class, str);
    }

    public static PixelOpacity[] values() {
        return (PixelOpacity[]) y.clone();
    }
}
