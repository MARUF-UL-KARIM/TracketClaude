package com.tracket.editor.sheets;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class BottomSheetTimelineMode {
    public static final /* synthetic */ BottomSheetTimelineMode[] A;
    public static final BottomSheetTimelineMode y;
    public static final BottomSheetTimelineMode z;

    static {
        BottomSheetTimelineMode bottomSheetTimelineMode = new BottomSheetTimelineMode("FOCUSED", 0);
        y = bottomSheetTimelineMode;
        BottomSheetTimelineMode bottomSheetTimelineMode2 = new BottomSheetTimelineMode("DOCKED", 1);
        z = bottomSheetTimelineMode2;
        A = new BottomSheetTimelineMode[]{bottomSheetTimelineMode, bottomSheetTimelineMode2};
    }

    public static BottomSheetTimelineMode valueOf(String str) {
        return (BottomSheetTimelineMode) Enum.valueOf(BottomSheetTimelineMode.class, str);
    }

    public static BottomSheetTimelineMode[] values() {
        return (BottomSheetTimelineMode[]) A.clone();
    }
}
