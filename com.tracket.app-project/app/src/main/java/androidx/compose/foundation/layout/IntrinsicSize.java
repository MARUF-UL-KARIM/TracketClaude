package androidx.compose.foundation.layout;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class IntrinsicSize {
    public static final /* synthetic */ IntrinsicSize[] A;
    public static final IntrinsicSize y;
    public static final IntrinsicSize z;

    static {
        IntrinsicSize intrinsicSize = new IntrinsicSize("Min", 0);
        y = intrinsicSize;
        IntrinsicSize intrinsicSize2 = new IntrinsicSize("Max", 1);
        z = intrinsicSize2;
        A = new IntrinsicSize[]{intrinsicSize, intrinsicSize2};
    }

    public static IntrinsicSize valueOf(String str) {
        return (IntrinsicSize) Enum.valueOf(IntrinsicSize.class, str);
    }

    public static IntrinsicSize[] values() {
        return (IntrinsicSize[]) A.clone();
    }
}
