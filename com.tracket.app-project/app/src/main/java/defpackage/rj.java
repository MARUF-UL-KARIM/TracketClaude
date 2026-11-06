package defpackage;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class rj implements ThreadFactory {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ rj(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                Thread thread = new Thread(runnable, "SemanticLandmarkDetector");
                ((sj) obj).d.set(thread);
                return thread;
            default:
                Thread thread2 = new Thread(runnable, "TracketPreviewGL");
                ((AtomicReference) ((zl) obj).A).set(thread2);
                return thread2;
        }
    }
}
