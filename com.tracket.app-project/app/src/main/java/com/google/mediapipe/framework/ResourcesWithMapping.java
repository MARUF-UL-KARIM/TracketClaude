package com.google.mediapipe.framework;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class ResourcesWithMapping {
    private final Map<String, String> resourcesMapping;

    public ResourcesWithMapping(Map<String, String> map) {
        this.resourcesMapping = map;
    }

    public Map<String, String> getResourcesMapping() {
        return this.resourcesMapping;
    }

    public ResourcesWithMapping() {
        this(null);
    }
}
