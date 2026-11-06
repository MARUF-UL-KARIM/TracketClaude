package defpackage;

import com.google.common.flogger.parser.ParseException;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class rl3 {
    public static final long d;
    public static final rl3 e;
    public final int a;
    public final int b;
    public final int c;

    static {
        long jCharAt = 0;
        for (int i = 0; i < 7; i++) {
            jCharAt |= (((long) i) + 1) << ((int) (((long) (" #(+,-0".charAt(i) - ' ')) * 3));
        }
        d = jCharAt;
        e = new rl3(0, -1, -1);
    }

    public rl3(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public static int c(String str, int i, int i2) {
        if (i == i2) {
            throw ParseException.a("missing precision", i - 1, str);
        }
        int i3 = 0;
        for (int i4 = i; i4 < i2; i4++) {
            char cCharAt = (char) (str.charAt(i4) - '0');
            if (cCharAt >= '\n') {
                throw ParseException.a("invalid precision character", i4, str);
            }
            i3 = (i3 * 10) + cCharAt;
            if (i3 > 999999) {
                throw ParseException.c(i, i2, "precision too large", str);
            }
        }
        if (i3 != 0 || i2 == i + 1) {
            return i3;
        }
        throw ParseException.c(i, i2, "invalid precision", str);
    }

    public final void a(StringBuilder sb) {
        if (b()) {
            return;
        }
        int i = this.a & (-129);
        int i2 = 0;
        while (true) {
            int i3 = 1 << i2;
            if (i3 > i) {
                break;
            }
            if ((i3 & i) != 0) {
                sb.append(" #(+,-0".charAt(i2));
            }
            i2++;
        }
        int i4 = this.b;
        if (i4 != -1) {
            sb.append(i4);
        }
        int i5 = this.c;
        if (i5 != -1) {
            sb.append('.');
            sb.append(i5);
        }
    }

    public final boolean b() {
        return this == e;
    }

    public final boolean d() {
        return (this.a & 128) != 0;
    }

    public final boolean e(int i, boolean z) {
        int i2;
        if (!b()) {
            int i3 = ~i;
            int i4 = this.a;
            if ((i3 & i4) == 0 && (z || this.c == -1)) {
                boolean z2 = this.b != -1;
                if ((i4 & 9) != 9 && (i2 = i4 & 96) != 96 && (i2 == 0 || z2)) {
                }
            }
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof rl3) {
            rl3 rl3Var = (rl3) obj;
            if (rl3Var.a == this.a && rl3Var.b == this.b && rl3Var.c == this.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a * 31) + this.b) * 31) + this.c;
    }
}
