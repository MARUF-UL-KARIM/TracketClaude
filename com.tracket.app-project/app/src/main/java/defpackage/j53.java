package defpackage;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public abstract class j53 {
    public static final /* synthetic */ h53 a;
    public static final /* synthetic */ AtomicLongFieldUpdater b;
    public static final /* synthetic */ i53 c;
    public static final /* synthetic */ AtomicLongFieldUpdater d;

    static {
        h53 h53Var = new h53();
        h53Var.a = 0L;
        a = h53Var;
        i53 i53Var = new i53();
        i53Var.a = 0L;
        c = i53Var;
        b = AtomicLongFieldUpdater.newUpdater(h53.class, "a");
        d = AtomicLongFieldUpdater.newUpdater(i53.class, "a");
    }
}
