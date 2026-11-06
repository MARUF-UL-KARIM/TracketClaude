package com.google.android.gms.internal.ads;

import defpackage.k8d;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
final class zzgun implements k8d {
    public static final zzgun y;
    public static final /* synthetic */ zzgun[] z;

    static {
        zzgun zzgunVar = new zzgun("ALWAYS_TRUE", 0);
        y = zzgunVar;
        z = new zzgun[]{zzgunVar, new zzgun("ALWAYS_FALSE", 1), new zzgun("IS_NULL", 2), new zzgun("NOT_NULL", 3)};
    }

    public static zzgun[] values() {
        return (zzgun[]) z.clone();
    }

    @Override // defpackage.k8d
    public final /* synthetic */ boolean i(Object obj) {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return true;
        }
        if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return obj != null;
                }
                throw null;
            }
            if (obj == null) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.Enum
    public final /* synthetic */ String toString() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return "Predicates.alwaysTrue()";
        }
        if (iOrdinal == 1) {
            return "Predicates.alwaysFalse()";
        }
        if (iOrdinal != 2) {
            return iOrdinal != 3 ? super.toString() : "Predicates.notNull()";
        }
        return "Predicates.isNull()";
    }
}
