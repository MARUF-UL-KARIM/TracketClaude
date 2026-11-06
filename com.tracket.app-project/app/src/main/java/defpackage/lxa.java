package defpackage;

import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class lxa extends z0b implements m0b {
    public final z8a y;

    public lxa(z8a z8aVar) {
        super("com.google.android.gms.ads.internal.client.IAdClickListener");
        this.y = z8aVar;
    }

    @Override // defpackage.m0b
    public final void p() {
        this.y.t0();
    }

    @Override // defpackage.z0b
    public final boolean u4(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        p();
        parcel2.writeNoException();
        return true;
    }
}
