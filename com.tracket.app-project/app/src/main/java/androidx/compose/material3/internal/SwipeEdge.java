package androidx.compose.material3.internal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class SwipeEdge {
    public static final /* synthetic */ SwipeEdge[] y = {new SwipeEdge("Left", 0), new SwipeEdge("Right", 1), new SwipeEdge("None", 2)};

    /* JADX INFO: Fake field, exist only in values array */
    SwipeEdge EF5;

    public static SwipeEdge valueOf(String str) {
        return (SwipeEdge) Enum.valueOf(SwipeEdge.class, str);
    }

    public static SwipeEdge[] values() {
        return (SwipeEdge[]) y.clone();
    }
}
