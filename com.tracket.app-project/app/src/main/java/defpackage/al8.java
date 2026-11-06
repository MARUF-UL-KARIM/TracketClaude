package defpackage;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class al8 implements yk8 {
    public static final fa2 B = new fa2(3);
    public Object A;
    public final Object y = new Object();
    public volatile yk8 z;

    public al8(yk8 yk8Var) {
        yk8Var.getClass();
        this.z = yk8Var;
    }

    @Override // defpackage.yk8
    public final Object get() {
        yk8 yk8Var = this.z;
        fa2 fa2Var = B;
        if (yk8Var != fa2Var) {
            synchronized (this.y) {
                try {
                    if (this.z != fa2Var) {
                        Object obj = this.z.get();
                        this.A = obj;
                        this.z = fa2Var;
                        return obj;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.A;
    }

    public final String toString() {
        Object obj = this.z;
        StringBuilder sb = new StringBuilder("Suppliers.memoize(");
        if (obj == B) {
            obj = "<supplier that returned " + this.A + ">";
        }
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }
}
