package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class frb extends p6a implements esb {
    public frb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IBundleReceiver", 6);
    }

    @Override // defpackage.esb
    public final void W2(Bundle bundle) {
        Parcel parcelG0 = G0();
        s8b.b(parcelG0, bundle);
        p1(parcelG0, 1);
    }
}
