package org.jetbrains.skiko.internal;

import defpackage.lq3;
import defpackage.mq3;
import defpackage.xp3;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class CollectionUtilsKt {
    public static final <T> boolean fastAll(List<? extends T> list, xp3 xp3Var) {
        list.getClass();
        xp3Var.getClass();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!((Boolean) xp3Var.invoke(list.get(i))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final <T> boolean fastAny(List<? extends T> list, xp3 xp3Var) {
        list.getClass();
        xp3Var.getClass();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (((Boolean) xp3Var.invoke(list.get(i))).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public static final <T> void fastForEach(List<? extends T> list, xp3 xp3Var) {
        list.getClass();
        xp3Var.getClass();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            xp3Var.invoke(list.get(i));
        }
    }

    public static final <T> void fastForEachIndexed(List<? extends T> list, lq3 lq3Var) {
        list.getClass();
        lq3Var.getClass();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            lq3Var.invoke(Integer.valueOf(i), list.get(i));
        }
    }

    public static final <T> void fastForEachReversed(List<? extends T> list, xp3 xp3Var) {
        list.getClass();
        xp3Var.getClass();
        int size = list.size() - 1;
        if (size < 0) {
            return;
        }
        while (true) {
            int i = size - 1;
            xp3Var.invoke(list.get(size));
            if (i < 0) {
                return;
            } else {
                size = i;
            }
        }
    }

    public static final <T> boolean fastNone(List<? extends T> list, xp3 xp3Var) {
        list.getClass();
        xp3Var.getClass();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (((Boolean) xp3Var.invoke(list.get(i))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final <T, R> R unpackTo(T[] tArr, R r, mq3 mq3Var) {
        tArr.getClass();
        mq3Var.getClass();
        int iIntValue = 0;
        for (T t : tArr) {
            iIntValue = ((Number) mq3Var.invoke(t, r, Integer.valueOf(iIntValue))).intValue();
        }
        return r;
    }
}
