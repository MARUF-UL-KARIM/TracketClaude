package com.airbnb.lottie.model.content;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class GradientType {
    public static final /* synthetic */ GradientType[] A;
    public static final GradientType y;
    public static final GradientType z;

    static {
        GradientType gradientType = new GradientType("LINEAR", 0);
        y = gradientType;
        GradientType gradientType2 = new GradientType("RADIAL", 1);
        z = gradientType2;
        A = new GradientType[]{gradientType, gradientType2};
    }

    public static GradientType valueOf(String str) {
        return (GradientType) Enum.valueOf(GradientType.class, str);
    }

    public static GradientType[] values() {
        return (GradientType[]) A.clone();
    }
}
