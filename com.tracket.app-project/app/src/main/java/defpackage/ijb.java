package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class ijb extends p6a implements jjb {
    public ijb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardItem", 5);
    }

    @Override // defpackage.jjb
    public final String a() {
        Parcel parcelN1 = N1(y1(), 1);
        String string = parcelN1.readString();
        parcelN1.recycle();
        return string;
    }

    @Override // defpackage.jjb
    public final int b() {
        Parcel parcelN1 = N1(y1(), 2);
        int i = parcelN1.readInt();
        parcelN1.recycle();
        return i;
    }
}
