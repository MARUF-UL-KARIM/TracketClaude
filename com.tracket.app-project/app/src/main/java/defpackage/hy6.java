package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class hy6 extends tq5 implements Serializable {
    public final tq5 y;

    public hy6(tq5 tq5Var) {
        this.y = tq5Var;
    }

    @Override // defpackage.tq5
    public final tq5 a() {
        return this.y;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.y.compare(obj2, obj);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hy6) {
            return this.y.equals(((hy6) obj).y);
        }
        return false;
    }

    public final int hashCode() {
        return -this.y.hashCode();
    }

    public final String toString() {
        return this.y + ".reverse()";
    }
}
