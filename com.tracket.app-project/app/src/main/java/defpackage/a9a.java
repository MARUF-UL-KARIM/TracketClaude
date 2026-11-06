package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class a9a extends n2 {
    public static final Parcelable.Creator<a9a> CREATOR = new x7a(12);
    public final String A;
    public final String y;
    public final String z;

    public a9a(String str, String str2, String str3) {
        this.y = str;
        this.z = str2;
        this.A = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iR = zfe.r(parcel, 20293);
        zfe.j(parcel, 1, this.y);
        zfe.j(parcel, 2, this.z);
        zfe.j(parcel, 3, this.A);
        zfe.s(parcel, iR);
    }
}
