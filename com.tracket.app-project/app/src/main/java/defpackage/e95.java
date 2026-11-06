package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class e95 extends n2 {
    public static final Parcelable.Creator<e95> CREATOR = new x7a(1);
    public final int A;
    public final long B;
    public final long C;
    public final String D;
    public final String E;
    public final int F;
    public final int G;
    public final int y;
    public final int z;

    public e95(int i, int i2, int i3, long j, long j2, String str, String str2, int i4, int i5) {
        this.y = i;
        this.z = i2;
        this.A = i3;
        this.B = j;
        this.C = j2;
        this.D = str;
        this.E = str2;
        this.F = i4;
        this.G = i5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iR = zfe.r(parcel, 20293);
        zfe.p(parcel, 1, 4);
        parcel.writeInt(this.y);
        zfe.p(parcel, 2, 4);
        parcel.writeInt(this.z);
        zfe.p(parcel, 3, 4);
        parcel.writeInt(this.A);
        zfe.p(parcel, 4, 8);
        parcel.writeLong(this.B);
        zfe.p(parcel, 5, 8);
        parcel.writeLong(this.C);
        zfe.j(parcel, 6, this.D);
        zfe.j(parcel, 7, this.E);
        zfe.p(parcel, 8, 4);
        parcel.writeInt(this.F);
        zfe.p(parcel, 9, 4);
        parcel.writeInt(this.G);
        zfe.s(parcel, iR);
    }
}
