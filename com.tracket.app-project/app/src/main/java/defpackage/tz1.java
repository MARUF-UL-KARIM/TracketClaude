package defpackage;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class tz1 implements Runnable {
    public final /* synthetic */ int y;
    public final /* synthetic */ xz1 z;

    public tz1(xz1 xz1Var, int i, int i2, int i3, int i4, int i5, Bundle bundle) {
        this.y = 2;
        this.z = xz1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.y;
        xz1 xz1Var = this.z;
        switch (i) {
            case 0:
                xz1Var.z.getClass();
                break;
            case 1:
                xz1Var.z.getClass();
                break;
            case 2:
                xz1Var.z.getClass();
                break;
            default:
                xz1Var.z.getClass();
                break;
        }
    }

    public /* synthetic */ tz1(xz1 xz1Var, Bundle bundle, int i) {
        this.y = i;
        this.z = xz1Var;
    }
}
