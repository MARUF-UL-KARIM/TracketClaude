package com.google.firebase.concurrent;

import defpackage.txd;
import defpackage.yb7;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class c implements Executor {
    public static final Logger D = Logger.getLogger(c.class.getName());
    public final Executor y;
    public final ArrayDeque z = new ArrayDeque();
    public SequentialExecutor$WorkerRunningState A = SequentialExecutor$WorkerRunningState.y;
    public long B = 0;
    public final b C = new b(this);

    public c(Executor executor) {
        txd.j(executor);
        this.y = executor;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0061  */
    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        SequentialExecutor$WorkerRunningState sequentialExecutor$WorkerRunningState;
        txd.j(runnable);
        synchronized (this.z) {
            SequentialExecutor$WorkerRunningState sequentialExecutor$WorkerRunningState2 = this.A;
            if (sequentialExecutor$WorkerRunningState2 != SequentialExecutor$WorkerRunningState.B && sequentialExecutor$WorkerRunningState2 != (sequentialExecutor$WorkerRunningState = SequentialExecutor$WorkerRunningState.A)) {
                long j = this.B;
                boolean z = true;
                yb7 yb7Var = new yb7(1, runnable);
                this.z.add(yb7Var);
                SequentialExecutor$WorkerRunningState sequentialExecutor$WorkerRunningState3 = SequentialExecutor$WorkerRunningState.z;
                this.A = sequentialExecutor$WorkerRunningState3;
                try {
                    this.y.execute(this.C);
                    if (this.A != sequentialExecutor$WorkerRunningState3) {
                        return;
                    }
                    synchronized (this.z) {
                        try {
                            if (this.B == j && this.A == sequentialExecutor$WorkerRunningState3) {
                                this.A = sequentialExecutor$WorkerRunningState;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return;
                } catch (Error | RuntimeException e) {
                    synchronized (this.z) {
                        try {
                            SequentialExecutor$WorkerRunningState sequentialExecutor$WorkerRunningState4 = this.A;
                            if (sequentialExecutor$WorkerRunningState4 != SequentialExecutor$WorkerRunningState.y && sequentialExecutor$WorkerRunningState4 != SequentialExecutor$WorkerRunningState.z) {
                                z = false;
                            } else if (!this.z.removeLastOccurrence(yb7Var)) {
                                z = false;
                            }
                            if (!(e instanceof RejectedExecutionException) || z) {
                                throw e;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    return;
                }
            }
            this.z.add(runnable);
        }
    }

    public final String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + this.y + "}";
    }
}
