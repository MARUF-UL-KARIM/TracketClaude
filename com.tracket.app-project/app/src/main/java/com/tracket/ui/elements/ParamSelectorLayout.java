package com.tracket.ui.elements;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class ParamSelectorLayout {
    public static final ParamSelectorLayout A;
    public static final /* synthetic */ ParamSelectorLayout[] B;
    public static final ParamSelectorLayout y;
    public static final ParamSelectorLayout z;

    static {
        ParamSelectorLayout paramSelectorLayout = new ParamSelectorLayout("Fill", 0);
        y = paramSelectorLayout;
        ParamSelectorLayout paramSelectorLayout2 = new ParamSelectorLayout("Packed", 1);
        z = paramSelectorLayout2;
        ParamSelectorLayout paramSelectorLayout3 = new ParamSelectorLayout("Adaptive", 2);
        A = paramSelectorLayout3;
        B = new ParamSelectorLayout[]{paramSelectorLayout, paramSelectorLayout2, paramSelectorLayout3};
    }

    public static ParamSelectorLayout valueOf(String str) {
        return (ParamSelectorLayout) Enum.valueOf(ParamSelectorLayout.class, str);
    }

    public static ParamSelectorLayout[] values() {
        return (ParamSelectorLayout[]) B.clone();
    }
}
