package com.tracket.ui.modifiers;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class HorizontalFadeEdgePlacement {
    public static final HorizontalFadeEdgePlacement A;
    public static final /* synthetic */ HorizontalFadeEdgePlacement[] B;
    public static final HorizontalFadeEdgePlacement y;
    public static final HorizontalFadeEdgePlacement z;

    static {
        HorizontalFadeEdgePlacement horizontalFadeEdgePlacement = new HorizontalFadeEdgePlacement("Start", 0);
        y = horizontalFadeEdgePlacement;
        HorizontalFadeEdgePlacement horizontalFadeEdgePlacement2 = new HorizontalFadeEdgePlacement("End", 1);
        z = horizontalFadeEdgePlacement2;
        HorizontalFadeEdgePlacement horizontalFadeEdgePlacement3 = new HorizontalFadeEdgePlacement("Both", 2);
        A = horizontalFadeEdgePlacement3;
        B = new HorizontalFadeEdgePlacement[]{horizontalFadeEdgePlacement, horizontalFadeEdgePlacement2, horizontalFadeEdgePlacement3};
    }

    public static HorizontalFadeEdgePlacement valueOf(String str) {
        return (HorizontalFadeEdgePlacement) Enum.valueOf(HorizontalFadeEdgePlacement.class, str);
    }

    public static HorizontalFadeEdgePlacement[] values() {
        return (HorizontalFadeEdgePlacement[]) B.clone();
    }
}
