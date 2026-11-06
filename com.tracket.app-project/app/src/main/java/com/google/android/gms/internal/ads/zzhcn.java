package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class zzhcn implements Executor {
    public static final zzhcn y;
    public static final /* synthetic */ zzhcn[] z;

    static {
        zzhcn zzhcnVar = new zzhcn("INSTANCE", 0);
        y = zzhcnVar;
        z = new zzhcn[]{zzhcnVar};
    }

    public static zzhcn[] values() {
        return (zzhcn[]) z.clone();
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
