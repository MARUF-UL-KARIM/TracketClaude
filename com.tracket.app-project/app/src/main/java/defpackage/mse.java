package defpackage;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class mse extends q5a {
    public final cr8 A;
    public final /* synthetic */ tue B;
    public final /* synthetic */ tue C;
    public final hhd z;

    public mse(tue tueVar, cr8 cr8Var, String str) {
        this.C = tueVar;
        hhd hhdVar = new hhd("OnRequestInstallCallback");
        this.B = tueVar;
        super(5);
        attachInterface(this, "com.google.android.play.core.appupdate.protocol.IAppUpdateServiceCallback");
        this.z = hhdVar;
        this.A = cr8Var;
    }
}
