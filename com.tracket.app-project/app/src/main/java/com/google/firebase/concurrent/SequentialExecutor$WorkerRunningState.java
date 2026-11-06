package com.google.firebase.concurrent;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
final class SequentialExecutor$WorkerRunningState {
    public static final SequentialExecutor$WorkerRunningState A;
    public static final SequentialExecutor$WorkerRunningState B;
    public static final /* synthetic */ SequentialExecutor$WorkerRunningState[] C;
    public static final SequentialExecutor$WorkerRunningState y;
    public static final SequentialExecutor$WorkerRunningState z;

    static {
        SequentialExecutor$WorkerRunningState sequentialExecutor$WorkerRunningState = new SequentialExecutor$WorkerRunningState("IDLE", 0);
        y = sequentialExecutor$WorkerRunningState;
        SequentialExecutor$WorkerRunningState sequentialExecutor$WorkerRunningState2 = new SequentialExecutor$WorkerRunningState("QUEUING", 1);
        z = sequentialExecutor$WorkerRunningState2;
        SequentialExecutor$WorkerRunningState sequentialExecutor$WorkerRunningState3 = new SequentialExecutor$WorkerRunningState("QUEUED", 2);
        A = sequentialExecutor$WorkerRunningState3;
        SequentialExecutor$WorkerRunningState sequentialExecutor$WorkerRunningState4 = new SequentialExecutor$WorkerRunningState("RUNNING", 3);
        B = sequentialExecutor$WorkerRunningState4;
        C = new SequentialExecutor$WorkerRunningState[]{sequentialExecutor$WorkerRunningState, sequentialExecutor$WorkerRunningState2, sequentialExecutor$WorkerRunningState3, sequentialExecutor$WorkerRunningState4};
    }

    public static SequentialExecutor$WorkerRunningState valueOf(String str) {
        return (SequentialExecutor$WorkerRunningState) Enum.valueOf(SequentialExecutor$WorkerRunningState.class, str);
    }

    public static SequentialExecutor$WorkerRunningState[] values() {
        return (SequentialExecutor$WorkerRunningState[]) C.clone();
    }
}
