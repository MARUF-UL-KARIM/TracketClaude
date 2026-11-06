package com.tracket.editor.dto;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class StabilizationEdgeFill {
    public static final StabilizationEdgeFill A;
    public static final /* synthetic */ StabilizationEdgeFill[] B;
    public static final StabilizationEdgeFill y;
    public static final StabilizationEdgeFill z;

    static {
        StabilizationEdgeFill stabilizationEdgeFill = new StabilizationEdgeFill("BLACK", 0);
        y = stabilizationEdgeFill;
        StabilizationEdgeFill stabilizationEdgeFill2 = new StabilizationEdgeFill("CLAMP", 1);
        z = stabilizationEdgeFill2;
        StabilizationEdgeFill stabilizationEdgeFill3 = new StabilizationEdgeFill("MIRROR", 2);
        A = stabilizationEdgeFill3;
        B = new StabilizationEdgeFill[]{stabilizationEdgeFill, stabilizationEdgeFill2, stabilizationEdgeFill3};
    }

    public static StabilizationEdgeFill valueOf(String str) {
        return (StabilizationEdgeFill) Enum.valueOf(StabilizationEdgeFill.class, str);
    }

    public static StabilizationEdgeFill[] values() {
        return (StabilizationEdgeFill[]) B.clone();
    }
}
