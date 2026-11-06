package com.google.android.gms.ads;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public enum AdFormat {
    BANNER(0),
    INTERSTITIAL(1),
    REWARDED(2),
    REWARDED_INTERSTITIAL(3),
    NATIVE(4),
    APP_OPEN_AD(6);

    public final int y;

    AdFormat(int i) {
        this.y = i;
    }

    public static AdFormat a(int i) {
        for (AdFormat adFormat : values()) {
            if (adFormat.y == i) {
                return adFormat;
            }
        }
        return null;
    }
}
