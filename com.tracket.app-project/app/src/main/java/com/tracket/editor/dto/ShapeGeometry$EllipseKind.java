package com.tracket.editor.dto;

import defpackage.x03;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class ShapeGeometry$EllipseKind {
    public static final /* synthetic */ ShapeGeometry$EllipseKind[] A;
    public static final /* synthetic */ x03 B;
    public static final ShapeGeometry$EllipseKind y;
    public static final ShapeGeometry$EllipseKind z;

    static {
        ShapeGeometry$EllipseKind shapeGeometry$EllipseKind = new ShapeGeometry$EllipseKind("ELLIPSE", 0);
        y = shapeGeometry$EllipseKind;
        ShapeGeometry$EllipseKind shapeGeometry$EllipseKind2 = new ShapeGeometry$EllipseKind("CIRCLE", 1);
        z = shapeGeometry$EllipseKind2;
        ShapeGeometry$EllipseKind[] shapeGeometry$EllipseKindArr = {shapeGeometry$EllipseKind, shapeGeometry$EllipseKind2};
        A = shapeGeometry$EllipseKindArr;
        B = new x03(shapeGeometry$EllipseKindArr);
    }

    public static ShapeGeometry$EllipseKind valueOf(String str) {
        return (ShapeGeometry$EllipseKind) Enum.valueOf(ShapeGeometry$EllipseKind.class, str);
    }

    public static ShapeGeometry$EllipseKind[] values() {
        return (ShapeGeometry$EllipseKind[]) A.clone();
    }
}
