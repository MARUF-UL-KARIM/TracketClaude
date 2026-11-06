package defpackage;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class pve {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final pwb e;
    public final int f;
    public final int g;

    public /* synthetic */ pve(md5 md5Var) {
        this.a = md5Var.a;
        this.b = md5Var.c;
        this.c = md5Var.d;
        this.d = md5Var.e;
        this.e = (pwb) md5Var.b;
        this.f = md5Var.f;
        this.g = md5Var.g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && pve.class == obj.getClass()) {
            pve pveVar = (pve) obj;
            if (this.a == pveVar.a && this.b == pveVar.b && this.c == pveVar.c && this.d == pveVar.d && this.f == pveVar.f && this.g == pveVar.g && this.e.equals(pveVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Integer numValueOf = Integer.valueOf(this.a);
        Integer numValueOf2 = Integer.valueOf(this.b);
        Integer numValueOf3 = Integer.valueOf(this.c);
        Boolean bool = Boolean.FALSE;
        return Objects.hash(numValueOf, numValueOf2, numValueOf3, bool, bool, Integer.valueOf(this.d), this.e, Integer.valueOf(this.f), Integer.valueOf(this.g), bool, bool);
    }
}
