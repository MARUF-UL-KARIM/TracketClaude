package com.tracket.editor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class ProjectLoadState {
    public static final ProjectLoadState A;
    public static final /* synthetic */ ProjectLoadState[] B;
    public static final ProjectLoadState y;
    public static final ProjectLoadState z;

    static {
        ProjectLoadState projectLoadState = new ProjectLoadState("LOADING", 0);
        y = projectLoadState;
        ProjectLoadState projectLoadState2 = new ProjectLoadState("READY", 1);
        z = projectLoadState2;
        ProjectLoadState projectLoadState3 = new ProjectLoadState("FAILED", 2);
        A = projectLoadState3;
        B = new ProjectLoadState[]{projectLoadState, projectLoadState2, projectLoadState3};
    }

    public static ProjectLoadState valueOf(String str) {
        return (ProjectLoadState) Enum.valueOf(ProjectLoadState.class, str);
    }

    public static ProjectLoadState[] values() {
        return (ProjectLoadState[]) B.clone();
    }
}
