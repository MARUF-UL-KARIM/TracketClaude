package defpackage;

import java.io.Serializable;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class a96 implements z86, Serializable {
    public final List y;

    public a96(List list) {
        this.y = list;
    }

    @Override // defpackage.z86
    public final boolean apply(Object obj) {
        int i = 0;
        while (true) {
            List list = this.y;
            if (i >= list.size()) {
                return true;
            }
            if (!((z86) list.get(i)).apply(obj)) {
                return false;
            }
            i++;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a96) {
            return this.y.equals(((a96) obj).y);
        }
        return false;
    }

    public final int hashCode() {
        return this.y.hashCode() + 306654252;
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
