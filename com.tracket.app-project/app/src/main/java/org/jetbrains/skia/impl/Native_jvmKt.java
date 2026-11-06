package org.jetbrains.skia.impl;

import defpackage.xp3;
import java.lang.ref.Reference;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes4.dex */
public final class Native_jvmKt {
    public static final <T> T interopScope(xp3 xp3Var) {
        xp3Var.getClass();
        return (T) xp3Var.invoke(theScope.INSTANCE);
    }

    public static final void reachabilityBarrier(Object obj) {
        Reference.reachabilityFence(obj);
    }
}
