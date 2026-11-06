package defpackage;

import java.io.Closeable;
import java.io.RandomAccessFile;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class ni4 implements Closeable {
    public int A;
    public final ReentrantLock B = new ReentrantLock();
    public final RandomAccessFile C;
    public final boolean y;
    public boolean z;

    public ni4(boolean z, RandomAccessFile randomAccessFile) {
        this.y = z;
        this.C = randomAccessFile;
    }

    public static eb3 c(ni4 ni4Var) {
        if (!ni4Var.y) {
            cp2.n("file handle is read-only");
            return null;
        }
        ReentrantLock reentrantLock = ni4Var.B;
        reentrantLock.lock();
        try {
            if (ni4Var.z) {
                throw new IllegalStateException("closed");
            }
            ni4Var.A++;
            reentrantLock.unlock();
            return new eb3(ni4Var);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final synchronized int a(long j, byte[] bArr, int i, int i2) {
        bArr.getClass();
        this.C.seek(j);
        int i3 = 0;
        while (i3 < i2) {
            int i4 = this.C.read(bArr, i, i2 - i3);
            if (i4 == -1) {
                if (i3 != 0) {
                    break;
                }
                return -1;
            }
            i3 += i4;
        }
        return i3;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ReentrantLock reentrantLock = this.B;
        reentrantLock.lock();
        try {
            if (this.z) {
                reentrantLock.unlock();
                return;
            }
            this.z = true;
            if (this.A != 0) {
                reentrantLock.unlock();
                return;
            }
            reentrantLock.unlock();
            synchronized (this) {
                this.C.close();
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final fb3 d(long j) {
        ReentrantLock reentrantLock = this.B;
        reentrantLock.lock();
        try {
            if (this.z) {
                throw new IllegalStateException("closed");
            }
            this.A++;
            reentrantLock.unlock();
            return new fb3(this, j);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void flush() {
        if (!this.y) {
            cp2.n("file handle is read-only");
            return;
        }
        ReentrantLock reentrantLock = this.B;
        reentrantLock.lock();
        try {
            if (this.z) {
                throw new IllegalStateException("closed");
            }
            reentrantLock.unlock();
            synchronized (this) {
                this.C.getFD().sync();
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final long size() {
        long length;
        ReentrantLock reentrantLock = this.B;
        reentrantLock.lock();
        try {
            if (this.z) {
                throw new IllegalStateException("closed");
            }
            reentrantLock.unlock();
            synchronized (this) {
                length = this.C.length();
            }
            return length;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
