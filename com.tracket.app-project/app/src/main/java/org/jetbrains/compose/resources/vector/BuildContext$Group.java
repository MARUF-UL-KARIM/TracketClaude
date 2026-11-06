package org.jetbrains.compose.resources.vector;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class BuildContext$Group {
    public static final /* synthetic */ BuildContext$Group[] A;
    public static final BuildContext$Group y;
    public static final BuildContext$Group z;

    static {
        BuildContext$Group buildContext$Group = new BuildContext$Group("Real", 0);
        y = buildContext$Group;
        BuildContext$Group buildContext$Group2 = new BuildContext$Group("Virtual", 1);
        z = buildContext$Group2;
        A = new BuildContext$Group[]{buildContext$Group, buildContext$Group2};
    }

    public static BuildContext$Group valueOf(String str) {
        return (BuildContext$Group) Enum.valueOf(BuildContext$Group.class, str);
    }

    public static BuildContext$Group[] values() {
        return (BuildContext$Group[]) A.clone();
    }
}
