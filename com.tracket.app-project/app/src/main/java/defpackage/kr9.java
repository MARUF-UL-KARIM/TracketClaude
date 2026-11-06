package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public abstract class kr9 {
    public final lr9 a = new lr9();

    public final void a() {
        lr9 lr9Var = this.a;
        if (!lr9Var.d) {
            lr9Var.d = true;
            synchronized (lr9Var.a) {
                try {
                    Iterator it = lr9Var.b.values().iterator();
                    while (it.hasNext()) {
                        lr9.a((AutoCloseable) it.next());
                    }
                    Iterator it2 = lr9Var.c.iterator();
                    while (it2.hasNext()) {
                        lr9.a((AutoCloseable) it2.next());
                    }
                    lr9Var.c.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        b();
    }

    public void b() {
    }
}
