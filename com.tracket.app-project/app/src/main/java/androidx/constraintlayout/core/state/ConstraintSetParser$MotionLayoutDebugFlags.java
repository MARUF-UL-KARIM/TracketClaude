package androidx.constraintlayout.core.state;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class ConstraintSetParser$MotionLayoutDebugFlags {
    public static final /* synthetic */ ConstraintSetParser$MotionLayoutDebugFlags[] y = {new ConstraintSetParser$MotionLayoutDebugFlags("NONE", 0), new ConstraintSetParser$MotionLayoutDebugFlags("SHOW_ALL", 1), new ConstraintSetParser$MotionLayoutDebugFlags("UNKNOWN", 2)};

    /* JADX INFO: Fake field, exist only in values array */
    ConstraintSetParser$MotionLayoutDebugFlags EF5;

    public static ConstraintSetParser$MotionLayoutDebugFlags valueOf(String str) {
        return (ConstraintSetParser$MotionLayoutDebugFlags) Enum.valueOf(ConstraintSetParser$MotionLayoutDebugFlags.class, str);
    }

    public static ConstraintSetParser$MotionLayoutDebugFlags[] values() {
        return (ConstraintSetParser$MotionLayoutDebugFlags[]) y.clone();
    }
}
