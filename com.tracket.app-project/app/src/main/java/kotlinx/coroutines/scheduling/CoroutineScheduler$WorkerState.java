package kotlinx.coroutines.scheduling;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class CoroutineScheduler$WorkerState {
    public static final CoroutineScheduler$WorkerState A;
    public static final CoroutineScheduler$WorkerState B;
    public static final CoroutineScheduler$WorkerState C;
    public static final /* synthetic */ CoroutineScheduler$WorkerState[] D;
    public static final CoroutineScheduler$WorkerState y;
    public static final CoroutineScheduler$WorkerState z;

    static {
        CoroutineScheduler$WorkerState coroutineScheduler$WorkerState = new CoroutineScheduler$WorkerState("CPU_ACQUIRED", 0);
        y = coroutineScheduler$WorkerState;
        CoroutineScheduler$WorkerState coroutineScheduler$WorkerState2 = new CoroutineScheduler$WorkerState("BLOCKING", 1);
        z = coroutineScheduler$WorkerState2;
        CoroutineScheduler$WorkerState coroutineScheduler$WorkerState3 = new CoroutineScheduler$WorkerState("PARKING", 2);
        A = coroutineScheduler$WorkerState3;
        CoroutineScheduler$WorkerState coroutineScheduler$WorkerState4 = new CoroutineScheduler$WorkerState("DORMANT", 3);
        B = coroutineScheduler$WorkerState4;
        CoroutineScheduler$WorkerState coroutineScheduler$WorkerState5 = new CoroutineScheduler$WorkerState("TERMINATED", 4);
        C = coroutineScheduler$WorkerState5;
        D = new CoroutineScheduler$WorkerState[]{coroutineScheduler$WorkerState, coroutineScheduler$WorkerState2, coroutineScheduler$WorkerState3, coroutineScheduler$WorkerState4, coroutineScheduler$WorkerState5};
    }

    public static CoroutineScheduler$WorkerState valueOf(String str) {
        return (CoroutineScheduler$WorkerState) Enum.valueOf(CoroutineScheduler$WorkerState.class, str);
    }

    public static CoroutineScheduler$WorkerState[] values() {
        return (CoroutineScheduler$WorkerState[]) D.clone();
    }
}
