package defpackage;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class h2e implements o2e, f2e {
    public static final Object c = new Object();
    public volatile o2e a;
    public volatile Object b = c;

    public h2e(o2e o2eVar) {
        this.a = o2eVar;
    }

    public static h2e a(o2e o2eVar) {
        return o2eVar instanceof h2e ? (h2e) o2eVar : new h2e(o2eVar);
    }

    public static f2e b(o2e o2eVar) {
        if (o2eVar instanceof f2e) {
            return (f2e) o2eVar;
        }
        o2eVar.getClass();
        return new h2e(o2eVar);
    }

    @Override // defpackage.o2e
    public final Object zzb() {
        Object obj = this.b;
        Object obj2 = c;
        if (obj != obj2) {
            return obj;
        }
        synchronized (this) {
            try {
                Object obj3 = this.b;
                if (obj3 != obj2) {
                    return obj3;
                }
                Object objZzb = this.a.zzb();
                Object obj4 = this.b;
                if (obj4 != obj2 && obj4 != objZzb) {
                    throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + objZzb + ". This is likely due to a circular dependency.");
                }
                this.b = objZzb;
                this.a = null;
                return objZzb;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
