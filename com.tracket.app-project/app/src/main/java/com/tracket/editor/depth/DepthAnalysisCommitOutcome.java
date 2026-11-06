package com.tracket.editor.depth;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class DepthAnalysisCommitOutcome {
    public static final DepthAnalysisCommitOutcome A;
    public static final /* synthetic */ DepthAnalysisCommitOutcome[] B;
    public static final DepthAnalysisCommitOutcome y;
    public static final DepthAnalysisCommitOutcome z;

    static {
        DepthAnalysisCommitOutcome depthAnalysisCommitOutcome = new DepthAnalysisCommitOutcome("COMPLETED", 0);
        y = depthAnalysisCommitOutcome;
        DepthAnalysisCommitOutcome depthAnalysisCommitOutcome2 = new DepthAnalysisCommitOutcome("CANCELLED", 1);
        z = depthAnalysisCommitOutcome2;
        DepthAnalysisCommitOutcome depthAnalysisCommitOutcome3 = new DepthAnalysisCommitOutcome("HISTORY_DISCARDED", 2);
        A = depthAnalysisCommitOutcome3;
        B = new DepthAnalysisCommitOutcome[]{depthAnalysisCommitOutcome, depthAnalysisCommitOutcome2, depthAnalysisCommitOutcome3};
    }

    public static DepthAnalysisCommitOutcome valueOf(String str) {
        return (DepthAnalysisCommitOutcome) Enum.valueOf(DepthAnalysisCommitOutcome.class, str);
    }

    public static DepthAnalysisCommitOutcome[] values() {
        return (DepthAnalysisCommitOutcome[]) B.clone();
    }
}
