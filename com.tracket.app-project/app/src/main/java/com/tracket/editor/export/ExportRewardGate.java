package com.tracket.editor.export;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class ExportRewardGate {
    public static final ExportRewardGate A;
    public static final ExportRewardGate B;
    public static final ExportRewardGate C;
    public static final /* synthetic */ ExportRewardGate[] D;
    public static final ExportRewardGate y;
    public static final ExportRewardGate z;

    static {
        ExportRewardGate exportRewardGate = new ExportRewardGate("ADVANCED_EDITING", 0);
        y = exportRewardGate;
        ExportRewardGate exportRewardGate2 = new ExportRewardGate("EXPORT_1080_OR_HIGHER", 1);
        z = exportRewardGate2;
        ExportRewardGate exportRewardGate3 = new ExportRewardGate("WATERMARK_REMOVAL", 2);
        A = exportRewardGate3;
        ExportRewardGate exportRewardGate4 = new ExportRewardGate("EXPORT_4K", 3);
        B = exportRewardGate4;
        ExportRewardGate exportRewardGate5 = new ExportRewardGate("HIGH_BITRATE", 4);
        C = exportRewardGate5;
        D = new ExportRewardGate[]{exportRewardGate, exportRewardGate2, exportRewardGate3, exportRewardGate4, exportRewardGate5};
    }

    public static ExportRewardGate valueOf(String str) {
        return (ExportRewardGate) Enum.valueOf(ExportRewardGate.class, str);
    }

    public static ExportRewardGate[] values() {
        return (ExportRewardGate[]) D.clone();
    }
}
