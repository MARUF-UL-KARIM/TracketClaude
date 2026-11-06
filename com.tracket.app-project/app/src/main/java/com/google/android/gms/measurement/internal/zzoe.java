package com.google.android.gms.measurement.internal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
final class zzoe {
    public static final /* synthetic */ zzoe[] A;
    public static final zzoe y;
    public static final zzoe z;

    static {
        zzoe zzoeVar = new zzoe("CONSENT", 0);
        y = zzoeVar;
        zzoe zzoeVar2 = new zzoe("LEGITIMATE_INTEREST", 1);
        zzoe zzoeVar3 = new zzoe("FLEXIBLE_CONSENT", 2);
        zzoe zzoeVar4 = new zzoe("FLEXIBLE_LEGITIMATE_INTEREST", 3);
        z = zzoeVar4;
        A = new zzoe[]{zzoeVar, zzoeVar2, zzoeVar3, zzoeVar4};
    }

    public static zzoe[] values() {
        return (zzoe[]) A.clone();
    }
}
