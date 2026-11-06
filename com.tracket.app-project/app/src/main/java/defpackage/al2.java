package defpackage;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class al2 implements hk6 {
    public static final Object A = new Object();
    public volatile hk6 y;
    public volatile Object z;

    public static hk6 a(hk6 hk6Var) {
        if (hk6Var instanceof al2) {
            return hk6Var;
        }
        al2 al2Var = new al2();
        al2Var.z = A;
        al2Var.y = hk6Var;
        return al2Var;
    }

    @Override // defpackage.ik6
    public final Object get() {
        Object obj;
        Object obj2 = this.z;
        Object obj3 = A;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            obj = this.z;
            if (obj == obj3) {
                obj = this.y.get();
                Object obj4 = this.z;
                if (obj4 != obj3 && obj4 != obj) {
                    throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                }
                this.z = obj;
                this.y = null;
            }
        }
        return obj;
    }
}
