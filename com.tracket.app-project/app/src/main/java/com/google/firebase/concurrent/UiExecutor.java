package com.google.firebase.concurrent;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class UiExecutor implements Executor {
    public static final /* synthetic */ UiExecutor[] A;
    public static final UiExecutor y;
    public static final Handler z;

    static {
        UiExecutor uiExecutor = new UiExecutor("INSTANCE", 0);
        y = uiExecutor;
        A = new UiExecutor[]{uiExecutor};
        z = new Handler(Looper.getMainLooper());
    }

    public static UiExecutor valueOf(String str) {
        return (UiExecutor) Enum.valueOf(UiExecutor.class, str);
    }

    public static UiExecutor[] values() {
        return (UiExecutor[]) A.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        z.post(runnable);
    }
}
