package com.airbnb.lottie.model.content;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class ShapeTrimPath$Type {
    public static final /* synthetic */ ShapeTrimPath$Type[] A;
    public static final ShapeTrimPath$Type y;
    public static final ShapeTrimPath$Type z;

    static {
        ShapeTrimPath$Type shapeTrimPath$Type = new ShapeTrimPath$Type("SIMULTANEOUSLY", 0);
        y = shapeTrimPath$Type;
        ShapeTrimPath$Type shapeTrimPath$Type2 = new ShapeTrimPath$Type("INDIVIDUALLY", 1);
        z = shapeTrimPath$Type2;
        A = new ShapeTrimPath$Type[]{shapeTrimPath$Type, shapeTrimPath$Type2};
    }

    public static ShapeTrimPath$Type valueOf(String str) {
        return (ShapeTrimPath$Type) Enum.valueOf(ShapeTrimPath$Type.class, str);
    }

    public static ShapeTrimPath$Type[] values() {
        return (ShapeTrimPath$Type[]) A.clone();
    }
}
