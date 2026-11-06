package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class g53 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater c = AtomicIntegerFieldUpdater.newUpdater(g53.class, "b");
    public final long a;
    public volatile /* synthetic */ int b = 0;

    public g53(long j) {
        this.a = j;
    }

    public final void a() {
        if (c.compareAndSet(this, 0, 1)) {
            j53.d.compareAndSet(j53.c, this.a, 0L);
        }
    }
}
