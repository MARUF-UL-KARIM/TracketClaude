package com.google.android.datatransport.runtime.scheduling.jobscheduling;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class SchedulerConfig$Flag {
    public static final SchedulerConfig$Flag A;
    public static final /* synthetic */ SchedulerConfig$Flag[] B;
    public static final SchedulerConfig$Flag y;
    public static final SchedulerConfig$Flag z;

    static {
        SchedulerConfig$Flag schedulerConfig$Flag = new SchedulerConfig$Flag("NETWORK_UNMETERED", 0);
        y = schedulerConfig$Flag;
        SchedulerConfig$Flag schedulerConfig$Flag2 = new SchedulerConfig$Flag("DEVICE_IDLE", 1);
        z = schedulerConfig$Flag2;
        SchedulerConfig$Flag schedulerConfig$Flag3 = new SchedulerConfig$Flag("DEVICE_CHARGING", 2);
        A = schedulerConfig$Flag3;
        B = new SchedulerConfig$Flag[]{schedulerConfig$Flag, schedulerConfig$Flag2, schedulerConfig$Flag3};
    }

    public static SchedulerConfig$Flag valueOf(String str) {
        return (SchedulerConfig$Flag) Enum.valueOf(SchedulerConfig$Flag.class, str);
    }

    public static SchedulerConfig$Flag[] values() {
        return (SchedulerConfig$Flag[]) B.clone();
    }
}
