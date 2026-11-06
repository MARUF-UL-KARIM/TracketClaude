package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public abstract class yx8 {
    public static final /* synthetic */ long b = yu.a.objectFieldOffset(yx8.class.getDeclaredField("_size$volatile"));
    private volatile /* synthetic */ int _size$volatile;
    public m13[] a;

    public final void a(m13 m13Var) {
        m13Var.c((n13) this);
        m13[] m13VarArr = this.a;
        if (m13VarArr == null) {
            m13VarArr = new m13[4];
            this.a = m13VarArr;
        } else if (b() >= m13VarArr.length) {
            m13VarArr = (m13[]) Arrays.copyOf(m13VarArr, b() * 2);
            this.a = m13VarArr;
        }
        int iB = b();
        yu.a.putIntVolatile(this, b, iB + 1);
        m13VarArr[iB] = m13Var;
        m13Var.z = iB;
        d(iB);
    }

    public final int b() {
        return yu.a.getIntVolatile(this, b);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0047  */
    /* JADX WARN: Code duplicated, block: B:14:0x0054  */
    /* JADX WARN: Code duplicated, block: B:17:0x0065  */
    /* JADX WARN: Code duplicated, block: B:21:0x0077 A[LOOP:0: B:9:0x003c->B:21:0x0077, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:24:0x007c A[EDGE_INSN: B:24:0x007c->B:22:0x007c BREAK  A[LOOP:0: B:9:0x003c->B:21:0x0077], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:25:0x007c A[EDGE_INSN: B:25:0x007c->B:22:0x007c BREAK  A[LOOP:0: B:9:0x003c->B:21:0x0077], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:? A[SYNTHETIC] */
    public final m13 c(int i) {
        int i2;
        int i3;
        Object[] objArr;
        int i4;
        Comparable comparable;
        Comparable comparable2;
        Comparable comparable3;
        Object obj;
        Object[] objArr2 = this.a;
        objArr2.getClass();
        yu.a.putIntVolatile(this, b, b() - 1);
        if (i < b()) {
            e(i, b());
            int i5 = (i - 1) / 2;
            if (i > 0) {
                m13 m13Var = objArr2[i];
                m13Var.getClass();
                Object obj2 = objArr2[i5];
                obj2.getClass();
                if (m13Var.compareTo(obj2) < 0) {
                    e(i, i5);
                    d(i5);
                } else {
                    while (true) {
                        i2 = i * 2;
                        i3 = i2 + 1;
                        if (i3 >= b()) {
                            break;
                        }
                        objArr = this.a;
                        objArr.getClass();
                        i4 = i2 + 2;
                        if (i4 < b()) {
                            comparable3 = objArr[i4];
                            comparable3.getClass();
                            obj = objArr[i3];
                            obj.getClass();
                            if (comparable3.compareTo(obj) >= 0) {
                                i4 = i3;
                            }
                        } else {
                            i4 = i3;
                        }
                        comparable = objArr[i];
                        comparable.getClass();
                        comparable2 = objArr[i4];
                        comparable2.getClass();
                        if (comparable.compareTo(comparable2) <= 0) {
                            break;
                        }
                        e(i, i4);
                        i = i4;
                    }
                }
            } else {
                while (true) {
                    i2 = i * 2;
                    i3 = i2 + 1;
                    if (i3 >= b()) {
                        break;
                        break;
                    }
                    objArr = this.a;
                    objArr.getClass();
                    i4 = i2 + 2;
                    if (i4 < b()) {
                        comparable3 = objArr[i4];
                        comparable3.getClass();
                        obj = objArr[i3];
                        obj.getClass();
                        if (comparable3.compareTo(obj) >= 0) {
                            i4 = i3;
                        }
                    } else {
                        i4 = i3;
                    }
                    comparable = objArr[i];
                    comparable.getClass();
                    comparable2 = objArr[i4];
                    comparable2.getClass();
                    if (comparable.compareTo(comparable2) <= 0) {
                        break;
                        break;
                    }
                    e(i, i4);
                    i = i4;
                }
            }
        }
        m13 m13Var2 = objArr2[b()];
        m13Var2.getClass();
        m13Var2.c(null);
        m13Var2.z = -1;
        objArr2[b()] = null;
        return m13Var2;
    }

    public final void d(int i) {
        while (i > 0) {
            m13[] m13VarArr = this.a;
            m13VarArr.getClass();
            int i2 = (i - 1) / 2;
            m13 m13Var = m13VarArr[i2];
            m13Var.getClass();
            m13 m13Var2 = m13VarArr[i];
            m13Var2.getClass();
            if (m13Var.compareTo(m13Var2) <= 0) {
                return;
            }
            e(i, i2);
            i = i2;
        }
    }

    public final void e(int i, int i2) {
        m13[] m13VarArr = this.a;
        m13VarArr.getClass();
        m13 m13Var = m13VarArr[i2];
        m13Var.getClass();
        m13 m13Var2 = m13VarArr[i];
        m13Var2.getClass();
        m13VarArr[i] = m13Var;
        m13VarArr[i2] = m13Var2;
        m13Var.z = i;
        m13Var2.z = i2;
    }
}
