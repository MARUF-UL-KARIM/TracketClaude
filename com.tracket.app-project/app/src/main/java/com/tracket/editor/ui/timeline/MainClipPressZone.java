package com.tracket.editor.ui.timeline;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class MainClipPressZone {
    public static final MainClipPressZone A;
    public static final /* synthetic */ MainClipPressZone[] B;
    public static final MainClipPressZone y;
    public static final MainClipPressZone z;

    static {
        MainClipPressZone mainClipPressZone = new MainClipPressZone("TRIM_START", 0);
        y = mainClipPressZone;
        MainClipPressZone mainClipPressZone2 = new MainClipPressZone("TRIM_END", 1);
        z = mainClipPressZone2;
        MainClipPressZone mainClipPressZone3 = new MainClipPressZone("REORDER", 2);
        A = mainClipPressZone3;
        B = new MainClipPressZone[]{mainClipPressZone, mainClipPressZone2, mainClipPressZone3};
    }

    public static MainClipPressZone valueOf(String str) {
        return (MainClipPressZone) Enum.valueOf(MainClipPressZone.class, str);
    }

    public static MainClipPressZone[] values() {
        return (MainClipPressZone[]) B.clone();
    }
}
