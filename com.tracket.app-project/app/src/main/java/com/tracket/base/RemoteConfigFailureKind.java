package com.tracket.base;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class RemoteConfigFailureKind {
    public static final /* synthetic */ RemoteConfigFailureKind[] A;
    public static final RemoteConfigFailureKind y;
    public static final RemoteConfigFailureKind z;

    static {
        RemoteConfigFailureKind remoteConfigFailureKind = new RemoteConfigFailureKind("NETWORK", 0);
        y = remoteConfigFailureKind;
        RemoteConfigFailureKind remoteConfigFailureKind2 = new RemoteConfigFailureKind("UNKNOWN", 1);
        z = remoteConfigFailureKind2;
        A = new RemoteConfigFailureKind[]{remoteConfigFailureKind, remoteConfigFailureKind2};
    }

    public static RemoteConfigFailureKind valueOf(String str) {
        return (RemoteConfigFailureKind) Enum.valueOf(RemoteConfigFailureKind.class, str);
    }

    public static RemoteConfigFailureKind[] values() {
        return (RemoteConfigFailureKind[]) A.clone();
    }
}
