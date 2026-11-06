package defpackage;

import java.util.concurrent.ScheduledFuture;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class mk2 implements nk2 {
    public final ScheduledFuture y;

    public mk2(ScheduledFuture scheduledFuture) {
        this.y = scheduledFuture;
    }

    @Override // defpackage.nk2
    public final void dispose() {
        this.y.cancel(false);
    }

    public final String toString() {
        return "DisposableFutureHandle[" + this.y + ']';
    }
}
