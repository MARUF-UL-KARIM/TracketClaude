package com.google.api;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class JwtLocation$InCase {
    public static final /* synthetic */ JwtLocation$InCase[] y = {new JwtLocation$InCase("HEADER", 0), new JwtLocation$InCase("QUERY", 1), new JwtLocation$InCase("IN_NOT_SET", 2)};

    /* JADX INFO: Fake field, exist only in values array */
    JwtLocation$InCase EF5;

    public static JwtLocation$InCase valueOf(String str) {
        return (JwtLocation$InCase) Enum.valueOf(JwtLocation$InCase.class, str);
    }

    public static JwtLocation$InCase[] values() {
        return (JwtLocation$InCase[]) y.clone();
    }
}
