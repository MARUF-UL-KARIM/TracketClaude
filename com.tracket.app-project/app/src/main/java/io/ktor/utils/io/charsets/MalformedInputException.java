package io.ktor.utils.io.charsets;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public class MalformedInputException extends java.nio.charset.MalformedInputException {
    public final String y;

    public MalformedInputException(String str) {
        super(0);
        this.y = str;
    }

    @Override // java.nio.charset.MalformedInputException, java.lang.Throwable
    public final String getMessage() {
        return this.y;
    }
}
