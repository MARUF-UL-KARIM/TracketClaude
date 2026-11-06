package io.ktor.client.engine;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes4.dex */
public final class ProxyType {
    public static final /* synthetic */ ProxyType[] y = {new ProxyType("SOCKS", 0), new ProxyType("HTTP", 1), new ProxyType("UNKNOWN", 2)};

    /* JADX INFO: Fake field, exist only in values array */
    ProxyType EF5;

    public static ProxyType valueOf(String str) {
        return (ProxyType) Enum.valueOf(ProxyType.class, str);
    }

    public static ProxyType[] values() {
        return (ProxyType[]) y.clone();
    }
}
