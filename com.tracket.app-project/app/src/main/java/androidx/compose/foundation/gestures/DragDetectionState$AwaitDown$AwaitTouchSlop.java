package androidx.compose.foundation.gestures;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class DragDetectionState$AwaitDown$AwaitTouchSlop {
    public static final DragDetectionState$AwaitDown$AwaitTouchSlop A;
    public static final /* synthetic */ DragDetectionState$AwaitDown$AwaitTouchSlop[] B;
    public static final DragDetectionState$AwaitDown$AwaitTouchSlop y;
    public static final DragDetectionState$AwaitDown$AwaitTouchSlop z;

    static {
        DragDetectionState$AwaitDown$AwaitTouchSlop dragDetectionState$AwaitDown$AwaitTouchSlop = new DragDetectionState$AwaitDown$AwaitTouchSlop("Yes", 0);
        y = dragDetectionState$AwaitDown$AwaitTouchSlop;
        DragDetectionState$AwaitDown$AwaitTouchSlop dragDetectionState$AwaitDown$AwaitTouchSlop2 = new DragDetectionState$AwaitDown$AwaitTouchSlop("No", 1);
        z = dragDetectionState$AwaitDown$AwaitTouchSlop2;
        DragDetectionState$AwaitDown$AwaitTouchSlop dragDetectionState$AwaitDown$AwaitTouchSlop3 = new DragDetectionState$AwaitDown$AwaitTouchSlop("NotInitialized", 2);
        A = dragDetectionState$AwaitDown$AwaitTouchSlop3;
        B = new DragDetectionState$AwaitDown$AwaitTouchSlop[]{dragDetectionState$AwaitDown$AwaitTouchSlop, dragDetectionState$AwaitDown$AwaitTouchSlop2, dragDetectionState$AwaitDown$AwaitTouchSlop3};
    }

    public static DragDetectionState$AwaitDown$AwaitTouchSlop valueOf(String str) {
        return (DragDetectionState$AwaitDown$AwaitTouchSlop) Enum.valueOf(DragDetectionState$AwaitDown$AwaitTouchSlop.class, str);
    }

    public static DragDetectionState$AwaitDown$AwaitTouchSlop[] values() {
        return (DragDetectionState$AwaitDown$AwaitTouchSlop[]) B.clone();
    }
}
