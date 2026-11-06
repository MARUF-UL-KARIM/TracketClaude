package com.tracket.editor.export;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class ExportPersistenceStage {
    public static final ExportPersistenceStage A;
    public static final ExportPersistenceStage B;
    public static final ExportPersistenceStage C;
    public static final ExportPersistenceStage D;
    public static final /* synthetic */ ExportPersistenceStage[] E;
    public static final ExportPersistenceStage y;
    public static final ExportPersistenceStage z;

    static {
        ExportPersistenceStage exportPersistenceStage = new ExportPersistenceStage("TEMP_SOURCE", 0);
        y = exportPersistenceStage;
        ExportPersistenceStage exportPersistenceStage2 = new ExportPersistenceStage("MEDIA_STORE_INSERT", 1);
        z = exportPersistenceStage2;
        ExportPersistenceStage exportPersistenceStage3 = new ExportPersistenceStage("DESTINATION_OPEN", 2);
        A = exportPersistenceStage3;
        ExportPersistenceStage exportPersistenceStage4 = new ExportPersistenceStage("DESTINATION_PREPARE", 3);
        ExportPersistenceStage exportPersistenceStage5 = new ExportPersistenceStage("PHOTO_LIBRARY", 4);
        B = exportPersistenceStage5;
        ExportPersistenceStage exportPersistenceStage6 = new ExportPersistenceStage("COPY", 5);
        C = exportPersistenceStage6;
        ExportPersistenceStage exportPersistenceStage7 = new ExportPersistenceStage("COMMIT", 6);
        D = exportPersistenceStage7;
        E = new ExportPersistenceStage[]{exportPersistenceStage, exportPersistenceStage2, exportPersistenceStage3, exportPersistenceStage4, exportPersistenceStage5, exportPersistenceStage6, exportPersistenceStage7};
    }

    public static ExportPersistenceStage valueOf(String str) {
        return (ExportPersistenceStage) Enum.valueOf(ExportPersistenceStage.class, str);
    }

    public static ExportPersistenceStage[] values() {
        return (ExportPersistenceStage[]) E.clone();
    }
}
