package org.slf4j.helpers;

import java.io.PrintStream;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class a {
    public static final Reporter$TargetChoice a;
    public static final Reporter$Level b;

    static {
        String[] strArr = {"System.out", "stdout", "sysout"};
        String property = System.getProperty("slf4j.internal.report.stream");
        Reporter$TargetChoice reporter$TargetChoice = Reporter$TargetChoice.y;
        if (property != null && !property.isEmpty()) {
            for (int i = 0; i < 3; i++) {
                if (strArr[i].equalsIgnoreCase(property)) {
                    reporter$TargetChoice = Reporter$TargetChoice.z;
                    break;
                }
            }
        }
        a = reporter$TargetChoice;
        String property2 = System.getProperty("slf4j.internal.verbosity");
        Reporter$Level reporter$Level = Reporter$Level.INFO;
        if (property2 != null && !property2.isEmpty()) {
            if (property2.equalsIgnoreCase("DEBUG")) {
                reporter$Level = Reporter$Level.DEBUG;
            } else if (property2.equalsIgnoreCase("ERROR")) {
                reporter$Level = Reporter$Level.ERROR;
            } else if (property2.equalsIgnoreCase("WARN")) {
                reporter$Level = Reporter$Level.WARN;
            }
        }
        b = reporter$Level;
    }

    public static void a(String str) {
        if (b.y <= 0) {
            c().println("SLF4J(D): ".concat(str));
        }
    }

    public static final void b(String str, Throwable th) {
        c().println("SLF4J(E): ".concat(str));
        c().println("SLF4J(E): Reported exception:");
        th.printStackTrace(c());
    }

    public static PrintStream c() {
        return a.ordinal() != 1 ? System.err : System.out;
    }

    public static void d(String str) {
        if (1 >= b.y) {
            c().println("SLF4J(I): ".concat(str));
        }
    }

    public static final void e(String str) {
        if (2 >= b.y) {
            c().println("SLF4J(W): ".concat(str));
        }
    }
}
