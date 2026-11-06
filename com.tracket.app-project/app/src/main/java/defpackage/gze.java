package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class gze extends n2 {
    public static final Parcelable.Creator<gze> CREATOR = new w6e(21);
    public final String A;
    public final long B;
    public final int y;
    public final int z;

    public gze(int i, int i2, long j, String str) {
        this.y = i;
        this.z = i2;
        this.A = str;
        this.B = j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iR = zfe.r(parcel, 20293);
        zfe.p(parcel, 1, 4);
        parcel.writeInt(this.y);
        zfe.p(parcel, 2, 4);
        parcel.writeInt(this.z);
        zfe.j(parcel, 3, this.A);
        zfe.p(parcel, 4, 8);
        parcel.writeLong(this.B);
        zfe.s(parcel, iR);
    }
}
