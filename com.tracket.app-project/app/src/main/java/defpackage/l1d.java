package defpackage;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class l1d implements i1d {
    public final ScheduledExecutorService a = Executors.newSingleThreadScheduledExecutor();

    @Override // defpackage.i1d
    public final void a(long j, Runnable runnable) {
        this.a.schedule(runnable, j, TimeUnit.MILLISECONDS);
    }

    @Override // defpackage.i1d
    public final void zzb() {
    }
}
