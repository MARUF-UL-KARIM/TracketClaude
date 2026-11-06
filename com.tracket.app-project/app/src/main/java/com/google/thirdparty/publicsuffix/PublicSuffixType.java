package com.google.thirdparty.publicsuffix;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class PublicSuffixType {
    public static final /* synthetic */ PublicSuffixType[] y = {new PublicSuffixType("PRIVATE", 0), new PublicSuffixType("REGISTRY", 1)};

    /* JADX INFO: Fake field, exist only in values array */
    PublicSuffixType EF5;

    public static PublicSuffixType valueOf(String str) {
        return (PublicSuffixType) Enum.valueOf(PublicSuffixType.class, str);
    }

    public static PublicSuffixType[] values() {
        return (PublicSuffixType[]) y.clone();
    }
}
