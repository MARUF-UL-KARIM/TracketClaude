package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class rdd {
    public static final rdd d = new rdd();
    public final Runnable a;
    public final Executor b;
    public rdd c;

    public rdd() {
        this.a = null;
        this.b = null;
    }

    public rdd(Runnable runnable, Executor executor) {
        this.a = runnable;
        this.b = executor;
    }
}
