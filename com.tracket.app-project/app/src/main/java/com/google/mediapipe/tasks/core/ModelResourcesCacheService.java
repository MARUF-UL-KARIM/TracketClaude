package com.google.mediapipe.tasks.core;

import com.google.mediapipe.framework.GraphService;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
class ModelResourcesCacheService implements GraphService<ModelResourcesCache> {
    @Override // com.google.mediapipe.framework.GraphService
    public void installServiceObject(long j, ModelResourcesCache modelResourcesCache) {
        nativeInstallServiceObject(j, modelResourcesCache.getNativeHandle());
    }

    public native void nativeInstallServiceObject(long j, long j2);
}
