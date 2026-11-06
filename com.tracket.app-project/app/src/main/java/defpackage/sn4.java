package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public abstract class sn4 {
    public final HashMap y = new HashMap();

    public sn4(Set set) {
        synchronized (this) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                m2c m2cVar = (m2c) it.next();
                synchronized (this) {
                    d1(m2cVar.a, m2cVar.b);
                }
            }
        }
    }

    public abstract Object b1(Object obj);

    public Object c1(Object obj) {
        synchronized (this.y) {
            try {
                if (this.y.containsKey(obj)) {
                    return this.y.get(obj);
                }
                Object objB1 = b1(obj);
                this.y.put(obj, objB1);
                return objB1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public synchronized void d1(Object obj, Executor executor) {
        this.y.put(obj, executor);
    }

    public synchronized void e1(q1c q1cVar) {
        for (Map.Entry entry : this.y.entrySet()) {
            ((Executor) entry.getValue()).execute(new hzb(22, q1cVar, entry.getKey()));
        }
    }

    public sn4() {
    }
}
