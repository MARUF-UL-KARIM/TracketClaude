package androidx.compose.animation;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class StateChangeRequest {
    public static final /* synthetic */ StateChangeRequest[] y = {new StateChangeRequest("NoRequest", 0), new StateChangeRequest("MatchFound", 1), new StateChangeRequest("VisibleContentAbsentDuringTransition", 2), new StateChangeRequest("NoMatchFound", 3)};

    /* JADX INFO: Fake field, exist only in values array */
    StateChangeRequest EF5;

    public static StateChangeRequest valueOf(String str) {
        return (StateChangeRequest) Enum.valueOf(StateChangeRequest.class, str);
    }

    public static StateChangeRequest[] values() {
        return (StateChangeRequest[]) y.clone();
    }
}
