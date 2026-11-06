package com.tracket.editor.dto;

import defpackage.x03;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class StabilizationAnalysisQuality {
    public static final StabilizationAnalysisQuality A;
    public static final /* synthetic */ StabilizationAnalysisQuality[] B;
    public static final /* synthetic */ x03 C;
    public static final StabilizationAnalysisQuality y;
    public static final StabilizationAnalysisQuality z;

    static {
        StabilizationAnalysisQuality stabilizationAnalysisQuality = new StabilizationAnalysisQuality("FAST", 0);
        y = stabilizationAnalysisQuality;
        StabilizationAnalysisQuality stabilizationAnalysisQuality2 = new StabilizationAnalysisQuality("BALANCED", 1);
        z = stabilizationAnalysisQuality2;
        StabilizationAnalysisQuality stabilizationAnalysisQuality3 = new StabilizationAnalysisQuality("HIGH", 2);
        A = stabilizationAnalysisQuality3;
        StabilizationAnalysisQuality[] stabilizationAnalysisQualityArr = {stabilizationAnalysisQuality, stabilizationAnalysisQuality2, stabilizationAnalysisQuality3};
        B = stabilizationAnalysisQualityArr;
        C = new x03(stabilizationAnalysisQualityArr);
    }

    public static StabilizationAnalysisQuality valueOf(String str) {
        return (StabilizationAnalysisQuality) Enum.valueOf(StabilizationAnalysisQuality.class, str);
    }

    public static StabilizationAnalysisQuality[] values() {
        return (StabilizationAnalysisQuality[]) B.clone();
    }
}
