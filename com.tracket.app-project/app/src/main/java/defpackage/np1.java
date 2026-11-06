package defpackage;

import androidx.work.NetworkType;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class np1 {
    public static final np1 i;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public NetworkType a = NetworkType.y;
    public long f = -1;
    public long g = -1;
    public ks1 h = new ks1();

    static {
        ks1 ks1Var = new ks1();
        np1 np1Var = new np1();
        NetworkType networkType = NetworkType.y;
        np1Var.a = networkType;
        np1Var.f = -1L;
        np1Var.g = -1L;
        new HashSet();
        np1Var.b = false;
        np1Var.c = false;
        np1Var.a = networkType;
        np1Var.d = false;
        np1Var.e = false;
        np1Var.h = ks1Var;
        np1Var.f = -1L;
        np1Var.g = -1L;
        i = np1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || np1.class != obj.getClass()) {
            return false;
        }
        np1 np1Var = (np1) obj;
        if (this.b == np1Var.b && this.c == np1Var.c && this.d == np1Var.d && this.e == np1Var.e && this.f == np1Var.f && this.g == np1Var.g && this.a == np1Var.a) {
            return this.h.equals(np1Var.h);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((((((this.a.hashCode() * 31) + (this.b ? 1 : 0)) * 31) + (this.c ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31) + (this.e ? 1 : 0)) * 31;
        long j = this.f;
        int i2 = (iHashCode + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.g;
        return this.h.a.hashCode() + ((i2 + ((int) (j2 ^ (j2 >>> 32)))) * 31);
    }
}
