package defpackage;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class uz1 implements Runnable {
    public final /* synthetic */ Bundle A;
    public final /* synthetic */ xz1 B;
    public final /* synthetic */ int y;
    public final /* synthetic */ String z;

    public /* synthetic */ uz1(xz1 xz1Var, String str, Bundle bundle, int i) {
        this.y = i;
        this.B = xz1Var;
        this.z = str;
        this.A = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.y;
        Bundle bundle = this.A;
        String str = this.z;
        xz1 xz1Var = this.B;
        switch (i) {
            case 0:
                xz1Var.z.a(str, bundle);
                break;
            default:
                xz1Var.z.f(str, bundle);
                break;
        }
    }
}
