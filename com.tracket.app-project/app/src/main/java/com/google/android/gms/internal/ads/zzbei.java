package com.google.android.gms.internal.ads;

import defpackage.lxd;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public enum zzbei implements lxd {
    UNSUPPORTED(0),
    ARM7(2),
    X86(4),
    ARM64(5),
    X86_64(6),
    RISCV64(7),
    UNKNOWN(999);

    public final int y;

    zzbei(int i) {
        this.y = i;
    }

    public static zzbei a(int i) {
        if (i == 0) {
            return UNSUPPORTED;
        }
        if (i == 2) {
            return ARM7;
        }
        if (i == 999) {
            return UNKNOWN;
        }
        if (i == 4) {
            return X86;
        }
        if (i == 5) {
            return ARM64;
        }
        if (i == 6) {
            return X86_64;
        }
        if (i != 7) {
            return null;
        }
        return RISCV64;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.y);
    }

    @Override // defpackage.lxd
    public final int zza() {
        return this.y;
    }
}
