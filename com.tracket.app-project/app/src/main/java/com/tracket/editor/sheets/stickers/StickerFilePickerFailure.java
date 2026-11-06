package com.tracket.editor.sheets.stickers;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class StickerFilePickerFailure {
    public static final /* synthetic */ StickerFilePickerFailure[] A;
    public static final StickerFilePickerFailure y;
    public static final StickerFilePickerFailure z;

    static {
        StickerFilePickerFailure stickerFilePickerFailure = new StickerFilePickerFailure("FILE_TOO_LARGE", 0);
        y = stickerFilePickerFailure;
        StickerFilePickerFailure stickerFilePickerFailure2 = new StickerFilePickerFailure("READ_FAILED", 1);
        z = stickerFilePickerFailure2;
        A = new StickerFilePickerFailure[]{stickerFilePickerFailure, stickerFilePickerFailure2};
    }

    public static StickerFilePickerFailure valueOf(String str) {
        return (StickerFilePickerFailure) Enum.valueOf(StickerFilePickerFailure.class, str);
    }

    public static StickerFilePickerFailure[] values() {
        return (StickerFilePickerFailure[]) A.clone();
    }
}
