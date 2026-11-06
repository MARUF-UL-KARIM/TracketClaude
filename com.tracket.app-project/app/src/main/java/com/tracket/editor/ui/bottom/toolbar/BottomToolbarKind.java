package com.tracket.editor.ui.bottom.toolbar;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
final class BottomToolbarKind {
    public static final BottomToolbarKind A;
    public static final BottomToolbarKind B;
    public static final BottomToolbarKind C;
    public static final BottomToolbarKind D;
    public static final BottomToolbarKind E;
    public static final /* synthetic */ BottomToolbarKind[] F;
    public static final BottomToolbarKind y;
    public static final BottomToolbarKind z;

    static {
        BottomToolbarKind bottomToolbarKind = new BottomToolbarKind("MAIN_CLIP", 0);
        y = bottomToolbarKind;
        BottomToolbarKind bottomToolbarKind2 = new BottomToolbarKind("OVERLAY", 1);
        z = bottomToolbarKind2;
        BottomToolbarKind bottomToolbarKind3 = new BottomToolbarKind("AUDIO", 2);
        A = bottomToolbarKind3;
        BottomToolbarKind bottomToolbarKind4 = new BottomToolbarKind("TRACKING", 3);
        B = bottomToolbarKind4;
        BottomToolbarKind bottomToolbarKind5 = new BottomToolbarKind("CUTOUT", 4);
        C = bottomToolbarKind5;
        BottomToolbarKind bottomToolbarKind6 = new BottomToolbarKind("STABILIZER", 5);
        D = bottomToolbarKind6;
        BottomToolbarKind bottomToolbarKind7 = new BottomToolbarKind("DEPTH", 6);
        E = bottomToolbarKind7;
        F = new BottomToolbarKind[]{bottomToolbarKind, bottomToolbarKind2, bottomToolbarKind3, bottomToolbarKind4, bottomToolbarKind5, bottomToolbarKind6, bottomToolbarKind7};
    }

    public static BottomToolbarKind valueOf(String str) {
        return (BottomToolbarKind) Enum.valueOf(BottomToolbarKind.class, str);
    }

    public static BottomToolbarKind[] values() {
        return (BottomToolbarKind[]) F.clone();
    }
}
