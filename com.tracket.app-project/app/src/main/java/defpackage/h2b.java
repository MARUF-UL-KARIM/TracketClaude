package defpackage;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class h2b extends j18 {
    public MessageDigest c;
    public final int d;
    public final int e;

    public h2b(int i) {
        super(1);
        int i2 = i >> 3;
        this.d = (i & 7) > 0 ? i2 + 1 : i2;
        this.e = i;
    }

    public final byte[] g(String str) {
        synchronized (this.a) {
            try {
                MessageDigest messageDigestF = f();
                this.c = messageDigestF;
                if (messageDigestF == null) {
                    return new byte[0];
                }
                messageDigestF.reset();
                this.c.update(str.getBytes(StandardCharsets.UTF_8));
                byte[] bArrDigest = this.c.digest();
                int length = bArrDigest.length;
                int i = this.d;
                if (length > i) {
                    length = i;
                }
                byte[] bArr = new byte[length];
                System.arraycopy(bArrDigest, 0, bArr, 0, length);
                int i2 = this.e & 7;
                if (i2 > 0) {
                    long j = 0;
                    for (int i3 = 0; i3 < length; i3++) {
                        if (i3 > 0) {
                            j <<= 8;
                        }
                        j += (long) (bArr[i3] & 255);
                    }
                    long j2 = j >>> (8 - i2);
                    while (true) {
                        i--;
                        if (i < 0) {
                            break;
                        }
                        bArr[i] = (byte) (255 & j2);
                        j2 >>>= 8;
                    }
                }
                return bArr;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
