package defpackage;

import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public class cw4 {
    public static final /* synthetic */ long a = yu.a.objectFieldOffset(cw4.class.getDeclaredField("_cur$volatile"));
    private volatile /* synthetic */ Object _cur$volatile = new ew4(8, false);

    public final boolean a(Runnable runnable) {
        cw4 cw4Var;
        while (true) {
            Unsafe unsafe = yu.a;
            long j = a;
            ew4 ew4Var = (ew4) unsafe.getObjectVolatile(this, j);
            int iA = ew4Var.a(runnable);
            if (iA == 0) {
                return true;
            }
            if (iA == 1) {
                ew4 ew4VarC = ew4Var.c();
                while (true) {
                    Unsafe unsafe2 = yu.a;
                    cw4Var = this;
                    if (unsafe2.compareAndSwapObject(cw4Var, a, ew4Var, ew4VarC) || unsafe2.getObjectVolatile(cw4Var, j) != ew4Var) {
                        break;
                    }
                    this = cw4Var;
                }
            } else {
                if (iA == 2) {
                    return false;
                }
                cw4Var = this;
            }
            this = cw4Var;
        }
    }

    public final void b() {
        cw4 cw4Var;
        while (true) {
            Unsafe unsafe = yu.a;
            long j = a;
            ew4 ew4Var = (ew4) unsafe.getObjectVolatile(this, j);
            if (ew4Var.b()) {
                return;
            }
            ew4 ew4VarC = ew4Var.c();
            while (true) {
                cw4Var = this;
                if (yu.a.compareAndSwapObject(cw4Var, a, ew4Var, ew4VarC) || yu.a.getObjectVolatile(cw4Var, j) != ew4Var) {
                    break;
                } else {
                    this = cw4Var;
                }
            }
            this = cw4Var;
        }
    }

    public final int c() {
        ew4 ew4Var = (ew4) yu.a.getObjectVolatile(this, a);
        ew4Var.getClass();
        long longVolatile = yu.a.getLongVolatile(ew4Var, ew4.g);
        return 1073741823 & (((int) ((longVolatile & 1152921503533105152L) >> 30)) - ((int) (1073741823 & longVolatile)));
    }

    public final Object d() {
        cw4 cw4Var;
        while (true) {
            Unsafe unsafe = yu.a;
            long j = a;
            ew4 ew4Var = (ew4) unsafe.getObjectVolatile(this, j);
            Object objD = ew4Var.d();
            if (objD != ew4.e) {
                return objD;
            }
            ew4 ew4VarC = ew4Var.c();
            while (true) {
                cw4Var = this;
                if (yu.a.compareAndSwapObject(cw4Var, a, ew4Var, ew4VarC) || yu.a.getObjectVolatile(cw4Var, j) != ew4Var) {
                    break;
                }
                this = cw4Var;
            }
            this = cw4Var;
        }
    }
}
