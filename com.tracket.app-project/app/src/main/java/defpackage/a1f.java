package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class a1f extends n2 {
    public static final Parcelable.Creator<a1f> CREATOR = new w6e(26);
    public o9c A;
    public final Bundle B;
    public final String C;
    public final String D;
    public final String E;
    public final String F;
    public final String y;
    public long z;

    public a1f(String str, long j, o9c o9cVar, Bundle bundle, String str2, String str3, String str4, String str5) {
        this.y = str;
        this.z = j;
        this.A = o9cVar;
        this.B = bundle;
        this.C = str2;
        this.D = str3;
        this.E = str4;
        this.F = str5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iR = zfe.r(parcel, 20293);
        zfe.j(parcel, 1, this.y);
        long j = this.z;
        zfe.p(parcel, 2, 8);
        parcel.writeLong(j);
        zfe.i(parcel, 3, this.A, i);
        zfe.b(parcel, 4, this.B);
        zfe.j(parcel, 5, this.C);
        zfe.j(parcel, 6, this.D);
        zfe.j(parcel, 7, this.E);
        zfe.j(parcel, 8, this.F);
        zfe.s(parcel, iR);
    }
}
