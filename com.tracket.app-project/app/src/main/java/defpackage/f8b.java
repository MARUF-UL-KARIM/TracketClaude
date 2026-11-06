package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class f8b extends p6a implements h8b {
    public f8b(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IAttributionInfo", 5);
    }

    @Override // defpackage.h8b
    public final String zza() {
        Parcel parcelN1 = N1(y1(), 2);
        String string = parcelN1.readString();
        parcelN1.recycle();
        return string;
    }

    @Override // defpackage.h8b
    public final ArrayList zzb() {
        Parcel parcelN1 = N1(y1(), 3);
        ArrayList arrayList = parcelN1.readArrayList(a1b.a);
        parcelN1.recycle();
        return arrayList;
    }
}
