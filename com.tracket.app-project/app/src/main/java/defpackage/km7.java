package defpackage;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public abstract class km7 {
    public static final byte[] a;

    static {
        byte[] bArr = new byte[32];
        new SecureRandom().nextBytes(bArr);
        a = bArr;
    }

    public static byte[] a(byte[] bArr) throws NoSuchAlgorithmException {
        byte[] bArr2 = a;
        byte[] bArrCopyOf = Arrays.copyOf(bArr2, bArr2.length);
        int length = (bArrCopyOf.length / 2) - 1;
        if (length >= 0) {
            int length2 = bArrCopyOf.length - 1;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    byte b = bArrCopyOf[i];
                    bArrCopyOf[i] = bArrCopyOf[length2];
                    bArrCopyOf[length2] = b;
                    length2--;
                    if (i == length) {
                        break;
                    }
                    i++;
                }
            }
        }
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        messageDigest.update(bArr2);
        messageDigest.update(bArr);
        messageDigest.update(bArrCopyOf);
        byte[] bArrDigest = messageDigest.digest();
        bArrDigest.getClass();
        return bArrDigest;
    }
}
