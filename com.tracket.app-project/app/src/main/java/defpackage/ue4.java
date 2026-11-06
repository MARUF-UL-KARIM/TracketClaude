package defpackage;

import java.util.concurrent.locks.AbstractOwnableSynchronizer;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class ue4 extends AbstractOwnableSynchronizer implements Runnable {
    public final ve4 y;

    public ue4(ve4 ve4Var) {
        this.y = ve4Var;
    }

    public final void a(Thread thread) {
        setExclusiveOwnerThread(thread);
    }

    public final String toString() {
        return this.y.toString();
    }

    @Override // java.lang.Runnable
    public final void run() {
    }
}
