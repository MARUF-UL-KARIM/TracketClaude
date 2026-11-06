package com.tracket.editor.sheets.transform;

import defpackage.x03;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class PlanarWarpEdge {
    public static final /* synthetic */ PlanarWarpEdge[] y;
    public static final /* synthetic */ x03 z;

    /* JADX INFO: Fake field, exist only in values array */
    PlanarWarpEdge EF5;

    static {
        PlanarWarpEdge[] planarWarpEdgeArr = {new PlanarWarpEdge("TOP", 0), new PlanarWarpEdge("RIGHT", 1), new PlanarWarpEdge("BOTTOM", 2), new PlanarWarpEdge("LEFT", 3)};
        y = planarWarpEdgeArr;
        z = new x03(planarWarpEdgeArr);
    }

    public static PlanarWarpEdge valueOf(String str) {
        return (PlanarWarpEdge) Enum.valueOf(PlanarWarpEdge.class, str);
    }

    public static PlanarWarpEdge[] values() {
        return (PlanarWarpEdge[]) y.clone();
    }
}
