package com.google.firebase.concurrent;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class b implements Runnable {
    public Runnable y;
    public final /* synthetic */ c z;

    public b(c cVar) {
        this.z = cVar;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x0036 A[SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003d, code lost:
    
        if (r1 == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0046, code lost:
    
        r1 = r1 | java.lang.Thread.interrupted();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0048, code lost:
    
        r9.y.run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0052, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0054, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0055, code lost:
    
        com.google.firebase.concurrent.c.D.log(java.util.logging.Level.SEVERE, "Exception while executing runnable " + r9.y, (java.lang.Throwable) r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0070, code lost:
    
        r9.y = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0072, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            r9 = this;
            r0 = 0
            r1 = r0
        L2:
            com.google.firebase.concurrent.c r2 = r9.z     // Catch: java.lang.Throwable -> L50
            java.util.ArrayDeque r2 = r2.z     // Catch: java.lang.Throwable -> L50
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L50
            if (r0 != 0) goto L28
            com.google.firebase.concurrent.c r0 = r9.z     // Catch: java.lang.Throwable -> L1c
            com.google.firebase.concurrent.SequentialExecutor$WorkerRunningState r3 = r0.A     // Catch: java.lang.Throwable -> L1c
            com.google.firebase.concurrent.SequentialExecutor$WorkerRunningState r4 = com.google.firebase.concurrent.SequentialExecutor$WorkerRunningState.B     // Catch: java.lang.Throwable -> L1c
            if (r3 != r4) goto L1e
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1c
            if (r1 == 0) goto L40
        L14:
            java.lang.Thread r9 = java.lang.Thread.currentThread()
            r9.interrupt()
            goto L40
        L1c:
            r9 = move-exception
            goto L73
        L1e:
            long r5 = r0.B     // Catch: java.lang.Throwable -> L1c
            r7 = 1
            long r5 = r5 + r7
            r0.B = r5     // Catch: java.lang.Throwable -> L1c
            r0.A = r4     // Catch: java.lang.Throwable -> L1c
            r0 = 1
        L28:
            com.google.firebase.concurrent.c r3 = r9.z     // Catch: java.lang.Throwable -> L1c
            java.util.ArrayDeque r3 = r3.z     // Catch: java.lang.Throwable -> L1c
            java.lang.Object r3 = r3.poll()     // Catch: java.lang.Throwable -> L1c
            java.lang.Runnable r3 = (java.lang.Runnable) r3     // Catch: java.lang.Throwable -> L1c
            r9.y = r3     // Catch: java.lang.Throwable -> L1c
            if (r3 != 0) goto L41
            com.google.firebase.concurrent.c r9 = r9.z     // Catch: java.lang.Throwable -> L1c
            com.google.firebase.concurrent.SequentialExecutor$WorkerRunningState r0 = com.google.firebase.concurrent.SequentialExecutor$WorkerRunningState.y     // Catch: java.lang.Throwable -> L1c
            r9.A = r0     // Catch: java.lang.Throwable -> L1c
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1c
            if (r1 == 0) goto L40
            goto L14
        L40:
            return
        L41:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1c
            boolean r2 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L50
            r1 = r1 | r2
            r2 = 0
            java.lang.Runnable r3 = r9.y     // Catch: java.lang.Throwable -> L52 java.lang.RuntimeException -> L54
            r3.run()     // Catch: java.lang.Throwable -> L52 java.lang.RuntimeException -> L54
        L4d:
            r9.y = r2     // Catch: java.lang.Throwable -> L50
            goto L2
        L50:
            r9 = move-exception
            goto L75
        L52:
            r0 = move-exception
            goto L70
        L54:
            r3 = move-exception
            java.util.logging.Logger r4 = com.google.firebase.concurrent.c.D     // Catch: java.lang.Throwable -> L52
            java.util.logging.Level r5 = java.util.logging.Level.SEVERE     // Catch: java.lang.Throwable -> L52
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L52
            r6.<init>()     // Catch: java.lang.Throwable -> L52
            java.lang.String r7 = "Exception while executing runnable "
            r6.append(r7)     // Catch: java.lang.Throwable -> L52
            java.lang.Runnable r7 = r9.y     // Catch: java.lang.Throwable -> L52
            r6.append(r7)     // Catch: java.lang.Throwable -> L52
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L52
            r4.log(r5, r6, r3)     // Catch: java.lang.Throwable -> L52
            goto L4d
        L70:
            r9.y = r2     // Catch: java.lang.Throwable -> L50
            throw r0     // Catch: java.lang.Throwable -> L50
        L73:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1c
            throw r9     // Catch: java.lang.Throwable -> L50
        L75:
            if (r1 == 0) goto L7e
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L7e:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.concurrent.b.a():void");
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            a();
        } catch (Error e) {
            synchronized (this.z.z) {
                this.z.A = SequentialExecutor$WorkerRunningState.y;
                throw e;
            }
        }
    }

    public final String toString() {
        Runnable runnable = this.y;
        if (runnable != null) {
            return "SequentialExecutorWorker{running=" + runnable + "}";
        }
        return "SequentialExecutorWorker{state=" + this.z.A + "}";
    }
}
