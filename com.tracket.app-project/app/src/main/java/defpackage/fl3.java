package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class fl3 implements Comparable {
    public static final fl3 A;
    public static final fl3 B;
    public static final fl3 C;
    public static final fl3 D;
    public static final fl3 E;
    public static final fl3 F;
    public static final fl3 G;
    public static final fl3 H;
    public static final List I;
    public static final fl3 z;
    public final int y;

    static {
        fl3 fl3Var = new fl3(100);
        fl3 fl3Var2 = new fl3(200);
        fl3 fl3Var3 = new fl3(300);
        fl3 fl3Var4 = new fl3(400);
        z = fl3Var4;
        fl3 fl3Var5 = new fl3(500);
        A = fl3Var5;
        fl3 fl3Var6 = new fl3(600);
        B = fl3Var6;
        fl3 fl3Var7 = new fl3(700);
        fl3 fl3Var8 = new fl3(800);
        fl3 fl3Var9 = new fl3(900);
        C = fl3Var3;
        D = fl3Var4;
        E = fl3Var5;
        F = fl3Var6;
        G = fl3Var7;
        H = fl3Var9;
        I = tc1.k(fl3Var, fl3Var2, fl3Var3, fl3Var4, fl3Var5, fl3Var6, fl3Var7, fl3Var8, fl3Var9);
    }

    public fl3(int i) {
        this.y = i;
        boolean z2 = false;
        if (1 <= i && i < 1001) {
            z2 = true;
        }
        if (z2) {
            return;
        }
        v94.a("Font weight can be in range [1, 1000]. Current value: " + i);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(fl3 fl3Var) {
        return ff4.i(this.y, fl3Var.y);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof fl3) {
            return this.y == ((fl3) obj).y;
        }
        return false;
    }

    public final int hashCode() {
        return this.y;
    }

    public final String toString() {
        return zd2.n(new StringBuilder("FontWeight(weight="), this.y, ')');
    }
}
