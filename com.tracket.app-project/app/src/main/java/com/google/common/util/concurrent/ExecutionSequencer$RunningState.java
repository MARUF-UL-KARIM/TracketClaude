package com.google.common.util.concurrent;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
final class ExecutionSequencer$RunningState {
    public static final /* synthetic */ ExecutionSequencer$RunningState[] y = {new ExecutionSequencer$RunningState("NOT_RUN", 0), new ExecutionSequencer$RunningState("CANCELLED", 1), new ExecutionSequencer$RunningState("STARTED", 2)};

    /* JADX INFO: Fake field, exist only in values array */
    ExecutionSequencer$RunningState EF5;

    public static ExecutionSequencer$RunningState valueOf(String str) {
        return (ExecutionSequencer$RunningState) Enum.valueOf(ExecutionSequencer$RunningState.class, str);
    }

    public static ExecutionSequencer$RunningState[] values() {
        return (ExecutionSequencer$RunningState[]) y.clone();
    }
}
