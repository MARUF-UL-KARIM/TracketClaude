package com.google.android.gms.internal.ads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class zzict {
    public static final /* synthetic */ zzict[] A;
    public static final zzict y;
    public static final zzict z;

    static {
        zzict zzictVar = new zzict("LENIENT", 0);
        y = zzictVar;
        zzict zzictVar2 = new zzict("LEGACY_STRICT", 1);
        z = zzictVar2;
        A = new zzict[]{zzictVar, zzictVar2, new zzict("STRICT", 2)};
    }

    public static zzict[] values() {
        return (zzict[]) A.clone();
    }
}
