package com.google.android.gms.internal.mlkit_vision_mediapipe;

import defpackage.cp2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
final class zzdk {
    public static final zzdk A;
    public static final zzdk B;
    public static final /* synthetic */ zzdk[] C;
    public static final zzdk y;
    public static final zzdk z;

    static {
        zzdk zzdkVar = new zzdk("BOOLEAN", 0);
        y = zzdkVar;
        zzdk zzdkVar2 = new zzdk("STRING", 1);
        z = zzdkVar2;
        zzdk zzdkVar3 = new zzdk("LONG", 2);
        A = zzdkVar3;
        zzdk zzdkVar4 = new zzdk("DOUBLE", 3);
        B = zzdkVar4;
        C = new zzdk[]{zzdkVar, zzdkVar2, zzdkVar3, zzdkVar4};
    }

    public static /* bridge */ /* synthetic */ zzdk a(Object obj) {
        if (obj instanceof String) {
            return z;
        }
        if (obj instanceof Boolean) {
            return y;
        }
        if (obj instanceof Long) {
            return A;
        }
        if (obj instanceof Double) {
            return B;
        }
        cp2.i("invalid tag type: ".concat(String.valueOf(obj.getClass())));
        return null;
    }

    public static zzdk[] values() {
        return (zzdk[]) C.clone();
    }
}
