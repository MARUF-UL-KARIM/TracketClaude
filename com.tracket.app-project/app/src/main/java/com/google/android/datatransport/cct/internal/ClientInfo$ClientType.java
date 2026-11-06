package com.google.android.datatransport.cct.internal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class ClientInfo$ClientType {
    public static final ClientInfo$ClientType y;
    public static final /* synthetic */ ClientInfo$ClientType[] z;

    /* JADX INFO: Fake field, exist only in values array */
    ClientInfo$ClientType EF0;

    static {
        ClientInfo$ClientType clientInfo$ClientType = new ClientInfo$ClientType("UNKNOWN", 0);
        ClientInfo$ClientType clientInfo$ClientType2 = new ClientInfo$ClientType("ANDROID_FIREBASE", 1);
        y = clientInfo$ClientType2;
        z = new ClientInfo$ClientType[]{clientInfo$ClientType, clientInfo$ClientType2};
    }

    public static ClientInfo$ClientType valueOf(String str) {
        return (ClientInfo$ClientType) Enum.valueOf(ClientInfo$ClientType.class, str);
    }

    public static ClientInfo$ClientType[] values() {
        return (ClientInfo$ClientType[]) z.clone();
    }
}
