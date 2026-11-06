package defpackage;

import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class f11 extends tq5 implements Serializable {
    public final tq3 y;
    public final tq5 z;

    public f11(tq3 tq3Var, tq5 tq5Var) {
        this.y = tq3Var;
        this.z = tq5Var;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        tq3 tq3Var = this.y;
        return this.z.compare(tq3Var.apply(obj), tq3Var.apply(obj2));
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f11)) {
            return false;
        }
        f11 f11Var = (f11) obj;
        return this.y.equals(f11Var.y) && this.z.equals(f11Var.z);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.y, this.z});
    }

    public final String toString() {
        return this.z + ".onResultOf(" + this.y + ")";
    }
}
