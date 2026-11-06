package com.google.common.graph;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
final class GraphConstants$Presence {
    public static final /* synthetic */ GraphConstants$Presence[] y = {new GraphConstants$Presence("EDGE_EXISTS", 0)};

    /* JADX INFO: Fake field, exist only in values array */
    GraphConstants$Presence EF5;

    public static GraphConstants$Presence valueOf(String str) {
        return (GraphConstants$Presence) Enum.valueOf(GraphConstants$Presence.class, str);
    }

    public static GraphConstants$Presence[] values() {
        return (GraphConstants$Presence[]) y.clone();
    }
}
