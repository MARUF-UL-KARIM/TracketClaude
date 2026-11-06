package com.tracket.editor.export;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public enum ExportFailureStage {
    PREPARATION("preparation"),
    STORAGE_PREFLIGHT("storage_preflight"),
    REWARD_SYNC("reward_sync"),
    STABILIZATION("stabilization"),
    STORAGE_AFTER_PREPARE("storage_after_prepare"),
    PREVIEW_RETIREMENT("preview_retirement"),
    TEMP_OUTPUT_SETUP("temp_output_setup"),
    EXPORTER_CREATION("exporter_creation"),
    EXPORTER_SETUP("exporter_setup"),
    TRANSCODING("transcoding"),
    OUTPUT_PERSISTENCE("output_persistence"),
    FINALIZATION("finalization"),
    /* JADX INFO: Fake field, exist only in values array */
    CLEANUP("cleanup");

    public final String y;

    ExportFailureStage(String str) {
        this.y = str;
    }
}
