package androidx.compose.material3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class SwipeToDismissBoxValue {
    public static final SwipeToDismissBoxValue A;
    public static final /* synthetic */ SwipeToDismissBoxValue[] B;
    public static final SwipeToDismissBoxValue y;
    public static final SwipeToDismissBoxValue z;

    static {
        SwipeToDismissBoxValue swipeToDismissBoxValue = new SwipeToDismissBoxValue("StartToEnd", 0);
        y = swipeToDismissBoxValue;
        SwipeToDismissBoxValue swipeToDismissBoxValue2 = new SwipeToDismissBoxValue("EndToStart", 1);
        z = swipeToDismissBoxValue2;
        SwipeToDismissBoxValue swipeToDismissBoxValue3 = new SwipeToDismissBoxValue("Settled", 2);
        A = swipeToDismissBoxValue3;
        B = new SwipeToDismissBoxValue[]{swipeToDismissBoxValue, swipeToDismissBoxValue2, swipeToDismissBoxValue3};
    }

    public static SwipeToDismissBoxValue valueOf(String str) {
        return (SwipeToDismissBoxValue) Enum.valueOf(SwipeToDismissBoxValue.class, str);
    }

    public static SwipeToDismissBoxValue[] values() {
        return (SwipeToDismissBoxValue[]) B.clone();
    }
}
