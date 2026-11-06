package io.ktor.network.tls.extensions;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class SignatureAlgorithm {
    public static final /* synthetic */ SignatureAlgorithm[] y = {new SignatureAlgorithm("ANON", 0), new SignatureAlgorithm("RSA", 1), new SignatureAlgorithm("DSA", 2), new SignatureAlgorithm("ECDSA", 3), new SignatureAlgorithm("ED25519", 4), new SignatureAlgorithm("ED448", 5)};

    /* JADX INFO: Fake field, exist only in values array */
    SignatureAlgorithm EF5;

    public static SignatureAlgorithm valueOf(String str) {
        return (SignatureAlgorithm) Enum.valueOf(SignatureAlgorithm.class, str);
    }

    public static SignatureAlgorithm[] values() {
        return (SignatureAlgorithm[]) y.clone();
    }
}
