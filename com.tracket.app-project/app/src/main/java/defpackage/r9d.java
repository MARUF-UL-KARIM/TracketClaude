package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public abstract class r9d {
    public transient Map A;
    public transient Set y;
    public transient Collection z;

    public abstract Collection a();

    public abstract Map b();

    public boolean c(Object obj) {
        Iterator it = d().values().iterator();
        while (it.hasNext()) {
            if (((Collection) it.next()).contains(obj)) {
                return true;
            }
        }
        return false;
    }

    public Map d() {
        Map map = this.A;
        if (map != null) {
            return map;
        }
        Map mapB = b();
        this.A = mapB;
        return mapB;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof r9d) {
            return d().equals(((r9d) obj).d());
        }
        return false;
    }

    public final int hashCode() {
        return d().hashCode();
    }

    public final String toString() {
        return d().toString();
    }
}
