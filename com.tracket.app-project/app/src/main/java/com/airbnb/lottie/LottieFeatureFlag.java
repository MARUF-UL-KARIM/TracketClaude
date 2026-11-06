package com.airbnb.lottie;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class LottieFeatureFlag {
    public static final LottieFeatureFlag y;
    public static final /* synthetic */ LottieFeatureFlag[] z;

    static {
        LottieFeatureFlag lottieFeatureFlag = new LottieFeatureFlag("MergePathsApi19", 0);
        y = lottieFeatureFlag;
        z = new LottieFeatureFlag[]{lottieFeatureFlag};
    }

    public static LottieFeatureFlag valueOf(String str) {
        return (LottieFeatureFlag) Enum.valueOf(LottieFeatureFlag.class, str);
    }

    public static LottieFeatureFlag[] values() {
        return (LottieFeatureFlag[]) z.clone();
    }
}
