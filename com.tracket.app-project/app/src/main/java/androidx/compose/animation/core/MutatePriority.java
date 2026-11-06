package androidx.compose.animation.core;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class MutatePriority {
    public static final MutatePriority y;
    public static final /* synthetic */ MutatePriority[] z;

    static {
        MutatePriority mutatePriority = new MutatePriority("Default", 0);
        y = mutatePriority;
        z = new MutatePriority[]{mutatePriority, new MutatePriority("UserInput", 1), new MutatePriority("PreventUserInput", 2)};
    }

    public static MutatePriority valueOf(String str) {
        return (MutatePriority) Enum.valueOf(MutatePriority.class, str);
    }

    public static MutatePriority[] values() {
        return (MutatePriority[]) z.clone();
    }
}
