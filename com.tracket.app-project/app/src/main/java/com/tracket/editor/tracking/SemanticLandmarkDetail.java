package com.tracket.editor.tracking;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class SemanticLandmarkDetail {
    public static final SemanticLandmarkDetail A;
    public static final SemanticLandmarkDetail B;
    public static final SemanticLandmarkDetail C;
    public static final /* synthetic */ SemanticLandmarkDetail[] D;
    public static final SemanticLandmarkDetail y;
    public static final SemanticLandmarkDetail z;

    static {
        SemanticLandmarkDetail semanticLandmarkDetail = new SemanticLandmarkDetail("DISCOVERY", 0);
        y = semanticLandmarkDetail;
        SemanticLandmarkDetail semanticLandmarkDetail2 = new SemanticLandmarkDetail("FOCUSED", 1);
        z = semanticLandmarkDetail2;
        SemanticLandmarkDetail semanticLandmarkDetail3 = new SemanticLandmarkDetail("ALL", 2);
        A = semanticLandmarkDetail3;
        SemanticLandmarkDetail semanticLandmarkDetail4 = new SemanticLandmarkDetail("ENTITY", 3);
        B = semanticLandmarkDetail4;
        SemanticLandmarkDetail semanticLandmarkDetail5 = new SemanticLandmarkDetail("RECOVERY", 4);
        C = semanticLandmarkDetail5;
        D = new SemanticLandmarkDetail[]{semanticLandmarkDetail, semanticLandmarkDetail2, semanticLandmarkDetail3, semanticLandmarkDetail4, semanticLandmarkDetail5};
    }

    public static SemanticLandmarkDetail valueOf(String str) {
        return (SemanticLandmarkDetail) Enum.valueOf(SemanticLandmarkDetail.class, str);
    }

    public static SemanticLandmarkDetail[] values() {
        return (SemanticLandmarkDetail[]) D.clone();
    }
}
