package defpackage;

import android.util.Log;
import java.util.ArrayDeque;
import java.util.Deque;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class yb7 implements Runnable {
    public final /* synthetic */ int y;
    public final Runnable z;

    public /* synthetic */ yb7(int i, Runnable runnable) {
        this.y = i;
        this.z = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.y;
        Runnable runnable = this.z;
        switch (i) {
            case 0:
                try {
                    runnable.run();
                } catch (Exception e) {
                    w9a.b("Executor", "Background execution failure.", e);
                    return;
                }
                break;
            case 1:
                runnable.run();
                break;
            case 2:
                try {
                    runnable.run();
                } catch (RuntimeException e2) {
                    Log.e("ServiceConnMgrImpl", "error caused by ", e2);
                    return;
                }
                break;
            case 3:
                Deque deque = (Deque) u95.z.get();
                txd.j(deque);
                deque.add(runnable);
                if (deque.size() <= 1) {
                    do {
                        runnable.run();
                        deque.removeFirst();
                        runnable = (Runnable) deque.peekFirst();
                    } while (runnable != null);
                }
                break;
            default:
                u95.z.set(new ArrayDeque());
                runnable.run();
                break;
        }
    }

    public String toString() {
        switch (this.y) {
            case 1:
                return this.z.toString();
            default:
                return super.toString();
        }
    }
}
