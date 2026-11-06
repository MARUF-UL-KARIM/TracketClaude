package androidx.constraintlayout.core.dsl;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class OnSwipe$Boundary {
    public static final /* synthetic */ OnSwipe$Boundary[] y = {new OnSwipe$Boundary("OVERSHOOT", 0), new OnSwipe$Boundary("BOUNCE_START", 1), new OnSwipe$Boundary("BOUNCE_END", 2), new OnSwipe$Boundary("BOUNCE_BOTH", 3)};

    /* JADX INFO: Fake field, exist only in values array */
    OnSwipe$Boundary EF5;

    public static OnSwipe$Boundary valueOf(String str) {
        return (OnSwipe$Boundary) Enum.valueOf(OnSwipe$Boundary.class, str);
    }

    public static OnSwipe$Boundary[] values() {
        return (OnSwipe$Boundary[]) y.clone();
    }
}
