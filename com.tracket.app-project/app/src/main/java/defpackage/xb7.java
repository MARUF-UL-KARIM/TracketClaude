package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class xb7 implements Iterable {
    public final WeakHashMap A = new WeakHashMap();
    public int B = 0;
    public ub7 y;
    public ub7 z;

    public final boolean equals(Object obj) {
        tb7 tb7Var;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof xb7)) {
            return false;
        }
        xb7 xb7Var = (xb7) obj;
        if (this.B != xb7Var.B) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = xb7Var.iterator();
        while (true) {
            tb7Var = (tb7) it;
            if (!tb7Var.hasNext()) {
                break;
            }
            tb7 tb7Var2 = (tb7) it2;
            if (!tb7Var2.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) tb7Var.next();
            Object next = tb7Var2.next();
            if ((entry == null && next != null) || (entry != null && !entry.equals(next))) {
                return false;
            }
        }
        return (tb7Var.hasNext() || ((tb7) it2).hasNext()) ? false : true;
    }

    public final int hashCode() {
        Iterator it = iterator();
        int iHashCode = 0;
        while (true) {
            tb7 tb7Var = (tb7) it;
            if (!tb7Var.hasNext()) {
                return iHashCode;
            }
            iHashCode += ((Map.Entry) tb7Var.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        ub7 ub7Var = this.y;
        ub7 ub7Var2 = this.z;
        tb7 tb7Var = new tb7();
        tb7Var.y = ub7Var2;
        tb7Var.z = ub7Var;
        this.A.put(tb7Var, Boolean.FALSE);
        return tb7Var;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            tb7 tb7Var = (tb7) it;
            if (!tb7Var.hasNext()) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(((Map.Entry) tb7Var.next()).toString());
            if (tb7Var.hasNext()) {
                sb.append(", ");
            }
        }
    }
}
