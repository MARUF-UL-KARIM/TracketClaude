package androidx.compose.foundation.gestures;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class Orientation {
    public static final /* synthetic */ Orientation[] A;
    public static final Orientation y;
    public static final Orientation z;

    static {
        Orientation orientation = new Orientation("Vertical", 0);
        y = orientation;
        Orientation orientation2 = new Orientation("Horizontal", 1);
        z = orientation2;
        A = new Orientation[]{orientation, orientation2};
    }

    public static Orientation valueOf(String str) {
        return (Orientation) Enum.valueOf(Orientation.class, str);
    }

    public static Orientation[] values() {
        return (Orientation[]) A.clone();
    }
}
