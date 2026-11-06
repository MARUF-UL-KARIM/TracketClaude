package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class jfb extends n2 {
    public static final Parcelable.Creator<jfb> CREATOR = new x7a(25);
    public final int A;
    public final int y;
    public final int z;

    public jfb(int i, int i2, int i3) {
        this.y = i;
        this.z = i2;
        this.A = i3;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof jfb)) {
            jfb jfbVar = (jfb) obj;
            if (jfbVar.A == this.A && jfbVar.z == this.z && jfbVar.y == this.y) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new int[]{this.y, this.z, this.A});
    }

    public final String toString() {
        int i = this.y;
        int length = String.valueOf(i).length();
        int i2 = this.z;
        int length2 = String.valueOf(i2).length();
        int i3 = this.A;
        StringBuilder sb = new StringBuilder(pyd.d(length, 1, length2, 1, String.valueOf(i3).length()));
        zd2.y(sb, i, ".", i2, ".");
        sb.append(i3);
        return sb.toString();
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
        zfe.s(parcel, iR);
    }
}
