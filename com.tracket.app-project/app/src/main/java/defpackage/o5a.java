package defpackage;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class o5a implements p5a {
    public static final Object A = new Object();
    public volatile p5a y;
    public volatile Object z;

    public static o5a a(p5a p5aVar) {
        if (p5aVar instanceof o5a) {
            return (o5a) p5aVar;
        }
        o5a o5aVar = new o5a();
        o5aVar.z = A;
        o5aVar.y = p5aVar;
        return o5aVar;
    }

    @Override // defpackage.p5a
    public final Object g() {
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
                Object objG = this.y.g();
                Object obj4 = this.z;
                if (obj4 != obj2 && obj4 != objG) {
                    throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + objG + ". This is likely due to a circular dependency.");
                }
                this.z = objG;
                this.y = null;
                return objG;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
