package androidx.compose.runtime;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class Recomposer$State {
    public static final Recomposer$State A;
    public static final Recomposer$State B;
    public static final Recomposer$State C;
    public static final Recomposer$State D;
    public static final /* synthetic */ Recomposer$State[] E;
    public static final Recomposer$State y;
    public static final Recomposer$State z;

    static {
        Recomposer$State recomposer$State = new Recomposer$State("ShutDown", 0);
        y = recomposer$State;
        Recomposer$State recomposer$State2 = new Recomposer$State("ShuttingDown", 1);
        z = recomposer$State2;
        Recomposer$State recomposer$State3 = new Recomposer$State("Inactive", 2);
        A = recomposer$State3;
        Recomposer$State recomposer$State4 = new Recomposer$State("InactivePendingWork", 3);
        B = recomposer$State4;
        Recomposer$State recomposer$State5 = new Recomposer$State("Idle", 4);
        C = recomposer$State5;
        Recomposer$State recomposer$State6 = new Recomposer$State("PendingWork", 5);
        D = recomposer$State6;
        E = new Recomposer$State[]{recomposer$State, recomposer$State2, recomposer$State3, recomposer$State4, recomposer$State5, recomposer$State6};
    }

    public static Recomposer$State valueOf(String str) {
        return (Recomposer$State) Enum.valueOf(Recomposer$State.class, str);
    }

    public static Recomposer$State[] values() {
        return (Recomposer$State[]) E.clone();
    }
}
