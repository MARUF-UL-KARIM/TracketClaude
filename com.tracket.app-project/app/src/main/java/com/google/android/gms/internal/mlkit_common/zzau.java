package com.google.android.gms.internal.mlkit_common;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
final class zzau implements Executor {
    public static final /* synthetic */ zzau[] y = {new zzau("INSTANCE", 0)};

    /* JADX INFO: Fake field, exist only in values array */
    zzau EF5;

    public static zzau[] values() {
        return (zzau[]) y.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "MoreExecutors.directExecutor()";
    }
}
