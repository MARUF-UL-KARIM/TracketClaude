package defpackage;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public abstract class jn6 {
    public static final f2 y;

    static {
        Integer num = xf4.a;
        y = (num == null || num.intValue() >= 34) ? new i36() : new ha3();
    }

    public abstract int a(int i);

    public float b() {
        return a(24) / 1.6777216E7f;
    }

    public abstract int c();

    public long d() {
        return (((long) c()) << 32) + ((long) c());
    }

    public long e(long j, long j2) {
        long jD;
        long j3;
        long jA;
        int iC;
        if (j2 <= j) {
            c15.z("Random range is empty: [", Long.valueOf(j), ", ", Long.valueOf(j2), ").");
            return 0L;
        }
        long j4 = j2 - j;
        if (j4 > 0) {
            if (((-j4) & j4) == j4) {
                int i = (int) j4;
                int i2 = (int) (j4 >>> 32);
                if (i != 0) {
                    iC = a(31 - Integer.numberOfLeadingZeros(i));
                } else if (i2 == 1) {
                    iC = c();
                } else {
                    jA = (((long) a(31 - Integer.numberOfLeadingZeros(i2))) << 32) + (((long) c()) & 4294967295L);
                }
                jA = ((long) iC) & 4294967295L;
            } else {
                do {
                    jD = d() >>> 1;
                    j3 = jD % j4;
                } while ((j4 - 1) + (jD - j3) < 0);
                jA = j3;
            }
            return j + jA;
        }
        while (true) {
            long jD2 = d();
            if (j <= jD2 && jD2 < j2) {
                return jD2;
            }
        }
    }

    public long f() {
        return e(0L, 1000L);
    }
}
