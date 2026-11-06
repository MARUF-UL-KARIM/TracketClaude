package defpackage;

import com.airbnb.lottie.parser.moshi.JsonReader$Token;
import java.io.Closeable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public abstract class bi4 implements Closeable {
    public static final String[] C = new String[128];
    public String[] A;
    public int[] B;
    public int y;
    public int[] z;

    static {
        for (int i = 0; i <= 31; i++) {
            C[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = C;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    public abstract boolean A();

    public abstract double B();

    public abstract int D();

    public abstract String L();

    public abstract JsonReader$Token V();

    public final void Y(int i) {
        int i2 = this.y;
        int[] iArr = this.z;
        if (i2 == iArr.length) {
            if (i2 == 256) {
                throw new zg4("Nesting too deep at ".concat(p()));
            }
            this.z = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.A;
            this.A = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
            int[] iArr2 = this.B;
            this.B = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.z;
        int i3 = this.y;
        this.y = i3 + 1;
        iArr3[i3] = i;
    }

    public abstract void a();

    public abstract void c();

    public abstract int c0(a8e a8eVar);

    public abstract void d();

    public abstract void d0();

    public abstract void m0();

    public final void n0(String str) throws jh4 {
        throw new jh4(str + " at path " + p());
    }

    public abstract void o();

    public final String p() {
        int i = this.y;
        int[] iArr = this.z;
        String[] strArr = this.A;
        int[] iArr2 = this.B;
        StringBuilder sb = new StringBuilder("$");
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = iArr[i2];
            if (i3 == 1 || i3 == 2) {
                sb.append('[');
                sb.append(iArr2[i2]);
                sb.append(']');
            } else if (i3 == 3 || i3 == 4 || i3 == 5) {
                sb.append('.');
                String str = strArr[i2];
                if (str != null) {
                    sb.append(str);
                }
            }
        }
        return sb.toString();
    }

    public abstract boolean w();
}
