package androidx.compose.ui.node;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class LayoutNode$UsageByParent {
    public static final LayoutNode$UsageByParent A;
    public static final /* synthetic */ LayoutNode$UsageByParent[] B;
    public static final LayoutNode$UsageByParent y;
    public static final LayoutNode$UsageByParent z;

    static {
        LayoutNode$UsageByParent layoutNode$UsageByParent = new LayoutNode$UsageByParent("InMeasureBlock", 0);
        y = layoutNode$UsageByParent;
        LayoutNode$UsageByParent layoutNode$UsageByParent2 = new LayoutNode$UsageByParent("InLayoutBlock", 1);
        z = layoutNode$UsageByParent2;
        LayoutNode$UsageByParent layoutNode$UsageByParent3 = new LayoutNode$UsageByParent("NotUsed", 2);
        A = layoutNode$UsageByParent3;
        B = new LayoutNode$UsageByParent[]{layoutNode$UsageByParent, layoutNode$UsageByParent2, layoutNode$UsageByParent3};
    }

    public static LayoutNode$UsageByParent valueOf(String str) {
        return (LayoutNode$UsageByParent) Enum.valueOf(LayoutNode$UsageByParent.class, str);
    }

    public static LayoutNode$UsageByParent[] values() {
        return (LayoutNode$UsageByParent[]) B.clone();
    }
}
