package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class av1 implements Parcelable {
    public static final Parcelable.Creator<av1> CREATOR = new j5(4);
    public final String y;
    public final AtomicLong z;

    public av1(Parcel parcel) {
        this.y = parcel.readString();
        this.z = new AtomicLong(parcel.readLong());
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.y);
        parcel.writeLong(this.z.get());
    }

    public av1(String str) {
        this.y = str;
        this.z = new AtomicLong(0L);
    }
}
