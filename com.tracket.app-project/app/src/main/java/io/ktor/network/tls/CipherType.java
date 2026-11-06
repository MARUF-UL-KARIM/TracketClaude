package io.ktor.network.tls;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class CipherType {
    public static final /* synthetic */ CipherType[] y = {new CipherType("GCM", 0), new CipherType("CBC", 1)};

    /* JADX INFO: Fake field, exist only in values array */
    CipherType EF5;

    public static CipherType valueOf(String str) {
        return (CipherType) Enum.valueOf(CipherType.class, str);
    }

    public static CipherType[] values() {
        return (CipherType[]) y.clone();
    }
}
