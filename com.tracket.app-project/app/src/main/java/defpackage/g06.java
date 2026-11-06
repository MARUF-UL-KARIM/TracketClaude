package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public abstract class g06 implements Iterator, wi4 {
    public boolean A = true;
    public final da9[] y;
    public int z;

    public g06(ca9 ca9Var, da9[] da9VarArr) {
        this.y = da9VarArr;
        da9VarArr[0].a(ca9Var.d, Integer.bitCount(ca9Var.a) * 2, 0);
        this.z = 0;
        a();
    }

    public final void a() {
        int i = this.z;
        da9[] da9VarArr = this.y;
        da9 da9Var = da9VarArr[i];
        if (da9Var.A < da9Var.z) {
            return;
        }
        while (-1 < i) {
            int iB = b(i);
            if (iB == -1) {
                da9 da9Var2 = da9VarArr[i];
                int i2 = da9Var2.A;
                Object[] objArr = da9Var2.y;
                if (i2 < objArr.length) {
                    int length = objArr.length;
                    da9Var2.A = i2 + 1;
                    iB = b(i);
                }
            }
            if (iB != -1) {
                this.z = iB;
                return;
            }
            if (i > 0) {
                da9 da9Var3 = da9VarArr[i - 1];
                int i3 = da9Var3.A;
                int length2 = da9Var3.y.length;
                da9Var3.A = i3 + 1;
            }
            da9VarArr[i].a(ca9.e.d, 0, 0);
            i--;
        }
        this.A = false;
    }

    public final int b(int i) {
        da9[] da9VarArr = this.y;
        da9 da9Var = da9VarArr[i];
        int i2 = da9Var.A;
        if (i2 < da9Var.z) {
            return i;
        }
        Object[] objArr = da9Var.y;
        if (i2 >= objArr.length) {
            return -1;
        }
        int length = objArr.length;
        Object obj = objArr[i2];
        obj.getClass();
        ca9 ca9Var = (ca9) obj;
        if (i == 6) {
            da9 da9Var2 = da9VarArr[i + 1];
            Object[] objArr2 = ca9Var.d;
            da9Var2.a(objArr2, objArr2.length, 0);
        } else {
            da9VarArr[i + 1].a(ca9Var.d, Integer.bitCount(ca9Var.a) * 2, 0);
        }
        return b(i + 1);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.A;
    }

    @Override // java.util.Iterator
    public Object next() {
        if (!this.A) {
            bd3.c();
            return null;
        }
        Object next = this.y[this.z].next();
        a();
        return next;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
