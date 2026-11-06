package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class tl3 extends fi3 {
    public final ju4 G;

    public tl3(ju4 ju4Var) {
        this.G = ju4Var;
    }

    @Override // com.google.common.util.concurrent.a, defpackage.ju4
    public final void a(Runnable runnable, Executor executor) {
        this.G.a(runnable, executor);
    }

    @Override // com.google.common.util.concurrent.a, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return this.G.cancel(z);
    }

    @Override // com.google.common.util.concurrent.a, java.util.concurrent.Future
    public final Object get() {
        return this.G.get();
    }

    @Override // com.google.common.util.concurrent.a, java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.G.isCancelled();
    }

    @Override // com.google.common.util.concurrent.a, java.util.concurrent.Future
    public final boolean isDone() {
        return this.G.isDone();
    }

    @Override // com.google.common.util.concurrent.a
    public final String toString() {
        return this.G.toString();
    }

    @Override // com.google.common.util.concurrent.a, java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.G.get(j, timeUnit);
    }
}
