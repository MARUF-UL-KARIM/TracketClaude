package com.airbnb.lottie.model.content;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class MergePaths$MergePathsMode {
    public static final MergePaths$MergePathsMode A;
    public static final MergePaths$MergePathsMode B;
    public static final MergePaths$MergePathsMode C;
    public static final /* synthetic */ MergePaths$MergePathsMode[] D;
    public static final MergePaths$MergePathsMode y;
    public static final MergePaths$MergePathsMode z;

    static {
        MergePaths$MergePathsMode mergePaths$MergePathsMode = new MergePaths$MergePathsMode("MERGE", 0);
        y = mergePaths$MergePathsMode;
        MergePaths$MergePathsMode mergePaths$MergePathsMode2 = new MergePaths$MergePathsMode("ADD", 1);
        z = mergePaths$MergePathsMode2;
        MergePaths$MergePathsMode mergePaths$MergePathsMode3 = new MergePaths$MergePathsMode("SUBTRACT", 2);
        A = mergePaths$MergePathsMode3;
        MergePaths$MergePathsMode mergePaths$MergePathsMode4 = new MergePaths$MergePathsMode("INTERSECT", 3);
        B = mergePaths$MergePathsMode4;
        MergePaths$MergePathsMode mergePaths$MergePathsMode5 = new MergePaths$MergePathsMode("EXCLUDE_INTERSECTIONS", 4);
        C = mergePaths$MergePathsMode5;
        D = new MergePaths$MergePathsMode[]{mergePaths$MergePathsMode, mergePaths$MergePathsMode2, mergePaths$MergePathsMode3, mergePaths$MergePathsMode4, mergePaths$MergePathsMode5};
    }

    public static MergePaths$MergePathsMode valueOf(String str) {
        return (MergePaths$MergePathsMode) Enum.valueOf(MergePaths$MergePathsMode.class, str);
    }

    public static MergePaths$MergePathsMode[] values() {
        return (MergePaths$MergePathsMode[]) D.clone();
    }
}
