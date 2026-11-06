package defpackage;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zlc implements Runnable {
    public final /* synthetic */ boolean A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ int y;
    public final /* synthetic */ boolean z;

    public /* synthetic */ zlc(int i, Object obj, boolean z, boolean z2) {
        this.y = i;
        this.B = obj;
        this.z = z;
        this.A = z2;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        int i = this.y;
        boolean z = this.A;
        boolean z2 = this.z;
        Object obj = this.B;
        switch (i) {
            case 0:
                ((k4e) obj).d(z2, z);
                break;
            default:
                ((fy9) ((v13) obj).A).b(z2, z);
                break;
        }
    }
}
