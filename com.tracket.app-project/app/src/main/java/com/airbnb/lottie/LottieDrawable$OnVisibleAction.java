package com.airbnb.lottie;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
final class LottieDrawable$OnVisibleAction {
    public static final LottieDrawable$OnVisibleAction A;
    public static final /* synthetic */ LottieDrawable$OnVisibleAction[] B;
    public static final LottieDrawable$OnVisibleAction y;
    public static final LottieDrawable$OnVisibleAction z;

    static {
        LottieDrawable$OnVisibleAction lottieDrawable$OnVisibleAction = new LottieDrawable$OnVisibleAction("NONE", 0);
        y = lottieDrawable$OnVisibleAction;
        LottieDrawable$OnVisibleAction lottieDrawable$OnVisibleAction2 = new LottieDrawable$OnVisibleAction("PLAY", 1);
        z = lottieDrawable$OnVisibleAction2;
        LottieDrawable$OnVisibleAction lottieDrawable$OnVisibleAction3 = new LottieDrawable$OnVisibleAction("RESUME", 2);
        A = lottieDrawable$OnVisibleAction3;
        B = new LottieDrawable$OnVisibleAction[]{lottieDrawable$OnVisibleAction, lottieDrawable$OnVisibleAction2, lottieDrawable$OnVisibleAction3};
    }

    public static LottieDrawable$OnVisibleAction valueOf(String str) {
        return (LottieDrawable$OnVisibleAction) Enum.valueOf(LottieDrawable$OnVisibleAction.class, str);
    }

    public static LottieDrawable$OnVisibleAction[] values() {
        return (LottieDrawable$OnVisibleAction[]) B.clone();
    }
}
