package io.ktor.http;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class CacheControl$Visibility {
    public static final /* synthetic */ CacheControl$Visibility[] y = {new CacheControl$Visibility("Public", 0), new CacheControl$Visibility("Private", 1)};

    /* JADX INFO: Fake field, exist only in values array */
    CacheControl$Visibility EF5;

    public static CacheControl$Visibility valueOf(String str) {
        return (CacheControl$Visibility) Enum.valueOf(CacheControl$Visibility.class, str);
    }

    public static CacheControl$Visibility[] values() {
        return (CacheControl$Visibility[]) y.clone();
    }
}
