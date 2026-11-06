package com.google.android.gms.internal.measurement;

import defpackage.cp2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
final class zzabd {
    public static final zzabd A;
    public static final zzabd B;
    public static final /* synthetic */ zzabd[] C;
    public static final zzabd y;
    public static final zzabd z;

    static {
        zzabd zzabdVar = new zzabd("BOOLEAN", 0);
        y = zzabdVar;
        zzabd zzabdVar2 = new zzabd("STRING", 1);
        z = zzabdVar2;
        zzabd zzabdVar3 = new zzabd("LONG", 2);
        A = zzabdVar3;
        zzabd zzabdVar4 = new zzabd("DOUBLE", 3);
        B = zzabdVar4;
        C = new zzabd[]{zzabdVar, zzabdVar2, zzabdVar3, zzabdVar4};
    }

    public static /* synthetic */ zzabd a(Object obj) {
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

    public static zzabd[] values() {
        return (zzabd[]) C.clone();
    }
}
