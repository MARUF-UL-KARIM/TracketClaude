package io.ktor.network.tls;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class SecretExchangeType {
    public static final /* synthetic */ SecretExchangeType[] y = {new SecretExchangeType("ECDHE", 0), new SecretExchangeType("RSA", 1)};

    /* JADX INFO: Fake field, exist only in values array */
    SecretExchangeType EF5;

    public static SecretExchangeType valueOf(String str) {
        return (SecretExchangeType) Enum.valueOf(SecretExchangeType.class, str);
    }

    public static SecretExchangeType[] values() {
        return (SecretExchangeType[]) y.clone();
    }
}
