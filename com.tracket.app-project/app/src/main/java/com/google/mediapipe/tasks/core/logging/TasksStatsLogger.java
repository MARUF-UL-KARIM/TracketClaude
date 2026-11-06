package com.google.mediapipe.tasks.core.logging;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public interface TasksStatsLogger {

    /* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
    public static abstract class StatsSnapshot {
        public static StatsSnapshot create(int i, int i2, int i3, int i4, long j, long j2, long j3) {
            return new AutoValue_TasksStatsLogger_StatsSnapshot(i, i2, i3, i4, j, j2, j3);
        }

        public static StatsSnapshot createDefault() {
            return new AutoValue_TasksStatsLogger_StatsSnapshot(0, 0, 0, 0, 0L, 0L, 0L);
        }

        public abstract int cpuInputCount();

        public abstract int droppedCount();

        public abstract long elapsedTimeMs();

        public abstract int finishedCount();

        public abstract int gpuInputCount();

        public abstract long peakLatencyMs();

        public abstract long totalLatencyMs();
    }

    void logInitError();

    void logInvocationReport(StatsSnapshot statsSnapshot);

    void logSessionClone();

    void logSessionEnd();

    void logSessionStart();

    void recordCpuInputArrival(long j);

    void recordGpuInputArrival(long j);

    void recordInvocationEnd(long j);
}
