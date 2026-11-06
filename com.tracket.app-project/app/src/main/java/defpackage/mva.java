package defpackage;

import com.google.android.gms.internal.mlkit_vision_mediapipe.zzdv;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class mva {
    public static final long d;
    public static final mva e;
    public final int a;
    public final int b;
    public final int c;

    static {
        long jCharAt = 0;
        for (int i = 0; i < 7; i++) {
            jCharAt |= (((long) i) + 1) << ((int) (((long) (" #(+,-0".charAt(i) - ' ')) * 3));
        }
        d = jCharAt;
        e = new mva(0, -1, -1);
    }

    public mva(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public static int e(String str, int i, int i2) {
        if (i == i2) {
            throw zzdv.a("missing precision", i - 1, str);
        }
        int i3 = 0;
        for (int i4 = i; i4 < i2; i4++) {
            char cCharAt = (char) (str.charAt(i4) - '0');
            if (cCharAt >= '\n') {
                throw zzdv.a("invalid precision character", i4, str);
            }
            i3 = (i3 * 10) + cCharAt;
            if (i3 > 999999) {
                throw zzdv.b(i, i2, "precision too large", str);
            }
        }
        if (i3 != 0) {
            return i3;
        }
        if (i2 == i + 1) {
            return 0;
        }
        throw zzdv.b(i, i2, "invalid precision", str);
    }

    public final void a(StringBuilder sb) {
        if (b()) {
            return;
        }
        int i = 0;
        while (true) {
            int i2 = this.a & (-129);
            int i3 = 1 << i;
            if (i3 > i2) {
                break;
            }
            if ((i2 & i3) != 0) {
                sb.append(" #(+,-0".charAt(i));
            }
            i++;
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

    public final boolean c() {
        return (this.a & 128) != 0;
    }

    public final boolean d(int i, boolean z) {
        int i2;
        if (b()) {
            return true;
        }
        int i3 = ~i;
        int i4 = this.a;
        if ((i3 & i4) != 0) {
            return false;
        }
        if ((!z && this.c != -1) || (i4 & 9) == 9 || (i2 = i4 & 96) == 96) {
            return false;
        }
        return i2 == 0 || this.b != -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mva) {
            mva mvaVar = (mva) obj;
            if (mvaVar.a == this.a && mvaVar.b == this.b && mvaVar.c == this.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a * 31) + this.b) * 31) + this.c;
    }
}
