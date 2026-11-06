package defpackage;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class lc4 implements Parcelable {
    public static final Parcelable.Creator<lc4> CREATOR = new j5(11);
    public final int A;
    public final int B;
    public final IntentSender y;
    public final Intent z;

    public lc4(IntentSender intentSender, Intent intent, int i, int i2) {
        this.y = intentSender;
        this.z = intent;
        this.A = i;
        this.B = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.y, i);
        parcel.writeParcelable(this.z, i);
        parcel.writeInt(this.A);
        parcel.writeInt(this.B);
    }
}
