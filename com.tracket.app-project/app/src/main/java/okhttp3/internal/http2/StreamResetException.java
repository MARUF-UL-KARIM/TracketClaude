package okhttp3.internal.http2;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes4.dex */
public final class StreamResetException extends IOException {
    public final ErrorCode y;

    public StreamResetException(ErrorCode errorCode) {
        super("stream was reset: " + errorCode);
        this.y = errorCode;
    }
}
