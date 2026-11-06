package com.tracket.editor.preview;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class PreviewRetirementReason {
    public static final PreviewRetirementReason A;
    public static final /* synthetic */ PreviewRetirementReason[] B;
    public static final PreviewRetirementReason y;
    public static final PreviewRetirementReason z;

    static {
        PreviewRetirementReason previewRetirementReason = new PreviewRetirementReason("EDITOR_EXIT", 0);
        y = previewRetirementReason;
        PreviewRetirementReason previewRetirementReason2 = new PreviewRetirementReason("EXPORT", 1);
        z = previewRetirementReason2;
        PreviewRetirementReason previewRetirementReason3 = new PreviewRetirementReason("RENDER_STALL", 2);
        A = previewRetirementReason3;
        B = new PreviewRetirementReason[]{previewRetirementReason, previewRetirementReason2, previewRetirementReason3};
    }

    public static PreviewRetirementReason valueOf(String str) {
        return (PreviewRetirementReason) Enum.valueOf(PreviewRetirementReason.class, str);
    }

    public static PreviewRetirementReason[] values() {
        return (PreviewRetirementReason[]) B.clone();
    }
}
