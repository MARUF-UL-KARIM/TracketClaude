package defpackage;

import android.media.MediaDataSource;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class gb3 extends MediaDataSource {
    public final ni4 y;

    public gb3(ni4 ni4Var) {
        this.y = ni4Var;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.y.close();
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return this.y.size();
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j, byte[] bArr, int i, int i2) {
        ni4 ni4Var = this.y;
        ni4Var.getClass();
        bArr.getClass();
        ReentrantLock reentrantLock = ni4Var.B;
        reentrantLock.lock();
        try {
            if (ni4Var.z) {
                throw new IllegalStateException("closed");
            }
            reentrantLock.unlock();
            return ni4Var.a(j, bArr, i, i2);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
