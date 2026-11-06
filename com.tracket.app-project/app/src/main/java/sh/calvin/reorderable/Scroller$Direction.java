package sh.calvin.reorderable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class Scroller$Direction {
    public static final /* synthetic */ Scroller$Direction[] A;
    public static final Scroller$Direction y;
    public static final Scroller$Direction z;

    static {
        Scroller$Direction scroller$Direction = new Scroller$Direction("BACKWARD", 0);
        y = scroller$Direction;
        Scroller$Direction scroller$Direction2 = new Scroller$Direction("FORWARD", 1);
        z = scroller$Direction2;
        A = new Scroller$Direction[]{scroller$Direction, scroller$Direction2};
    }

    public static Scroller$Direction valueOf(String str) {
        return (Scroller$Direction) Enum.valueOf(Scroller$Direction.class, str);
    }

    public static Scroller$Direction[] values() {
        return (Scroller$Direction[]) A.clone();
    }
}
