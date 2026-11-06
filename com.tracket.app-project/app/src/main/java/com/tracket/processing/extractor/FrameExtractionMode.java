package com.tracket.processing.extractor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class FrameExtractionMode {
    public static final /* synthetic */ FrameExtractionMode[] y = {new FrameExtractionMode("DEFAULT", 0), new FrameExtractionMode("MEMORY_EFFICIENT", 1)};

    /* JADX INFO: Fake field, exist only in values array */
    FrameExtractionMode EF5;

    public static FrameExtractionMode valueOf(String str) {
        return (FrameExtractionMode) Enum.valueOf(FrameExtractionMode.class, str);
    }

    public static FrameExtractionMode[] values() {
        return (FrameExtractionMode[]) y.clone();
    }
}
