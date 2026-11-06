package defpackage;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class rib extends n2 {
    public static final Parcelable.Creator<rib> CREATOR = new sib(0);
    public final ApplicationInfo A;
    public final String B;
    public final List C;
    public final PackageInfo D;
    public final String E;
    public final String F;
    public prc G;
    public String H;
    public final boolean I;
    public final boolean J;
    public final Bundle K;
    public final Bundle y;
    public final ih9 z;

    public rib(Bundle bundle, ih9 ih9Var, ApplicationInfo applicationInfo, String str, ArrayList arrayList, PackageInfo packageInfo, String str2, String str3, prc prcVar, String str4, boolean z, boolean z2, Bundle bundle2) {
        this.y = bundle;
        this.z = ih9Var;
        this.B = str;
        this.A = applicationInfo;
        this.C = arrayList;
        this.D = packageInfo;
        this.E = str2;
        this.F = str3;
        this.G = prcVar;
        this.H = str4;
        this.I = z;
        this.J = z2;
        this.K = bundle2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iR = zfe.r(parcel, 20293);
        zfe.b(parcel, 1, this.y);
        zfe.i(parcel, 2, this.z, i);
        zfe.i(parcel, 3, this.A, i);
        zfe.j(parcel, 4, this.B);
        zfe.l(parcel, 5, this.C);
        zfe.i(parcel, 6, this.D, i);
        zfe.j(parcel, 7, this.E);
        zfe.j(parcel, 9, this.F);
        zfe.i(parcel, 10, this.G, i);
        zfe.j(parcel, 11, this.H);
        zfe.p(parcel, 12, 4);
        parcel.writeInt(this.I ? 1 : 0);
        zfe.p(parcel, 13, 4);
        parcel.writeInt(this.J ? 1 : 0);
        zfe.b(parcel, 14, this.K);
        zfe.s(parcel, iR);
    }
}
