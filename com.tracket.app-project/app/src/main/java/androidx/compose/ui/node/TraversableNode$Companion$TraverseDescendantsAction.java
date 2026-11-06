package androidx.compose.ui.node;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class TraversableNode$Companion$TraverseDescendantsAction {
    public static final TraversableNode$Companion$TraverseDescendantsAction A;
    public static final /* synthetic */ TraversableNode$Companion$TraverseDescendantsAction[] B;
    public static final TraversableNode$Companion$TraverseDescendantsAction y;
    public static final TraversableNode$Companion$TraverseDescendantsAction z;

    static {
        TraversableNode$Companion$TraverseDescendantsAction traversableNode$Companion$TraverseDescendantsAction = new TraversableNode$Companion$TraverseDescendantsAction("ContinueTraversal", 0);
        y = traversableNode$Companion$TraverseDescendantsAction;
        TraversableNode$Companion$TraverseDescendantsAction traversableNode$Companion$TraverseDescendantsAction2 = new TraversableNode$Companion$TraverseDescendantsAction("SkipSubtreeAndContinueTraversal", 1);
        z = traversableNode$Companion$TraverseDescendantsAction2;
        TraversableNode$Companion$TraverseDescendantsAction traversableNode$Companion$TraverseDescendantsAction3 = new TraversableNode$Companion$TraverseDescendantsAction("CancelTraversal", 2);
        A = traversableNode$Companion$TraverseDescendantsAction3;
        B = new TraversableNode$Companion$TraverseDescendantsAction[]{traversableNode$Companion$TraverseDescendantsAction, traversableNode$Companion$TraverseDescendantsAction2, traversableNode$Companion$TraverseDescendantsAction3};
    }

    public static TraversableNode$Companion$TraverseDescendantsAction valueOf(String str) {
        return (TraversableNode$Companion$TraverseDescendantsAction) Enum.valueOf(TraversableNode$Companion$TraverseDescendantsAction.class, str);
    }

    public static TraversableNode$Companion$TraverseDescendantsAction[] values() {
        return (TraversableNode$Companion$TraverseDescendantsAction[]) B.clone();
    }
}
