package com.google.android.gms.internal.ads;

import defpackage.pyd;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class zzfe extends IllegalStateException {
    public final int y;
    public final int z;

    public zzfe(int i, int i2) {
        super(i != 0 ? i != 1 ? i != 2 ? i != 3 ? pyd.e(new StringBuilder(String.valueOf(i2).length() + 31), "Player stuck suppressed for ", i2, " ms") : pyd.e(new StringBuilder(String.valueOf(i2).length() + 43), "Player stuck playing without ending for ", i2, " ms") : pyd.e(new StringBuilder(String.valueOf(i2).length() + 45), "Player stuck playing with no progress for ", i2, " ms") : pyd.e(new StringBuilder(String.valueOf(i2).length() + 47), "Player stuck buffering with no progress for ", i2, " ms") : pyd.e(new StringBuilder(String.valueOf(i2).length() + 46), "Player stuck buffering and not loading for ", i2, " ms"));
        this.y = i;
        this.z = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzfe.class != obj.getClass()) {
            return false;
        }
        zzfe zzfeVar = (zzfe) obj;
        return this.y == zzfeVar.y && this.z == zzfeVar.z;
    }

    public final int hashCode() {
        return ((this.y + 527) * 31) + this.z;
    }
}
