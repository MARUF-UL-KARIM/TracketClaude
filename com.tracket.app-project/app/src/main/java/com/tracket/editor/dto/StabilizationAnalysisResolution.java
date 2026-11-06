package com.tracket.editor.dto;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class StabilizationAnalysisResolution {
    public static final StabilizationAnalysisResolution A;
    public static final /* synthetic */ StabilizationAnalysisResolution[] B;
    public static final StabilizationAnalysisResolution y;
    public static final StabilizationAnalysisResolution z;

    static {
        StabilizationAnalysisResolution stabilizationAnalysisResolution = new StabilizationAnalysisResolution("R_480P", 0);
        y = stabilizationAnalysisResolution;
        StabilizationAnalysisResolution stabilizationAnalysisResolution2 = new StabilizationAnalysisResolution("R_720P", 1);
        z = stabilizationAnalysisResolution2;
        StabilizationAnalysisResolution stabilizationAnalysisResolution3 = new StabilizationAnalysisResolution("R_1080P", 2);
        A = stabilizationAnalysisResolution3;
        B = new StabilizationAnalysisResolution[]{stabilizationAnalysisResolution, stabilizationAnalysisResolution2, stabilizationAnalysisResolution3};
    }

    public static StabilizationAnalysisResolution valueOf(String str) {
        return (StabilizationAnalysisResolution) Enum.valueOf(StabilizationAnalysisResolution.class, str);
    }

    public static StabilizationAnalysisResolution[] values() {
        return (StabilizationAnalysisResolution[]) B.clone();
    }
}
