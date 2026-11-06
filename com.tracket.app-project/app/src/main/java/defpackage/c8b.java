package defpackage;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class c8b extends z0b implements l8b {
    public final double A;
    public final int B;
    public final int C;
    public final Map D;
    public final Drawable y;
    public final Uri z;

    public c8b(Drawable drawable, Uri uri, double d, int i, int i2, HashMap map) {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
        this.y = drawable;
        this.z = uri;
        this.A = d;
        this.B = i;
        this.C = i2;
        this.D = map;
    }

    public static l8b v4(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
        return iInterfaceQueryLocalInterface instanceof l8b ? (l8b) iInterfaceQueryLocalInterface : new k8b(iBinder);
    }

    @Override // defpackage.l8b
    public final int a() {
        return this.C;
    }

    @Override // defpackage.l8b
    public final Map b() {
        return this.D;
    }

    @Override // defpackage.l8b
    public final double c() {
        return this.A;
    }

    @Override // defpackage.l8b
    public final int j() {
        return this.B;
    }

    @Override // defpackage.z0b
    public final boolean u4(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                y44 y44VarZza = zza();
                parcel2.writeNoException();
                a1b.e(parcel2, y44VarZza);
                return true;
            case 2:
                parcel2.writeNoException();
                a1b.d(parcel2, this.z);
                return true;
            case 3:
                parcel2.writeNoException();
                parcel2.writeDouble(this.A);
                return true;
            case 4:
                parcel2.writeNoException();
                parcel2.writeInt(this.B);
                return true;
            case 5:
                parcel2.writeNoException();
                parcel2.writeInt(this.C);
                return true;
            case 6:
                parcel2.writeNoException();
                parcel2.writeMap(this.D);
                return true;
            default:
                return false;
        }
    }

    @Override // defpackage.l8b
    public final y44 zza() {
        return new yl5(this.y);
    }

    @Override // defpackage.l8b
    public final Uri zzb() {
        return this.z;
    }
}
