package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class ekc extends z0b implements g0c {
    public final String y;
    public final String z;

    public ekc(String str, String str2) {
        super("com.google.android.gms.ads.internal.client.IMuteThisAdReason");
        this.y = str;
        this.z = str2;
    }

    public static g0c v4(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMuteThisAdReason");
        return iInterfaceQueryLocalInterface instanceof g0c ? (g0c) iInterfaceQueryLocalInterface : new izb(iBinder, "com.google.android.gms.ads.internal.client.IMuteThisAdReason", 5);
    }

    @Override // defpackage.g0c
    public final String a() {
        return this.y;
    }

    @Override // defpackage.g0c
    public final String b() {
        return this.z;
    }

    @Override // defpackage.z0b
    public final boolean u4(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            parcel2.writeNoException();
            parcel2.writeString(this.y);
            return true;
        }
        if (i != 2) {
            return false;
        }
        parcel2.writeNoException();
        parcel2.writeString(this.z);
        return true;
    }
}
