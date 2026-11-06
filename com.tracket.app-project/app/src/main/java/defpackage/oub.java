package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class oub extends p6a implements lvb {
    public oub(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IEventHandlerProxy", 6);
    }

    @Override // defpackage.lvb
    public final int b() {
        Parcel parcelF0 = f0(G0(), 2);
        int i = parcelF0.readInt();
        parcelF0.recycle();
        return i;
    }

    @Override // defpackage.lvb
    public final void i1(long j, Bundle bundle, String str, String str2) {
        Parcel parcelG0 = G0();
        parcelG0.writeString(str);
        parcelG0.writeString(str2);
        s8b.b(parcelG0, bundle);
        parcelG0.writeLong(j);
        p1(parcelG0, 1);
    }
}
