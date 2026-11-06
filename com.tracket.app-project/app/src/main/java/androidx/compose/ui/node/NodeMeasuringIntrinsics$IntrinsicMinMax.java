package androidx.compose.ui.node;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
final class NodeMeasuringIntrinsics$IntrinsicMinMax {
    public static final /* synthetic */ NodeMeasuringIntrinsics$IntrinsicMinMax[] A;
    public static final NodeMeasuringIntrinsics$IntrinsicMinMax y;
    public static final NodeMeasuringIntrinsics$IntrinsicMinMax z;

    static {
        NodeMeasuringIntrinsics$IntrinsicMinMax nodeMeasuringIntrinsics$IntrinsicMinMax = new NodeMeasuringIntrinsics$IntrinsicMinMax("Min", 0);
        y = nodeMeasuringIntrinsics$IntrinsicMinMax;
        NodeMeasuringIntrinsics$IntrinsicMinMax nodeMeasuringIntrinsics$IntrinsicMinMax2 = new NodeMeasuringIntrinsics$IntrinsicMinMax("Max", 1);
        z = nodeMeasuringIntrinsics$IntrinsicMinMax2;
        A = new NodeMeasuringIntrinsics$IntrinsicMinMax[]{nodeMeasuringIntrinsics$IntrinsicMinMax, nodeMeasuringIntrinsics$IntrinsicMinMax2};
    }

    public static NodeMeasuringIntrinsics$IntrinsicMinMax valueOf(String str) {
        return (NodeMeasuringIntrinsics$IntrinsicMinMax) Enum.valueOf(NodeMeasuringIntrinsics$IntrinsicMinMax.class, str);
    }

    public static NodeMeasuringIntrinsics$IntrinsicMinMax[] values() {
        return (NodeMeasuringIntrinsics$IntrinsicMinMax[]) A.clone();
    }
}
