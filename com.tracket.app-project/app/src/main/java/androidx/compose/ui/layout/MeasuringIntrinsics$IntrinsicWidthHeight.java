package androidx.compose.ui.layout;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
final class MeasuringIntrinsics$IntrinsicWidthHeight {
    public static final /* synthetic */ MeasuringIntrinsics$IntrinsicWidthHeight[] A;
    public static final MeasuringIntrinsics$IntrinsicWidthHeight y;
    public static final MeasuringIntrinsics$IntrinsicWidthHeight z;

    static {
        MeasuringIntrinsics$IntrinsicWidthHeight measuringIntrinsics$IntrinsicWidthHeight = new MeasuringIntrinsics$IntrinsicWidthHeight("Width", 0);
        y = measuringIntrinsics$IntrinsicWidthHeight;
        MeasuringIntrinsics$IntrinsicWidthHeight measuringIntrinsics$IntrinsicWidthHeight2 = new MeasuringIntrinsics$IntrinsicWidthHeight("Height", 1);
        z = measuringIntrinsics$IntrinsicWidthHeight2;
        A = new MeasuringIntrinsics$IntrinsicWidthHeight[]{measuringIntrinsics$IntrinsicWidthHeight, measuringIntrinsics$IntrinsicWidthHeight2};
    }

    public static MeasuringIntrinsics$IntrinsicWidthHeight valueOf(String str) {
        return (MeasuringIntrinsics$IntrinsicWidthHeight) Enum.valueOf(MeasuringIntrinsics$IntrinsicWidthHeight.class, str);
    }

    public static MeasuringIntrinsics$IntrinsicWidthHeight[] values() {
        return (MeasuringIntrinsics$IntrinsicWidthHeight[]) A.clone();
    }
}
