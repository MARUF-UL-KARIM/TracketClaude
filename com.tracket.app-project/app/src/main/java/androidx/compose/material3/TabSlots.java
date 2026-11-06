package androidx.compose.material3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0b7cfea85508d58686d8f3d90c16fee3cfa6bb72c3441c3c9e895e064ade750b */
/* JADX INFO: loaded from: classes.dex */
final class TabSlots {
    public static final /* synthetic */ TabSlots[] y = {new TabSlots("Tabs", 0), new TabSlots("Divider", 1), new TabSlots("Indicator", 2)};

    /* JADX INFO: Fake field, exist only in values array */
    TabSlots EF5;

    public static TabSlots valueOf(String str) {
        return (TabSlots) Enum.valueOf(TabSlots.class, str);
    }

    public static TabSlots[] values() {
        return (TabSlots[]) y.clone();
    }
}
