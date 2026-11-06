package com.airbnb.lottie.model.content;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class Mask$MaskMode {
    public static final Mask$MaskMode A;
    public static final Mask$MaskMode B;
    public static final /* synthetic */ Mask$MaskMode[] C;
    public static final Mask$MaskMode y;
    public static final Mask$MaskMode z;

    static {
        Mask$MaskMode mask$MaskMode = new Mask$MaskMode("MASK_MODE_ADD", 0);
        y = mask$MaskMode;
        Mask$MaskMode mask$MaskMode2 = new Mask$MaskMode("MASK_MODE_SUBTRACT", 1);
        z = mask$MaskMode2;
        Mask$MaskMode mask$MaskMode3 = new Mask$MaskMode("MASK_MODE_INTERSECT", 2);
        A = mask$MaskMode3;
        Mask$MaskMode mask$MaskMode4 = new Mask$MaskMode("MASK_MODE_NONE", 3);
        B = mask$MaskMode4;
        C = new Mask$MaskMode[]{mask$MaskMode, mask$MaskMode2, mask$MaskMode3, mask$MaskMode4};
    }

    public static Mask$MaskMode valueOf(String str) {
        return (Mask$MaskMode) Enum.valueOf(Mask$MaskMode.class, str);
    }

    public static Mask$MaskMode[] values() {
        return (Mask$MaskMode[]) C.clone();
    }
}
