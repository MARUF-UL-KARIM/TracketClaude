package com.google.mediapipe.framework;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public class ResourcesService implements GraphService<ResourcesWithMapping> {
    @Override // com.google.mediapipe.framework.GraphService
    public void installServiceObject(long j, ResourcesWithMapping resourcesWithMapping) {
        nativeInstallServiceObject(j, resourcesWithMapping.getResourcesMapping());
    }

    public native void nativeInstallServiceObject(long j, Map<String, String> map);
}
