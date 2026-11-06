package com.tracket.projects;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class WorkActionResult {
    public static final WorkActionResult A;
    public static final /* synthetic */ WorkActionResult[] B;
    public static final WorkActionResult y;
    public static final WorkActionResult z;

    static {
        WorkActionResult workActionResult = new WorkActionResult("SUCCESS", 0);
        y = workActionResult;
        WorkActionResult workActionResult2 = new WorkActionResult("UNAVAILABLE", 1);
        z = workActionResult2;
        WorkActionResult workActionResult3 = new WorkActionResult("NO_HANDLER", 2);
        A = workActionResult3;
        B = new WorkActionResult[]{workActionResult, workActionResult2, workActionResult3};
    }

    public static WorkActionResult valueOf(String str) {
        return (WorkActionResult) Enum.valueOf(WorkActionResult.class, str);
    }

    public static WorkActionResult[] values() {
        return (WorkActionResult[]) B.clone();
    }
}
