package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class r07 {
    public final byte[] a;
    public final int b;
    public final int c;
    public final long d;
    public final int e;
    public final String f;

    public r07(byte[] bArr, int i, int i2, long j, int i3, String str) {
        bArr.getClass();
        this.a = bArr;
        this.b = i;
        this.c = i2;
        this.d = j;
        this.e = i3;
        this.f = str;
        if (i <= 0) {
            cp2.m("Width must be positive.");
            throw null;
        }
        if (i2 <= 0) {
            cp2.m("Height must be positive.");
            throw null;
        }
        if (i3 < i * 4) {
            cp2.m("bytesPerRow must be at least width * 4.");
            throw null;
        }
        long j2 = ((long) i3) * ((long) i2);
        if (bArr.length >= j2) {
            return;
        }
        throw new IllegalArgumentException(("Frame is too small. Need at least " + j2 + " bytes, got " + bArr.length + ".").toString());
    }

    public static r07 a(r07 r07Var, byte[] bArr) {
        int i = r07Var.b;
        int i2 = r07Var.c;
        long j = r07Var.d;
        int i3 = r07Var.e;
        String str = r07Var.f;
        r07Var.getClass();
        str.getClass();
        return new r07(bArr, i, i2, j, i3, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || r07.class != obj.getClass()) {
            return false;
        }
        r07 r07Var = (r07) obj;
        return this.b == r07Var.b && this.c == r07Var.c && this.d == r07Var.d && this.e == r07Var.e && Arrays.equals(this.a, r07Var.a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a) + ((ot5.c(((this.b * 31) + this.c) * 31, 31, this.d) + this.e) * 31);
    }

    public final String toString() {
        StringBuilder sbQ = wd0.q(this.b, "RgbaFrame(bytes=", Arrays.toString(this.a), ", width=", ", height=");
        mi9.u(sbQ, this.c, ", positionInClipUs=", this.d);
        mi9.q(this.e, ", bytesPerRow=", ", inputProfile=", this.f, sbQ);
        sbQ.append(")");
        return sbQ.toString();
    }

    public /* synthetic */ r07(long j, int i, int i2, int i3, int i4, byte[] bArr) {
        this(bArr, i, i2, (i4 & 8) != 0 ? -1L : j, (i4 & 16) != 0 ? i * 4 : i3, "unspecified");
    }
}
