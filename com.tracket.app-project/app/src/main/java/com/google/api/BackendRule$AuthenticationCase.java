package com.google.api;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class BackendRule$AuthenticationCase {
    public static final /* synthetic */ BackendRule$AuthenticationCase[] y = {new BackendRule$AuthenticationCase("JWT_AUDIENCE", 0), new BackendRule$AuthenticationCase("DISABLE_AUTH", 1), new BackendRule$AuthenticationCase("AUTHENTICATION_NOT_SET", 2)};

    /* JADX INFO: Fake field, exist only in values array */
    BackendRule$AuthenticationCase EF5;

    public static BackendRule$AuthenticationCase valueOf(String str) {
        return (BackendRule$AuthenticationCase) Enum.valueOf(BackendRule$AuthenticationCase.class, str);
    }

    public static BackendRule$AuthenticationCase[] values() {
        return (BackendRule$AuthenticationCase[]) y.clone();
    }
}
