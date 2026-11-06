package androidx.datastore.core;

import defpackage.ig5;
import defpackage.xp3;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class MutexUtilsKt {
    public static final <R> R withTryLock(ig5 ig5Var, Object obj, xp3 xp3Var) {
        ig5Var.getClass();
        xp3Var.getClass();
        boolean zC = ig5Var.c(obj);
        try {
            return (R) xp3Var.invoke(Boolean.valueOf(zC));
        } finally {
            if (zC) {
                ig5Var.o(obj);
            }
        }
    }

    public static Object withTryLock$default(ig5 ig5Var, Object obj, xp3 xp3Var, int i, Object obj2) {
        if ((i & 1) != 0) {
            obj = null;
        }
        ig5Var.getClass();
        xp3Var.getClass();
        boolean zC = ig5Var.c(obj);
        try {
            return xp3Var.invoke(Boolean.valueOf(zC));
        } finally {
            if (zC) {
                ig5Var.o(obj);
            }
        }
    }
}
