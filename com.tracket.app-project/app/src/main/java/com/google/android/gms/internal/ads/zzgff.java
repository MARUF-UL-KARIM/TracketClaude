package com.google.android.gms.internal.ads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class zzgff {
    public static final zzgff A;
    public static final /* synthetic */ zzgff[] B;
    public static final zzgff y;
    public static final zzgff z;

    static {
        zzgff zzgffVar = new zzgff("QUERY", 0);
        y = zzgffVar;
        zzgff zzgffVar2 = new zzgff("VIEW", 1);
        z = zzgffVar2;
        zzgff zzgffVar3 = new zzgff("CLICK", 2);
        A = zzgffVar3;
        B = new zzgff[]{zzgffVar, zzgffVar2, zzgffVar3};
    }

    public static zzgff[] values() {
        return (zzgff[]) B.clone();
    }
}
