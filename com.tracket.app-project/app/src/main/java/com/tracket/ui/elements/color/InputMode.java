package com.tracket.ui.elements.color;

import defpackage.x03;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class InputMode {
    public static final /* synthetic */ x03 A;
    public static final InputMode y;
    public static final /* synthetic */ InputMode[] z;

    static {
        InputMode inputMode = new InputMode("HEX", 0);
        y = inputMode;
        InputMode[] inputModeArr = {inputMode, new InputMode("RGB", 1), new InputMode("HSB", 2)};
        z = inputModeArr;
        A = new x03(inputModeArr);
    }

    public static InputMode valueOf(String str) {
        return (InputMode) Enum.valueOf(InputMode.class, str);
    }

    public static InputMode[] values() {
        return (InputMode[]) z.clone();
    }
}
