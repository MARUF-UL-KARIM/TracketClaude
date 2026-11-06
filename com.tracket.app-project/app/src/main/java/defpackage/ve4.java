package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public abstract class ve4 extends AtomicReference implements Runnable {
    public static final h7a A;
    public static final h7a B;
    public static final h7a C;
    public static final h7a z;
    public final /* synthetic */ int y;

    static {
        int i = 2;
        z = new h7a(i);
        A = new h7a(i);
        int i2 = 13;
        B = new h7a(i2);
        C = new h7a(i2);
    }

    public abstract void a(Throwable th);

    public abstract void b(Object obj);

    public abstract boolean c();

    public abstract Object d();

    public abstract String e();

    public void f(Thread thread) {
        Runnable runnable = (Runnable) get();
        ue4 ue4Var = null;
        boolean z2 = false;
        int i = 0;
        while (true) {
            boolean z3 = runnable instanceof ue4;
            h7a h7aVar = A;
            if (!z3 && runnable != h7aVar) {
                break;
            }
            if (z3) {
                ue4Var = (ue4) runnable;
            }
            i++;
            if (i <= 1000) {
                Thread.yield();
            } else if (runnable == h7aVar || compareAndSet(runnable, h7aVar)) {
                z2 = Thread.interrupted() || z2;
                LockSupport.park(ue4Var);
            }
            runnable = (Runnable) get();
        }
        if (z2) {
            thread.interrupt();
        }
    }

    public abstract Object g();

    public void h(Thread thread) {
        Runnable runnable = (Runnable) get();
        yed yedVar = null;
        boolean z2 = false;
        int i = 0;
        while (true) {
            boolean z3 = runnable instanceof yed;
            h7a h7aVar = C;
            if (!z3) {
                if (runnable != h7aVar) {
                    break;
                }
            } else {
                yedVar = (yed) runnable;
            }
            i++;
            if (i <= 1000) {
                Thread.yield();
            } else if (runnable == h7aVar || compareAndSet(runnable, h7aVar)) {
                z2 = Thread.interrupted() || z2;
                LockSupport.park(yedVar);
            }
            runnable = (Runnable) get();
        }
        if (z2) {
            thread.interrupt();
        }
    }

    public abstract String i();

    public abstract boolean j();

    public abstract void k(Object obj);

    public abstract void l(Throwable th);

    public void m() {
        h7a h7aVar = C;
        h7a h7aVar2 = B;
        Runnable runnable = (Runnable) get();
        if (runnable instanceof Thread) {
            yed yedVar = new yed(this);
            yedVar.a(Thread.currentThread());
            if (compareAndSet(runnable, yedVar)) {
                try {
                    ((Thread) runnable).interrupt();
                    if (((Runnable) getAndSet(h7aVar2)) == h7aVar) {
                    }
                } finally {
                    if (((Runnable) getAndSet(h7aVar2)) == h7aVar) {
                        LockSupport.unpark((Thread) runnable);
                    }
                }
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object objD = null;
        switch (this.y) {
            case 0:
                Thread threadCurrentThread = Thread.currentThread();
                if (compareAndSet(null, threadCurrentThread)) {
                    boolean zC = c();
                    h7a h7aVar = z;
                    if (!zC) {
                        try {
                            objD = d();
                            break;
                        } catch (Throwable th) {
                            try {
                                if (th instanceof InterruptedException) {
                                    Thread.currentThread().interrupt();
                                    break;
                                }
                                if (!compareAndSet(threadCurrentThread, h7aVar)) {
                                    f(threadCurrentThread);
                                }
                                if (zC) {
                                    return;
                                }
                                a(th);
                                return;
                            } catch (Throwable th2) {
                                if (!compareAndSet(threadCurrentThread, h7aVar)) {
                                    f(threadCurrentThread);
                                }
                                if (!zC) {
                                    b(null);
                                }
                                throw th2;
                            }
                        }
                    }
                    if (!compareAndSet(threadCurrentThread, h7aVar)) {
                        f(threadCurrentThread);
                    }
                    if (zC) {
                        return;
                    }
                    b(objD);
                    return;
                }
                return;
            default:
                Thread threadCurrentThread2 = Thread.currentThread();
                if (compareAndSet(null, threadCurrentThread2)) {
                    boolean zJ = j();
                    h7a h7aVar2 = B;
                    if (!zJ) {
                        try {
                            objD = g();
                            break;
                        } catch (Throwable th3) {
                            try {
                                if (th3 instanceof InterruptedException) {
                                    Thread.currentThread().interrupt();
                                    break;
                                }
                                if (!compareAndSet(threadCurrentThread2, h7aVar2)) {
                                    h(threadCurrentThread2);
                                }
                                l(th3);
                                return;
                            } catch (Throwable th4) {
                                if (!compareAndSet(threadCurrentThread2, h7aVar2)) {
                                    h(threadCurrentThread2);
                                }
                                k(null);
                                throw th4;
                            }
                        }
                    }
                    if (!compareAndSet(threadCurrentThread2, h7aVar2)) {
                        h(threadCurrentThread2);
                    }
                    if (zJ) {
                        return;
                    }
                    k(objD);
                    return;
                }
                return;
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        String strP = "running=[NOT STARTED YET]";
        switch (this.y) {
            case 0:
                Runnable runnable = (Runnable) get();
                if (runnable == z) {
                    strP = "running=[DONE]";
                } else if (runnable instanceof ue4) {
                    strP = "running=[INTERRUPTED]";
                } else if (runnable instanceof Thread) {
                    strP = "running=[RUNNING ON " + ((Thread) runnable).getName() + "]";
                }
                return strP + ", " + e();
            default:
                Runnable runnable2 = (Runnable) get();
                if (runnable2 == B) {
                    strP = "running=[DONE]";
                } else if (runnable2 instanceof yed) {
                    strP = "running=[INTERRUPTED]";
                } else if (runnable2 instanceof Thread) {
                    String name = ((Thread) runnable2).getName();
                    strP = wd0.p(new StringBuilder(String.valueOf(name).length() + 21), "running=[RUNNING ON ", name, "]");
                }
                String strI = i();
                return wd0.p(new StringBuilder(strP.length() + 2 + String.valueOf(strI).length()), strP, ", ", strI);
        }
    }
}
