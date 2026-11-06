package com.tracket.editor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class EditorTool$Kind {
    public static final EditorTool$Kind A;
    public static final EditorTool$Kind B;
    public static final /* synthetic */ EditorTool$Kind[] C;
    public static final EditorTool$Kind y;
    public static final EditorTool$Kind z;

    static {
        EditorTool$Kind editorTool$Kind = new EditorTool$Kind("TRACKER", 0);
        y = editorTool$Kind;
        EditorTool$Kind editorTool$Kind2 = new EditorTool$Kind("CUTTER", 1);
        z = editorTool$Kind2;
        EditorTool$Kind editorTool$Kind3 = new EditorTool$Kind("STABILIZER", 2);
        A = editorTool$Kind3;
        EditorTool$Kind editorTool$Kind4 = new EditorTool$Kind("DEPTH", 3);
        B = editorTool$Kind4;
        C = new EditorTool$Kind[]{editorTool$Kind, editorTool$Kind2, editorTool$Kind3, editorTool$Kind4};
    }

    public static EditorTool$Kind valueOf(String str) {
        return (EditorTool$Kind) Enum.valueOf(EditorTool$Kind.class, str);
    }

    public static EditorTool$Kind[] values() {
        return (EditorTool$Kind[]) C.clone();
    }
}
