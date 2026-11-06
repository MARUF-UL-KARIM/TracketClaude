package defpackage;

import com.google.android.gms.internal.consent_sdk.zzso;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public abstract class mte implements Cloneable {
    public final ute y;
    public ute z;

    public mte(ute uteVar) {
        this.y = uteVar;
        if (uteVar.e()) {
            cp2.m("Default instance must be immutable.");
            throw null;
        }
        this.z = (ute) uteVar.f(4);
    }

    public final ute a() {
        boolean zE = this.z.e();
        ute uteVar = this.z;
        if (zE) {
            uteVar.getClass();
            twe.c.a(uteVar.getClass()).b(uteVar);
            uteVar.j();
            uteVar = this.z;
        }
        uteVar.getClass();
        boolean zG = true;
        byte bByteValue = ((Byte) uteVar.f(1)).byteValue();
        if (bByteValue != 1) {
            if (bByteValue == 0) {
                zG = false;
            } else {
                zG = twe.c.a(uteVar.getClass()).g(uteVar);
                uteVar.f(2);
            }
        }
        if (zG) {
            return uteVar;
        }
        throw new zzso("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final void b() {
        if (this.z.e()) {
            return;
        }
        ute uteVar = (ute) this.y.f(4);
        twe.c.a(uteVar.getClass()).f(uteVar, this.z);
        this.z = uteVar;
    }

    public final Object clone() {
        mte mteVar = (mte) this.y.f(5);
        boolean zE = this.z.e();
        ute uteVar = this.z;
        if (zE) {
            uteVar.getClass();
            twe.c.a(uteVar.getClass()).b(uteVar);
            uteVar.j();
            uteVar = this.z;
        }
        mteVar.z = uteVar;
        return mteVar;
    }
}
