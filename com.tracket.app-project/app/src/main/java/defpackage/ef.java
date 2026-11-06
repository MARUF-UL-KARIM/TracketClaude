package defpackage;

import java.util.concurrent.ThreadFactory;
import org.jetbrains.skiko.CleanupKt;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ef implements ThreadFactory {
    public final /* synthetic */ int a;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.a) {
            case 0:
                return new Thread(runnable, "DepthEstimator");
            case 1:
                return CleanupKt.cleanupExecutor$lambda$0(runnable);
            case 2:
                return new Thread(runnable, "ReverseFrameRenderer");
            case 3:
                Thread thread = new Thread(runnable, "StabilizationCache");
                thread.setDaemon(true);
                return thread;
            default:
                return new Thread(runnable, "ExoPlayer:AudioTrackReleaseThread");
        }
    }

    public /* synthetic */ ef(int i) {
        this.a = i;
    }
}
