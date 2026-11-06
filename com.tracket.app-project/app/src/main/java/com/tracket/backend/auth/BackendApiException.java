package com.tracket.backend.auth;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class BackendApiException extends IllegalStateException {
    public final String y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BackendApiException(String str, int i, String str2) {
        super("HTTP " + i + ": " + str2);
        str2.getClass();
        this.y = str;
    }
}
