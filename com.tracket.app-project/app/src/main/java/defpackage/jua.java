package defpackage;

import java.nio.charset.Charset;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class jua {
    public static final jua b = new jua(new byte[0]);
    public final byte[] a;

    public jua(byte[] bArr) {
        this.a = bArr;
    }

    public static jua e(byte[] bArr) {
        byte[] bArr2;
        int length = bArr.length;
        if (length == 0) {
            bArr2 = new byte[0];
        } else {
            byte[] bArr3 = new byte[length];
            System.arraycopy(bArr, 0, bArr3, 0, length);
            bArr2 = bArr3;
        }
        return new jua(bArr2);
    }

    public static int f(byte b2) {
        int[] iArr = {2107654819, 15074090, 1957914693, -2142502098, -1902504939, -100121615, 100669, 1835342733, 837626799};
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        int i6 = iArr[5];
        int i7 = iArr[6];
        return b2 & ((iArr[7] % 837626799) ^ mi9.z((i2 & (~i)) | i3, (i & i4) | i5, i6, i7));
    }

    public final byte[] a() {
        byte[] bArr = this.a;
        int length = bArr.length;
        if (length == 0) {
            return new byte[0];
        }
        if (length == 0) {
            return new byte[0];
        }
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    public final byte b(int i) {
        byte[] bArr = this.a;
        int length = bArr.length;
        if (((length - (i + 1)) | i) >= 0) {
            return bArr[i];
        }
        if (i < 0) {
            StringBuilder sb = new StringBuilder(pyd.a(i, 11));
            sb.append(iua.a("Akelqh1fajntGgo="));
            sb.append(i);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder(pyd.a(length, pyd.a(i, 18)));
        String strA = iua.a("Akelqh1faDmxRUSK1T9GeQ==");
        String strA2 = iua.a("Zwk=");
        sb2.append(strA);
        sb2.append(i);
        sb2.append(strA2);
        sb2.append(length);
        throw new ArrayIndexOutOfBoundsException(sb2.toString());
    }

    public final String c() {
        Charset charsetForName = Charset.forName(iua.a("Hn2H4l0="));
        byte[] bArr = this.a;
        return new String(bArr, 0, bArr.length, charsetForName);
    }

    public final jua d(jua juaVar) {
        byte[] bArr = juaVar.a;
        int length = bArr.length;
        byte[] bArr2 = this.a;
        int length2 = bArr2.length;
        byte[] bArr3 = new byte[length2 + length];
        System.arraycopy(bArr2, 0, bArr3, 0, length2);
        System.arraycopy(bArr, 0, bArr3, length2, length);
        return e(bArr3);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof jua) {
            return Arrays.equals(this.a, ((jua) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(Arrays.hashCode(this.a));
    }

    public final String toString() {
        int[] iArr = {936621968, 262671172, 1099388327, 506341952, 1363551406, -1491858486, 110389885, 989492335, 981766422};
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        int i6 = iArr[5];
        int i7 = iArr[6];
        int i8 = iArr[7];
        int iZ = mi9.z((i2 & (~i)) | i3, (i & i4) | i5, i6, i7);
        String string = Arrays.toString(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(string).length() + ((i8 % 981766422) ^ iZ));
        sb.append(iua.a("CVC1qiQNJHikW0iU1TIPZA=="));
        sb.append(string);
        sb.append(iua.a("Ng=="));
        return sb.toString();
    }
}
