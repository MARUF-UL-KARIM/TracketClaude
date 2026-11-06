package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class bnb extends p6a implements mob {
    public bnb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAppEventListener", 5);
    }

    @Override // defpackage.mob
    public final void d0(String str, String str2) {
        Parcel parcelY1 = y1();
        parcelY1.writeString(str);
        parcelY1.writeString(str2);
        e2(parcelY1, 1);
    }
}
