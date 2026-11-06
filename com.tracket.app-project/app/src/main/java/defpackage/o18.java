package defpackage;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class o18 extends ld8 {
    public float c;

    public o18(float f, long j) {
        super(j);
        this.c = f;
    }

    @Override // defpackage.ld8
    public final void a(ld8 ld8Var) {
        ld8Var.getClass();
        this.c = ((o18) ld8Var).c;
    }

    @Override // defpackage.ld8
    public final ld8 b(long j) {
        return new o18(this.c, j);
    }
}
