package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class tb7 extends wb7 implements Iterator {
    public ub7 y;
    public ub7 z;

    @Override // defpackage.wb7
    public final void a(ub7 ub7Var) {
        ub7 ub7Var2 = this.y;
        ub7 ub7Var3 = null;
        if (ub7Var2 == ub7Var && ub7Var == this.z) {
            this.z = null;
            this.y = null;
            ub7Var2 = null;
        }
        ub7 ub7Var4 = ub7Var2;
        if (ub7Var2 == ub7Var) {
            ub7Var4 = ub7Var2.B;
            this.y = ub7Var4;
        }
        ub7 ub7Var5 = this.z;
        if (ub7Var5 == ub7Var) {
            if (ub7Var5 != ub7Var4 && ub7Var4 != null) {
                ub7Var3 = ub7Var5.A;
            }
            this.z = ub7Var3;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.z != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        ub7 ub7Var = this.z;
        ub7 ub7Var2 = this.y;
        this.z = (ub7Var == ub7Var2 || ub7Var2 == null) ? null : ub7Var.A;
        return ub7Var;
    }
}
