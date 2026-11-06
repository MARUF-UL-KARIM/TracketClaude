package io.ktor.http;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class CookieEncoding {
    public static final /* synthetic */ CookieEncoding[] y = {new CookieEncoding("RAW", 0), new CookieEncoding("DQUOTES", 1), new CookieEncoding("URI_ENCODING", 2), new CookieEncoding("BASE64_ENCODING", 3)};

    /* JADX INFO: Fake field, exist only in values array */
    CookieEncoding EF5;

    public static CookieEncoding valueOf(String str) {
        return (CookieEncoding) Enum.valueOf(CookieEncoding.class, str);
    }

    public static CookieEncoding[] values() {
        return (CookieEncoding[]) y.clone();
    }
}
