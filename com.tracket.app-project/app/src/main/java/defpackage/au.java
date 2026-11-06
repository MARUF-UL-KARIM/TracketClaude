package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class au implements Executor {
    public final /* synthetic */ int y;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.y) {
            case 0:
                bu.i().a.b.execute(runnable);
                break;
            case 1:
                break;
            default:
                runnable.run();
                break;
        }
    }

    private final void a(Runnable runnable) {
    }
}
