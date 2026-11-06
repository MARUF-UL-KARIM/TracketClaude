package com.google.android.gms.internal.ads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class zzedo {
    public static final zzedo A;
    public static final zzedo B;
    public static final /* synthetic */ zzedo[] C;
    public static final zzedo y;
    public static final zzedo z;

    static {
        zzedo zzedoVar = new zzedo("UNKNOWN", 0);
        y = zzedoVar;
        zzedo zzedoVar2 = new zzedo("API", 1);
        z = zzedoVar2;
        zzedo zzedoVar3 = new zzedo("GESTURE", 2);
        A = zzedoVar3;
        zzedo zzedoVar4 = new zzedo("DEBUG_MENU", 3);
        B = zzedoVar4;
        C = new zzedo[]{zzedoVar, zzedoVar2, zzedoVar3, zzedoVar4};
    }

    public static zzedo[] values() {
        return (zzedo[]) C.clone();
    }
}
