package sh.calvin.reorderable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes3.dex */
public final class ScrollMoveMode {
    public static final ScrollMoveMode y;
    public static final /* synthetic */ ScrollMoveMode[] z;

    static {
        ScrollMoveMode scrollMoveMode = new ScrollMoveMode("SWAP", 0);
        y = scrollMoveMode;
        z = new ScrollMoveMode[]{scrollMoveMode, new ScrollMoveMode("INSERT", 1)};
    }

    public static ScrollMoveMode valueOf(String str) {
        return (ScrollMoveMode) Enum.valueOf(ScrollMoveMode.class, str);
    }

    public static ScrollMoveMode[] values() {
        return (ScrollMoveMode[]) z.clone();
    }
}
