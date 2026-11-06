package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class qla extends tla {
    public final String b;
    public final boolean c;
    public final boolean d;
    public final String[] e;
    public final tla[] f;

    public qla(String str, boolean z, boolean z2, String[] strArr, tla[] tlaVarArr) {
        super("CTOC");
        this.b = str;
        this.c = z;
        this.d = z2;
        this.e = strArr;
        this.f = tlaVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || qla.class != obj.getClass()) {
            return false;
        }
        qla qlaVar = (qla) obj;
        return this.c == qlaVar.c && this.d == qlaVar.d && this.b.equals(qlaVar.b) && Arrays.equals(this.e, qlaVar.e) && Arrays.equals(this.f, qlaVar.f);
    }

    public final int hashCode() {
        return this.b.hashCode() + (((((this.c ? 1 : 0) + 527) * 31) + (this.d ? 1 : 0)) * 31);
    }
}
