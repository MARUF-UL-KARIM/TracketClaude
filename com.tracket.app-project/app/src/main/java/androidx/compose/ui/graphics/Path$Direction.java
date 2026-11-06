package androidx.compose.ui.graphics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class Path$Direction {
    public static final Path$Direction y;
    public static final /* synthetic */ Path$Direction[] z;

    static {
        Path$Direction path$Direction = new Path$Direction("CounterClockwise", 0);
        y = path$Direction;
        z = new Path$Direction[]{path$Direction, new Path$Direction("Clockwise", 1)};
    }

    public static Path$Direction valueOf(String str) {
        return (Path$Direction) Enum.valueOf(Path$Direction.class, str);
    }

    public static Path$Direction[] values() {
        return (Path$Direction[]) z.clone();
    }
}
