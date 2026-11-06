package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class tc6 implements Parcelable {
    public static final Parcelable.Creator<tc6> CREATOR = new w6e(6);
    public final IBinder A;
    public final Bundle B;
    public final String y;
    public final String z;

    public /* synthetic */ tc6(Parcel parcel) {
        String string = parcel.readString();
        Objects.requireNonNull(string);
        this.y = string;
        String string2 = parcel.readString();
        Objects.requireNonNull(string2);
        this.z = string2;
        if (parcel.readByte() != 0) {
            this.A = parcel.readStrongBinder();
        } else {
            this.A = null;
        }
        Bundle bundle = parcel.readBundle(tc6.class.getClassLoader());
        this.B = bundle == null ? Bundle.EMPTY : bundle;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.y);
        parcel.writeString(this.z);
        IBinder iBinder = this.A;
        if (iBinder != null) {
            parcel.writeByte((byte) 1);
            parcel.writeStrongBinder(iBinder);
        } else {
            parcel.writeByte((byte) 0);
        }
        parcel.writeBundle(this.B);
    }

    public tc6(String str, String str2, IBinder iBinder) {
        this.y = str;
        Objects.requireNonNull(str2, "url cannot be null");
        this.z = str2;
        this.A = iBinder;
        this.B = Bundle.EMPTY;
    }
}
