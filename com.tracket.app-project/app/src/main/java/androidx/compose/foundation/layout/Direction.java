package androidx.compose.foundation.layout;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class Direction {
    public static final Direction A;
    public static final /* synthetic */ Direction[] B;
    public static final Direction y;
    public static final Direction z;

    static {
        Direction direction = new Direction("Vertical", 0);
        y = direction;
        Direction direction2 = new Direction("Horizontal", 1);
        z = direction2;
        Direction direction3 = new Direction("Both", 2);
        A = direction3;
        B = new Direction[]{direction, direction2, direction3};
    }

    public static Direction valueOf(String str) {
        return (Direction) Enum.valueOf(Direction.class, str);
    }

    public static Direction[] values() {
        return (Direction[]) B.clone();
    }
}
