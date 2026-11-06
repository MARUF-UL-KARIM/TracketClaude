package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class xz8 implements Parcelable {
    public static final Parcelable.Creator<xz8> CREATOR = new j5(18);
    public long y;
    public long z;

    public xz8() {
        this(e(), a());
    }

    public static long a() {
        return SystemClock.elapsedRealtimeNanos() / 1000;
    }

    public static long e() {
        return TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis());
    }

    public final long b() {
        return new xz8().z - this.z;
    }

    public final long c(xz8 xz8Var) {
        return xz8Var.z - this.z;
    }

    public final void d() {
        this.y = e();
        this.z = a();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.y);
        parcel.writeLong(this.z);
    }

    public xz8(long j, long j2) {
        this.y = j;
        this.z = j2;
    }
}
