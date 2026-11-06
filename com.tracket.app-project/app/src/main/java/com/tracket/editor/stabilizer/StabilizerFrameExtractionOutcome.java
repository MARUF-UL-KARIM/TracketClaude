package com.tracket.editor.stabilizer;

/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public enum StabilizerFrameExtractionOutcome {
    SOURCE_EXHAUSTED("source_exhausted"),
    WINDOW_END_REACHED("window_end_reached"),
    STOP_REQUESTED("stop_requested"),
    INTERRUPTED("interrupted"),
    EXTRACTOR_EXCEPTION("extractor_exception");

    public final String y;

    StabilizerFrameExtractionOutcome(String str) {
        this.y = str;
    }
}
