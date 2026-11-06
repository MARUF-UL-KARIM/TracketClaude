package com.tracket.editor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
final class ToolTimeline {
    public static final /* synthetic */ ToolTimeline[] y = {new ToolTimeline("NONE", 0), new ToolTimeline("TRACKING", 1), new ToolTimeline("CUTOUT", 2), new ToolTimeline("DEPTH", 3)};

    /* JADX INFO: Fake field, exist only in values array */
    ToolTimeline EF5;

    public static ToolTimeline valueOf(String str) {
        return (ToolTimeline) Enum.valueOf(ToolTimeline.class, str);
    }

    public static ToolTimeline[] values() {
        return (ToolTimeline[]) y.clone();
    }
}
