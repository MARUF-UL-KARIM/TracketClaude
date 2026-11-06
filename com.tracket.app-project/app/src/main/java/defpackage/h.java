package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public abstract class h implements Parcelable {
    public final Parcelable y;
    public static final g z = new g();
    public static final Parcelable.Creator<h> CREATOR = new aw5(1);

    public h(Parcelable parcelable) {
        if (parcelable != null) {
            this.y = parcelable == z ? null : parcelable;
        } else {
            cp2.m("superState must not be null");
            throw null;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.y, i);
    }

    public h() {
        this.y = null;
    }

    public h(Parcel parcel, ClassLoader classLoader) {
        Parcelable parcelable = parcel.readParcelable(classLoader);
        this.y = parcelable == null ? z : parcelable;
    }
}
