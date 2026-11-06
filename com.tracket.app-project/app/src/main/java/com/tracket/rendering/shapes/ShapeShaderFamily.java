package com.tracket.rendering.shapes;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public enum ShapeShaderFamily {
    BASIC("SHAPE_FAMILY_BASIC"),
    POLYGON("SHAPE_FAMILY_POLYGON"),
    SYMBOL("SHAPE_FAMILY_SYMBOL"),
    ARROW("SHAPE_FAMILY_ARROW"),
    RADIAL("SHAPE_FAMILY_RADIAL"),
    ORGANIC("SHAPE_FAMILY_ORGANIC");

    public final String y;

    ShapeShaderFamily(String str) {
        this.y = str;
    }
}
