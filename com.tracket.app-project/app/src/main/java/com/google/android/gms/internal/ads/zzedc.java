package com.google.android.gms.internal.ads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class zzedc {
    public static final zzedc A;
    public static final /* synthetic */ zzedc[] B;
    public static final zzedc y;
    public static final zzedc z;

    static {
        zzedc zzedcVar = new zzedc("AD_REQUESTED", 0);
        y = zzedcVar;
        zzedc zzedcVar2 = new zzedc("AD_LOADED", 1);
        z = zzedcVar2;
        zzedc zzedcVar3 = new zzedc("AD_LOAD_FAILED", 2);
        A = zzedcVar3;
        B = new zzedc[]{zzedcVar, zzedcVar2, zzedcVar3};
    }

    public static zzedc[] values() {
        return (zzedc[]) B.clone();
    }
}
