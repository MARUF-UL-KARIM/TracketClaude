package com.tracket.processing;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class ReuseResult {
    public static final ReuseResult A;
    public static final ReuseResult B;
    public static final /* synthetic */ ReuseResult[] C;
    public static final ReuseResult y;
    public static final ReuseResult z;

    static {
        ReuseResult reuseResult = new ReuseResult("REUSE_RESULT_NO", 0);
        y = reuseResult;
        ReuseResult reuseResult2 = new ReuseResult("REUSE_RESULT_YES_WITHOUT_RECONFIGURATION", 1);
        z = reuseResult2;
        ReuseResult reuseResult3 = new ReuseResult("REUSE_RESULT_YES_WITH_RECONFIGURATION", 2);
        A = reuseResult3;
        ReuseResult reuseResult4 = new ReuseResult("REUSE_RESULT_YES_WITH_FLUSH", 3);
        B = reuseResult4;
        C = new ReuseResult[]{reuseResult, reuseResult2, reuseResult3, reuseResult4};
    }

    public static ReuseResult valueOf(String str) {
        return (ReuseResult) Enum.valueOf(ReuseResult.class, str);
    }

    public static ReuseResult[] values() {
        return (ReuseResult[]) C.clone();
    }
}
