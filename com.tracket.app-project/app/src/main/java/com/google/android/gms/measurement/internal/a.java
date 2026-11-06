package com.google.android.gms.measurement.internal;

import java.util.EnumMap;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class a {
    public final EnumMap a;

    public a(EnumMap enumMap) {
        EnumMap enumMap2 = new EnumMap(zzjk.class);
        this.a = enumMap2;
        enumMap2.putAll(enumMap);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    public final void a(zzjk zzjkVar, int i) {
        zzam zzamVar;
        if (i == -30) {
            zzamVar = zzam.TCF;
        } else if (i == -20) {
            zzamVar = zzam.API;
        } else if (i == -10) {
            zzamVar = zzam.MANIFEST;
        } else if (i != 0) {
            zzamVar = i != 30 ? zzam.UNSET : zzam.INITIALIZATION;
        } else {
            zzamVar = zzam.API;
        }
        this.a.put(zzjkVar, zzamVar);
    }

    public final void b(zzjk zzjkVar, zzam zzamVar) {
        this.a.put(zzjkVar, zzamVar);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("1");
        for (zzjk zzjkVar : zzjk.values()) {
            zzam zzamVar = (zzam) this.a.get(zzjkVar);
            if (zzamVar == null) {
                zzamVar = zzam.UNSET;
            }
            sb.append(zzamVar.y);
        }
        return sb.toString();
    }

    public a() {
        this.a = new EnumMap(zzjk.class);
    }
}
