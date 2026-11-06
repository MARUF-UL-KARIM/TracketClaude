package com.tracket.processing.proxy;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class ProxyItemStatus {
    public static final ProxyItemStatus A;
    public static final ProxyItemStatus B;
    public static final ProxyItemStatus C;
    public static final ProxyItemStatus D;
    public static final /* synthetic */ ProxyItemStatus[] E;
    public static final ProxyItemStatus y;
    public static final ProxyItemStatus z;

    static {
        ProxyItemStatus proxyItemStatus = new ProxyItemStatus("NOT_GENERATED", 0);
        y = proxyItemStatus;
        ProxyItemStatus proxyItemStatus2 = new ProxyItemStatus("QUEUED", 1);
        z = proxyItemStatus2;
        ProxyItemStatus proxyItemStatus3 = new ProxyItemStatus("GENERATING", 2);
        A = proxyItemStatus3;
        ProxyItemStatus proxyItemStatus4 = new ProxyItemStatus("READY", 3);
        B = proxyItemStatus4;
        ProxyItemStatus proxyItemStatus5 = new ProxyItemStatus("DISABLED", 4);
        C = proxyItemStatus5;
        ProxyItemStatus proxyItemStatus6 = new ProxyItemStatus("FAILED", 5);
        D = proxyItemStatus6;
        E = new ProxyItemStatus[]{proxyItemStatus, proxyItemStatus2, proxyItemStatus3, proxyItemStatus4, proxyItemStatus5, proxyItemStatus6};
    }

    public static ProxyItemStatus valueOf(String str) {
        return (ProxyItemStatus) Enum.valueOf(ProxyItemStatus.class, str);
    }

    public static ProxyItemStatus[] values() {
        return (ProxyItemStatus[]) E.clone();
    }
}
