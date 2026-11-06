package defpackage;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class pyd {
    public static int a(int i, int i2) {
        return String.valueOf(i).length() + i2;
    }

    public static int b(int i, int i2, int i3) {
        int i4 = i / i2;
        return i4 + i4 + i3;
    }

    public static int c(int i, int i2, int i3, int i4) {
        return n7e.r(i) + i2 + i3 + i4;
    }

    public static int d(int i, int i2, int i3, int i4, int i5) {
        return i + i2 + i3 + i4 + i5;
    }

    public static String e(StringBuilder sb, String str, int i, String str2) {
        sb.append(str);
        sb.append(i);
        sb.append(str2);
        return sb.toString();
    }

    public static void f(StringBuilder sb, String str, double d, String str2) {
        sb.append(str);
        sb.append(d);
        sb.append(str2);
    }

    public static int g(int i, int i2, int i3) {
        return n7e.r(i) + i2 + i3;
    }

    public static int h(int i, int i2, int i3, int i4) {
        return yre.d(i) + i2 + i3 + i4;
    }

    public static int i(int i, int i2, int i3) {
        return yre.d(i) + i2 + i3;
    }
}
