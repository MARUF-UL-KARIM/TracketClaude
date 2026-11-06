package com.tracket.base;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class RemoteConfigValueSource {
    public static final RemoteConfigValueSource A;
    public static final RemoteConfigValueSource B;
    public static final RemoteConfigValueSource C;
    public static final /* synthetic */ RemoteConfigValueSource[] D;
    public static final RemoteConfigValueSource y;
    public static final RemoteConfigValueSource z;

    static {
        RemoteConfigValueSource remoteConfigValueSource = new RemoteConfigValueSource("REMOTE", 0);
        y = remoteConfigValueSource;
        RemoteConfigValueSource remoteConfigValueSource2 = new RemoteConfigValueSource("DEFAULT", 1);
        z = remoteConfigValueSource2;
        RemoteConfigValueSource remoteConfigValueSource3 = new RemoteConfigValueSource("STATIC", 2);
        A = remoteConfigValueSource3;
        RemoteConfigValueSource remoteConfigValueSource4 = new RemoteConfigValueSource("OVERRIDE", 3);
        B = remoteConfigValueSource4;
        RemoteConfigValueSource remoteConfigValueSource5 = new RemoteConfigValueSource("UNKNOWN", 4);
        C = remoteConfigValueSource5;
        D = new RemoteConfigValueSource[]{remoteConfigValueSource, remoteConfigValueSource2, remoteConfigValueSource3, remoteConfigValueSource4, remoteConfigValueSource5};
    }

    public static RemoteConfigValueSource valueOf(String str) {
        return (RemoteConfigValueSource) Enum.valueOf(RemoteConfigValueSource.class, str);
    }

    public static RemoteConfigValueSource[] values() {
        return (RemoteConfigValueSource[]) D.clone();
    }
}
