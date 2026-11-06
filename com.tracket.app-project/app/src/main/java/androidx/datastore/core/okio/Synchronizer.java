package androidx.datastore.core.okio;

import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class Synchronizer {
    public final <T> T withLock(Function0<? extends T> function0) {
        T tInvoke;
        function0.getClass();
        synchronized (this) {
            tInvoke = function0.invoke();
        }
        return tInvoke;
    }
}
