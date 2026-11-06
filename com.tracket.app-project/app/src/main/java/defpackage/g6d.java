package defpackage;

import android.content.Context;
import android.view.View;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class g6d {
    public final Set a;
    public final l6d b;

    public g6d(l6d l6dVar, Set set) {
        this.a = set;
        this.b = l6dVar;
    }

    public final HashMap a() {
        HashMap map = new HashMap();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((h6d) it.next()).b(map);
        }
        return map;
    }

    public final HashMap b(Context context, View view) {
        HashMap map = new HashMap();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((h6d) it.next()).c(map, context, view);
        }
        return map;
    }

    public final HashMap c() {
        HashMap map = new HashMap();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((h6d) it.next()).a(map);
        }
        return map;
    }
}
