package com.tracket.editor.export;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
final class ExportCancelSource {
    public static final /* synthetic */ ExportCancelSource[] A;
    public static final ExportCancelSource y;
    public static final ExportCancelSource z;

    static {
        ExportCancelSource exportCancelSource = new ExportCancelSource("USER", 0);
        y = exportCancelSource;
        ExportCancelSource exportCancelSource2 = new ExportCancelSource("LIFECYCLE_PAUSE", 1);
        z = exportCancelSource2;
        A = new ExportCancelSource[]{exportCancelSource, exportCancelSource2};
    }

    public static ExportCancelSource valueOf(String str) {
        return (ExportCancelSource) Enum.valueOf(ExportCancelSource.class, str);
    }

    public static ExportCancelSource[] values() {
        return (ExportCancelSource[]) A.clone();
    }
}
