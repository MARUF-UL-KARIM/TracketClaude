package com.tracket.editor.export;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class ExportStage {
    public static final ExportStage A;
    public static final ExportStage B;
    public static final ExportStage C;
    public static final ExportStage D;
    public static final ExportStage E;
    public static final /* synthetic */ ExportStage[] F;
    public static final ExportStage y;
    public static final ExportStage z;

    static {
        ExportStage exportStage = new ExportStage("IDLE", 0);
        y = exportStage;
        ExportStage exportStage2 = new ExportStage("PREPARING", 1);
        z = exportStage2;
        ExportStage exportStage3 = new ExportStage("HIDING_PREVIEW", 2);
        A = exportStage3;
        ExportStage exportStage4 = new ExportStage("RELEASING_PREVIEW", 3);
        B = exportStage4;
        ExportStage exportStage5 = new ExportStage("STARTING_EXPORT", 4);
        C = exportStage5;
        ExportStage exportStage6 = new ExportStage("EXPORTING", 5);
        D = exportStage6;
        ExportStage exportStage7 = new ExportStage("SHARE_HANDOFF", 6);
        E = exportStage7;
        F = new ExportStage[]{exportStage, exportStage2, exportStage3, exportStage4, exportStage5, exportStage6, exportStage7};
    }

    public static ExportStage valueOf(String str) {
        return (ExportStage) Enum.valueOf(ExportStage.class, str);
    }

    public static ExportStage[] values() {
        return (ExportStage[]) F.clone();
    }
}
