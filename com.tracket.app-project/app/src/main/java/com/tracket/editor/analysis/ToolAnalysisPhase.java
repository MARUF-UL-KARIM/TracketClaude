package com.tracket.editor.analysis;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class ToolAnalysisPhase {
    public static final ToolAnalysisPhase A;
    public static final ToolAnalysisPhase B;
    public static final ToolAnalysisPhase C;
    public static final ToolAnalysisPhase D;
    public static final /* synthetic */ ToolAnalysisPhase[] E;
    public static final ToolAnalysisPhase y;
    public static final ToolAnalysisPhase z;

    static {
        ToolAnalysisPhase toolAnalysisPhase = new ToolAnalysisPhase("ANALYZING", 0);
        y = toolAnalysisPhase;
        ToolAnalysisPhase toolAnalysisPhase2 = new ToolAnalysisPhase("STOPPING_ANALYSIS", 1);
        z = toolAnalysisPhase2;
        ToolAnalysisPhase toolAnalysisPhase3 = new ToolAnalysisPhase("RESTORING", 2);
        A = toolAnalysisPhase3;
        ToolAnalysisPhase toolAnalysisPhase4 = new ToolAnalysisPhase("COMMITTING", 3);
        B = toolAnalysisPhase4;
        ToolAnalysisPhase toolAnalysisPhase5 = new ToolAnalysisPhase("AWAITING_FRAME", 4);
        C = toolAnalysisPhase5;
        ToolAnalysisPhase toolAnalysisPhase6 = new ToolAnalysisPhase("COMPLETED", 5);
        D = toolAnalysisPhase6;
        E = new ToolAnalysisPhase[]{toolAnalysisPhase, toolAnalysisPhase2, toolAnalysisPhase3, toolAnalysisPhase4, toolAnalysisPhase5, toolAnalysisPhase6};
    }

    public static ToolAnalysisPhase valueOf(String str) {
        return (ToolAnalysisPhase) Enum.valueOf(ToolAnalysisPhase.class, str);
    }

    public static ToolAnalysisPhase[] values() {
        return (ToolAnalysisPhase[]) E.clone();
    }
}
