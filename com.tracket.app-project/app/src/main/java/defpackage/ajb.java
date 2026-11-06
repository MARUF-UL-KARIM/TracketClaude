package defpackage;

import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class ajb extends z0b {
    public final String y;
    public final int z;

    public ajb(String str, int i) {
        super("com.google.android.gms.ads.internal.reward.client.IRewardItem");
        this.y = str;
        this.z = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ajb)) {
            return false;
        }
        ajb ajbVar = (ajb) obj;
        if (hxb.d(this.y, ajbVar.y)) {
            if (hxb.d(Integer.valueOf(this.z), Integer.valueOf(ajbVar.z))) {
                return true;
            }
        }
        return false;
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
        parcel2.writeInt(this.z);
        return true;
    }
}
