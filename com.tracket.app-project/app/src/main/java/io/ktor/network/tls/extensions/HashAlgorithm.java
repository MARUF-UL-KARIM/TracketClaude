package io.ktor.network.tls.extensions;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class HashAlgorithm {
    public static final /* synthetic */ HashAlgorithm[] y = {new HashAlgorithm("NONE", 0), new HashAlgorithm("MD5", 1), new HashAlgorithm("SHA1", 2), new HashAlgorithm("SHA224", 3), new HashAlgorithm("SHA256", 4), new HashAlgorithm("SHA384", 5), new HashAlgorithm("SHA512", 6), new HashAlgorithm("INTRINSIC", 7)};

    /* JADX INFO: Fake field, exist only in values array */
    HashAlgorithm EF5;

    public static HashAlgorithm valueOf(String str) {
        return (HashAlgorithm) Enum.valueOf(HashAlgorithm.class, str);
    }

    public static HashAlgorithm[] values() {
        return (HashAlgorithm[]) y.clone();
    }
}
