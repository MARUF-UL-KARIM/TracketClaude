package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class btb {
    public static final btb d = new btb();
    public final Runnable a;
    public final Executor b;
    public btb c;

    public btb() {
        this.a = null;
        this.b = null;
    }

    public btb(Runnable runnable, Executor executor) {
        this.a = runnable;
        this.b = executor;
    }
}
