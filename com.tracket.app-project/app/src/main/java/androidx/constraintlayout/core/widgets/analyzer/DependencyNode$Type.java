package androidx.constraintlayout.core.widgets.analyzer;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
final class DependencyNode$Type {
    public static final /* synthetic */ DependencyNode$Type[] y = {new DependencyNode$Type("UNKNOWN", 0), new DependencyNode$Type("HORIZONTAL_DIMENSION", 1), new DependencyNode$Type("VERTICAL_DIMENSION", 2), new DependencyNode$Type("LEFT", 3), new DependencyNode$Type("RIGHT", 4), new DependencyNode$Type("TOP", 5), new DependencyNode$Type("BOTTOM", 6), new DependencyNode$Type("BASELINE", 7)};

    /* JADX INFO: Fake field, exist only in values array */
    DependencyNode$Type EF5;

    public static DependencyNode$Type valueOf(String str) {
        return (DependencyNode$Type) Enum.valueOf(DependencyNode$Type.class, str);
    }

    public static DependencyNode$Type[] values() {
        return (DependencyNode$Type[]) y.clone();
    }
}
