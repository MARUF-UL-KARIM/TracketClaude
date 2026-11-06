package defpackage;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ltb implements Runnable {
    public final /* synthetic */ int A;
    public final /* synthetic */ int B;
    public final /* synthetic */ int y;
    public final /* synthetic */ mtb z;

    public /* synthetic */ ltb(mtb mtbVar, int i, int i2, int i3) {
        this.y = i3;
        this.z = mtbVar;
        this.A = i;
        this.B = i2;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        int i = this.y;
        int i2 = this.B;
        int i3 = this.A;
        mtb mtbVar = this.z;
        switch (i) {
            case 0:
                mtbVar.z.execute(new ltb(mtbVar, i3, i2, 1));
                break;
            default:
                mtbVar.p(i3 - 1, i2);
                break;
        }
    }
}
