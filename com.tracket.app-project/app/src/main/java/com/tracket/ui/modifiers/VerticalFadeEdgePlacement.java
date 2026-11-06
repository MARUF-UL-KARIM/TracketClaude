package com.tracket.ui.modifiers;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class VerticalFadeEdgePlacement {
    public static final VerticalFadeEdgePlacement A;
    public static final /* synthetic */ VerticalFadeEdgePlacement[] B;
    public static final VerticalFadeEdgePlacement y;
    public static final VerticalFadeEdgePlacement z;

    static {
        VerticalFadeEdgePlacement verticalFadeEdgePlacement = new VerticalFadeEdgePlacement("Top", 0);
        y = verticalFadeEdgePlacement;
        VerticalFadeEdgePlacement verticalFadeEdgePlacement2 = new VerticalFadeEdgePlacement("Bottom", 1);
        z = verticalFadeEdgePlacement2;
        VerticalFadeEdgePlacement verticalFadeEdgePlacement3 = new VerticalFadeEdgePlacement("Both", 2);
        A = verticalFadeEdgePlacement3;
        B = new VerticalFadeEdgePlacement[]{verticalFadeEdgePlacement, verticalFadeEdgePlacement2, verticalFadeEdgePlacement3};
    }

    public static VerticalFadeEdgePlacement valueOf(String str) {
        return (VerticalFadeEdgePlacement) Enum.valueOf(VerticalFadeEdgePlacement.class, str);
    }

    public static VerticalFadeEdgePlacement[] values() {
        return (VerticalFadeEdgePlacement[]) B.clone();
    }
}
