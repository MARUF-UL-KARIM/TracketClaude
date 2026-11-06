package com.google.api;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class HttpRule$PatternCase {
    public static final /* synthetic */ HttpRule$PatternCase[] y = {new HttpRule$PatternCase("GET", 0), new HttpRule$PatternCase("PUT", 1), new HttpRule$PatternCase("POST", 2), new HttpRule$PatternCase("DELETE", 3), new HttpRule$PatternCase("PATCH", 4), new HttpRule$PatternCase("CUSTOM", 5), new HttpRule$PatternCase("PATTERN_NOT_SET", 6)};

    /* JADX INFO: Fake field, exist only in values array */
    HttpRule$PatternCase EF5;

    public static HttpRule$PatternCase valueOf(String str) {
        return (HttpRule$PatternCase) Enum.valueOf(HttpRule$PatternCase.class, str);
    }

    public static HttpRule$PatternCase[] values() {
        return (HttpRule$PatternCase[]) y.clone();
    }
}
