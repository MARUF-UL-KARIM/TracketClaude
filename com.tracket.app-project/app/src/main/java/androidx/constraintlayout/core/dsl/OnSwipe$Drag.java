package androidx.constraintlayout.core.dsl;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes4.dex */
public final class OnSwipe$Drag {
    public static final /* synthetic */ OnSwipe$Drag[] y = {new OnSwipe$Drag("UP", 0), new OnSwipe$Drag("DOWN", 1), new OnSwipe$Drag("LEFT", 2), new OnSwipe$Drag("RIGHT", 3), new OnSwipe$Drag("START", 4), new OnSwipe$Drag("END", 5), new OnSwipe$Drag("CLOCKWISE", 6), new OnSwipe$Drag("ANTICLOCKWISE", 7)};

    /* JADX INFO: Fake field, exist only in values array */
    OnSwipe$Drag EF5;

    public static OnSwipe$Drag valueOf(String str) {
        return (OnSwipe$Drag) Enum.valueOf(OnSwipe$Drag.class, str);
    }

    public static OnSwipe$Drag[] values() {
        return (OnSwipe$Drag[]) y.clone();
    }
}
