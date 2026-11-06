package com.google.mediapipe.framework;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class GraphGlSyncToken implements GlSyncToken {
    private long token;

    public GraphGlSyncToken(long j) {
        this.token = j;
    }

    private static native void nativeRelease(long j);

    private static native void nativeWaitOnCpu(long j);

    private static native void nativeWaitOnGpu(long j);

    @Override // com.google.mediapipe.framework.GlSyncToken
    public long nativeToken() {
        return this.token;
    }

    @Override // com.google.mediapipe.framework.GlSyncToken
    public void release() {
        long j = this.token;
        if (j != 0) {
            nativeRelease(j);
            this.token = 0L;
        }
    }

    @Override // com.google.mediapipe.framework.GlSyncToken
    public void waitOnCpu() {
        long j = this.token;
        if (j != 0) {
            nativeWaitOnCpu(j);
        }
    }

    @Override // com.google.mediapipe.framework.GlSyncToken
    public void waitOnGpu() {
        long j = this.token;
        if (j != 0) {
            nativeWaitOnGpu(j);
        }
    }
}
