package androidx.compose.foundation;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class MutatePriority {
    public static final MutatePriority A;
    public static final /* synthetic */ MutatePriority[] B;
    public static final MutatePriority y;
    public static final MutatePriority z;

    static {
        MutatePriority mutatePriority = new MutatePriority("Default", 0);
        y = mutatePriority;
        MutatePriority mutatePriority2 = new MutatePriority("UserInput", 1);
        z = mutatePriority2;
        MutatePriority mutatePriority3 = new MutatePriority("PreventUserInput", 2);
        A = mutatePriority3;
        B = new MutatePriority[]{mutatePriority, mutatePriority2, mutatePriority3};
    }

    public static MutatePriority valueOf(String str) {
        return (MutatePriority) Enum.valueOf(MutatePriority.class, str);
    }

    public static MutatePriority[] values() {
        return (MutatePriority[]) B.clone();
    }
}
