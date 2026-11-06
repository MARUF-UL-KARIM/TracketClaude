package io.ktor.network.tls.extensions;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class NamedCurve {
    public static final /* synthetic */ NamedCurve[] y = {new NamedCurve("sect163k1", 0), new NamedCurve("sect163r1", 1), new NamedCurve("sect163r2", 2), new NamedCurve("sect193r1", 3), new NamedCurve("sect193r2", 4), new NamedCurve("sect233k1", 5), new NamedCurve("sect233r1", 6), new NamedCurve("sect239k1", 7), new NamedCurve("sect283k1", 8), new NamedCurve("sect283r1", 9), new NamedCurve("sect409k1", 10), new NamedCurve("sect409r1", 11), new NamedCurve("sect571k1", 12), new NamedCurve("sect571r1", 13), new NamedCurve("secp160k1", 14), new NamedCurve("secp160r1", 15), new NamedCurve("secp160r2", 16), new NamedCurve("secp192k1", 17), new NamedCurve("secp192r1", 18), new NamedCurve("secp224k1", 19), new NamedCurve("secp224r1", 20), new NamedCurve("secp256k1", 21), new NamedCurve("secp256r1", 22), new NamedCurve("secp384r1", 23), new NamedCurve("secp521r1", 24)};

    /* JADX INFO: Fake field, exist only in values array */
    NamedCurve EF5;

    public static NamedCurve valueOf(String str) {
        return (NamedCurve) Enum.valueOf(NamedCurve.class, str);
    }

    public static NamedCurve[] values() {
        return (NamedCurve[]) y.clone();
    }
}
