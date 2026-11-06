package defpackage;

import android.util.SparseArray;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class d95 {
    public final SparseArray a;
    public wb9 b;

    public d95(int i) {
        this.a = new SparseArray(i);
    }

    public final void a(wb9 wb9Var, int i, int i2) {
        int iA = wb9Var.a(i);
        SparseArray sparseArray = this.a;
        d95 d95Var = (d95) sparseArray.get(iA);
        if (d95Var == null) {
            d95Var = new d95(1);
            sparseArray.put(wb9Var.a(i), d95Var);
        }
        if (i2 > i) {
            d95Var.a(wb9Var, i + 1, i2);
        } else {
            d95Var.b = wb9Var;
        }
    }
}
