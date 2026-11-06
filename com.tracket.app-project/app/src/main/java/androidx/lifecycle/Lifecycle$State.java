package androidx.lifecycle;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class Lifecycle$State {
    public static final Lifecycle$State A;
    public static final Lifecycle$State B;
    public static final Lifecycle$State C;
    public static final /* synthetic */ Lifecycle$State[] D;
    public static final Lifecycle$State y;
    public static final Lifecycle$State z;

    static {
        Lifecycle$State lifecycle$State = new Lifecycle$State("DESTROYED", 0);
        y = lifecycle$State;
        Lifecycle$State lifecycle$State2 = new Lifecycle$State("INITIALIZED", 1);
        z = lifecycle$State2;
        Lifecycle$State lifecycle$State3 = new Lifecycle$State("CREATED", 2);
        A = lifecycle$State3;
        Lifecycle$State lifecycle$State4 = new Lifecycle$State("STARTED", 3);
        B = lifecycle$State4;
        Lifecycle$State lifecycle$State5 = new Lifecycle$State("RESUMED", 4);
        C = lifecycle$State5;
        D = new Lifecycle$State[]{lifecycle$State, lifecycle$State2, lifecycle$State3, lifecycle$State4, lifecycle$State5};
    }

    public static Lifecycle$State valueOf(String str) {
        return (Lifecycle$State) Enum.valueOf(Lifecycle$State.class, str);
    }

    public static Lifecycle$State[] values() {
        return (Lifecycle$State[]) D.clone();
    }
}
