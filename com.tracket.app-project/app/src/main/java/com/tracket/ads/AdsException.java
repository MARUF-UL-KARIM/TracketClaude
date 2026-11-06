package com.tracket.ads;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class AdsException extends Exception {
    public final Long A;
    public final AdsError y;
    public final String z;

    /* JADX WARN: Illegal instructions before constructor call */
    public AdsException(AdsError adsError, String str, String str2, Long l, int i) {
        str = (i & 2) != 0 ? null : str;
        str2 = (i & 8) != 0 ? null : str2;
        l = (i & 16) != 0 ? null : l;
        adsError.getClass();
        super(str == null ? adsError.name() : str, null);
        this.y = adsError;
        this.z = str2;
        this.A = l;
    }
}
