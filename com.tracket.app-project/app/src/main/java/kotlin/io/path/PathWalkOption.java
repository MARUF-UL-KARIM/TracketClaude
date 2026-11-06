package kotlin.io.path;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class PathWalkOption {
    public static final /* synthetic */ PathWalkOption[] y = {new PathWalkOption("INCLUDE_DIRECTORIES", 0), new PathWalkOption("BREADTH_FIRST", 1), new PathWalkOption("FOLLOW_LINKS", 2)};

    /* JADX INFO: Fake field, exist only in values array */
    PathWalkOption EF5;

    public static PathWalkOption valueOf(String str) {
        return (PathWalkOption) Enum.valueOf(PathWalkOption.class, str);
    }

    public static PathWalkOption[] values() {
        return (PathWalkOption[]) y.clone();
    }
}
