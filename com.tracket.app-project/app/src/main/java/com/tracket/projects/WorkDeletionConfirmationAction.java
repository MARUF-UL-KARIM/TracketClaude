package com.tracket.projects;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class WorkDeletionConfirmationAction {
    public static final WorkDeletionConfirmationAction A;
    public static final /* synthetic */ WorkDeletionConfirmationAction[] B;
    public static final WorkDeletionConfirmationAction y;
    public static final WorkDeletionConfirmationAction z;

    static {
        WorkDeletionConfirmationAction workDeletionConfirmationAction = new WorkDeletionConfirmationAction("KEEP_RECORD", 0);
        y = workDeletionConfirmationAction;
        WorkDeletionConfirmationAction workDeletionConfirmationAction2 = new WorkDeletionConfirmationAction("RETRY_DELETE", 1);
        z = workDeletionConfirmationAction2;
        WorkDeletionConfirmationAction workDeletionConfirmationAction3 = new WorkDeletionConfirmationAction("REMOVE_RECORD", 2);
        A = workDeletionConfirmationAction3;
        B = new WorkDeletionConfirmationAction[]{workDeletionConfirmationAction, workDeletionConfirmationAction2, workDeletionConfirmationAction3};
    }

    public static WorkDeletionConfirmationAction valueOf(String str) {
        return (WorkDeletionConfirmationAction) Enum.valueOf(WorkDeletionConfirmationAction.class, str);
    }

    public static WorkDeletionConfirmationAction[] values() {
        return (WorkDeletionConfirmationAction[]) B.clone();
    }
}
