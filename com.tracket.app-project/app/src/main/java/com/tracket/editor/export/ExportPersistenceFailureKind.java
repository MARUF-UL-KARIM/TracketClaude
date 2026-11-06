package com.tracket.editor.export;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class ExportPersistenceFailureKind {
    public static final ExportPersistenceFailureKind A;
    public static final /* synthetic */ ExportPersistenceFailureKind[] B;
    public static final ExportPersistenceFailureKind y;
    public static final ExportPersistenceFailureKind z;

    static {
        ExportPersistenceFailureKind exportPersistenceFailureKind = new ExportPersistenceFailureKind("STORAGE", 0);
        y = exportPersistenceFailureKind;
        ExportPersistenceFailureKind exportPersistenceFailureKind2 = new ExportPersistenceFailureKind("PERMISSION", 1);
        z = exportPersistenceFailureKind2;
        ExportPersistenceFailureKind exportPersistenceFailureKind3 = new ExportPersistenceFailureKind("UNKNOWN", 2);
        A = exportPersistenceFailureKind3;
        B = new ExportPersistenceFailureKind[]{exportPersistenceFailureKind, exportPersistenceFailureKind2, exportPersistenceFailureKind3};
    }

    public static ExportPersistenceFailureKind valueOf(String str) {
        return (ExportPersistenceFailureKind) Enum.valueOf(ExportPersistenceFailureKind.class, str);
    }

    public static ExportPersistenceFailureKind[] values() {
        return (ExportPersistenceFailureKind[]) B.clone();
    }
}
