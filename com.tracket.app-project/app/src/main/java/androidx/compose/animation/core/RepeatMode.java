package androidx.compose.animation.core;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class RepeatMode {
    public static final RepeatMode y;
    public static final /* synthetic */ RepeatMode[] z;

    static {
        RepeatMode repeatMode = new RepeatMode("Restart", 0);
        y = repeatMode;
        z = new RepeatMode[]{repeatMode, new RepeatMode("Reverse", 1)};
    }

    public static RepeatMode valueOf(String str) {
        return (RepeatMode) Enum.valueOf(RepeatMode.class, str);
    }

    public static RepeatMode[] values() {
        return (RepeatMode[]) z.clone();
    }
}
