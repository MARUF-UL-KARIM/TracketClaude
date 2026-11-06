package com.google.android.gms.internal.ads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class zzibq {
    public static final zzibq A;
    public static final /* synthetic */ zzibq[] B;
    public static final zzibq y;
    public static final zzibq z;

    /* JADX INFO: Fake field, exist only in values array */
    zzibq EF0;

    static {
        zzibq zzibqVar = new zzibq("SHA1", 0);
        zzibq zzibqVar2 = new zzibq("SHA224", 1);
        zzibq zzibqVar3 = new zzibq("SHA256", 2);
        y = zzibqVar3;
        zzibq zzibqVar4 = new zzibq("SHA384", 3);
        z = zzibqVar4;
        zzibq zzibqVar5 = new zzibq("SHA512", 4);
        A = zzibqVar5;
        B = new zzibq[]{zzibqVar, zzibqVar2, zzibqVar3, zzibqVar4, zzibqVar5};
    }

    public static zzibq[] values() {
        return (zzibq[]) B.clone();
    }
}
