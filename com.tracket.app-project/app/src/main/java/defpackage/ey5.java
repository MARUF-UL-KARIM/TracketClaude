package defpackage;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class ey5 extends jy5 {
    public final String a;
    public final gy5 b;

    public ey5(String str, gy5 gy5Var) {
        this.a = str;
        this.b = gy5Var;
    }

    @Override // defpackage.jy5
    public final String a() {
        return this.a;
    }

    @Override // defpackage.jy5
    public final gy5 b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ey5)) {
            return false;
        }
        ey5 ey5Var = (ey5) obj;
        return this.a.equals(ey5Var.a) && this.b.equals(ey5Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Lifetime(price=" + this.a + ", storeDetails=" + this.b + ")";
    }
}
