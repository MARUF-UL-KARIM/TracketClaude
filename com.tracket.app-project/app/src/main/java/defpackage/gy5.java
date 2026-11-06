package defpackage;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class gy5 {
    public final String a;
    public final String b;
    public final long c;
    public final String d;
    public final boolean e;
    public final Boolean f;

    public gy5(String str, String str2, long j, String str3, boolean z, Boolean bool) {
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = str3;
        this.e = z;
        this.f = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gy5)) {
            return false;
        }
        gy5 gy5Var = (gy5) obj;
        return this.a.equals(gy5Var.a) && this.b.equals(gy5Var.b) && this.c == gy5Var.c && this.d.equals(gy5Var.d) && this.e == gy5Var.e && ff4.h(this.f, gy5Var.f);
    }

    public final int hashCode() {
        int iE = ot5.e(ot5.g(this.d, ot5.c(ot5.g(this.b, this.a.hashCode() * 31, 31), 31, this.c), 31), 31, this.e);
        Boolean bool = this.f;
        return iE + (bool == null ? 0 : bool.hashCode());
    }

    public final String toString() {
        StringBuilder sbV = ot5.v("StoreDetails(productId=", this.a, ", offerId=", this.b, ", priceMicros=");
        sbV.append(this.c);
        sbV.append(", currency=");
        sbV.append(this.d);
        sbV.append(", trialConfigured=");
        sbV.append(this.e);
        sbV.append(", trialEligible=");
        sbV.append(this.f);
        sbV.append(")");
        return sbV.toString();
    }
}
