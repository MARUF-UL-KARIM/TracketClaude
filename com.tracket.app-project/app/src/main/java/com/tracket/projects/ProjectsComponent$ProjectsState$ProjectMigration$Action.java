package com.tracket.projects;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class ProjectsComponent$ProjectsState$ProjectMigration$Action {
    public static final /* synthetic */ ProjectsComponent$ProjectsState$ProjectMigration$Action[] A;
    public static final ProjectsComponent$ProjectsState$ProjectMigration$Action y;
    public static final ProjectsComponent$ProjectsState$ProjectMigration$Action z;

    static {
        ProjectsComponent$ProjectsState$ProjectMigration$Action projectsComponent$ProjectsState$ProjectMigration$Action = new ProjectsComponent$ProjectsState$ProjectMigration$Action("OPEN", 0);
        y = projectsComponent$ProjectsState$ProjectMigration$Action;
        ProjectsComponent$ProjectsState$ProjectMigration$Action projectsComponent$ProjectsState$ProjectMigration$Action2 = new ProjectsComponent$ProjectsState$ProjectMigration$Action("DUPLICATE", 1);
        z = projectsComponent$ProjectsState$ProjectMigration$Action2;
        A = new ProjectsComponent$ProjectsState$ProjectMigration$Action[]{projectsComponent$ProjectsState$ProjectMigration$Action, projectsComponent$ProjectsState$ProjectMigration$Action2};
    }

    public static ProjectsComponent$ProjectsState$ProjectMigration$Action valueOf(String str) {
        return (ProjectsComponent$ProjectsState$ProjectMigration$Action) Enum.valueOf(ProjectsComponent$ProjectsState$ProjectMigration$Action.class, str);
    }

    public static ProjectsComponent$ProjectsState$ProjectMigration$Action[] values() {
        return (ProjectsComponent$ProjectsState$ProjectMigration$Action[]) A.clone();
    }
}
