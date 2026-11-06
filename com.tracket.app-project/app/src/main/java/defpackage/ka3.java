package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class ka3 implements Map.Entry, wi4 {
    public ka3 A;
    public ka3 B;
    public boolean C;
    public final zr4 y;
    public final cs4 z;

    public ka3(zr4 zr4Var, cs4 cs4Var) {
        this.y = zr4Var;
        this.z = cs4Var;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ka3) {
            ka3 ka3Var = (ka3) obj;
            return this.y.equals(ka3Var.y) && this.z == ka3Var.z;
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
        return this.z.hashCode() + (this.y.hashCode() * 31);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final String toString() {
        return "Entry(key=" + this.y + ", value=" + this.z + ")";
    }
}
