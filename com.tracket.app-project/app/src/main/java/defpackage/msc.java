package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class msc implements ju4 {
    public final ju4 A;
    public final Object y;
    public final String z;

    public msc(ju4 ju4Var, Object obj, String str) {
        this.y = obj;
        this.z = str;
        this.A = ju4Var;
    }

    @Override // defpackage.ju4
    public final void a(Runnable runnable, Executor executor) {
        this.A.a(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return this.A.cancel(z);
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.A.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.A.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.A.isDone();
    }

    public final String toString() {
        int iIdentityHashCode = System.identityHashCode(this);
        String str = this.z;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(iIdentityHashCode).length());
        sb.append(str);
        sb.append("@");
        sb.append(iIdentityHashCode);
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.A.get(j, timeUnit);
    }
}
