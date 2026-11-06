package defpackage;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class lz8 {
    public final vf5 a;
    public long b;

    public lz8(vf5 vf5Var) {
        vf5Var.getClass();
        this.a = vf5Var;
    }

    public final boolean a(long j) {
        if (j != this.b) {
            return false;
        }
        this.a.setValue(Boolean.TRUE);
        return true;
    }

    public final boolean b(long j) {
        long j2 = this.b;
        if (j != j2) {
            return false;
        }
        this.b = j2 + 1;
        this.a.setValue(Boolean.FALSE);
        return true;
    }
}
