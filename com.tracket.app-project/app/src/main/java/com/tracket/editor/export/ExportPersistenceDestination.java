package com.tracket.editor.export;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class ExportPersistenceDestination {
    public static final ExportPersistenceDestination y;
    public static final /* synthetic */ ExportPersistenceDestination[] z;

    /* JADX INFO: Fake field, exist only in values array */
    ExportPersistenceDestination EF0;

    static {
        ExportPersistenceDestination exportPersistenceDestination = new ExportPersistenceDestination("PHOTOS", 0);
        ExportPersistenceDestination exportPersistenceDestination2 = new ExportPersistenceDestination("MEDIA_STORE", 1);
        y = exportPersistenceDestination2;
        z = new ExportPersistenceDestination[]{exportPersistenceDestination, exportPersistenceDestination2, new ExportPersistenceDestination("LOCAL_FILE", 2)};
    }

    public static ExportPersistenceDestination valueOf(String str) {
        return (ExportPersistenceDestination) Enum.valueOf(ExportPersistenceDestination.class, str);
    }

    public static ExportPersistenceDestination[] values() {
        return (ExportPersistenceDestination[]) z.clone();
    }
}
