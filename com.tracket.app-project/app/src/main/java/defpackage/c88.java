package defpackage;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class c88 {
    public final String a;
    public final long b;
    public final long c;
    public final gx4 d;

    public c88(String str, long j, long j2, gx4 gx4Var) {
        str.getClass();
        this.a = str;
        this.b = j;
        this.c = j2;
        this.d = gx4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c88)) {
            return false;
        }
        c88 c88Var = (c88) obj;
        return ff4.h(this.a, c88Var.a) && this.b == c88Var.b && this.c == c88Var.c && this.d.equals(c88Var.d);
    }

    public final int hashCode() {
        return this.d.A.hashCode() + ot5.c(ot5.c(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbI = mi9.i(this.b, "StabilizationCacheWindow(windowId=", this.a, ", startInClipUs=");
        iu1.y(sbI, ", endInClipUs=", this.c, ", renderFrames=");
        sbI.append(this.d);
        sbI.append(")");
        return sbI.toString();
    }
}
