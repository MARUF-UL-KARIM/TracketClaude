package androidx.compose.ui.node;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
final class NodeMeasuringIntrinsics$IntrinsicWidthHeight {
    public static final /* synthetic */ NodeMeasuringIntrinsics$IntrinsicWidthHeight[] A;
    public static final NodeMeasuringIntrinsics$IntrinsicWidthHeight y;
    public static final NodeMeasuringIntrinsics$IntrinsicWidthHeight z;

    static {
        NodeMeasuringIntrinsics$IntrinsicWidthHeight nodeMeasuringIntrinsics$IntrinsicWidthHeight = new NodeMeasuringIntrinsics$IntrinsicWidthHeight("Width", 0);
        y = nodeMeasuringIntrinsics$IntrinsicWidthHeight;
        NodeMeasuringIntrinsics$IntrinsicWidthHeight nodeMeasuringIntrinsics$IntrinsicWidthHeight2 = new NodeMeasuringIntrinsics$IntrinsicWidthHeight("Height", 1);
        z = nodeMeasuringIntrinsics$IntrinsicWidthHeight2;
        A = new NodeMeasuringIntrinsics$IntrinsicWidthHeight[]{nodeMeasuringIntrinsics$IntrinsicWidthHeight, nodeMeasuringIntrinsics$IntrinsicWidthHeight2};
    }

    public static NodeMeasuringIntrinsics$IntrinsicWidthHeight valueOf(String str) {
        return (NodeMeasuringIntrinsics$IntrinsicWidthHeight) Enum.valueOf(NodeMeasuringIntrinsics$IntrinsicWidthHeight.class, str);
    }

    public static NodeMeasuringIntrinsics$IntrinsicWidthHeight[] values() {
        return (NodeMeasuringIntrinsics$IntrinsicWidthHeight[]) A.clone();
    }
}
