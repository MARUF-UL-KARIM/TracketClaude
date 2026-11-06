package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class or9 {
    public final LinkedHashMap a = new LinkedHashMap();

    public final void a() {
        LinkedHashMap linkedHashMap = this.a;
        Map mapO = x05.o(linkedHashMap);
        linkedHashMap.clear();
        Iterator it = mapO.values().iterator();
        while (it.hasNext()) {
            ((kr9) it.next()).a();
        }
    }

    public final String toString() {
        String strD = iq6.a(or9.class).d();
        if (strD == null) {
            strD = "ViewModelStore";
        }
        int iHashCode = hashCode();
        j9b.a(16);
        String string = Integer.toString(iHashCode, 16);
        string.getClass();
        return strD + "@" + string + "(keys=" + sc1.A0(this.a.keySet()) + ")";
    }
}
