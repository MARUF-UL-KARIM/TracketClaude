package defpackage;

import android.os.Bundle;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class ukb extends p6a implements blb {
    @Override // defpackage.blb
    public final void I3(String str, Bundle bundle, String str2) {
        Parcel parcelY1 = y1();
        parcelY1.writeString(str);
        parcelY1.writeString(str2);
        a1b.c(parcelY1, bundle);
        e2(parcelY1, 3);
    }

    @Override // defpackage.blb
    public final void q(String str) {
        Parcel parcelY1 = y1();
        parcelY1.writeString(str);
        e2(parcelY1, 2);
    }
}
