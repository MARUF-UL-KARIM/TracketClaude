package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class b72 {
    public final long a;
    public final long b;
    public final AtomicBoolean c;
    public final AtomicBoolean d;
    public volatile boolean e;
    public volatile boolean f;
    public volatile boolean g;
    public volatile boolean h;
    public volatile boolean i;
    public volatile int j;
    public volatile int k;

    public b72(long j) {
        long jNanoTime = System.nanoTime();
        this.a = j;
        this.b = jNanoTime;
        this.c = new AtomicBoolean(false);
        this.d = new AtomicBoolean(false);
    }
}
