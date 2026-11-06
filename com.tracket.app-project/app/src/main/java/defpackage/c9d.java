package defpackage;

import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public abstract class c9d extends xd9 implements ListIterator {
    public int A;
    public final int z;

    public c9d(int i, int i2) {
        super(9);
        oke.m(i2, i);
        this.z = i;
        this.A = i2;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    public abstract Object b(int i);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.A < this.z;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.A > 0;
    }

    @Override // defpackage.xd9, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            bd3.c();
            return null;
        }
        int i = this.A;
        this.A = i + 1;
        return b(i);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.A;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            bd3.c();
            return null;
        }
        int i = this.A - 1;
        this.A = i;
        return b(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.A - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
