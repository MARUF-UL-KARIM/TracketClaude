package defpackage;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class zk2 implements gk6 {
    public static final Object A = new Object();
    public volatile s93 y;
    public volatile Object z;

    public static gk6 a(s93 s93Var) {
        if (s93Var instanceof zk2) {
            return s93Var;
        }
        zk2 zk2Var = new zk2();
        zk2Var.z = A;
        zk2Var.y = s93Var;
        return zk2Var;
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
