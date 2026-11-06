package defpackage;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class j1d implements i1d {
    public final Executor a;
    public final PriorityQueue b = new PriorityQueue();

    public j1d(Executor executor) {
        this.a = executor;
    }

    @Override // defpackage.i1d
    public final void a(long j, Runnable runnable) {
        if (j <= 0) {
            this.a.execute(runnable);
            return;
        }
        k1d k1dVar = new k1d(System.currentTimeMillis() + j, runnable);
        PriorityQueue priorityQueue = this.b;
        synchronized (priorityQueue) {
            priorityQueue.add(k1dVar);
        }
    }

    @Override // defpackage.i1d
    public final void zzb() {
        PriorityQueue priorityQueue = this.b;
        synchronized (priorityQueue) {
            try {
                if (priorityQueue.isEmpty()) {
                    return;
                }
                PriorityQueue priorityQueue2 = new PriorityQueue();
                long jCurrentTimeMillis = System.currentTimeMillis();
                for (k1d k1dVar = (k1d) priorityQueue.peek(); k1dVar != null && k1dVar.z <= jCurrentTimeMillis; k1dVar = (k1d) priorityQueue.peek()) {
                    priorityQueue2.add(k1dVar);
                }
                Iterator it = priorityQueue2.iterator();
                while (it.hasNext()) {
                    try {
                        this.a.execute(((k1d) it.next()).y);
                    } catch (RuntimeException unused) {
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
