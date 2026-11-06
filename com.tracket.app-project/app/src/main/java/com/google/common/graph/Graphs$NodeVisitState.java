package com.google.common.graph;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
final class Graphs$NodeVisitState {
    public static final /* synthetic */ Graphs$NodeVisitState[] y = {new Graphs$NodeVisitState("PENDING", 0), new Graphs$NodeVisitState("COMPLETE", 1)};

    /* JADX INFO: Fake field, exist only in values array */
    Graphs$NodeVisitState EF5;

    public static Graphs$NodeVisitState valueOf(String str) {
        return (Graphs$NodeVisitState) Enum.valueOf(Graphs$NodeVisitState.class, str);
    }

    public static Graphs$NodeVisitState[] values() {
        return (Graphs$NodeVisitState[]) y.clone();
    }
}
