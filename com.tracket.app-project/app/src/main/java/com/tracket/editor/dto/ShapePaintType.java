package com.tracket.editor.dto;

import defpackage.x03;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class ShapePaintType {
    public static final ShapePaintType A;
    public static final ShapePaintType B;
    public static final ShapePaintType C;
    public static final /* synthetic */ ShapePaintType[] D;
    public static final /* synthetic */ x03 E;
    public static final ShapePaintType y;
    public static final ShapePaintType z;

    static {
        ShapePaintType shapePaintType = new ShapePaintType("NONE", 0);
        y = shapePaintType;
        ShapePaintType shapePaintType2 = new ShapePaintType("SOLID", 1);
        z = shapePaintType2;
        ShapePaintType shapePaintType3 = new ShapePaintType("LINEAR", 2);
        ShapePaintType shapePaintType4 = new ShapePaintType("RADIAL", 3);
        A = shapePaintType4;
        ShapePaintType shapePaintType5 = new ShapePaintType("ANGULAR", 4);
        B = shapePaintType5;
        ShapePaintType shapePaintType6 = new ShapePaintType("DIAMOND", 5);
        C = shapePaintType6;
        ShapePaintType[] shapePaintTypeArr = {shapePaintType, shapePaintType2, shapePaintType3, shapePaintType4, shapePaintType5, shapePaintType6};
        D = shapePaintTypeArr;
        E = new x03(shapePaintTypeArr);
    }

    public static ShapePaintType valueOf(String str) {
        return (ShapePaintType) Enum.valueOf(ShapePaintType.class, str);
    }

    public static ShapePaintType[] values() {
        return (ShapePaintType[]) D.clone();
    }
}
