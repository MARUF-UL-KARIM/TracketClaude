package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class dgb extends p6a implements fgb {
    public dgb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.overlay.client.IAdOverlay", 5);
    }

    @Override // defpackage.fgb
    public final void E() {
        e2(y1(), 7);
    }

    @Override // defpackage.fgb
    public final void F0(Bundle bundle) {
        Parcel parcelY1 = y1();
        a1b.c(parcelY1, bundle);
        e2(parcelY1, 1);
    }

    @Override // defpackage.fgb
    public final void I1(int i, String[] strArr, int[] iArr) {
        Parcel parcelY1 = y1();
        parcelY1.writeInt(i);
        parcelY1.writeStringArray(strArr);
        parcelY1.writeIntArray(iArr);
        e2(parcelY1, 15);
    }

    @Override // defpackage.fgb
    public final void J() {
        e2(y1(), 8);
    }

    @Override // defpackage.fgb
    public final void M0() {
        e2(y1(), 9);
    }

    @Override // defpackage.fgb
    public final void N3(int i, int i2, Intent intent) {
        Parcel parcelY1 = y1();
        parcelY1.writeInt(i);
        parcelY1.writeInt(i2);
        a1b.c(parcelY1, intent);
        e2(parcelY1, 12);
    }

    @Override // defpackage.fgb
    public final void T1(Bundle bundle) {
        Parcel parcelY1 = y1();
        a1b.c(parcelY1, bundle);
        Parcel parcelN1 = N1(parcelY1, 6);
        if (parcelN1.readInt() != 0) {
            bundle.readFromParcel(parcelN1);
        }
        parcelN1.recycle();
    }

    @Override // defpackage.fgb
    public final void a() {
        e2(y1(), 14);
    }

    @Override // defpackage.fgb
    public final boolean b() {
        Parcel parcelN1 = N1(y1(), 11);
        ClassLoader classLoader = a1b.a;
        boolean z = parcelN1.readInt() != 0;
        parcelN1.recycle();
        return z;
    }

    @Override // defpackage.fgb
    public final void d() {
        e2(y1(), 2);
    }

    @Override // defpackage.fgb
    public final void f() {
        e2(y1(), 4);
    }

    @Override // defpackage.fgb
    public final void h() {
        e2(y1(), 5);
    }

    @Override // defpackage.fgb
    public final void i() {
        e2(y1(), 3);
    }

    @Override // defpackage.fgb
    public final void j() {
        e2(y1(), 10);
    }

    @Override // defpackage.fgb
    public final void p0(y44 y44Var) {
        Parcel parcelY1 = y1();
        a1b.e(parcelY1, y44Var);
        e2(parcelY1, 13);
    }
}
