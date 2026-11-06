package defpackage;

import android.os.Bundle;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class bhc extends u7b implements lvb {
    public final d7e y;

    public bhc(d7e d7eVar) {
        super("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
        this.y = d7eVar;
    }

    @Override // defpackage.u7b
    public final boolean G(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            int iIdentityHashCode = System.identityHashCode(this.y);
            parcel2.writeNoException();
            parcel2.writeInt(iIdentityHashCode);
            return true;
        }
        String string = parcel.readString();
        String string2 = parcel.readString();
        Bundle bundle = (Bundle) s8b.a(parcel, Bundle.CREATOR);
        long j = parcel.readLong();
        s8b.d(parcel);
        i1(j, bundle, string, string2);
        parcel2.writeNoException();
        return true;
    }

    @Override // defpackage.lvb
    public final int b() {
        return System.identityHashCode(this.y);
    }

    @Override // defpackage.lvb
    public final void i1(long j, Bundle bundle, String str, String str2) {
        this.y.a(j, bundle, str, str2);
    }
}
