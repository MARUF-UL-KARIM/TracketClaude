package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class m3a {
    public static final /* synthetic */ AtomicIntegerFieldUpdater b;
    public static final /* synthetic */ AtomicIntegerFieldUpdater c;
    public static final /* synthetic */ long d;
    public static final /* synthetic */ long e;
    public static final /* synthetic */ long f;
    public static final /* synthetic */ long g;
    public final AtomicReferenceArray a = new AtomicReferenceArray(128);
    private volatile /* synthetic */ int blockingTasksInBuffer$volatile;
    private volatile /* synthetic */ int consumerIndex$volatile;
    private volatile /* synthetic */ Object lastScheduledTask$volatile;
    private volatile /* synthetic */ int producerIndex$volatile;

    static {
        Unsafe unsafe = yu.a;
        f = unsafe.objectFieldOffset(m3a.class.getDeclaredField("lastScheduledTask$volatile"));
        b = AtomicIntegerFieldUpdater.newUpdater(m3a.class, "producerIndex$volatile");
        g = unsafe.objectFieldOffset(m3a.class.getDeclaredField("producerIndex$volatile"));
        e = unsafe.objectFieldOffset(m3a.class.getDeclaredField("consumerIndex$volatile"));
        c = AtomicIntegerFieldUpdater.newUpdater(m3a.class, "blockingTasksInBuffer$volatile");
        d = unsafe.objectFieldOffset(m3a.class.getDeclaredField("blockingTasksInBuffer$volatile"));
    }

    public final zq8 a(zq8 zq8Var) {
        if (b() == 127) {
            return zq8Var;
        }
        if (zq8Var.z) {
            c.incrementAndGet(this);
        }
        int intVolatile = yu.a.getIntVolatile(this, g) & 127;
        while (true) {
            AtomicReferenceArray atomicReferenceArray = this.a;
            if (atomicReferenceArray.get(intVolatile) == null) {
                atomicReferenceArray.lazySet(intVolatile, zq8Var);
                b.incrementAndGet(this);
                return null;
            }
            Thread.yield();
        }
    }

    public final int b() {
        return yu.a.getIntVolatile(this, g) - yu.a.getIntVolatile(this, e);
    }

    public final zq8 c() {
        zq8 zq8Var;
        while (true) {
            Unsafe unsafe = yu.a;
            long j = e;
            int intVolatile = unsafe.getIntVolatile(this, j);
            if (intVolatile - unsafe.getIntVolatile(this, g) == 0) {
                return null;
            }
            int i = intVolatile & 127;
            m3a m3aVar = this;
            if (unsafe.compareAndSwapInt(m3aVar, j, intVolatile, intVolatile + 1) && (zq8Var = (zq8) m3aVar.a.getAndSet(i, null)) != null) {
                if (zq8Var.z) {
                    c.decrementAndGet(m3aVar);
                }
                return zq8Var;
            }
            this = m3aVar;
        }
    }

    public final zq8 d(int i, boolean z) {
        int i2 = i & 127;
        AtomicReferenceArray atomicReferenceArray = this.a;
        zq8 zq8Var = (zq8) atomicReferenceArray.get(i2);
        if (zq8Var != null && zq8Var.z == z) {
            while (!atomicReferenceArray.compareAndSet(i2, zq8Var, null)) {
                if (atomicReferenceArray.get(i2) != zq8Var) {
                }
            }
            if (z) {
                c.decrementAndGet(this);
            }
            return zq8Var;
        }
        return null;
    }
}
