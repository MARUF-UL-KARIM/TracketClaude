package defpackage;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public abstract class ia2 implements vl5 {
    public static final /* synthetic */ long C = yu.a.objectFieldOffset(ia2.class.getDeclaredField("top"));
    public final AtomicReferenceArray A;
    public final int[] B;
    private volatile /* synthetic */ long top;
    public final int y;
    public final int z;

    public ia2(int i) {
        if (i <= 0) {
            cp2.l(ot5.n(i, "capacity should be positive but it is "));
            throw null;
        }
        if (i > 536870911) {
            cp2.l(ot5.n(i, "capacity should be less or equal to 536870911 but it is "));
            throw null;
        }
        this.top = 0L;
        int iHighestOneBit = Integer.highestOneBit((i * 4) - 1) * 2;
        this.y = iHighestOneBit;
        this.z = Integer.numberOfLeadingZeros(iHighestOneBit) + 1;
        int i2 = iHighestOneBit + 1;
        this.A = new AtomicReferenceArray(i2);
        this.B = new int[i2];
    }

    @Override // defpackage.vl5
    public final void a0(Object obj) {
        ia2 ia2Var;
        obj.getClass();
        int iIdentityHashCode = ((System.identityHashCode(obj) * (-1640531527)) >>> this.z) + 1;
        int i = 0;
        while (i < 8) {
            AtomicReferenceArray atomicReferenceArray = this.A;
            while (true) {
                if (!atomicReferenceArray.compareAndSet(iIdentityHashCode, null, obj)) {
                    ia2Var = this;
                    if (atomicReferenceArray.get(iIdentityHashCode) != null) {
                        break;
                    } else {
                        this = ia2Var;
                    }
                } else {
                    if (iIdentityHashCode <= 0) {
                        cp2.m("index should be positive");
                        return;
                    }
                    while (true) {
                        long j = this.top;
                        long j2 = ((((j >> 32) & 4294967295L) + 1) << 32) | ((long) iIdentityHashCode);
                        this.B[iIdentityHashCode] = (int) (4294967295L & j);
                        ia2 ia2Var2 = this;
                        if (yu.a.compareAndSwapLong(ia2Var2, C, j, j2)) {
                            return;
                        } else {
                            this = ia2Var2;
                        }
                    }
                }
            }
            iIdentityHashCode--;
            if (iIdentityHashCode == 0) {
                iIdentityHashCode = ia2Var.y;
            }
            i++;
            this = ia2Var;
        }
    }

    public abstract Object c();

    public final Object d() {
        int i;
        ia2 ia2Var;
        while (true) {
            long j = this.top;
            if (j != 0) {
                long j2 = ((j >> 32) & 4294967295L) + 1;
                i = (int) (4294967295L & j);
                if (i != 0) {
                    ia2Var = this;
                    if (yu.a.compareAndSwapLong(ia2Var, C, j, (j2 << 32) | ((long) this.B[i]))) {
                        break;
                    }
                    this = ia2Var;
                }
            }
            i = 0;
            ia2Var = this;
            break;
        }
        if (i == 0) {
            return null;
        }
        return ia2Var.A.getAndSet(i, null);
    }

    @Override // defpackage.vl5
    public final void dispose() {
        while (d() != null) {
        }
    }

    @Override // defpackage.vl5
    public final Object v() {
        Object objD = d();
        return objD != null ? a(objD) : c();
    }

    public Object a(Object obj) {
        return obj;
    }
}
