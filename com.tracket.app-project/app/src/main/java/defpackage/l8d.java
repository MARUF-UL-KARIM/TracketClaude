package defpackage;

import java.io.Serializable;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class l8d implements Serializable, k8d {
    public final List y;

    public final boolean equals(Object obj) {
        if (obj instanceof l8d) {
            return this.y.equals(((l8d) obj).y);
        }
        return false;
    }

    public final int hashCode() {
        return this.y.hashCode() + 306654252;
    }

    @Override // defpackage.k8d
    public final boolean i(Object obj) {
        int i = 0;
        while (true) {
            List list = this.y;
            if (i >= list.size()) {
                return true;
            }
            if (!((k8d) list.get(i)).i(obj)) {
                return false;
            }
            i++;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Predicates.and(");
        boolean z = true;
        for (Object obj : this.y) {
            if (!z) {
                sb.append(',');
            }
            sb.append(obj);
            z = false;
        }
        sb.append(')');
        return sb.toString();
    }
}
