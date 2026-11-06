package defpackage;

import com.google.android.gms.internal.play_billing.zzik;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public abstract class izc implements Cloneable {
    public final r1d y;
    public r1d z;

    public izc(r1d r1dVar) {
        this.y = r1dVar;
        if (r1dVar.h()) {
            cp2.m("Default instance must be immutable.");
            throw null;
        }
        this.z = r1dVar.n();
    }

    public final r1d a() {
        boolean zH = this.z.h();
        r1d r1dVar = this.z;
        if (zH) {
            r1dVar.getClass();
            zod.c.a(r1dVar.getClass()).c(r1dVar);
            r1dVar.e();
            r1dVar = this.z;
        }
        r1dVar.getClass();
        if (r1d.i(r1dVar, true)) {
            return r1dVar;
        }
        throw new zzik();
    }

    public final void b() {
        if (this.z.h()) {
            return;
        }
        r1d r1dVarN = this.y.n();
        zod.c.a(r1dVarN.getClass()).g(r1dVarN, this.z);
        this.z = r1dVarN;
    }

    public final Object clone() {
        izc izcVar = (izc) this.y.j(5);
        boolean zH = this.z.h();
        r1d r1dVar = this.z;
        if (zH) {
            r1dVar.getClass();
            zod.c.a(r1dVar.getClass()).c(r1dVar);
            r1dVar.e();
            r1dVar = this.z;
        }
        izcVar.z = r1dVar;
        return izcVar;
    }
}
