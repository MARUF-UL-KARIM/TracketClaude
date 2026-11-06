package defpackage;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class suc implements Runnable {
    public final /* synthetic */ int y;
    public final /* synthetic */ tuc z;

    public /* synthetic */ suc(tuc tucVar, int i) {
        this.y = i;
        this.z = tucVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.y;
        tuc tucVar = this.z;
        switch (i) {
            case 0:
                tucVar.l();
                break;
            case 1:
                tucVar.l();
                break;
            case 2:
                tucVar.l();
                break;
            case 3:
                tucVar.l();
                break;
            default:
                tucVar.b.set(false);
                tucVar.l();
                break;
        }
    }
}
