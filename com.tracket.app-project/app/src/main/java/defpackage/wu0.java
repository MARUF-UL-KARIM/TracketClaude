package defpackage;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class wu0 {
    public static final wu0 e;
    public static final wu0 f;
    public static wu0 g;
    public final /* synthetic */ int a;
    public int b;
    public long c;
    public long d;

    static {
        int i = -3;
        e = new wu0(i, 0, -9223372036854775807L, -1L);
        int i2 = -3;
        f = new wu0(i2, 1, -9223372036854775807L, -1L);
    }

    public /* synthetic */ wu0(int i, int i2, long j, long j2) {
        this.a = i2;
        this.b = i;
        this.c = j;
        this.d = j2;
    }

    public static void c(wu0 wu0Var, long j, long j2, int i) {
        if ((i & 1) != 0) {
            j = 0;
        }
        if ((i & 2) != 0) {
            j2 = 0;
        }
        synchronized (wu0Var) {
            try {
                if (j < 0) {
                    throw new IllegalStateException("Check failed.");
                }
                if (j2 < 0) {
                    throw new IllegalStateException("Check failed.");
                }
                long j3 = wu0Var.c + j;
                wu0Var.c = j3;
                long j4 = wu0Var.d + j2;
                wu0Var.d = j4;
                if (j4 > j3) {
                    throw new IllegalStateException("Check failed.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a(long j, double d, double d2) {
        float f2 = (j - 946728000000L) / 8.64E7f;
        float f3 = (0.01720197f * f2) + 6.24006f;
        double d3 = f3;
        double dSin = (Math.sin(f3 * 3.0f) * 5.236000106378924E-6d) + (Math.sin(2.0f * f3) * 3.4906598739326E-4d) + (Math.sin(d3) * 0.03341960161924362d) + d3 + 1.796593063d + 3.141592653589793d;
        double d4 = (-d2) / 360.0d;
        double dSin2 = (Math.sin(2.0d * dSin) * (-0.0069d)) + (Math.sin(d3) * 0.0053d) + ((double) (Math.round(((double) (f2 - 9.0E-4f)) - d4) + 9.0E-4f)) + d4;
        double dAsin = Math.asin(Math.sin(0.4092797040939331d) * Math.sin(dSin));
        double d5 = 0.01745329238474369d * d;
        double dSin3 = (Math.sin(-0.10471975803375244d) - (Math.sin(dAsin) * Math.sin(d5))) / (Math.cos(dAsin) * Math.cos(d5));
        if (dSin3 >= 1.0d) {
            this.b = 1;
            this.c = -1L;
            this.d = -1L;
        } else {
            if (dSin3 <= -1.0d) {
                this.b = 0;
                this.c = -1L;
                this.d = -1L;
                return;
            }
            double dAcos = (float) (Math.acos(dSin3) / 6.283185307179586d);
            this.c = Math.round((dSin2 + dAcos) * 8.64E7d) + 946728000000L;
            long jRound = Math.round((dSin2 - dAcos) * 8.64E7d) + 946728000000L;
            this.d = jRound;
            if (jRound >= j || this.c <= j) {
                this.b = 1;
            } else {
                this.b = 0;
            }
        }
    }

    public synchronized long b() {
        return this.c - this.d;
    }

    public String toString() {
        switch (this.a) {
            case 4:
                return "WindowCounter(streamId=" + this.b + ", total=" + this.c + ", acknowledged=" + this.d + ", unacknowledged=" + b() + ')';
            default:
                return super.toString();
        }
    }

    public wu0(int i) {
        this.a = 4;
        this.b = i;
    }
}
