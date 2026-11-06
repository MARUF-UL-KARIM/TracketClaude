package com.airbnb.lottie.model.layer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class Layer$LayerType {
    public static final Layer$LayerType A;
    public static final /* synthetic */ Layer$LayerType[] B;
    public static final Layer$LayerType y;
    public static final Layer$LayerType z;

    static {
        Layer$LayerType layer$LayerType = new Layer$LayerType("PRE_COMP", 0);
        y = layer$LayerType;
        Layer$LayerType layer$LayerType2 = new Layer$LayerType("SOLID", 1);
        Layer$LayerType layer$LayerType3 = new Layer$LayerType("IMAGE", 2);
        z = layer$LayerType3;
        Layer$LayerType layer$LayerType4 = new Layer$LayerType("NULL", 3);
        Layer$LayerType layer$LayerType5 = new Layer$LayerType("SHAPE", 4);
        Layer$LayerType layer$LayerType6 = new Layer$LayerType("TEXT", 5);
        Layer$LayerType layer$LayerType7 = new Layer$LayerType("UNKNOWN", 6);
        A = layer$LayerType7;
        B = new Layer$LayerType[]{layer$LayerType, layer$LayerType2, layer$LayerType3, layer$LayerType4, layer$LayerType5, layer$LayerType6, layer$LayerType7};
    }

    public static Layer$LayerType valueOf(String str) {
        return (Layer$LayerType) Enum.valueOf(Layer$LayerType.class, str);
    }

    public static Layer$LayerType[] values() {
        return (Layer$LayerType[]) B.clone();
    }
}
