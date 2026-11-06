package com.tracket.editor.analysis;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class ToolAnalysisStopAction {
    public static final /* synthetic */ ToolAnalysisStopAction[] y = {new ToolAnalysisStopAction("STOP_ANALYSIS", 0), new ToolAnalysisStopAction("NONE", 1)};

    /* JADX INFO: Fake field, exist only in values array */
    ToolAnalysisStopAction EF5;

    public static ToolAnalysisStopAction valueOf(String str) {
        return (ToolAnalysisStopAction) Enum.valueOf(ToolAnalysisStopAction.class, str);
    }

    public static ToolAnalysisStopAction[] values() {
        return (ToolAnalysisStopAction[]) y.clone();
    }
}
