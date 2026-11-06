package com.tracket.editor.preview;

import defpackage.x03;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class TextRenderBackendMode {
    public static final /* synthetic */ TextRenderBackendMode[] A;
    public static final /* synthetic */ x03 B;
    public static final TextRenderBackendMode y;
    public static final TextRenderBackendMode z;

    static {
        TextRenderBackendMode textRenderBackendMode = new TextRenderBackendMode("NATIVE", 0);
        y = textRenderBackendMode;
        TextRenderBackendMode textRenderBackendMode2 = new TextRenderBackendMode("SKIKO", 1);
        z = textRenderBackendMode2;
        TextRenderBackendMode[] textRenderBackendModeArr = {textRenderBackendMode, textRenderBackendMode2};
        A = textRenderBackendModeArr;
        B = new x03(textRenderBackendModeArr);
    }

    public static TextRenderBackendMode valueOf(String str) {
        return (TextRenderBackendMode) Enum.valueOf(TextRenderBackendMode.class, str);
    }

    public static TextRenderBackendMode[] values() {
        return (TextRenderBackendMode[]) A.clone();
    }
}
