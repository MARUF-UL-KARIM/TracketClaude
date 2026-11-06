package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class vb7 extends wb7 implements Iterator {
    public final /* synthetic */ xb7 A;
    public ub7 y;
    public boolean z = true;

    public vb7(xb7 xb7Var) {
        this.A = xb7Var;
    }

    @Override // defpackage.wb7
    public final void a(ub7 ub7Var) {
        ub7 ub7Var2 = this.y;
        if (ub7Var == ub7Var2) {
            ub7 ub7Var3 = ub7Var2.B;
            this.y = ub7Var3;
            this.z = ub7Var3 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.z) {
            return this.A.y != null;
        }
        ub7 ub7Var = this.y;
        return (ub7Var == null || ub7Var.A == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.z) {
            this.z = false;
            ub7 ub7Var = this.A.y;
            this.y = ub7Var;
            return ub7Var;
        }
        ub7 ub7Var2 = this.y;
        ub7 ub7Var3 = ub7Var2 != null ? ub7Var2.A : null;
        this.y = ub7Var3;
        return ub7Var3;
    }
}
