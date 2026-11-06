package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class uoe extends n2 {
    public static final Parcelable.Creator<uoe> CREATOR = new w6e(13);
    public final int A;
    public final String y;
    public final long z;

    public uoe(long j, int i, String str) {
        this.y = str;
        this.z = j;
        this.A = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iR = zfe.r(parcel, 20293);
        zfe.j(parcel, 1, this.y);
        zfe.p(parcel, 2, 8);
        parcel.writeLong(this.z);
        zfe.p(parcel, 3, 4);
        parcel.writeInt(this.A);
        zfe.s(parcel, iR);
    }
}
