package defpackage;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class h05 extends wre {
    public final t5 a;

    public h05(t5 t5Var) {
        this.a = t5Var;
    }

    @Override // defpackage.wre
    public final void a(Object obj, dic dicVar) throws Exception {
        y5 y5Var = this.a.a;
        if (y5Var != null) {
            y5Var.a(obj, dicVar);
        } else {
            cp2.n("Launcher has not been initialized");
        }
    }
}
