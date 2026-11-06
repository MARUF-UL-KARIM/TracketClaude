package com.google.firebase.concurrent;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
final class FirebaseExecutors$DirectExecutor implements Executor {
    public static final FirebaseExecutors$DirectExecutor y;
    public static final /* synthetic */ FirebaseExecutors$DirectExecutor[] z;

    static {
        FirebaseExecutors$DirectExecutor firebaseExecutors$DirectExecutor = new FirebaseExecutors$DirectExecutor("INSTANCE", 0);
        y = firebaseExecutors$DirectExecutor;
        z = new FirebaseExecutors$DirectExecutor[]{firebaseExecutors$DirectExecutor};
    }

    public static FirebaseExecutors$DirectExecutor valueOf(String str) {
        return (FirebaseExecutors$DirectExecutor) Enum.valueOf(FirebaseExecutors$DirectExecutor.class, str);
    }

    public static FirebaseExecutors$DirectExecutor[] values() {
        return (FirebaseExecutors$DirectExecutor[]) z.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
