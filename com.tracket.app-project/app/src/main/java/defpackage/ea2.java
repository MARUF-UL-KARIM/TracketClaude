package defpackage;

import com.google.common.flogger.backend.system.StackBasedCallerFinder;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public class ea2 {
    public static final String[] e = {"com.google.common.flogger.backend.system.DefaultPlatform"};
    public final ey7 a;
    public final zj5 b;
    public final np8 c;
    public final o26 d;

    public ea2() {
        ey7 ey7Var = (ey7) rd8.c(ey7.class, "flogger.backend_factory");
        this.a = ey7Var == null ? ey7.a : ey7Var;
        zj5 zj5Var = (zj5) rd8.c(zj5.class, "flogger.logging_context");
        this.b = zj5Var == null ? zj5.a : zj5Var;
        np8 np8Var = (np8) rd8.c(np8.class, "flogger.clock");
        this.c = np8Var == null ? np8.a : np8Var;
        this.d = StackBasedCallerFinder.getInstance();
    }
}
