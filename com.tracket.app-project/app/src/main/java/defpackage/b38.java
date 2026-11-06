package defpackage;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class b38 implements AutoCloseable {
    public final i01 y;

    @Override // java.lang.AutoCloseable
    public final void close() throws IOException {
        this.y.close();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b38) {
            return this.y.equals(((b38) obj).y);
        }
        return false;
    }

    public final int hashCode() {
        return this.y.hashCode();
    }

    public final String toString() {
        return "SourceResponseBody(source=" + this.y + ")";
    }
}
