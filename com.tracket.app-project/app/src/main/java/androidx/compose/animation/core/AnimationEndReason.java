package androidx.compose.animation.core;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class AnimationEndReason {
    public static final /* synthetic */ AnimationEndReason[] A;
    public static final AnimationEndReason y;
    public static final AnimationEndReason z;

    static {
        AnimationEndReason animationEndReason = new AnimationEndReason("BoundReached", 0);
        y = animationEndReason;
        AnimationEndReason animationEndReason2 = new AnimationEndReason("Finished", 1);
        z = animationEndReason2;
        A = new AnimationEndReason[]{animationEndReason, animationEndReason2};
    }

    public static AnimationEndReason valueOf(String str) {
        return (AnimationEndReason) Enum.valueOf(AnimationEndReason.class, str);
    }

    public static AnimationEndReason[] values() {
        return (AnimationEndReason[]) A.clone();
    }
}
