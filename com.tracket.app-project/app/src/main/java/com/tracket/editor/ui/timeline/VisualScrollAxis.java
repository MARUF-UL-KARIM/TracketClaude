package com.tracket.editor.ui.timeline;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
final class VisualScrollAxis {
    public static final VisualScrollAxis A;
    public static final /* synthetic */ VisualScrollAxis[] B;
    public static final VisualScrollAxis y;
    public static final VisualScrollAxis z;

    static {
        VisualScrollAxis visualScrollAxis = new VisualScrollAxis("NONE", 0);
        y = visualScrollAxis;
        VisualScrollAxis visualScrollAxis2 = new VisualScrollAxis("HORIZONTAL", 1);
        z = visualScrollAxis2;
        VisualScrollAxis visualScrollAxis3 = new VisualScrollAxis("VERTICAL", 2);
        A = visualScrollAxis3;
        B = new VisualScrollAxis[]{visualScrollAxis, visualScrollAxis2, visualScrollAxis3};
    }

    public static VisualScrollAxis valueOf(String str) {
        return (VisualScrollAxis) Enum.valueOf(VisualScrollAxis.class, str);
    }

    public static VisualScrollAxis[] values() {
        return (VisualScrollAxis[]) B.clone();
    }
}
