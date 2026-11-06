package com.google.android.gms.ads.internal.util.client;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class zzt {
    public static final zzt A;
    public static final zzt B;
    public static final /* synthetic */ zzt[] C;
    public static final zzt y;
    public static final zzt z;

    static {
        zzt zztVar = new zzt("SUCCESS", 0);
        y = zztVar;
        zzt zztVar2 = new zzt("PERMANENT_FAILURE", 1);
        z = zztVar2;
        zzt zztVar3 = new zzt("RETRIABLE_FAILURE", 2);
        A = zztVar3;
        zzt zztVar4 = new zzt("BUFFERED", 3);
        B = zztVar4;
        C = new zzt[]{zztVar, zztVar2, zztVar3, zztVar4};
    }

    public static zzt[] values() {
        return (zzt[]) C.clone();
    }
}
