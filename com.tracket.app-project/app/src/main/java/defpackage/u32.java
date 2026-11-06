package defpackage;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class u32 {
    public final mm6 a;
    public final boolean b;

    public u32(mm6 mm6Var, boolean z) {
        this.a = mm6Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof u32) {
            u32 u32Var = (u32) obj;
            if (u32Var.a.equals(this.a) && u32Var.b == this.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.valueOf(this.b).hashCode() ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }
}
