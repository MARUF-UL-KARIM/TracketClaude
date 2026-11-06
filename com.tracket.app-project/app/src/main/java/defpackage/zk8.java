package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class zk8 implements yk8, Serializable {
    public volatile transient boolean A;
    public transient Object B;
    public final transient Object y = new Object();
    public final yk8 z;

    public zk8(yk8 yk8Var) {
        yk8Var.getClass();
        this.z = yk8Var;
    }

    @Override // defpackage.yk8
    public final Object get() {
        if (!this.A) {
            synchronized (this.y) {
                try {
                    if (!this.A) {
                        Object obj = this.z.get();
                        this.B = obj;
                        this.A = true;
                        return obj;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.B;
    }

    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder("Suppliers.memoize(");
        if (this.A) {
            obj = "<supplier that returned " + this.B + ">";
        } else {
            obj = this.z;
        }
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }
}
