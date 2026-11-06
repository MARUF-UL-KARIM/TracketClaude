package com.airbnb.lottie.model.layer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class Layer$MatteType {
    public static final /* synthetic */ Layer$MatteType[] A;
    public static final Layer$MatteType y;
    public static final Layer$MatteType z;

    static {
        Layer$MatteType layer$MatteType = new Layer$MatteType("NONE", 0);
        y = layer$MatteType;
        Layer$MatteType layer$MatteType2 = new Layer$MatteType("ADD", 1);
        Layer$MatteType layer$MatteType3 = new Layer$MatteType("INVERT", 2);
        z = layer$MatteType3;
        A = new Layer$MatteType[]{layer$MatteType, layer$MatteType2, layer$MatteType3, new Layer$MatteType("LUMA", 3), new Layer$MatteType("LUMA_INVERTED", 4), new Layer$MatteType("UNKNOWN", 5)};
    }

    public static Layer$MatteType valueOf(String str) {
        return (Layer$MatteType) Enum.valueOf(Layer$MatteType.class, str);
    }

    public static Layer$MatteType[] values() {
        return (Layer$MatteType[]) A.clone();
    }
}
