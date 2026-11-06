package com.tracket.base;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class RemoteConfigFailureStage {
    public static final /* synthetic */ RemoteConfigFailureStage[] A;
    public static final RemoteConfigFailureStage y;
    public static final RemoteConfigFailureStage z;

    static {
        RemoteConfigFailureStage remoteConfigFailureStage = new RemoteConfigFailureStage("FETCH", 0);
        y = remoteConfigFailureStage;
        RemoteConfigFailureStage remoteConfigFailureStage2 = new RemoteConfigFailureStage("ACTIVATE", 1);
        z = remoteConfigFailureStage2;
        A = new RemoteConfigFailureStage[]{remoteConfigFailureStage, remoteConfigFailureStage2};
    }

    public static RemoteConfigFailureStage valueOf(String str) {
        return (RemoteConfigFailureStage) Enum.valueOf(RemoteConfigFailureStage.class, str);
    }

    public static RemoteConfigFailureStage[] values() {
        return (RemoteConfigFailureStage[]) A.clone();
    }
}
