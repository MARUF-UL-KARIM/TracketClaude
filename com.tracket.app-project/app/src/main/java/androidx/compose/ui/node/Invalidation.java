package androidx.compose.ui.node;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class Invalidation {
    public static final Invalidation A;
    public static final Invalidation B;
    public static final /* synthetic */ Invalidation[] C;
    public static final Invalidation y;
    public static final Invalidation z;

    static {
        Invalidation invalidation = new Invalidation("LookaheadMeasurement", 0);
        y = invalidation;
        Invalidation invalidation2 = new Invalidation("LookaheadPlacement", 1);
        z = invalidation2;
        Invalidation invalidation3 = new Invalidation("Measurement", 2);
        A = invalidation3;
        Invalidation invalidation4 = new Invalidation("Placement", 3);
        B = invalidation4;
        C = new Invalidation[]{invalidation, invalidation2, invalidation3, invalidation4};
    }

    public static Invalidation valueOf(String str) {
        return (Invalidation) Enum.valueOf(Invalidation.class, str);
    }

    public static Invalidation[] values() {
        return (Invalidation[]) C.clone();
    }
}
