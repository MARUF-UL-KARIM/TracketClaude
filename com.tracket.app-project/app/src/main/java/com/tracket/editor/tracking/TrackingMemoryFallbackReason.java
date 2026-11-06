package com.tracket.editor.tracking;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public enum TrackingMemoryFallbackReason {
    DISABLED("disabled"),
    ALREADY_LOW_RESOLUTION("already_low_resolution"),
    NO_MEMORY_PRESSURE("no_memory_pressure"),
    FOOTPRINT_THRESHOLD("footprint_threshold"),
    LOW_RAM_DEVICE("low_ram_device"),
    SOURCE_RESOLUTION_CAP("source_resolution_cap"),
    ALLOCATION_BUDGET("allocation_budget");

    public final String y;

    TrackingMemoryFallbackReason(String str) {
        this.y = str;
    }
}
