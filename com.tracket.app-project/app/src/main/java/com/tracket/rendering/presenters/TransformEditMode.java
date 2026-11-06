package com.tracket.rendering.presenters;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class TransformEditMode {
    public static final TransformEditMode A;
    public static final TransformEditMode B;
    public static final TransformEditMode C;
    public static final /* synthetic */ TransformEditMode[] D;
    public static final TransformEditMode y;
    public static final TransformEditMode z;

    static {
        TransformEditMode transformEditMode = new TransformEditMode("NONE", 0);
        y = transformEditMode;
        TransformEditMode transformEditMode2 = new TransformEditMode("POSITION_2D", 1);
        z = transformEditMode2;
        TransformEditMode transformEditMode3 = new TransformEditMode("PIVOT", 2);
        A = transformEditMode3;
        TransformEditMode transformEditMode4 = new TransformEditMode("ORIENTATION_3D", 3);
        B = transformEditMode4;
        TransformEditMode transformEditMode5 = new TransformEditMode("WARP", 4);
        C = transformEditMode5;
        D = new TransformEditMode[]{transformEditMode, transformEditMode2, transformEditMode3, transformEditMode4, transformEditMode5};
    }

    public static TransformEditMode valueOf(String str) {
        return (TransformEditMode) Enum.valueOf(TransformEditMode.class, str);
    }

    public static TransformEditMode[] values() {
        return (TransformEditMode[]) D.clone();
    }
}
