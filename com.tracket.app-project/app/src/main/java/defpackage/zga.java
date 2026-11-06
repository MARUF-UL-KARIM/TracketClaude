package defpackage;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import libcore.io.Memory;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public abstract class zga {
    public static final Unsafe a;
    public static final Class b;
    public static final xga c;
    public static final boolean d;
    public static final long e;
    public static final boolean f;

    static {
        boolean z;
        xga xgaVar;
        Unsafe unsafeK = k();
        a = unsafeK;
        int i = fca.a;
        b = Memory.class;
        Class cls = Long.TYPE;
        boolean zL = l(cls);
        Class cls2 = Integer.TYPE;
        boolean zL2 = l(cls2);
        char c2 = 1;
        uga ugaVar = null;
        int i2 = 0;
        if (unsafeK != null) {
            if (zL) {
                ugaVar = new uga(unsafeK, c2 == true ? 1 : 0);
            } else if (zL2) {
                ugaVar = new uga(unsafeK, i2);
            }
        }
        c = ugaVar;
        if (ugaVar != null) {
            try {
                Class<?> cls3 = ugaVar.a.getClass();
                cls3.getMethod("objectFieldOffset", Field.class);
                cls3.getMethod("getLong", Object.class, cls);
                a();
            } catch (Throwable th) {
                Logger.getLogger(zga.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
            }
        }
        xga xgaVar2 = c;
        if (xgaVar2 == null) {
            z = false;
        } else {
            try {
                Class<?> cls4 = xgaVar2.a.getClass();
                cls4.getMethod("objectFieldOffset", Field.class);
                cls4.getMethod("arrayBaseOffset", Class.class);
                cls4.getMethod("arrayIndexScale", Class.class);
                cls4.getMethod("getInt", Object.class, cls);
                cls4.getMethod("putInt", Object.class, cls, cls2);
                cls4.getMethod("getLong", Object.class, cls);
                cls4.getMethod("putLong", Object.class, cls, cls);
                cls4.getMethod("getObject", Object.class, cls);
                cls4.getMethod("putObject", Object.class, cls, Object.class);
                z = true;
            } catch (Throwable th2) {
                Logger.getLogger(zga.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th2.toString()));
                z = false;
            }
        }
        d = z;
        e = o(byte[].class);
        o(boolean[].class);
        p(boolean[].class);
        o(int[].class);
        p(int[].class);
        o(long[].class);
        p(long[].class);
        o(float[].class);
        p(float[].class);
        o(double[].class);
        p(double[].class);
        o(Object[].class);
        p(Object[].class);
        Field fieldA = a();
        if (fieldA != null && (xgaVar = c) != null) {
            xgaVar.a.objectFieldOffset(fieldA);
        }
        f = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public static Field a() {
        Field declaredField;
        Field declaredField2;
        int i = fca.a;
        try {
            declaredField = Buffer.class.getDeclaredField("effectiveDirectAddress");
        } catch (Throwable unused) {
            declaredField = null;
        }
        if (declaredField != null) {
            return declaredField;
        }
        try {
            declaredField2 = Buffer.class.getDeclaredField("address");
        } catch (Throwable unused2) {
            declaredField2 = null;
        }
        if (declaredField2 == null || declaredField2.getType() != Long.TYPE) {
            return null;
        }
        return declaredField2;
    }

    public static void b(Object obj, long j, byte b2) {
        Unsafe unsafe = c.a;
        long j2 = (-4) & j;
        int i = unsafe.getInt(obj, j2);
        int i2 = ((~((int) j)) & 3) << 3;
        unsafe.putInt(obj, j2, ((255 & b2) << i2) | (i & (~(255 << i2))));
    }

    public static void c(Object obj, long j, byte b2) {
        Unsafe unsafe = c.a;
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        unsafe.putInt(obj, j2, ((255 & b2) << i) | (unsafe.getInt(obj, j2) & (~(255 << i))));
    }

    public static int d(long j, Object obj) {
        return c.a.getInt(obj, j);
    }

    public static void e(long j, int i, Object obj) {
        c.a.putInt(obj, j, i);
    }

    public static long f(long j, Object obj) {
        return c.a.getLong(obj, j);
    }

    public static void g(Object obj, long j, long j2) {
        c.a.putLong(obj, j, j2);
    }

    public static Object h(long j, Object obj) {
        return c.a.getObject(obj, j);
    }

    public static void i(long j, Object obj, Object obj2) {
        c.a.putObject(obj, j, obj2);
    }

    public static void j(byte[] bArr, long j, byte b2) {
        c.b(bArr, e + j, b2);
    }

    public static Unsafe k() {
        Unsafe unsafe;
        try {
            unsafe = (Unsafe) AccessController.doPrivileged(new w0(2));
        } catch (Throwable unused) {
            unsafe = null;
        }
        if (unsafe == null) {
            return null;
        }
        try {
            unsafe.arrayBaseOffset(byte[].class);
            return unsafe;
        } catch (Exception unused2) {
            Logger.getLogger(zga.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "getUnsafe", "As part of the planned removal, sun.misc.Unsafe is available in the current environment but configured to throw on use. Protobuf will continue without using it, but with slightly reduced performance. --sun-misc-unsafe-memory-access=allow is likely available to opt back in if desired. A later Protobuf version release will stop using sun.misc.Unsafe entirely.");
            return null;
        }
    }

    public static boolean l(Class cls) {
        int i = fca.a;
        try {
            Class cls2 = b;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static /* synthetic */ boolean m(long j, Object obj) {
        return ((byte) ((c.a.getInt(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3))) & 255)) != 0;
    }

    public static /* synthetic */ boolean n(long j, Object obj) {
        return ((byte) ((c.a.getInt(obj, (-4) & j) >>> ((int) ((j & 3) << 3))) & 255)) != 0;
    }

    public static int o(Class cls) {
        if (d) {
            return c.a.arrayBaseOffset(cls);
        }
        return -1;
    }

    public static void p(Class cls) {
        if (d) {
            c.a.arrayIndexScale(cls);
        }
    }
}
