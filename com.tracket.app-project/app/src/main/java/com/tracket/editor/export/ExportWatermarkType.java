package com.tracket.editor.export;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class ExportWatermarkType {
    public static final /* synthetic */ ExportWatermarkType[] A;
    public static final ExportWatermarkType y;
    public static final ExportWatermarkType z;

    static {
        ExportWatermarkType exportWatermarkType = new ExportWatermarkType("CORNER", 0);
        y = exportWatermarkType;
        ExportWatermarkType exportWatermarkType2 = new ExportWatermarkType("EDGE", 1);
        z = exportWatermarkType2;
        A = new ExportWatermarkType[]{exportWatermarkType, exportWatermarkType2};
    }

    public static ExportWatermarkType valueOf(String str) {
        return (ExportWatermarkType) Enum.valueOf(ExportWatermarkType.class, str);
    }

    public static ExportWatermarkType[] values() {
        return (ExportWatermarkType[]) A.clone();
    }
}
