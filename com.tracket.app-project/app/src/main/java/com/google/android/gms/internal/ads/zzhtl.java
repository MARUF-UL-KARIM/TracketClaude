package com.google.android.gms.internal.ads;

import defpackage.lxd;
import defpackage.rxd;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public enum zzhtl implements lxd {
    UNKNOWN_HASH(0),
    SHA1(1),
    SHA384(2),
    SHA256(3),
    SHA512(4),
    SHA224(5),
    UNRECOGNIZED(-1);

    public final int y;

    zzhtl(int i) {
        this.y = i;
    }

    public static zzhtl a(int i) {
        if (i == 0) {
            return UNKNOWN_HASH;
        }
        if (i == 1) {
            return SHA1;
        }
        if (i == 2) {
            return SHA384;
        }
        if (i == 3) {
            return SHA256;
        }
        if (i == 4) {
            return SHA512;
        }
        if (i != 5) {
            return null;
        }
        return SHA224;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.y);
    }

    @Override // defpackage.lxd
    public final int zza() {
        if (this != UNRECOGNIZED) {
            return this.y;
        }
        rxd.a();
        throw null;
    }
}
