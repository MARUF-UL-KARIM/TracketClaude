package com.tracket.editor.preview;

import defpackage.x03;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class TextTextureSamplingMode {
    public static final /* synthetic */ TextTextureSamplingMode[] A;
    public static final /* synthetic */ x03 B;
    public static final TextTextureSamplingMode y;
    public static final TextTextureSamplingMode z;

    /* JADX INFO: Fake field, exist only in values array */
    TextTextureSamplingMode EF0;

    static {
        TextTextureSamplingMode textTextureSamplingMode = new TextTextureSamplingMode("LINEAR", 0);
        TextTextureSamplingMode textTextureSamplingMode2 = new TextTextureSamplingMode("QUILEZ", 1);
        TextTextureSamplingMode textTextureSamplingMode3 = new TextTextureSamplingMode("BICUBIC", 2);
        TextTextureSamplingMode textTextureSamplingMode4 = new TextTextureSamplingMode("CATMULL_ROM", 3);
        TextTextureSamplingMode textTextureSamplingMode5 = new TextTextureSamplingMode("MITCHELL", 4);
        y = textTextureSamplingMode5;
        TextTextureSamplingMode textTextureSamplingMode6 = new TextTextureSamplingMode("ROBIDOUX", 5);
        TextTextureSamplingMode textTextureSamplingMode7 = new TextTextureSamplingMode("LANCZOS", 6);
        TextTextureSamplingMode textTextureSamplingMode8 = new TextTextureSamplingMode("HIGH_RES", 7);
        z = textTextureSamplingMode8;
        TextTextureSamplingMode[] textTextureSamplingModeArr = {textTextureSamplingMode, textTextureSamplingMode2, textTextureSamplingMode3, textTextureSamplingMode4, textTextureSamplingMode5, textTextureSamplingMode6, textTextureSamplingMode7, textTextureSamplingMode8};
        A = textTextureSamplingModeArr;
        B = new x03(textTextureSamplingModeArr);
    }

    public static TextTextureSamplingMode valueOf(String str) {
        return (TextTextureSamplingMode) Enum.valueOf(TextTextureSamplingMode.class, str);
    }

    public static TextTextureSamplingMode[] values() {
        return (TextTextureSamplingMode[]) A.clone();
    }
}
