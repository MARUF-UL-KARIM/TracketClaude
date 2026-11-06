package defpackage;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ktb implements Runnable {
    public final /* synthetic */ int y;
    public final /* synthetic */ mtb z;

    public /* synthetic */ ktb(mtb mtbVar, int i) {
        this.y = i;
        this.z = mtbVar;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        int i = this.y;
        mtb mtbVar = this.z;
        switch (i) {
            case 0:
                mtbVar.z.execute(new ktb(mtbVar, 1));
                break;
            default:
                mtbVar.q();
                break;
        }
    }
}
