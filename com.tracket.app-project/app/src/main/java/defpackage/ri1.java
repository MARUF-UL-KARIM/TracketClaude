package defpackage;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ri1 implements Runnable {
    public final /* synthetic */ int y;
    public final /* synthetic */ cj1 z;

    public /* synthetic */ ri1(cj1 cj1Var, int i) {
        this.y = i;
        this.z = cj1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.y;
        cj1 cj1Var = this.z;
        switch (i) {
            case 0:
                cj1.I(cj1Var);
                break;
            default:
                cj1Var.invalidateOptionsMenu();
                break;
        }
    }
}
