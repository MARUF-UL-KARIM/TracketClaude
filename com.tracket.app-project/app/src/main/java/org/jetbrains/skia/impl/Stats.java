package org.jetbrains.skia.impl;

import defpackage.lq3;
import defpackage.od7;
import defpackage.ud8;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes4.dex */
public final class Stats {
    public static final Stats INSTANCE = new Stats();
    private static Map<String, Integer> allocated;
    private static boolean enabled;
    private static long nativeCalls;

    static {
        String property = System.getProperty("skiko.collect.stat");
        enabled = property != null ? Boolean.parseBoolean(property) : false;
        allocated = new ConcurrentHashMap();
    }

    private Stats() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer onAllocated$lambda$0(int i, int i2) {
        return Integer.valueOf(i + i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer onAllocated$lambda$1(lq3 lq3Var, Object obj, Object obj2) {
        return (Integer) lq3Var.invoke(obj, obj2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer onDeallocated$lambda$0(int i, int i2) {
        return Integer.valueOf(i + i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer onDeallocated$lambda$1(lq3 lq3Var, Object obj, Object obj2) {
        return (Integer) lq3Var.invoke(obj, obj2);
    }

    public final Map<String, Integer> getAllocated() {
        return allocated;
    }

    public final boolean getEnabled() {
        return enabled;
    }

    public final long getNativeCalls() {
        return nativeCalls;
    }

    public final void onAllocated(String str) {
        str.getClass();
        if (enabled) {
            byte b = 0;
            allocated.merge(str, 1, new ud8(b, new od7(27, b)));
        }
    }

    public final void onDeallocated(String str) {
        str.getClass();
        if (enabled) {
            allocated.merge(str, -1, new ud8(1, new od7(28, (byte) 0)));
        }
    }

    public final void onNativeCall() {
        if (enabled) {
            nativeCalls++;
        }
    }

    public final void setAllocated(Map<String, Integer> map) {
        map.getClass();
        allocated = map;
    }

    public final void setEnabled(boolean z) {
        enabled = z;
    }

    public final void setNativeCalls(long j) {
        nativeCalls = j;
    }
}
