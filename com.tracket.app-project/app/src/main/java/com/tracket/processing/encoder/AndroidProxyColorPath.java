package com.tracket.processing.encoder;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class AndroidProxyColorPath {
    public static final /* synthetic */ AndroidProxyColorPath[] A;
    public static final AndroidProxyColorPath y;
    public static final AndroidProxyColorPath z;

    static {
        AndroidProxyColorPath androidProxyColorPath = new AndroidProxyColorPath("DETERMINISTIC_HDR_TO_SDR", 0);
        y = androidProxyColorPath;
        AndroidProxyColorPath androidProxyColorPath2 = new AndroidProxyColorPath("LEGACY_SDR", 1);
        z = androidProxyColorPath2;
        A = new AndroidProxyColorPath[]{androidProxyColorPath, androidProxyColorPath2};
    }

    public static AndroidProxyColorPath valueOf(String str) {
        return (AndroidProxyColorPath) Enum.valueOf(AndroidProxyColorPath.class, str);
    }

    public static AndroidProxyColorPath[] values() {
        return (AndroidProxyColorPath[]) A.clone();
    }
}
