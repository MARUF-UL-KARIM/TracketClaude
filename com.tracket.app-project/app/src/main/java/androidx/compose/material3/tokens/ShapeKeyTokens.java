package androidx.compose.material3.tokens;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class ShapeKeyTokens {
    public static final ShapeKeyTokens A;
    public static final ShapeKeyTokens B;
    public static final ShapeKeyTokens C;
    public static final /* synthetic */ ShapeKeyTokens[] D;
    public static final ShapeKeyTokens y;
    public static final ShapeKeyTokens z;

    /* JADX INFO: Fake field, exist only in values array */
    ShapeKeyTokens EF0;

    static {
        ShapeKeyTokens shapeKeyTokens = new ShapeKeyTokens("CornerExtraExtraLarge", 0);
        ShapeKeyTokens shapeKeyTokens2 = new ShapeKeyTokens("CornerExtraLarge", 1);
        y = shapeKeyTokens2;
        ShapeKeyTokens shapeKeyTokens3 = new ShapeKeyTokens("CornerExtraLargeIncreased", 2);
        ShapeKeyTokens shapeKeyTokens4 = new ShapeKeyTokens("CornerExtraLargeTop", 3);
        z = shapeKeyTokens4;
        ShapeKeyTokens shapeKeyTokens5 = new ShapeKeyTokens("CornerExtraSmall", 4);
        A = shapeKeyTokens5;
        ShapeKeyTokens shapeKeyTokens6 = new ShapeKeyTokens("CornerExtraSmallTop", 5);
        ShapeKeyTokens shapeKeyTokens7 = new ShapeKeyTokens("CornerFull", 6);
        B = shapeKeyTokens7;
        ShapeKeyTokens shapeKeyTokens8 = new ShapeKeyTokens("CornerLarge", 7);
        ShapeKeyTokens shapeKeyTokens9 = new ShapeKeyTokens("CornerLargeEnd", 8);
        ShapeKeyTokens shapeKeyTokens10 = new ShapeKeyTokens("CornerLargeIncreased", 9);
        ShapeKeyTokens shapeKeyTokens11 = new ShapeKeyTokens("CornerLargeStart", 10);
        ShapeKeyTokens shapeKeyTokens12 = new ShapeKeyTokens("CornerLargeTop", 11);
        ShapeKeyTokens shapeKeyTokens13 = new ShapeKeyTokens("CornerMedium", 12);
        C = shapeKeyTokens13;
        D = new ShapeKeyTokens[]{shapeKeyTokens, shapeKeyTokens2, shapeKeyTokens3, shapeKeyTokens4, shapeKeyTokens5, shapeKeyTokens6, shapeKeyTokens7, shapeKeyTokens8, shapeKeyTokens9, shapeKeyTokens10, shapeKeyTokens11, shapeKeyTokens12, shapeKeyTokens13, new ShapeKeyTokens("CornerNone", 13), new ShapeKeyTokens("CornerSmall", 14)};
    }

    public static ShapeKeyTokens valueOf(String str) {
        return (ShapeKeyTokens) Enum.valueOf(ShapeKeyTokens.class, str);
    }

    public static ShapeKeyTokens[] values() {
        return (ShapeKeyTokens[]) D.clone();
    }
}
