package defpackage;

import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class u1b extends z0b implements mob {
    public static final /* synthetic */ int z = 0;
    public final or y;

    public u1b(or orVar) {
        super("com.google.android.gms.ads.internal.client.IAppEventListener");
        this.y = orVar;
    }

    @Override // defpackage.mob
    public final void d0(String str, String str2) {
        this.y.p(str, str2);
    }

    @Override // defpackage.z0b
    public final boolean u4(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        String string = parcel.readString();
        String string2 = parcel.readString();
        a1b.f(parcel);
        d0(string, string2);
        parcel2.writeNoException();
        return true;
    }
}
