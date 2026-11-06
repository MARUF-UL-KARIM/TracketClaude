package com.tracket.editor.preview;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class RenderBackgroundShader {
    public static final RenderBackgroundShader y;
    public static final /* synthetic */ RenderBackgroundShader[] z;

    static {
        RenderBackgroundShader renderBackgroundShader = new RenderBackgroundShader("CHECKERBOARD", 0);
        y = renderBackgroundShader;
        z = new RenderBackgroundShader[]{renderBackgroundShader};
    }

    public static RenderBackgroundShader valueOf(String str) {
        return (RenderBackgroundShader) Enum.valueOf(RenderBackgroundShader.class, str);
    }

    public static RenderBackgroundShader[] values() {
        return (RenderBackgroundShader[]) z.clone();
    }
}
