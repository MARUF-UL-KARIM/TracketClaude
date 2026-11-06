package com.google.mediapipe.tasks.core;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
class ModelResourcesCache {
    private final long nativeHandle = nativeCreateModelResourcesCache();
    private final AtomicBoolean isHandleValid = new AtomicBoolean(true);

    private native long nativeCreateModelResourcesCache();

    private native void nativeReleaseModelResourcesCache(long j);

    public long getNativeHandle() {
        if (this.isHandleValid.get()) {
            return this.nativeHandle;
        }
        return 0L;
    }

    public boolean isHandleValid() {
        return this.isHandleValid.get();
    }

    public void release() {
        if (this.isHandleValid.compareAndSet(true, false)) {
            nativeReleaseModelResourcesCache(this.nativeHandle);
        }
    }
}
