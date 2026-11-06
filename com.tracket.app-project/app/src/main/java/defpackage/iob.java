package defpackage;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class iob {
    public static final iob e = new iob(-1, -1, -1);
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public iob(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = vqc.d(i3) ? vqc.f(i3) * i2 : -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iob)) {
            return false;
        }
        iob iobVar = (iob) obj;
        return this.a == iobVar.a && this.b == iobVar.b && this.c == iobVar.c;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c));
    }

    public final String toString() {
        int i = this.a;
        int length = String.valueOf(i).length();
        int i2 = this.b;
        int length2 = String.valueOf(i2).length();
        int i3 = this.c;
        StringBuilder sb = new StringBuilder(pyd.d(length, 38, length2, 11, String.valueOf(i3).length()) + 1);
        zd2.z(sb, "AudioFormat[sampleRate=", i, ", channelCount=", i2);
        return pyd.e(sb, ", encoding=", i3, "]");
    }
}
