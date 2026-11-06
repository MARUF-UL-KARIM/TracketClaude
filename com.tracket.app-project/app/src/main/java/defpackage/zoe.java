package defpackage;

import java.util.Arrays;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class zoe implements Comparable {
    public static final /* synthetic */ long A = yu.a.objectFieldOffset(zoe.class.getDeclaredField("z"));
    public final String y;
    public volatile Object z;

    public /* synthetic */ zoe(String str, byte[] bArr) {
        this.y = str;
        this.z = bArr;
    }

    public final /* synthetic */ void a(byte[] bArr) {
        byte[][] bArr2;
        zoe zoeVar;
        int i = 0;
        while (true) {
            Object obj = this.z;
            if (!(obj instanceof byte[])) {
                byte[][] bArr3 = (byte[][]) obj;
                while (true) {
                    int length = bArr3.length;
                    if (i >= length) {
                        bArr2 = (byte[][]) Arrays.copyOf(bArr3, length + 1);
                        bArr2[length] = bArr;
                        break;
                    } else if (Arrays.equals(bArr, bArr3[i])) {
                        return;
                    } else {
                        i++;
                    }
                }
            } else {
                byte[] bArr4 = (byte[]) obj;
                if (Arrays.equals(bArr, bArr4)) {
                    return;
                }
                i = 1;
                bArr2 = new byte[][]{bArr4, bArr};
            }
            byte[][] bArr5 = bArr2;
            while (true) {
                Unsafe unsafe = yu.a;
                long j = A;
                zoeVar = this;
                if (unsafe.compareAndSwapObject(zoeVar, j, obj, bArr5)) {
                    return;
                }
                if (unsafe.getObjectVolatile(zoeVar, j) != obj) {
                    break;
                } else {
                    this = zoeVar;
                }
            }
            this = zoeVar;
        }
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return this.y.compareTo((String) obj);
    }
}
