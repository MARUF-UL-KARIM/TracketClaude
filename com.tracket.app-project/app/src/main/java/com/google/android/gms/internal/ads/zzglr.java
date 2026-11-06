package com.google.android.gms.internal.ads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
final class zzglr {
    public static final zzglr A;
    public static final zzglr B;
    public static final zzglr C;
    public static final zzglr D;
    public static final /* synthetic */ zzglr[] E;
    public static final zzglr y;
    public static final zzglr z;

    static {
        zzglr zzglrVar = new zzglr("RESULT_UNKNOWN", 0);
        y = zzglrVar;
        zzglr zzglrVar2 = new zzglr("RESULT_NOOP_LOCAL_PROGRAM_STILL_VALID", 1);
        z = zzglrVar2;
        zzglr zzglrVar3 = new zzglr("RESULT_UPDATED", 2);
        A = zzglrVar3;
        zzglr zzglrVar4 = new zzglr("RESULT_NOOP_NO_NEW_PROGRAM", 3);
        B = zzglrVar4;
        zzglr zzglrVar5 = new zzglr("RESULT_FAILURE_INVALID_RESPONSE", 4);
        C = zzglrVar5;
        zzglr zzglrVar6 = new zzglr("RESULT_FAILURE_FETCHER_HTTP_RUNTIME_EXCEPTION", 5);
        D = zzglrVar6;
        E = new zzglr[]{zzglrVar, zzglrVar2, zzglrVar3, zzglrVar4, zzglrVar5, zzglrVar6};
    }

    public static zzglr[] values() {
        return (zzglr[]) E.clone();
    }
}
