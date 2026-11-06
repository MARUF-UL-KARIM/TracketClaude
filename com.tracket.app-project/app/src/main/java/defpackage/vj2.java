package defpackage;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class vj2 implements AutoCloseable {
    public final /* synthetic */ xj2 A;
    public final uj2 y;
    public boolean z;

    public vj2(xj2 xj2Var, uj2 uj2Var) {
        this.A = xj2Var;
        this.y = uj2Var;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.z) {
            return;
        }
        this.z = true;
        xj2 xj2Var = this.A;
        synchronized (xj2Var.F) {
            uj2 uj2Var = this.y;
            int i = uj2Var.h - 1;
            uj2Var.h = i;
            if (i == 0 && uj2Var.f) {
                xj2Var.L(uj2Var);
            }
        }
    }
}
