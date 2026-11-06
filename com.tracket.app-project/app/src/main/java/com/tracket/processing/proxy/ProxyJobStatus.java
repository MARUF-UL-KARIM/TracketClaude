package com.tracket.processing.proxy;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class ProxyJobStatus {
    public static final ProxyJobStatus A;
    public static final ProxyJobStatus B;
    public static final ProxyJobStatus C;
    public static final /* synthetic */ ProxyJobStatus[] D;
    public static final ProxyJobStatus y;
    public static final ProxyJobStatus z;

    static {
        ProxyJobStatus proxyJobStatus = new ProxyJobStatus("QUEUED", 0);
        y = proxyJobStatus;
        ProxyJobStatus proxyJobStatus2 = new ProxyJobStatus("RUNNING", 1);
        z = proxyJobStatus2;
        ProxyJobStatus proxyJobStatus3 = new ProxyJobStatus("COMPLETED", 2);
        A = proxyJobStatus3;
        ProxyJobStatus proxyJobStatus4 = new ProxyJobStatus("FAILED", 3);
        B = proxyJobStatus4;
        ProxyJobStatus proxyJobStatus5 = new ProxyJobStatus("CANCELLED", 4);
        C = proxyJobStatus5;
        D = new ProxyJobStatus[]{proxyJobStatus, proxyJobStatus2, proxyJobStatus3, proxyJobStatus4, proxyJobStatus5};
    }

    public static ProxyJobStatus valueOf(String str) {
        return (ProxyJobStatus) Enum.valueOf(ProxyJobStatus.class, str);
    }

    public static ProxyJobStatus[] values() {
        return (ProxyJobStatus[]) D.clone();
    }
}
