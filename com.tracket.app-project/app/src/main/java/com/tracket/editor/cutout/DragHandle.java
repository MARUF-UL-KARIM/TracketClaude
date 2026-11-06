package com.tracket.editor.cutout;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
final class DragHandle {
    public static final DragHandle A;
    public static final DragHandle B;
    public static final DragHandle C;
    public static final DragHandle D;
    public static final /* synthetic */ DragHandle[] E;
    public static final DragHandle y;
    public static final DragHandle z;

    static {
        DragHandle dragHandle = new DragHandle("None", 0);
        y = dragHandle;
        DragHandle dragHandle2 = new DragHandle("Move", 1);
        z = dragHandle2;
        DragHandle dragHandle3 = new DragHandle("TopLeft", 2);
        A = dragHandle3;
        DragHandle dragHandle4 = new DragHandle("TopRight", 3);
        B = dragHandle4;
        DragHandle dragHandle5 = new DragHandle("BottomLeft", 4);
        C = dragHandle5;
        DragHandle dragHandle6 = new DragHandle("BottomRight", 5);
        D = dragHandle6;
        E = new DragHandle[]{dragHandle, dragHandle2, dragHandle3, dragHandle4, dragHandle5, dragHandle6};
    }

    public static DragHandle valueOf(String str) {
        return (DragHandle) Enum.valueOf(DragHandle.class, str);
    }

    public static DragHandle[] values() {
        return (DragHandle[]) E.clone();
    }
}
