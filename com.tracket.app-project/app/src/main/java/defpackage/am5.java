package defpackage;

import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class am5 {
    public final long[] b;
    public final boolean[] c;
    public volatile boolean d;
    public volatile boolean f;
    public final ReentrantLock a = new ReentrantLock();
    public final ReentrantLock e = new ReentrantLock();

    public am5(int i) {
        this.b = new long[i];
        this.c = new boolean[i];
    }

    public final boolean a(int[] iArr) {
        ReentrantLock reentrantLock = this.a;
        reentrantLock.lock();
        try {
            boolean z = false;
            for (int i : iArr) {
                long[] jArr = this.b;
                long j = jArr[i];
                jArr[i] = 1 + j;
                if (j == 0) {
                    this.d = true;
                    z = true;
                }
            }
            return z || this.d || this.f;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean b(int[] iArr) {
        iArr.getClass();
        ReentrantLock reentrantLock = this.a;
        reentrantLock.lock();
        try {
            boolean z = false;
            for (int i : iArr) {
                long[] jArr = this.b;
                long j = jArr[i];
                jArr[i] = j - 1;
                if (j == 1) {
                    this.d = true;
                    z = true;
                }
            }
            return z || this.d || this.f;
        } finally {
            reentrantLock.unlock();
        }
    }
}
