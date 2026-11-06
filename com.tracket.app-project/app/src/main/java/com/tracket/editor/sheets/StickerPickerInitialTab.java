package com.tracket.editor.sheets;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class StickerPickerInitialTab {
    public static final /* synthetic */ StickerPickerInitialTab[] A;
    public static final StickerPickerInitialTab y;
    public static final StickerPickerInitialTab z;

    static {
        StickerPickerInitialTab stickerPickerInitialTab = new StickerPickerInitialTab("DEFAULT", 0);
        y = stickerPickerInitialTab;
        StickerPickerInitialTab stickerPickerInitialTab2 = new StickerPickerInitialTab("IMPORTED", 1);
        z = stickerPickerInitialTab2;
        A = new StickerPickerInitialTab[]{stickerPickerInitialTab, stickerPickerInitialTab2};
    }

    public static StickerPickerInitialTab valueOf(String str) {
        return (StickerPickerInitialTab) Enum.valueOf(StickerPickerInitialTab.class, str);
    }

    public static StickerPickerInitialTab[] values() {
        return (StickerPickerInitialTab[]) A.clone();
    }
}
