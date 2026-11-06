package com.airbnb.lottie.model.content;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class ShapeStroke$LineCapType {
    public static final ShapeStroke$LineCapType y;
    public static final /* synthetic */ ShapeStroke$LineCapType[] z;

    static {
        ShapeStroke$LineCapType shapeStroke$LineCapType = new ShapeStroke$LineCapType("BUTT", 0);
        y = shapeStroke$LineCapType;
        z = new ShapeStroke$LineCapType[]{shapeStroke$LineCapType, new ShapeStroke$LineCapType("ROUND", 1), new ShapeStroke$LineCapType("UNKNOWN", 2)};
    }

    public static ShapeStroke$LineCapType valueOf(String str) {
        return (ShapeStroke$LineCapType) Enum.valueOf(ShapeStroke$LineCapType.class, str);
    }

    public static ShapeStroke$LineCapType[] values() {
        return (ShapeStroke$LineCapType[]) z.clone();
    }
}
