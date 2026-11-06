package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class ub7 implements Map.Entry {
    public ub7 A;
    public ub7 B;
    public final Object y;
    public final bv4 z;

    public ub7(Object obj, bv4 bv4Var) {
        this.y = obj;
        this.z = bv4Var;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ub7) {
            ub7 ub7Var = (ub7) obj;
            return this.y.equals(ub7Var.y) && this.z == ub7Var.z;
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.y;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.z;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.z.hashCode() ^ this.y.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.y + "=" + this.z;
    }
}
