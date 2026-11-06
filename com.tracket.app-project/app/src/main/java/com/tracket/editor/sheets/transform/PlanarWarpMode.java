package com.tracket.editor.sheets.transform;

import defpackage.x03;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class PlanarWarpMode {
    public static final /* synthetic */ PlanarWarpMode[] A;
    public static final /* synthetic */ x03 B;
    public static final PlanarWarpMode y;
    public static final PlanarWarpMode z;

    static {
        PlanarWarpMode planarWarpMode = new PlanarWarpMode("AFFINE", 0);
        y = planarWarpMode;
        PlanarWarpMode planarWarpMode2 = new PlanarWarpMode("PERSPECTIVE", 1);
        z = planarWarpMode2;
        PlanarWarpMode[] planarWarpModeArr = {planarWarpMode, planarWarpMode2};
        A = planarWarpModeArr;
        B = new x03(planarWarpModeArr);
    }

    public static PlanarWarpMode valueOf(String str) {
        return (PlanarWarpMode) Enum.valueOf(PlanarWarpMode.class, str);
    }

    public static PlanarWarpMode[] values() {
        return (PlanarWarpMode[]) A.clone();
    }
}
