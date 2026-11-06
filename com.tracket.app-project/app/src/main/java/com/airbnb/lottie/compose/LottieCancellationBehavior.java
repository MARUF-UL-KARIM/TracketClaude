package com.airbnb.lottie.compose;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class LottieCancellationBehavior {
    public static final LottieCancellationBehavior y;
    public static final /* synthetic */ LottieCancellationBehavior[] z;

    static {
        LottieCancellationBehavior lottieCancellationBehavior = new LottieCancellationBehavior("Immediately", 0);
        y = lottieCancellationBehavior;
        z = new LottieCancellationBehavior[]{lottieCancellationBehavior, new LottieCancellationBehavior("OnIterationFinish", 1)};
    }

    public static LottieCancellationBehavior valueOf(String str) {
        return (LottieCancellationBehavior) Enum.valueOf(LottieCancellationBehavior.class, str);
    }

    public static LottieCancellationBehavior[] values() {
        return (LottieCancellationBehavior[]) z.clone();
    }
}
