package com.google.android.gms.internal.ads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class zziaz {
    public static final zziaz A;
    public static final /* synthetic */ zziaz[] B;
    public static final zziaz y;
    public static final zziaz z;

    static {
        zziaz zziazVar = new zziaz("NIST_P256", 0);
        y = zziazVar;
        zziaz zziazVar2 = new zziaz("NIST_P384", 1);
        z = zziazVar2;
        zziaz zziazVar3 = new zziaz("NIST_P521", 2);
        A = zziazVar3;
        B = new zziaz[]{zziazVar, zziazVar2, zziazVar3};
    }

    public static zziaz[] values() {
        return (zziaz[]) B.clone();
    }
}
