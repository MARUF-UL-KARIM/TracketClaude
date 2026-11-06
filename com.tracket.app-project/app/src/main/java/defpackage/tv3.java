package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class tv3 {
    public static final byte[] f = {0, 0, 1};
    public static final byte[] g = {0, 0, 1};
    public boolean a;
    public int b;
    public int c;
    public int d;
    public byte[] e;

    public void a(byte[] bArr, int i, int i2) {
        if (this.a) {
            int i3 = i2 - i;
            byte[] bArrCopyOf = this.e;
            int length = bArrCopyOf.length;
            int i4 = this.c + i3;
            if (length < i4) {
                bArrCopyOf = Arrays.copyOf(bArrCopyOf, i4 * 2);
                this.e = bArrCopyOf;
            }
            System.arraycopy(bArr, i, bArrCopyOf, this.c, i3);
            this.c += i3;
        }
    }

    public void b(byte[] bArr, int i, int i2) {
        if (this.a) {
            int i3 = i2 - i;
            byte[] bArrCopyOf = this.e;
            int length = bArrCopyOf.length;
            int i4 = this.c + i3;
            if (length < i4) {
                bArrCopyOf = Arrays.copyOf(bArrCopyOf, i4 + i4);
                this.e = bArrCopyOf;
            }
            System.arraycopy(bArr, i, bArrCopyOf, this.c, i3);
            this.c += i3;
        }
    }
}
