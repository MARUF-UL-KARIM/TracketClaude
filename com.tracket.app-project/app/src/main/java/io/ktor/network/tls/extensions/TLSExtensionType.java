package io.ktor.network.tls.extensions;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class TLSExtensionType {
    public static final /* synthetic */ TLSExtensionType[] y = {new TLSExtensionType("SERVER_NAME", 0), new TLSExtensionType("MAX_FRAGMENT_LENGTH", 1), new TLSExtensionType("CLIENT_CERTIFICATE_URL", 2), new TLSExtensionType("TRUSTED_CA_KEYS", 3), new TLSExtensionType("TRUNCATED_HMAC", 4), new TLSExtensionType("STATUS_REQUEST", 5), new TLSExtensionType("ELLIPTIC_CURVES", 6), new TLSExtensionType("EC_POINT_FORMAT", 7), new TLSExtensionType("SIGNATURE_ALGORITHMS", 8)};

    /* JADX INFO: Fake field, exist only in values array */
    TLSExtensionType EF5;

    public static TLSExtensionType valueOf(String str) {
        return (TLSExtensionType) Enum.valueOf(TLSExtensionType.class, str);
    }

    public static TLSExtensionType[] values() {
        return (TLSExtensionType[]) y.clone();
    }
}
