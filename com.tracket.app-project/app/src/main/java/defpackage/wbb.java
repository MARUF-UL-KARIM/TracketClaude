package defpackage;

import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class wbb extends p6a implements xbb {
    @Override // defpackage.xbb
    public final void a() {
        e2(y1(), 1);
    }

    @Override // defpackage.xbb
    public final void x(int i) {
        Parcel parcelY1 = y1();
        parcelY1.writeInt(i);
        e2(parcelY1, 2);
    }
}
