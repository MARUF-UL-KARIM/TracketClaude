package defpackage;

import java.util.AbstractList;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class cbd extends t89 implements ListIterator {
    public final /* synthetic */ int A;
    public final /* synthetic */ AbstractList B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cbd(AbstractList abstractList, ListIterator listIterator, int i) {
        super(listIterator, 1);
        this.A = i;
        this.B = abstractList;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.t89
    public final Object b(Object obj) {
        int i = this.A;
        AbstractList abstractList = this.B;
        switch (i) {
            case 0:
                return ((h8d) ((zu4) abstractList).A).apply(obj);
            default:
                return ((h8d) ((av4) abstractList).A).apply(obj);
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return ((ListIterator) this.z).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return ((ListIterator) this.z).nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return b(((ListIterator) this.z).previous());
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return ((ListIterator) this.z).previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
