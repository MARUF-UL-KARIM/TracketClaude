package com.google.android.gms.internal.ads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
final class zzyj {
    public static final zzyj A;
    public static final /* synthetic */ zzyj[] B;
    public static final zzyj y;
    public static final zzyj z;

    static {
        zzyj zzyjVar = new zzyj("PASS_THROUGH", 0);
        y = zzyjVar;
        zzyj zzyjVar2 = new zzyj("DISCARD_AFTER_NEXT_SAMPLE_METADATA", 1);
        z = zzyjVar2;
        zzyj zzyjVar3 = new zzyj("DISCARDING", 2);
        A = zzyjVar3;
        B = new zzyj[]{zzyjVar, zzyjVar2, zzyjVar3};
    }

    public static zzyj[] values() {
        return (zzyj[]) B.clone();
    }
}
