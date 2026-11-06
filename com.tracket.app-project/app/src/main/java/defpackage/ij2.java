package defpackage;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public abstract class ij2 {
    public static final char[] a = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/'};
    public static final int[] b;

    static {
        int[] iArr = new int[128];
        for (int i = 0; i < 128; i++) {
            char[] cArr = a;
            char c = (char) i;
            int i2 = 0;
            while (true) {
                if (i2 >= 64) {
                    i2 = -1;
                    break;
                } else if (c == cArr[i2]) {
                    break;
                } else {
                    i2++;
                }
            }
            iArr[i] = i2;
        }
        b = iArr;
    }
}
