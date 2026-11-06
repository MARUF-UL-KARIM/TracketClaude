package com.airbnb.lottie.configurations.reducemotion;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class ReducedMotionMode {
    public static final /* synthetic */ ReducedMotionMode[] A;
    public static final ReducedMotionMode y;
    public static final ReducedMotionMode z;

    static {
        ReducedMotionMode reducedMotionMode = new ReducedMotionMode("STANDARD_MOTION", 0);
        y = reducedMotionMode;
        ReducedMotionMode reducedMotionMode2 = new ReducedMotionMode("REDUCED_MOTION", 1);
        z = reducedMotionMode2;
        A = new ReducedMotionMode[]{reducedMotionMode, reducedMotionMode2};
    }

    public static ReducedMotionMode valueOf(String str) {
        return (ReducedMotionMode) Enum.valueOf(ReducedMotionMode.class, str);
    }

    public static ReducedMotionMode[] values() {
        return (ReducedMotionMode[]) A.clone();
    }
}
