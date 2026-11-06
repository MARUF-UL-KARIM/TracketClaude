package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class zb7 implements Executor {
    public final /* synthetic */ int y;
    public final Executor z;

    public /* synthetic */ zb7(ExecutorService executorService, int i) {
        this.y = i;
        this.z = executorService;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.y) {
            case 0:
                this.z.execute(new yb7(0, runnable));
                break;
            default:
                this.z.execute(runnable);
                break;
        }
    }
}
