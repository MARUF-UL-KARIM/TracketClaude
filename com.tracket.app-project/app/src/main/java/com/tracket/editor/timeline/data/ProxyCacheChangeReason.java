package com.tracket.editor.timeline.data;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class ProxyCacheChangeReason {
    public static final ProxyCacheChangeReason A;
    public static final ProxyCacheChangeReason B;
    public static final /* synthetic */ ProxyCacheChangeReason[] C;
    public static final ProxyCacheChangeReason y;
    public static final ProxyCacheChangeReason z;

    static {
        ProxyCacheChangeReason proxyCacheChangeReason = new ProxyCacheChangeReason("INITIAL", 0);
        y = proxyCacheChangeReason;
        ProxyCacheChangeReason proxyCacheChangeReason2 = new ProxyCacheChangeReason("UPDATED", 1);
        z = proxyCacheChangeReason2;
        ProxyCacheChangeReason proxyCacheChangeReason3 = new ProxyCacheChangeReason("CLEARED", 2);
        A = proxyCacheChangeReason3;
        ProxyCacheChangeReason proxyCacheChangeReason4 = new ProxyCacheChangeReason("INVALIDATED", 3);
        B = proxyCacheChangeReason4;
        C = new ProxyCacheChangeReason[]{proxyCacheChangeReason, proxyCacheChangeReason2, proxyCacheChangeReason3, proxyCacheChangeReason4};
    }

    public static ProxyCacheChangeReason valueOf(String str) {
        return (ProxyCacheChangeReason) Enum.valueOf(ProxyCacheChangeReason.class, str);
    }

    public static ProxyCacheChangeReason[] values() {
        return (ProxyCacheChangeReason[]) C.clone();
    }
}
