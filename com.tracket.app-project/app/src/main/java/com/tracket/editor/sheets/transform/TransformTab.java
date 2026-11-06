package com.tracket.editor.sheets.transform;

import defpackage.x03;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
final class TransformTab {
    public static final /* synthetic */ TransformTab[] A;
    public static final /* synthetic */ x03 B;
    public static final TransformTab y;
    public static final TransformTab z;

    static {
        TransformTab transformTab = new TransformTab("TWO_D", 0);
        y = transformTab;
        TransformTab transformTab2 = new TransformTab("PIVOT", 1);
        TransformTab transformTab3 = new TransformTab("THREE_D", 2);
        TransformTab transformTab4 = new TransformTab("WARP", 3);
        z = transformTab4;
        TransformTab[] transformTabArr = {transformTab, transformTab2, transformTab3, transformTab4};
        A = transformTabArr;
        B = new x03(transformTabArr);
    }

    public static TransformTab valueOf(String str) {
        return (TransformTab) Enum.valueOf(TransformTab.class, str);
    }

    public static TransformTab[] values() {
        return (TransformTab[]) A.clone();
    }
}
