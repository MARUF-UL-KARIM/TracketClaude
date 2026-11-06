package com.google.android.gms.internal.ads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class zzfnp {
    public static final zzfnp A;
    public static final /* synthetic */ zzfnp[] B;
    public static final zzfnp y;
    public static final zzfnp z;

    static {
        zzfnp zzfnpVar = new zzfnp("Rewarded", 0);
        y = zzfnpVar;
        zzfnp zzfnpVar2 = new zzfnp("Interstitial", 1);
        z = zzfnpVar2;
        zzfnp zzfnpVar3 = new zzfnp("AppOpen", 2);
        A = zzfnpVar3;
        B = new zzfnp[]{zzfnpVar, zzfnpVar2, zzfnpVar3};
    }

    public static zzfnp[] values() {
        return (zzfnp[]) B.clone();
    }
}
