package org.tensorflow.lite.gpu;

import defpackage.hu3;
import defpackage.rc2;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public class GpuDelegate implements rc2 {
    public long y;

    public GpuDelegate(hu3 hu3Var) {
        GpuDelegateNative.a();
        this.y = createDelegate(hu3Var.a, true, hu3Var.b, hu3Var.c, hu3Var.d, 0);
    }

    private static native long createDelegate(boolean z, boolean z2, int i, String str, String str2, int i2);

    private static native void deleteDelegate(long j);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        long j = this.y;
        if (j != 0) {
            deleteDelegate(j);
            this.y = 0L;
        }
    }

    @Override // defpackage.rc2
    public final long getNativeHandle() {
        return this.y;
    }

    public GpuDelegate() {
        this(new hu3());
    }
}
