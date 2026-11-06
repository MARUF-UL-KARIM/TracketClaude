package defpackage;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public abstract class mae implements Cloneable {
    public final lbe y;
    public lbe z;

    public mae(lbe lbeVar) {
        this.y = lbeVar;
        if (lbeVar.g()) {
            cp2.m("Default instance must be immutable.");
            throw null;
        }
        this.z = (lbe) lbeVar.i(4, null);
    }

    public lbe a() {
        boolean zG = this.z.g();
        lbe lbeVar = this.z;
        if (!zG) {
            return lbeVar;
        }
        lbeVar.getClass();
        nie.c.a(lbeVar.getClass()).c(lbeVar);
        lbeVar.d();
        return this.z;
    }

    public final Object clone() {
        mae maeVar = (mae) this.y.i(5, null);
        maeVar.z = a();
        return maeVar;
    }
}
