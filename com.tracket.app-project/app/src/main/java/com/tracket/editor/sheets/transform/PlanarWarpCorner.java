package com.tracket.editor.sheets.transform;

import defpackage.x03;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class PlanarWarpCorner {
    public static final PlanarWarpCorner A;
    public static final PlanarWarpCorner B;
    public static final /* synthetic */ PlanarWarpCorner[] C;
    public static final /* synthetic */ x03 D;
    public static final PlanarWarpCorner y;
    public static final PlanarWarpCorner z;

    static {
        PlanarWarpCorner planarWarpCorner = new PlanarWarpCorner("TOP_LEFT", 0);
        y = planarWarpCorner;
        PlanarWarpCorner planarWarpCorner2 = new PlanarWarpCorner("TOP_RIGHT", 1);
        z = planarWarpCorner2;
        PlanarWarpCorner planarWarpCorner3 = new PlanarWarpCorner("BOTTOM_RIGHT", 2);
        A = planarWarpCorner3;
        PlanarWarpCorner planarWarpCorner4 = new PlanarWarpCorner("BOTTOM_LEFT", 3);
        B = planarWarpCorner4;
        PlanarWarpCorner[] planarWarpCornerArr = {planarWarpCorner, planarWarpCorner2, planarWarpCorner3, planarWarpCorner4};
        C = planarWarpCornerArr;
        D = new x03(planarWarpCornerArr);
    }

    public static PlanarWarpCorner valueOf(String str) {
        return (PlanarWarpCorner) Enum.valueOf(PlanarWarpCorner.class, str);
    }

    public static PlanarWarpCorner[] values() {
        return (PlanarWarpCorner[]) C.clone();
    }
}
