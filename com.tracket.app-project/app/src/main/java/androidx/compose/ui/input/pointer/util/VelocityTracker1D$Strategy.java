package androidx.compose.ui.input.pointer.util;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class VelocityTracker1D$Strategy {
    public static final /* synthetic */ VelocityTracker1D$Strategy[] A;
    public static final VelocityTracker1D$Strategy y;
    public static final VelocityTracker1D$Strategy z;

    static {
        VelocityTracker1D$Strategy velocityTracker1D$Strategy = new VelocityTracker1D$Strategy("Lsq2", 0);
        y = velocityTracker1D$Strategy;
        VelocityTracker1D$Strategy velocityTracker1D$Strategy2 = new VelocityTracker1D$Strategy("Impulse", 1);
        z = velocityTracker1D$Strategy2;
        A = new VelocityTracker1D$Strategy[]{velocityTracker1D$Strategy, velocityTracker1D$Strategy2};
    }

    public static VelocityTracker1D$Strategy valueOf(String str) {
        return (VelocityTracker1D$Strategy) Enum.valueOf(VelocityTracker1D$Strategy.class, str);
    }

    public static VelocityTracker1D$Strategy[] values() {
        return (VelocityTracker1D$Strategy[]) A.clone();
    }
}
