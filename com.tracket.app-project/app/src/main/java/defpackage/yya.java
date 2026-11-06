package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class yya implements Iterator {
    public final /* synthetic */ int y = 1;
    public final Iterator z;

    public yya(e1b e1bVar) {
        this.z = e1bVar.y.keySet().iterator();
    }

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
                return ((Map.Entry) this.z.next()).getValue();
            default:
                return (String) this.z.next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.y) {
            case 0:
                this.z.remove();
                return;
            default:
                throw new UnsupportedOperationException("Remove not supported");
        }
    }

    public yya(Iterator it) {
        it.getClass();
        this.z = it;
    }
}
