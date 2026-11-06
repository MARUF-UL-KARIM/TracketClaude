package androidx.compose.ui.layout;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
final class MeasuringIntrinsics$IntrinsicMinMax {
    public static final /* synthetic */ MeasuringIntrinsics$IntrinsicMinMax[] A;
    public static final MeasuringIntrinsics$IntrinsicMinMax y;
    public static final MeasuringIntrinsics$IntrinsicMinMax z;

    static {
        MeasuringIntrinsics$IntrinsicMinMax measuringIntrinsics$IntrinsicMinMax = new MeasuringIntrinsics$IntrinsicMinMax("Min", 0);
        y = measuringIntrinsics$IntrinsicMinMax;
        MeasuringIntrinsics$IntrinsicMinMax measuringIntrinsics$IntrinsicMinMax2 = new MeasuringIntrinsics$IntrinsicMinMax("Max", 1);
        z = measuringIntrinsics$IntrinsicMinMax2;
        A = new MeasuringIntrinsics$IntrinsicMinMax[]{measuringIntrinsics$IntrinsicMinMax, measuringIntrinsics$IntrinsicMinMax2};
    }

    public static MeasuringIntrinsics$IntrinsicMinMax valueOf(String str) {
        return (MeasuringIntrinsics$IntrinsicMinMax) Enum.valueOf(MeasuringIntrinsics$IntrinsicMinMax.class, str);
    }

    public static MeasuringIntrinsics$IntrinsicMinMax[] values() {
        return (MeasuringIntrinsics$IntrinsicMinMax[]) A.clone();
    }
}
