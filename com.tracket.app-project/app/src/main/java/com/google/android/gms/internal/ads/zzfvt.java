package com.google.android.gms.internal.ads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class zzfvt {
    public static final zzfvt y;
    public static final /* synthetic */ zzfvt[] z;

    /* JADX INFO: Fake field, exist only in values array */
    zzfvt EF0;

    static {
        zzfvt zzfvtVar = new zzfvt("VIDEO_CONTROLS", 0);
        zzfvt zzfvtVar2 = new zzfvt("CLOSE_AD", 1);
        zzfvt zzfvtVar3 = new zzfvt("NOT_VISIBLE", 2);
        y = zzfvtVar3;
        z = new zzfvt[]{zzfvtVar, zzfvtVar2, zzfvtVar3, new zzfvt("OTHER", 3)};
    }

    public static zzfvt[] values() {
        return (zzfvt[]) z.clone();
    }
}
