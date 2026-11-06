package defpackage;

import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class izb extends p6a implements g0c {
    @Override // defpackage.g0c
    public final String a() {
        Parcel parcelN1 = N1(y1(), 1);
        String string = parcelN1.readString();
        parcelN1.recycle();
        return string;
    }

    @Override // defpackage.g0c
    public final String b() {
        Parcel parcelN1 = N1(y1(), 2);
        String string = parcelN1.readString();
        parcelN1.recycle();
        return string;
    }
}
