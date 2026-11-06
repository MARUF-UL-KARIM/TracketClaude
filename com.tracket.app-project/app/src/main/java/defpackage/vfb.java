package defpackage;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class vfb implements gib {
    public static final Object A = new Object();
    public volatile gib y;
    public volatile Object z = A;

    public vfb(gib gibVar) {
        this.y = gibVar;
    }

    public static vfb a(gib gibVar) {
        return gibVar instanceof vfb ? (vfb) gibVar : new vfb(gibVar);
    }

    public static gib b(gib gibVar) {
        return gibVar instanceof vfb ? gibVar : new vfb(gibVar);
    }

    @Override // defpackage.gib
    /* JADX INFO: renamed from: zza */
    public final Object mo268zza() {
        Object objMo268zza;
        Object obj = this.z;
        Object obj2 = A;
        if (obj != obj2) {
            return obj;
        }
        synchronized (this) {
            try {
                objMo268zza = this.z;
                if (objMo268zza == obj2) {
                    objMo268zza = this.y.mo268zza();
                    Object obj3 = this.z;
                    if (obj3 != obj2 && obj3 != objMo268zza) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + objMo268zza + ". This is likely due to a circular dependency.");
                    }
                    this.z = objMo268zza;
                    this.y = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return objMo268zza;
    }
}
