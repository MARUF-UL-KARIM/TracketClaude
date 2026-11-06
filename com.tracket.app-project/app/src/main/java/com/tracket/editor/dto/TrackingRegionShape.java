package com.tracket.editor.dto;

import defpackage.x03;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class TrackingRegionShape {
    public static final TrackingRegionShape A;
    public static final /* synthetic */ TrackingRegionShape[] B;
    public static final /* synthetic */ x03 C;
    public static final TrackingRegionShape y;
    public static final TrackingRegionShape z;

    static {
        TrackingRegionShape trackingRegionShape = new TrackingRegionShape("CIRCLE", 0);
        y = trackingRegionShape;
        TrackingRegionShape trackingRegionShape2 = new TrackingRegionShape("RECTANGLE", 1);
        z = trackingRegionShape2;
        TrackingRegionShape trackingRegionShape3 = new TrackingRegionShape("QUAD", 2);
        A = trackingRegionShape3;
        TrackingRegionShape[] trackingRegionShapeArr = {trackingRegionShape, trackingRegionShape2, trackingRegionShape3};
        B = trackingRegionShapeArr;
        C = new x03(trackingRegionShapeArr);
    }

    public static TrackingRegionShape valueOf(String str) {
        return (TrackingRegionShape) Enum.valueOf(TrackingRegionShape.class, str);
    }

    public static TrackingRegionShape[] values() {
        return (TrackingRegionShape[]) B.clone();
    }
}
