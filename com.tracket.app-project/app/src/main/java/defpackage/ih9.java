package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class ih9 extends n2 {
    public static final Parcelable.Creator<ih9> CREATOR = new w6e(27);
    public final int A;
    public final boolean B;
    public final boolean C;
    public final String y;
    public final int z;

    public ih9(int i, int i2, int i3, boolean z, boolean z2) {
        String str = z ? "0" : "1";
        StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + String.valueOf(i).length() + 13 + 2);
        zd2.z(sb, "afma-sdk-a-v", i, ".", i2);
        this(wd0.o(sb, ".", str), i, i2, z, z2);
    }

    public static ih9 a() {
        return new ih9(12451000, 12451000, true);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iR = zfe.r(parcel, 20293);
        zfe.j(parcel, 2, this.y);
        zfe.p(parcel, 3, 4);
        parcel.writeInt(this.z);
        zfe.p(parcel, 4, 4);
        parcel.writeInt(this.A);
        zfe.p(parcel, 5, 4);
        parcel.writeInt(this.B ? 1 : 0);
        zfe.p(parcel, 6, 4);
        parcel.writeInt(this.C ? 1 : 0);
        zfe.s(parcel, iR);
    }

    public ih9(int i, int i2, boolean z) {
        this(i, i2, 0, z, false);
    }

    public ih9(String str, int i, int i2, boolean z, boolean z2) {
        this.y = str;
        this.z = i;
        this.A = i2;
        this.B = z;
        this.C = z2;
    }
}
