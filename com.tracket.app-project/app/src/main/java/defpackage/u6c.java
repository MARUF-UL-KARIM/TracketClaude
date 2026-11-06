package defpackage;

import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class u6c extends z0b implements xbb {
    @Override // defpackage.z0b
    public final boolean u4(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            parcel.readInt();
            a1b.f(parcel);
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // defpackage.xbb
    public final void a() {
    }

    @Override // defpackage.xbb
    public final void x(int i) {
    }
}
