package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class y4c extends p6a implements a6c {
    public y4c(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IOutOfContextTester", 5);
    }

    @Override // defpackage.a6c
    public final void R1(String str, y44 y44Var, y44 y44Var2) {
        Parcel parcelY1 = y1();
        parcelY1.writeString(str);
        a1b.e(parcelY1, y44Var);
        a1b.e(parcelY1, y44Var2);
        e2(parcelY1, 1);
    }
}
