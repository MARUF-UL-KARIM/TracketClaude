package androidx.work;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class WorkInfo$State {
    public static final WorkInfo$State A;
    public static final WorkInfo$State B;
    public static final WorkInfo$State C;
    public static final WorkInfo$State D;
    public static final /* synthetic */ WorkInfo$State[] E;
    public static final WorkInfo$State y;
    public static final WorkInfo$State z;

    static {
        WorkInfo$State workInfo$State = new WorkInfo$State("ENQUEUED", 0);
        y = workInfo$State;
        WorkInfo$State workInfo$State2 = new WorkInfo$State("RUNNING", 1);
        z = workInfo$State2;
        WorkInfo$State workInfo$State3 = new WorkInfo$State("SUCCEEDED", 2);
        A = workInfo$State3;
        WorkInfo$State workInfo$State4 = new WorkInfo$State("FAILED", 3);
        B = workInfo$State4;
        WorkInfo$State workInfo$State5 = new WorkInfo$State("BLOCKED", 4);
        C = workInfo$State5;
        WorkInfo$State workInfo$State6 = new WorkInfo$State("CANCELLED", 5);
        D = workInfo$State6;
        E = new WorkInfo$State[]{workInfo$State, workInfo$State2, workInfo$State3, workInfo$State4, workInfo$State5, workInfo$State6};
    }

    public static WorkInfo$State valueOf(String str) {
        return (WorkInfo$State) Enum.valueOf(WorkInfo$State.class, str);
    }

    public static WorkInfo$State[] values() {
        return (WorkInfo$State[]) E.clone();
    }

    public final boolean a() {
        return this == A || this == B || this == D;
    }
}
