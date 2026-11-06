package com.airbnb.lottie.model.content;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class ShapeStroke$LineJoinType {
    public static final ShapeStroke$LineJoinType y;
    public static final /* synthetic */ ShapeStroke$LineJoinType[] z;

    static {
        ShapeStroke$LineJoinType shapeStroke$LineJoinType = new ShapeStroke$LineJoinType("MITER", 0);
        y = shapeStroke$LineJoinType;
        z = new ShapeStroke$LineJoinType[]{shapeStroke$LineJoinType, new ShapeStroke$LineJoinType("ROUND", 1), new ShapeStroke$LineJoinType("BEVEL", 2)};
    }

    public static ShapeStroke$LineJoinType valueOf(String str) {
        return (ShapeStroke$LineJoinType) Enum.valueOf(ShapeStroke$LineJoinType.class, str);
    }

    public static ShapeStroke$LineJoinType[] values() {
        return (ShapeStroke$LineJoinType[]) z.clone();
    }
}
