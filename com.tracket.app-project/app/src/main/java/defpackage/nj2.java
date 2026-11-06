package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class nj2 implements Executor {
    public final /* synthetic */ int y;
    public static final nj2 z = new nj2(0);
    public static final /* synthetic */ nj2 A = new nj2(2);
    public static final /* synthetic */ nj2 B = new nj2(3);

    public /* synthetic */ nj2(int i) {
        this.y = i;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.y) {
            case 0:
                runnable.run();
                break;
            case 1:
                new Thread(runnable).start();
                break;
            case 2:
                break;
            case 3:
                runnable.run();
                break;
            default:
                runnable.run();
                break;
        }
    }

    private final /* synthetic */ void a(Runnable runnable) {
    }
}
