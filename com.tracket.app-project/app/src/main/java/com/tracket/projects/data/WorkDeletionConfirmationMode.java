package com.tracket.projects.data;

import defpackage.x03;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class WorkDeletionConfirmationMode {
    public static final /* synthetic */ WorkDeletionConfirmationMode[] A;
    public static final /* synthetic */ x03 B;
    public static final WorkDeletionConfirmationMode y;
    public static final WorkDeletionConfirmationMode z;

    static {
        WorkDeletionConfirmationMode workDeletionConfirmationMode = new WorkDeletionConfirmationMode("RETRY_DELETE", 0);
        y = workDeletionConfirmationMode;
        WorkDeletionConfirmationMode workDeletionConfirmationMode2 = new WorkDeletionConfirmationMode("DELETE_COMPLETED", 1);
        z = workDeletionConfirmationMode2;
        WorkDeletionConfirmationMode[] workDeletionConfirmationModeArr = {workDeletionConfirmationMode, workDeletionConfirmationMode2};
        A = workDeletionConfirmationModeArr;
        B = new x03(workDeletionConfirmationModeArr);
    }

    public static WorkDeletionConfirmationMode valueOf(String str) {
        return (WorkDeletionConfirmationMode) Enum.valueOf(WorkDeletionConfirmationMode.class, str);
    }

    public static WorkDeletionConfirmationMode[] values() {
        return (WorkDeletionConfirmationMode[]) A.clone();
    }
}
