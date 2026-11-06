package com.tracket.editor.tracking;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class SemanticDetectionMode {
    public static final /* synthetic */ SemanticDetectionMode[] A;
    public static final SemanticDetectionMode y;
    public static final SemanticDetectionMode z;

    static {
        SemanticDetectionMode semanticDetectionMode = new SemanticDetectionMode("IMAGE", 0);
        y = semanticDetectionMode;
        SemanticDetectionMode semanticDetectionMode2 = new SemanticDetectionMode("VIDEO", 1);
        z = semanticDetectionMode2;
        A = new SemanticDetectionMode[]{semanticDetectionMode, semanticDetectionMode2};
    }

    public static SemanticDetectionMode valueOf(String str) {
        return (SemanticDetectionMode) Enum.valueOf(SemanticDetectionMode.class, str);
    }

    public static SemanticDetectionMode[] values() {
        return (SemanticDetectionMode[]) A.clone();
    }
}
