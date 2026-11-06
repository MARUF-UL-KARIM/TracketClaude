package defpackage;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class q18 extends ld8 {
    public long c;

    public q18(long j, long j2) {
        super(j);
        this.c = j2;
    }

    @Override // defpackage.ld8
    public final void a(ld8 ld8Var) {
        ld8Var.getClass();
        this.c = ((q18) ld8Var).c;
    }

    @Override // defpackage.ld8
    public final ld8 b(long j) {
        return new q18(j, this.c);
    }
}
