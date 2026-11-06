package com.tracket.ads;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public enum AdPlacement {
    A("rewarded_export", "rewarded"),
    B("editor_exit", "interstitial"),
    C("warm_return", "app_open"),
    D("projects", "native");

    public final String y;
    public final String z;

    AdPlacement(String str, String str2) {
        this.y = str;
        this.z = str2;
    }
}
