package com.google.android.gms.internal.mlkit_vision_mediapipe;

import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class a implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        zzdk zzdkVarA = zzdk.a(obj);
        zzdk zzdkVarA2 = zzdk.a(obj2);
        if (zzdkVarA != zzdkVarA2) {
            return zzdkVarA.compareTo(zzdkVarA2);
        }
        int iOrdinal = zzdkVarA.ordinal();
        if (iOrdinal == 0) {
            return ((Boolean) obj).compareTo((Boolean) obj2);
        }
        if (iOrdinal == 1) {
            return ((String) obj).compareTo((String) obj2);
        }
        if (iOrdinal == 2) {
            return ((Long) obj).compareTo((Long) obj2);
        }
        if (iOrdinal == 3) {
            return ((Double) obj).compareTo((Double) obj2);
        }
        throw null;
    }
}
