package org.jetbrains.skiko;

import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes4.dex */
public final class Actuals_jvmKt {
    public static final long currentNanoTime() {
        return System.nanoTime();
    }

    public static final <R> R maybeSynchronized(Object obj, Function0<? extends R> function0) {
        R rInvoke;
        obj.getClass();
        function0.getClass();
        synchronized (obj) {
            rInvoke = function0.invoke();
        }
        return rInvoke;
    }
}
