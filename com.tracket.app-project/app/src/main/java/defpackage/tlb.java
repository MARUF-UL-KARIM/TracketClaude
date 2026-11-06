package defpackage;

import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public class tlb extends AbstractExecutorService implements AutoCloseable, ExecutorService {
    public final /* synthetic */ int y = 0;
    public final Executor z;

    public tlb(ExecutorService executorService) {
        executorService.getClass();
        this.z = executorService;
    }

    public final ju4 a(Runnable runnable) {
        return (ju4) super.submit(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        switch (this.y) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                return ((ExecutorService) this.z).awaitTermination(j, timeUnit);
        }
    }

    public final ju4 c(Callable callable) {
        return (ju4) super.submit(callable);
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        boolean zIsTerminated;
        if (this == ForkJoinPool.commonPool() || (zIsTerminated = isTerminated())) {
            return;
        }
        shutdown();
        boolean z = false;
        while (!zIsTerminated) {
            try {
                zIsTerminated = awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z) {
                    shutdownNow();
                    z = true;
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        int i = this.y;
        Executor executor = this.z;
        switch (i) {
            case 0:
                executor.execute(runnable);
                break;
            default:
                ((ExecutorService) executor).execute(runnable);
                break;
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        switch (this.y) {
            case 0:
                return false;
            default:
                return ((ExecutorService) this.z).isShutdown();
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        switch (this.y) {
            case 0:
                return false;
            default:
                return ((ExecutorService) this.z).isTerminated();
        }
    }

    @Override // java.util.concurrent.AbstractExecutorService
    public final RunnableFuture newTaskFor(Runnable runnable, Object obj) {
        return new ffd(Executors.callable(runnable, obj));
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        switch (this.y) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                ((ExecutorService) this.z).shutdown();
                return;
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        switch (this.y) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                return ((ExecutorService) this.z).shutdownNow();
        }
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final /* synthetic */ Future submit(Runnable runnable) {
        return (ju4) super.submit(runnable);
    }

    public String toString() {
        switch (this.y) {
            case 1:
                ExecutorService executorService = (ExecutorService) this.z;
                String string = super.toString();
                String strValueOf = String.valueOf(executorService);
                return zd2.r(new StringBuilder(iu1.b(String.valueOf(string).length(), 1, strValueOf.length(), 1)), string, "[", strValueOf, "]");
            default:
                return super.toString();
        }
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final /* synthetic */ Future submit(Runnable runnable, Object obj) {
        return (ju4) super.submit(runnable, obj);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final /* synthetic */ Future submit(Callable callable) {
        return (ju4) super.submit(callable);
    }

    @Override // java.util.concurrent.AbstractExecutorService
    public final RunnableFuture newTaskFor(Callable callable) {
        return new ffd(callable);
    }

    public tlb(Executor executor) {
        this.z = executor;
    }
}
