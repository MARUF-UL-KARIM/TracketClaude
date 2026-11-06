package com.google.android.gms.internal.ads;

import defpackage.lxd;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public enum zzbil$zzq implements lxd {
    ENUM_FALSE(0),
    ENUM_TRUE(1),
    ENUM_UNKNOWN(1000);

    public final int y;

    zzbil$zzq(int i) {
        this.y = i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.y);
    }

    @Override // defpackage.lxd
    public final int zza() {
        return this.y;
    }
}
