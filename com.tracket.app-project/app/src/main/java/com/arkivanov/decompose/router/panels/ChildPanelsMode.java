package com.arkivanov.decompose.router.panels;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class ChildPanelsMode {
    public static final /* synthetic */ ChildPanelsMode[] y = {new ChildPanelsMode("SINGLE", 0), new ChildPanelsMode("DUAL", 1), new ChildPanelsMode("TRIPLE", 2)};

    /* JADX INFO: Fake field, exist only in values array */
    ChildPanelsMode EF5;

    public static ChildPanelsMode valueOf(String str) {
        return (ChildPanelsMode) Enum.valueOf(ChildPanelsMode.class, str);
    }

    public static ChildPanelsMode[] values() {
        return (ChildPanelsMode[]) y.clone();
    }
}
