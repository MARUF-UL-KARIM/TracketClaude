package defpackage;

import android.os.SystemClock;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class xkc {
    public final ju4 a;
    public final long b;
    public final i82 c;

    public xkc(ju4 ju4Var, long j, i82 i82Var) {
        this.a = ju4Var;
        this.c = i82Var;
        i82Var.getClass();
        this.b = SystemClock.elapsedRealtime() + j;
    }
}
