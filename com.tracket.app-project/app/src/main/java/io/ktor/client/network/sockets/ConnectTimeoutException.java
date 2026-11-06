package io.ktor.client.network.sockets;

import java.net.ConnectException;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes4.dex */
public final class ConnectTimeoutException extends ConnectException {
    public final Throwable y;

    public ConnectTimeoutException(String str, Throwable th) {
        super(str);
        this.y = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.y;
    }
}
