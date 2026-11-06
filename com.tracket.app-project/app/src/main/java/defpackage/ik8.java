package defpackage;

import java.lang.reflect.Method;
import java.util.concurrent.LinkedBlockingQueue;
import org.slf4j.event.Level;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes4.dex */
public final class ik8 implements vw4 {
    public Boolean A;
    public Method B;
    public s13 C;
    public final LinkedBlockingQueue D;
    public final boolean E;
    public final String y;
    public volatile vw4 z;

    public ik8(String str, LinkedBlockingQueue linkedBlockingQueue, boolean z) {
        this.y = str;
        this.D = linkedBlockingQueue;
        this.E = z;
    }

    @Override // defpackage.vw4
    public final boolean a(Level level) {
        return c().a(level);
    }

    @Override // defpackage.vw4
    public final void b(String str, Throwable th) {
        c().b(str, th);
    }

    public final vw4 c() {
        if (this.z != null) {
            return this.z;
        }
        if (this.E) {
            return lg5.y;
        }
        s13 s13Var = this.C;
        if (s13Var != null) {
            return s13Var;
        }
        LinkedBlockingQueue linkedBlockingQueue = this.D;
        s13 s13Var2 = new s13();
        s13Var2.y = this;
        s13Var2.z = linkedBlockingQueue;
        this.C = s13Var2;
        return s13Var2;
    }

    public final boolean d() {
        Boolean bool;
        Boolean bool2 = this.A;
        if (bool2 != null) {
            return bool2.booleanValue();
        }
        try {
            this.B = this.z.getClass().getMethod("log", kk8.class);
            bool = Boolean.TRUE;
            this.A = bool;
        } catch (NoSuchMethodException unused) {
            bool = Boolean.FALSE;
            this.A = bool;
        }
        return bool.booleanValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && ik8.class == obj.getClass() && this.y.equals(((ik8) obj).y);
    }

    public final int hashCode() {
        return this.y.hashCode();
    }

    @Override // defpackage.vw4
    public final boolean isDebugEnabled() {
        return c().isDebugEnabled();
    }

    @Override // defpackage.vw4
    public final boolean isErrorEnabled() {
        return c().isErrorEnabled();
    }

    @Override // defpackage.vw4
    public final boolean isInfoEnabled() {
        return c().isInfoEnabled();
    }

    @Override // defpackage.vw4
    public final boolean isTraceEnabled() {
        return c().isTraceEnabled();
    }

    @Override // defpackage.vw4
    public final boolean isWarnEnabled() {
        return c().isWarnEnabled();
    }

    @Override // defpackage.vw4
    public final void trace(String str) {
        c().trace(str);
    }

    @Override // defpackage.vw4
    public final void warn(String str) {
        c().warn(str);
    }
}
