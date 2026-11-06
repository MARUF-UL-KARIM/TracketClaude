package androidx.constraintlayout.core.dsl;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes4.dex */
public final class OnSwipe$TouchUp {
    public static final /* synthetic */ OnSwipe$TouchUp[] y = {new OnSwipe$TouchUp("AUTOCOMPLETE", 0), new OnSwipe$TouchUp("TO_START", 1), new OnSwipe$TouchUp("NEVER_COMPLETE_END", 2), new OnSwipe$TouchUp("TO_END", 3), new OnSwipe$TouchUp("STOP", 4), new OnSwipe$TouchUp("DECELERATE", 5), new OnSwipe$TouchUp("DECELERATE_COMPLETE", 6), new OnSwipe$TouchUp("NEVER_COMPLETE_START", 7)};

    /* JADX INFO: Fake field, exist only in values array */
    OnSwipe$TouchUp EF5;

    public static OnSwipe$TouchUp valueOf(String str) {
        return (OnSwipe$TouchUp) Enum.valueOf(OnSwipe$TouchUp.class, str);
    }

    public static OnSwipe$TouchUp[] values() {
        return (OnSwipe$TouchUp[]) y.clone();
    }
}
