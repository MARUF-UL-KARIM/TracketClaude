package defpackage;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class nze implements oze {
    public static final Object A = new Object();
    public volatile oze y;
    public volatile Object z;

    public static nze a(oze ozeVar) {
        if (ozeVar instanceof nze) {
            return (nze) ozeVar;
        }
        nze nzeVar = new nze();
        nzeVar.z = A;
        nzeVar.y = ozeVar;
        return nzeVar;
    }

    @Override // defpackage.oze
    public final Object zzb() {
        Object obj = this.z;
        Object obj2 = A;
        if (obj != obj2) {
            return obj;
        }
        synchronized (this) {
            try {
                Object obj3 = this.z;
                if (obj3 != obj2) {
                    return obj3;
                }
                Object objZzb = this.y.zzb();
                Object obj4 = this.z;
                if (obj4 != obj2 && obj4 != objZzb) {
                    throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + objZzb + ". This is likely due to a circular dependency.");
                }
                this.z = objZzb;
                this.y = null;
                return objZzb;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
