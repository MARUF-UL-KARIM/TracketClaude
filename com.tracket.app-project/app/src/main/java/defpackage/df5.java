package defpackage;

import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class df5 implements ListIterator, wi4 {
    public int A;
    public final /* synthetic */ int y;
    public final List z;

    public df5(int i, int i2, List list) {
        this.y = i2;
        switch (i2) {
            case 1:
                this.z = list;
                this.A = i;
                break;
            default:
                this.z = list;
                this.A = i - 1;
                break;
        }
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        int i = this.y;
        List list = this.z;
        switch (i) {
            case 0:
                int i2 = this.A + 1;
                this.A = i2;
                list.add(i2, obj);
                break;
            default:
                list.add(this.A, obj);
                this.A++;
                break;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        int i = this.y;
        List list = this.z;
        switch (i) {
            case 0:
                return this.A < list.size() - 1;
            default:
                return this.A < list.size();
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.y) {
            case 0:
                return this.A >= 0;
            default:
                return this.A > 0;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        int i = this.y;
        List list = this.z;
        switch (i) {
            case 0:
                int i2 = this.A + 1;
                this.A = i2;
                return list.get(i2);
            default:
                int i3 = this.A;
                this.A = i3 + 1;
                return list.get(i3);
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.y) {
            case 0:
                return this.A + 1;
            default:
                return this.A;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        int i = this.y;
        List list = this.z;
        switch (i) {
            case 0:
                int i2 = this.A;
                this.A = i2 - 1;
                return list.get(i2);
            default:
                int i3 = this.A - 1;
                this.A = i3;
                return list.get(i3);
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        switch (this.y) {
            case 0:
                return this.A;
            default:
                return this.A - 1;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        int i = this.y;
        List list = this.z;
        switch (i) {
            case 0:
                list.remove(this.A);
                this.A--;
                break;
            default:
                int i2 = this.A - 1;
                this.A = i2;
                list.remove(i2);
                break;
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        int i = this.y;
        List list = this.z;
        switch (i) {
            case 0:
                list.set(this.A, obj);
                break;
            default:
                list.set(this.A, obj);
                break;
        }
    }
}
