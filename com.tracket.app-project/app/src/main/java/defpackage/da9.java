package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public abstract class da9 implements Iterator, wi4 {
    public int A;
    public Object[] y = ca9.e.d;
    public int z;

    public final void a(Object[] objArr, int i, int i2) {
        this.y = objArr;
        this.z = i;
        this.A = i2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.A < this.z;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
