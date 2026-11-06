package defpackage;

import android.os.Handler;
import android.view.Choreographer;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o20 implements Executor {
    public final /* synthetic */ int y;
    public final /* synthetic */ Object z;

    public /* synthetic */ o20(Object obj, int i) {
        this.y = i;
        this.z = obj;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        int i = this.y;
        Object obj = this.z;
        switch (i) {
            case 0:
                ((Handler) obj).post(runnable);
                break;
            case 1:
                ((sp8) obj).d(runnable);
                break;
            default:
                ((Choreographer) obj).postFrameCallback(new ke6(runnable));
                break;
        }
    }
}
