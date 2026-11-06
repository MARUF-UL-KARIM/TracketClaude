package androidx.constraintlayout.compose;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class MotionLayoutDebugFlags {
    public static final /* synthetic */ MotionLayoutDebugFlags[] y = {new MotionLayoutDebugFlags("NONE", 0), new MotionLayoutDebugFlags("SHOW_ALL", 1), new MotionLayoutDebugFlags("UNKNOWN", 2)};

    /* JADX INFO: Fake field, exist only in values array */
    MotionLayoutDebugFlags EF5;

    public static MotionLayoutDebugFlags valueOf(String str) {
        return (MotionLayoutDebugFlags) Enum.valueOf(MotionLayoutDebugFlags.class, str);
    }

    public static MotionLayoutDebugFlags[] values() {
        return (MotionLayoutDebugFlags[]) y.clone();
    }
}
