package com.tracket.editor.dto;

import defpackage.x03;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class DepthPalette {
    public static final /* synthetic */ x03 A;
    public static final DepthPalette y;
    public static final /* synthetic */ DepthPalette[] z;

    static {
        DepthPalette depthPalette = new DepthPalette("TURBO", 0);
        y = depthPalette;
        DepthPalette[] depthPaletteArr = {depthPalette, new DepthPalette("VIRIDIS", 1), new DepthPalette("INFERNO", 2)};
        z = depthPaletteArr;
        A = new x03(depthPaletteArr);
    }

    public static DepthPalette valueOf(String str) {
        return (DepthPalette) Enum.valueOf(DepthPalette.class, str);
    }

    public static DepthPalette[] values() {
        return (DepthPalette[]) z.clone();
    }
}
