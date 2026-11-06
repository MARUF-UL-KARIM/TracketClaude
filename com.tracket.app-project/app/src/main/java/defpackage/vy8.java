package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class vy8 {
    public long[] a;
    public Object[] b;
    public int c;
    public int d;

    public vy8(int i) {
        switch (i) {
            case 1:
                this.a = new long[10];
                this.b = new Object[10];
                break;
            default:
                this.a = new long[10];
                this.b = new Object[10];
                break;
        }
    }

    public synchronized void a(long j, Object obj) {
        int i = this.d;
        if (i > 0) {
            if (j <= this.a[((this.c + i) - 1) % this.b.length]) {
                b();
            }
        }
        c();
        int i2 = this.c;
        int i3 = this.d;
        Object[] objArr = this.b;
        int length = (i2 + i3) % objArr.length;
        this.a[length] = j;
        objArr[length] = obj;
        this.d = i3 + 1;
    }

    public synchronized void b() {
        this.c = 0;
        this.d = 0;
        Arrays.fill(this.b, (Object) null);
    }

    public void c() {
        int length = this.b.length;
        if (this.d < length) {
            return;
        }
        int i = length * 2;
        long[] jArr = new long[i];
        Object[] objArr = new Object[i];
        int i2 = this.c;
        int i3 = length - i2;
        System.arraycopy(this.a, i2, jArr, 0, i3);
        System.arraycopy(this.b, this.c, objArr, 0, i3);
        int i4 = this.c;
        if (i4 > 0) {
            System.arraycopy(this.a, 0, jArr, i3, i4);
            System.arraycopy(this.b, 0, objArr, i3, this.c);
        }
        this.a = jArr;
        this.b = objArr;
        this.c = 0;
    }

    public Object d(long j, boolean z) {
        Object objG = null;
        long j2 = Long.MAX_VALUE;
        while (this.d > 0) {
            long j3 = j - this.a[this.c];
            if (j3 < 0 && (z || (-j3) >= j2)) {
                break;
            }
            objG = g();
            j2 = j3;
        }
        return objG;
    }

    public synchronized Object e() {
        return this.d == 0 ? null : g();
    }

    public synchronized Object f(long j) {
        return d(j, true);
    }

    public Object g() {
        iyd.p(this.d > 0);
        Object[] objArr = this.b;
        int i = this.c;
        Object obj = objArr[i];
        objArr[i] = null;
        this.c = (i + 1) % objArr.length;
        this.d--;
        return obj;
    }

    public synchronized int h() {
        return this.d;
    }

    public synchronized void i(long j, Object obj) {
        try {
            int i = this.d;
            if (i > 0) {
                if (j <= this.a[((this.c + i) - 1) % this.b.length]) {
                    synchronized (this) {
                        this.c = 0;
                        this.d = 0;
                        Arrays.fill(this.b, (Object) null);
                    }
                }
            }
            Object[] objArr = this.b;
            int length = objArr.length;
            if (this.d >= length) {
                int i2 = length + length;
                long[] jArr = new long[i2];
                objArr = new Object[i2];
                int i3 = this.c;
                int i4 = length - i3;
                System.arraycopy(this.a, i3, jArr, 0, i4);
                System.arraycopy(this.b, this.c, objArr, 0, i4);
                int i5 = this.c;
                if (i5 > 0) {
                    System.arraycopy(this.a, 0, jArr, i4, i5);
                    System.arraycopy(this.b, 0, objArr, i4, this.c);
                }
                this.a = jArr;
                this.b = objArr;
                this.c = 0;
            }
            int i6 = this.c;
            int i7 = this.d;
            int length2 = (i6 + i7) % objArr.length;
            this.a[length2] = j;
            objArr[length2] = obj;
            this.d = i7 + 1;
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized int j() {
        return this.d;
    }

    public synchronized Object k() {
        if (this.d == 0) {
            return null;
        }
        return m();
    }

    public synchronized Object l(long j) {
        Object objM;
        objM = null;
        while (this.d > 0 && j - this.a[this.c] >= 0) {
            objM = m();
        }
        return objM;
    }

    public Object m() {
        oke.i(this.d > 0);
        Object[] objArr = this.b;
        int i = this.c;
        Object obj = objArr[i];
        objArr[i] = null;
        this.c = (i + 1) % objArr.length;
        this.d--;
        return obj;
    }
}
