package androidx.recyclerview.widget;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
public final class RecyclerView$Adapter$StateRestorationPolicy {
    public static final /* synthetic */ RecyclerView$Adapter$StateRestorationPolicy[] y = {new RecyclerView$Adapter$StateRestorationPolicy("ALLOW", 0), new RecyclerView$Adapter$StateRestorationPolicy("PREVENT_WHEN_EMPTY", 1), new RecyclerView$Adapter$StateRestorationPolicy("PREVENT", 2)};

    /* JADX INFO: Fake field, exist only in values array */
    RecyclerView$Adapter$StateRestorationPolicy EF5;

    public static RecyclerView$Adapter$StateRestorationPolicy valueOf(String str) {
        return (RecyclerView$Adapter$StateRestorationPolicy) Enum.valueOf(RecyclerView$Adapter$StateRestorationPolicy.class, str);
    }

    public static RecyclerView$Adapter$StateRestorationPolicy[] values() {
        return (RecyclerView$Adapter$StateRestorationPolicy[]) y.clone();
    }
}
