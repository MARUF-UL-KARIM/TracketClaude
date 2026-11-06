package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public abstract class t89 implements Iterator {
    public final /* synthetic */ int y;
    public final Iterator z;

    public t89(Iterator it, int i) {
        this.y = i;
        switch (i) {
            case 1:
                it.getClass();
                this.z = it;
                break;
            default:
                it.getClass();
                this.z = it;
                break;
        }
    }

    public abstract Object a(Object obj);

    public abstract Object b(Object obj);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.y) {
            case 0:
                break;
        }
        return this.z.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.y) {
            case 0:
                return a(this.z.next());
            default:
                return b(this.z.next());
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.y) {
            case 0:
                this.z.remove();
                break;
            default:
                this.z.remove();
                break;
        }
    }
}
