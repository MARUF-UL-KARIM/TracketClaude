package defpackage;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class wca implements gfa {
    public static final Object A = new Object();
    public volatile gfa y;
    public volatile Object z;

    public static gfa a(gfa gfaVar) {
        if (gfaVar instanceof wca) {
            return gfaVar;
        }
        wca wcaVar = new wca();
        wcaVar.z = A;
        wcaVar.y = gfaVar;
        return wcaVar;
    }

    @Override // defpackage.gfa
    public final Object zza() {
        Object objZza;
        Object obj = this.z;
        Object obj2 = A;
        if (obj != obj2) {
            return obj;
        }
        synchronized (this) {
            try {
                objZza = this.z;
                if (objZza == obj2) {
                    objZza = this.y.zza();
                    Object obj3 = this.z;
                    if (obj3 != obj2 && obj3 != objZza) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + objZza + ". This is likely due to a circular dependency.");
                    }
                    this.z = objZza;
                    this.y = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return objZza;
    }
}
