package defpackage;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class m8b {
    public final l8b a;
    public final Drawable b;
    public final Uri c;
    public final double d;
    public final int e;
    public final int f;

    public m8b(l8b l8bVar) {
        Drawable drawable;
        double dC;
        int iJ;
        this.a = l8bVar;
        Uri uriZzb = null;
        try {
            y44 y44VarZza = l8bVar.zza();
            drawable = y44VarZza != null ? (Drawable) yl5.E1(y44VarZza) : null;
        } catch (RemoteException e) {
            q9c.g("", e);
        }
        this.b = drawable;
        try {
            uriZzb = this.a.zzb();
        } catch (RemoteException e2) {
            q9c.g("", e2);
        }
        this.c = uriZzb;
        try {
            dC = this.a.c();
        } catch (RemoteException e3) {
            q9c.g("", e3);
            dC = 1.0d;
        }
        this.d = dC;
        int iA = -1;
        try {
            iJ = this.a.j();
        } catch (RemoteException e4) {
            q9c.g("", e4);
            iJ = -1;
        }
        this.e = iJ;
        try {
            iA = this.a.a();
        } catch (RemoteException e5) {
            q9c.g("", e5);
        }
        this.f = iA;
    }
}
