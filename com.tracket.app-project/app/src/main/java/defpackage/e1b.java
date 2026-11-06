package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class e1b extends n2 implements Iterable {
    public static final Parcelable.Creator<e1b> CREATOR = new x7a(15);
    public final Bundle y;

    public e1b(Bundle bundle) {
        this.y = bundle;
    }

    public final Object a(String str) {
        return this.y.get(str);
    }

    public final Double b() {
        return Double.valueOf(this.y.getDouble("value"));
    }

    public final String e() {
        return this.y.getString("currency");
    }

    public final Bundle g() {
        return new Bundle(this.y);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new yya(this);
    }

    public final String toString() {
        return this.y.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iR = zfe.r(parcel, 20293);
        zfe.b(parcel, 2, g());
        zfe.s(parcel, iR);
    }
}
