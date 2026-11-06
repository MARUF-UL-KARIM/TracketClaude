package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.util.Random;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ke6 implements Choreographer.FrameCallback {
    public final /* synthetic */ int y = 0;
    public final /* synthetic */ Object z;

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        int i = this.y;
        Object obj = this.z;
        switch (i) {
            case 0:
                Handler.createAsync(Looper.getMainLooper()).postDelayed(new fp((Context) obj, 2), new Random().nextInt(Math.max(1000, 1)) + 5000);
                break;
            default:
                ((Runnable) obj).run();
                break;
        }
    }

    public /* synthetic */ ke6(Runnable runnable) {
        this.z = runnable;
    }
}
