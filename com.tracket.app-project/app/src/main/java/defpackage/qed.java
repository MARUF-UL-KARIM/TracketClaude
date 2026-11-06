package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class qed extends ped {
    public final ju4 F;

    public qed(ju4 ju4Var) {
        ju4Var.getClass();
        this.F = ju4Var;
    }

    @Override // com.google.android.gms.internal.ads.z, defpackage.ju4
    public final void a(Runnable runnable, Executor executor) {
        this.F.a(runnable, executor);
    }

    @Override // com.google.android.gms.internal.ads.z, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return this.F.cancel(z);
    }

    @Override // com.google.android.gms.internal.ads.z, java.util.concurrent.Future
    public final Object get() {
        return this.F.get();
    }

    @Override // com.google.android.gms.internal.ads.z, java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.F.isCancelled();
    }

    @Override // com.google.android.gms.internal.ads.z, java.util.concurrent.Future
    public final boolean isDone() {
        return this.F.isDone();
    }

    @Override // com.google.android.gms.internal.ads.z
    public final String toString() {
        return this.F.toString();
    }

    @Override // com.google.android.gms.internal.ads.z, java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.F.get(j, timeUnit);
    }
}
