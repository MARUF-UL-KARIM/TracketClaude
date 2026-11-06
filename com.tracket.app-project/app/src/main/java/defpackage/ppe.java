package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class ppe extends n2 {
    public static final Parcelable.Creator<ppe> CREATOR = new w6e(16);
    public final List y;

    public ppe(ArrayList arrayList) {
        this.y = arrayList;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iR = zfe.r(parcel, 20293);
        zfe.n(parcel, 1, this.y);
        zfe.s(parcel, iR);
    }
}
