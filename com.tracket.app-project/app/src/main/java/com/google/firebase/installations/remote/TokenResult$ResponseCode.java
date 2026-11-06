package com.google.firebase.installations.remote;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class TokenResult$ResponseCode {
    public static final TokenResult$ResponseCode A;
    public static final /* synthetic */ TokenResult$ResponseCode[] B;
    public static final TokenResult$ResponseCode y;
    public static final TokenResult$ResponseCode z;

    static {
        TokenResult$ResponseCode tokenResult$ResponseCode = new TokenResult$ResponseCode("OK", 0);
        y = tokenResult$ResponseCode;
        TokenResult$ResponseCode tokenResult$ResponseCode2 = new TokenResult$ResponseCode("BAD_CONFIG", 1);
        z = tokenResult$ResponseCode2;
        TokenResult$ResponseCode tokenResult$ResponseCode3 = new TokenResult$ResponseCode("AUTH_ERROR", 2);
        A = tokenResult$ResponseCode3;
        B = new TokenResult$ResponseCode[]{tokenResult$ResponseCode, tokenResult$ResponseCode2, tokenResult$ResponseCode3};
    }

    public static TokenResult$ResponseCode valueOf(String str) {
        return (TokenResult$ResponseCode) Enum.valueOf(TokenResult$ResponseCode.class, str);
    }

    public static TokenResult$ResponseCode[] values() {
        return (TokenResult$ResponseCode[]) B.clone();
    }
}
