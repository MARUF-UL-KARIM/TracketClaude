package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class fe3 {
    public long a;
    public long b;
    public long c;
    public long d;
    public long e;
    public long f;
    public final boolean[] g;
    public int h;

    public fe3(int i) {
        switch (i) {
            case 1:
                this.g = new boolean[15];
                break;
            default:
                this.g = new boolean[15];
                break;
        }
    }

    public boolean a() {
        return this.d > 15 && this.h == 0;
    }

    public void b(long j) {
        long j2 = this.d;
        if (j2 == 0) {
            this.a = j;
        } else if (j2 == 1) {
            long j3 = j - this.a;
            this.b = j3;
            this.f = j3;
            this.e = 1L;
        } else {
            long j4 = j - this.c;
            int i = (int) (j2 % 15);
            long jAbs = Math.abs(j4 - this.b);
            boolean[] zArr = this.g;
            if (jAbs <= 1000000) {
                this.e++;
                this.f += j4;
                if (zArr[i]) {
                    zArr[i] = false;
                    this.h--;
                }
            } else if (!zArr[i]) {
                zArr[i] = true;
                this.h++;
            }
        }
        this.d++;
        this.c = j;
    }

    public void c() {
        this.d = 0L;
        this.e = 0L;
        this.f = 0L;
        this.h = 0;
        Arrays.fill(this.g, false);
    }

    public void d() {
        this.d = 0L;
        this.e = 0L;
        this.f = 0L;
        this.h = 0;
        Arrays.fill(this.g, false);
    }

    public boolean e() {
        return this.d > 15 && this.h == 0;
    }

    public void f(long j) {
        long j2 = this.d;
        if (j2 == 0) {
            this.a = j;
        } else if (j2 == 1) {
            long j3 = j - this.a;
            this.b = j3;
            this.f = j3;
            this.e = 1L;
        } else {
            long j4 = j - this.c;
            long jAbs = Math.abs(j4 - this.b);
            int i = (int) (j2 % 15);
            boolean[] zArr = this.g;
            if (jAbs <= 1000000) {
                this.e++;
                this.f += j4;
                if (zArr[i]) {
                    zArr[i] = false;
                    this.h--;
                }
            } else if (!zArr[i]) {
                zArr[i] = true;
                this.h++;
            }
        }
        this.d++;
        this.c = j;
    }
}
