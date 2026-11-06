package com.google.common.util.concurrent;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
final class SequentialExecutor$WorkerRunningState {
    public static final /* synthetic */ SequentialExecutor$WorkerRunningState[] y = {new SequentialExecutor$WorkerRunningState("IDLE", 0), new SequentialExecutor$WorkerRunningState("QUEUING", 1), new SequentialExecutor$WorkerRunningState("QUEUED", 2), new SequentialExecutor$WorkerRunningState("RUNNING", 3)};

    /* JADX INFO: Fake field, exist only in values array */
    SequentialExecutor$WorkerRunningState EF5;

    public static SequentialExecutor$WorkerRunningState valueOf(String str) {
        return (SequentialExecutor$WorkerRunningState) Enum.valueOf(SequentialExecutor$WorkerRunningState.class, str);
    }

    public static SequentialExecutor$WorkerRunningState[] values() {
        return (SequentialExecutor$WorkerRunningState[]) y.clone();
    }
}
