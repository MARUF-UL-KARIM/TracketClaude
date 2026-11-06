package defpackage;

import java.util.Map;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class lt1 {
    private volatile /* synthetic */ Object current = dz2.y;

    static {
        AtomicReferenceFieldUpdater.newUpdater(lt1.class, Object.class, "current");
    }

    public final Object a(Object obj) {
        return ((Map) this.current).get(obj);
    }
}
