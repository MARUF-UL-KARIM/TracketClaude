package io.ktor.network.tls;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class TLSVersion {
    public static final /* synthetic */ TLSVersion[] y = {new TLSVersion("SSL3", 0), new TLSVersion("TLS10", 1), new TLSVersion("TLS11", 2), new TLSVersion("TLS12", 3)};

    /* JADX INFO: Fake field, exist only in values array */
    TLSVersion EF5;

    public static TLSVersion valueOf(String str) {
        return (TLSVersion) Enum.valueOf(TLSVersion.class, str);
    }

    public static TLSVersion[] values() {
        return (TLSVersion[]) y.clone();
    }
}
