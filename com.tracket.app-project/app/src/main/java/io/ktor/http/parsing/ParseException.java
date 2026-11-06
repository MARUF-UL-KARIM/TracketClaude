package io.ktor.http.parsing;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class ParseException extends IllegalArgumentException {
    public final String y;

    public ParseException(String str) {
        super(str, null);
        this.y = str;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return null;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.y;
    }
}
