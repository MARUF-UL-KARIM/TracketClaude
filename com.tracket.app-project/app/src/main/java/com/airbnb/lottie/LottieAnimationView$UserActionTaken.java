package com.airbnb.lottie;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
final class LottieAnimationView$UserActionTaken {
    public static final /* synthetic */ LottieAnimationView$UserActionTaken[] y = {new LottieAnimationView$UserActionTaken("SET_ANIMATION", 0), new LottieAnimationView$UserActionTaken("SET_PROGRESS", 1), new LottieAnimationView$UserActionTaken("SET_REPEAT_MODE", 2), new LottieAnimationView$UserActionTaken("SET_REPEAT_COUNT", 3), new LottieAnimationView$UserActionTaken("SET_IMAGE_ASSETS", 4), new LottieAnimationView$UserActionTaken("PLAY_OPTION", 5)};

    /* JADX INFO: Fake field, exist only in values array */
    LottieAnimationView$UserActionTaken EF5;

    public static LottieAnimationView$UserActionTaken valueOf(String str) {
        return (LottieAnimationView$UserActionTaken) Enum.valueOf(LottieAnimationView$UserActionTaken.class, str);
    }

    public static LottieAnimationView$UserActionTaken[] values() {
        return (LottieAnimationView$UserActionTaken[]) y.clone();
    }
}
