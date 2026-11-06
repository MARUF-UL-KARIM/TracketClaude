package defpackage;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class v6 {
    public static final v6 h = new v6("320x50_mb", 320, 50);
    public static final v6 i;
    public static final v6 j;
    public final int a;
    public final int b;
    public final String c;
    public boolean d;
    public int e;
    public boolean f;
    public int g;

    static {
        new v6("468x60_as", 468, 60);
        new v6("320x100_as", 320, 100);
        new v6("728x90_as", 728, 90);
        new v6("300x250_as", 300, 250);
        new v6("160x600_as", 160, 600);
        new v6("smart_banner", -1, -2);
        i = new v6("fluid", -3, -4);
        j = new v6("invalid", 0, 0);
        new v6("50x50_mb", 50, 50);
    }

    public v6(String str, int i2, int i3) {
        if (i2 < 0 && i2 != -1 && i2 != -3) {
            cp2.m(zd2.q(new StringBuilder(String.valueOf(i2).length() + 26), "Invalid width for AdSize: ", i2));
            throw null;
        }
        if (i3 < 0 && i3 != -2 && i3 != -4) {
            cp2.m(zd2.q(new StringBuilder(String.valueOf(i3).length() + 27), "Invalid height for AdSize: ", i3));
            throw null;
        }
        this.a = i2;
        this.b = i3;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v6)) {
            return false;
        }
        v6 v6Var = (v6) obj;
        return this.a == v6Var.a && this.b == v6Var.b && this.c.equals(v6Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        return this.c;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public v6(int i2, int i3) {
        String strValueOf;
        if (i2 == -1) {
            strValueOf = "FULL";
        } else {
            strValueOf = String.valueOf(i2);
        }
        String strValueOf2 = i3 == -2 ? "AUTO" : String.valueOf(i3);
        this(zd2.r(new StringBuilder(String.valueOf(strValueOf2).length() + String.valueOf(strValueOf).length() + 1 + 3), strValueOf, "x", strValueOf2, "_as"), i2, i3);
    }
}
