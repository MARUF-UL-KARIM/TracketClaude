package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class p23 extends InputStream {
    public final InputStream y;
    public int z = 1073741824;

    public p23(InputStream inputStream) {
        this.y = inputStream;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.z;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.y.close();
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        int i = this.y.read();
        if (i == -1) {
            this.z = 0;
        }
        return i;
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        return this.y.skip(j);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        int i = this.y.read(bArr);
        if (i == -1) {
            this.z = 0;
        }
        return i;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.y.read(bArr, i, i2);
        if (i3 == -1) {
            this.z = 0;
        }
        return i3;
    }
}
