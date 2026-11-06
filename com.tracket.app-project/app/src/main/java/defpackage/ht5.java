package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class ht5 implements Serializable {
    public final Object y;
    public final Object z;

    public ht5(Object obj, Object obj2) {
        this.y = obj;
        this.z = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ht5)) {
            return false;
        }
        ht5 ht5Var = (ht5) obj;
        return ff4.h(this.y, ht5Var.y) && ff4.h(this.z, ht5Var.z);
    }

    public final int hashCode() {
        Object obj = this.y;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.z;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.y + ", " + this.z + ')';
    }
}
