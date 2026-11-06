package defpackage;

import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class yp4 {
    public final /* synthetic */ int a;
    public final String b;
    public volatile Logger c;
    public final Object d;

    public yp4(Class cls, int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.d = new a41();
                this.b = cls.getName();
                break;
            case 2:
                this.d = new a41();
                this.b = cls.getName();
                break;
            default:
                this.d = new Object();
                this.b = cls.getName();
                break;
        }
    }

    public Logger a() {
        Logger logger = this.c;
        if (logger != null) {
            return logger;
        }
        synchronized (this.d) {
            try {
                Logger logger2 = this.c;
                if (logger2 != null) {
                    return logger2;
                }
                Logger logger3 = Logger.getLogger(this.b);
                this.c = logger3;
                return logger3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Logger b() {
        Logger logger;
        Logger logger2;
        switch (this.a) {
            case 1:
                Logger logger3 = this.c;
                if (logger3 != null) {
                    return logger3;
                }
                synchronized (((a41) this.d)) {
                    try {
                        logger = this.c;
                        if (logger == null) {
                            logger = Logger.getLogger(this.b);
                            this.c = logger;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return logger;
            default:
                Logger logger4 = this.c;
                if (logger4 != null) {
                    return logger4;
                }
                synchronized (((a41) this.d)) {
                    try {
                        logger2 = this.c;
                        if (logger2 == null) {
                            logger2 = Logger.getLogger(this.b);
                            this.c = logger2;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return logger2;
        }
    }
}
