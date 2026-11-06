package com.tracket.editor.dto;

import defpackage.x03;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class ShapeGeometry$RectKind {
    public static final ShapeGeometry$RectKind A;
    public static final ShapeGeometry$RectKind B;
    public static final /* synthetic */ ShapeGeometry$RectKind[] C;
    public static final /* synthetic */ x03 D;
    public static final ShapeGeometry$RectKind y;
    public static final ShapeGeometry$RectKind z;

    static {
        ShapeGeometry$RectKind shapeGeometry$RectKind = new ShapeGeometry$RectKind("RECTANGLE", 0);
        y = shapeGeometry$RectKind;
        ShapeGeometry$RectKind shapeGeometry$RectKind2 = new ShapeGeometry$RectKind("SQUARE", 1);
        z = shapeGeometry$RectKind2;
        ShapeGeometry$RectKind shapeGeometry$RectKind3 = new ShapeGeometry$RectKind("SQUIRCLE", 2);
        A = shapeGeometry$RectKind3;
        ShapeGeometry$RectKind shapeGeometry$RectKind4 = new ShapeGeometry$RectKind("CAPSULE", 3);
        B = shapeGeometry$RectKind4;
        ShapeGeometry$RectKind[] shapeGeometry$RectKindArr = {shapeGeometry$RectKind, shapeGeometry$RectKind2, shapeGeometry$RectKind3, shapeGeometry$RectKind4};
        C = shapeGeometry$RectKindArr;
        D = new x03(shapeGeometry$RectKindArr);
    }

    public static ShapeGeometry$RectKind valueOf(String str) {
        return (ShapeGeometry$RectKind) Enum.valueOf(ShapeGeometry$RectKind.class, str);
    }

    public static ShapeGeometry$RectKind[] values() {
        return (ShapeGeometry$RectKind[]) C.clone();
    }
}
