package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class qx4 implements Iterable, wi4 {
    public final long y;
    public final long z;

    public qx4(long j, long j2) {
        this.y = j;
        if (j < j2) {
            long j3 = j2 % 1;
            long j4 = j % 1;
            long j5 = ((j3 < 0 ? j3 + 1 : j3) - (j4 < 0 ? j4 + 1 : j4)) % 1;
            j2 -= j5 < 0 ? j5 + 1 : j5;
        }
        this.z = j2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof qx4)) {
            return false;
        }
        if (isEmpty() && ((qx4) obj).isEmpty()) {
            return true;
        }
        qx4 qx4Var = (qx4) obj;
        return this.y == qx4Var.y && this.z == qx4Var.z;
    }

    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return Long.hashCode(this.z) + (Long.hashCode(this.y) * 31);
    }

    public final boolean isEmpty() {
        return this.y > this.z;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new px4(this.y, this.z);
    }

    public final String toString() {
        return this.y + ".." + this.z;
    }
}
