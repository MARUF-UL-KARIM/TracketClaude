package com.tracket.editor.motion;

import defpackage.x03;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class PlanarMotionModel {
    public static final PlanarMotionModel A;
    public static final /* synthetic */ PlanarMotionModel[] B;
    public static final /* synthetic */ x03 C;
    public static final PlanarMotionModel y;
    public static final PlanarMotionModel z;

    static {
        PlanarMotionModel planarMotionModel = new PlanarMotionModel("SIMILARITY", 0);
        y = planarMotionModel;
        PlanarMotionModel planarMotionModel2 = new PlanarMotionModel("AFFINE", 1);
        z = planarMotionModel2;
        PlanarMotionModel planarMotionModel3 = new PlanarMotionModel("HOMOGRAPHY", 2);
        A = planarMotionModel3;
        PlanarMotionModel[] planarMotionModelArr = {planarMotionModel, planarMotionModel2, planarMotionModel3};
        B = planarMotionModelArr;
        C = new x03(planarMotionModelArr);
    }

    public static PlanarMotionModel valueOf(String str) {
        return (PlanarMotionModel) Enum.valueOf(PlanarMotionModel.class, str);
    }

    public static PlanarMotionModel[] values() {
        return (PlanarMotionModel[]) B.clone();
    }
}
