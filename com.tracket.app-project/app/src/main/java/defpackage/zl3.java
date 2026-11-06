package defpackage;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes4.dex */
public final class zl3 extends uz8 {
    public uz8 e;

    public zl3(uz8 uz8Var) {
        uz8Var.getClass();
        this.e = uz8Var;
    }

    @Override // defpackage.uz8
    public final uz8 a() {
        return this.e.a();
    }

    @Override // defpackage.uz8
    public final uz8 b() {
        return this.e.b();
    }

    @Override // defpackage.uz8
    public final long c() {
        return this.e.c();
    }

    @Override // defpackage.uz8
    public final uz8 d(long j) {
        return this.e.d(j);
    }

    @Override // defpackage.uz8
    public final boolean e() {
        return this.e.e();
    }

    @Override // defpackage.uz8
    public final void f() throws InterruptedIOException {
        this.e.f();
    }

    @Override // defpackage.uz8
    public final uz8 g(long j, TimeUnit timeUnit) {
        timeUnit.getClass();
        return this.e.g(j, timeUnit);
    }
}
